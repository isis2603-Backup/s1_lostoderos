/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.test.logic;

import co.edu.uniandes.csw.lostoderos.ejb.ContratistaLogic;
import co.edu.uniandes.csw.lostoderos.ejb.ServicioLogic;
import co.edu.uniandes.csw.lostoderos.entities.ContratistaEntity;
import co.edu.uniandes.csw.lostoderos.entities.ServicioEntity;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.lostoderos.persistence.ContratistaPersistence;
import co.edu.uniandes.csw.lostoderos.persistence.ServicioPersistence;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author s.naranjop1
 */
@RunWith(Arquillian.class)
public class ServicioLogicTest 
{
    private PodamFactory factory = new PodamFactoryImpl();

    @Inject
    private ServicioLogic servicioLogic;
    
    @Inject
    private ContratistaPersistence contratistaP;

    @PersistenceContext
    private EntityManager em;

    @Inject
    private UserTransaction utx;

    private List<ServicioEntity> data = new ArrayList<ServicioEntity>();

    private List<ContratistaEntity> contratistas= new ArrayList<ContratistaEntity>();
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(ServicioEntity.class.getPackage())
                .addPackage(ServicioLogic.class.getPackage())
                .addPackage(ServicioPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }

    /**
     * Configuración inicial de la prueba.
     *
     */
    @Before
    public void configTest() {
        try {
            utx.begin();
            clearData();
            insertData();
            utx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                utx.rollback();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * Limpia las tablas que están implicadas en la prueba.
     *
     */
    private void clearData() {
        em.createQuery("delete from ServicioEntity").executeUpdate();
    }

    /**
     * Inserta los datos iniciales para el correcto funcionamiento de las
     * pruebas.
     *
     */
    private void insertData() {
        
        for (int i = 0; i < 3; i++) {
            ContratistaEntity entity1= factory.manufacturePojo(ContratistaEntity.class);
            em.persist(entity1);
            contratistaP.create(entity1);
            contratistas.add(entity1);
        }
        for (int i = 0; i < 3; i++) {
            
            ServicioEntity entity = factory.manufacturePojo(ServicioEntity.class);
            
            em.persist(entity);
            
            data.add(entity);
            if(i == 0){
                contratistas.get(i).setServicios(data);
            }
        }
        
    }

    /**
     * Prueba para crear un Servicio
     *
     * @throws co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException
     */
    @Test
    public void createServicioTest() throws BusinessLogicException {
        ServicioEntity newEntity = factory.manufacturePojo(ServicioEntity.class);
        ServicioEntity result = servicioLogic.create(newEntity);
        Assert.assertNotNull(result);
        ServicioEntity entity = em.find(ServicioEntity.class, result.getId());
        Assert.assertEquals(newEntity.getId(), entity.getId());
        Assert.assertEquals(newEntity.getName(), entity.getName());
    }

    /**
     * Prueba para consultar un Servicio
     *
     * 
     */
    @Test
    public void getServicioTest() {
        ServicioEntity entity = data.get(0);
        ServicioEntity resultEntity =servicioLogic.getById(entity.getId());
        Assert.assertNotNull(resultEntity);
        Assert.assertEquals(entity.getId(), resultEntity.getId());
        Assert.assertEquals(entity.getName(), resultEntity.getName());
    }

    /**
     * Prueba para consultar la lista de Servicios
     *
     *
     */
     @Test
    public void getAllTest(){
        List<ServicioEntity> list = servicioLogic.getAll();
        Assert.assertEquals(data.size(), list.size());
        for(ServicioEntity entity:list){
            boolean found = false;
            for(ServicioEntity storedEntity:data){
                if(entity.getId().equals(storedEntity.getId())) found =true;
            }
            Assert.assertTrue(found);
        }
    }
    
    /**
     * Prueba para eliminar un Servicio
     *
     * 
     * @throws co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException
     */
    @Test
    public void deleteServicioTest() throws BusinessLogicException {
        ServicioEntity entity = data.get(0);
        servicioLogic.delete(entity.getId());
        ServicioEntity deleted = em.find(ServicioEntity.class, entity.getId());
        Assert.assertNull(deleted);
    }

    /**
     * Prueba para actualizar un Servicio
     *
     * 
     * @throws co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException
     */
    @Test
    public void updateServicioTest() throws BusinessLogicException {
        ServicioEntity entity = data.get(0);
        ServicioEntity pojoEntity = factory.manufacturePojo(ServicioEntity.class);

        pojoEntity.setId(entity.getId());
        pojoEntity.setNombre(entity.getNombre());

        servicioLogic.update(pojoEntity);

        ServicioEntity resp = em.find(ServicioEntity.class, entity.getId());

        Assert.assertEquals(pojoEntity.getId(), resp.getId());
        Assert.assertEquals(pojoEntity.getNombre(), resp.getNombre());
    }
    
    @Test
    public void getContratistaTest() throws BusinessLogicException{
        ServicioEntity entity= data.get(0);
        ContratistaEntity contratista= contratistas.get(0);
        
        entity.getContratistas().add(contratista);
        
        
        ContratistaEntity prueba= servicioLogic.getContratista(entity.getId(), contratista.getId());
        System.out.println(prueba.getId());
        
        Assert.assertEquals(contratista, prueba);
    }
    
    @Test
    public void addContratistaTest() throws BusinessLogicException{
        ServicioEntity entity= data.get(0);
        ContratistaEntity contratista= contratistas.get(1);
        ContratistaEntity response= servicioLogic.addContratista(entity.getId(), contratista.getId());
        
        Assert.assertNotNull(response);
        Assert.assertEquals(contratista.getId(), response.getId());
    }
    
    @Test
    public void removeContratistaTestt(){
        
        try {
            servicioLogic.removeContratista(data.get(0).getId(), contratistas.get(0).getId());
        } catch (BusinessLogicException ex) {
            Logger.getLogger(ServicioLogicTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
