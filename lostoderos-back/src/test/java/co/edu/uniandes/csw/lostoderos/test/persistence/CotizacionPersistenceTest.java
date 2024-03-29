/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.test.persistence;

import co.edu.uniandes.csw.lostoderos.entities.CotizacionEntity;
import co.edu.uniandes.csw.lostoderos.persistence.CotizacionPersistence;
import java.util.ArrayList;
import java.util.List;
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
 * @author m.saravia
 */
@RunWith(Arquillian.class)
public class CotizacionPersistenceTest {
    
      @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(CotizacionEntity.class.getPackage())
                .addPackage(CotizacionPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }
    
    /**
     * Inyección de la dependencia a la clase CotizacionPersistence cuyos métodos
     * se van a probar.
     */
    @Inject
    private CotizacionPersistence cotizacionPersistence;

    /**
     * Contexto de Persistencia que se va a utilizar para acceder a la Base de
     * datos por fuera de los métodos que se están probando.
     */
    @PersistenceContext
    private EntityManager em;

    /**
     * Variable para martcar las transacciones del em anterior cuando se
     * crean/borran datos para las pruebas.
     */
    @Inject
    UserTransaction utx;

    /**
     * Configuración inicial de la prueba.
     *
     *
     */
    @Before
    public void configTest() {
        try {
            utx.begin();
            em.joinTransaction();
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
     *
     */
    private void clearData() {
        em.createQuery("delete from CotizacionEntity").executeUpdate();
    }

    /**
     * lista que tiene los datos de prueba
     */
    private List<CotizacionEntity> data = new ArrayList<CotizacionEntity>();

    /**
     * Inserta los datos iniciales para el correcto funcionamiento de las
     * pruebas.
     *
     *
     */
    private void insertData() {
        PodamFactory factory = new PodamFactoryImpl();
        for (int i = 0; i < 3; i++) {
            
            CotizacionEntity entity = factory.manufacturePojo(CotizacionEntity.class);

            em.persist(entity);
            
            data.add(entity);
        }
    }

    /**
     * Prueba para crear una Cotizacion.
     *
     *
     */
    @Test
    public void createCotizacionTest() {
        PodamFactory factory = new PodamFactoryImpl();
        CotizacionEntity newEntity = factory.manufacturePojo(CotizacionEntity.class);
        CotizacionEntity result = cotizacionPersistence.create(newEntity);

        Assert.assertNotNull(result);

        CotizacionEntity entity = em.find(CotizacionEntity.class, result.getId());

        Assert.assertEquals(newEntity.getName(), entity.getName());
    }
    
    /**
     * 
     */
    @Test
    public void getCotizacionTest(){
        CotizacionEntity entity = data.get(0);
        CotizacionEntity newEntity = cotizacionPersistence.find(entity.getId());
        Assert.assertNotNull(newEntity);
        Assert.assertEquals(entity.getName(), newEntity.getName());
    }
    
    /**
     * 
     */
    @Test
    public void deleteCotizacionTest(){
        
        CotizacionEntity entity = data.get(0);
        cotizacionPersistence.delete(entity.getId());
        CotizacionEntity deleted = em.find(CotizacionEntity.class, entity.getId());
        Assert.assertNull(deleted);
    }
    
    @Test
    public void updateCotizacionTest(){
        
        CotizacionEntity entity = data.get(0);
        PodamFactory factory = new PodamFactoryImpl();
        CotizacionEntity newEntity = factory.manufacturePojo(CotizacionEntity.class);

        newEntity.setId(entity.getId());

        cotizacionPersistence.update(newEntity);

        CotizacionEntity resp = em.find(CotizacionEntity.class, entity.getId());

        Assert.assertEquals(newEntity.getName(), resp.getName());
    }

    
}
