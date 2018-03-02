/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.test.logic;

import co.edu.uniandes.csw.lostoderos.ejb.SolicitudLogic;
import co.edu.uniandes.csw.lostoderos.entities.SolicitudEntity;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.lostoderos.persistence.SolicitudPersistence;
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
import org.junit.*;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author m.saravia
 */
@RunWith(Arquillian.class)
public class SolicitudLogicTest {
    
    /**
     * 
     */
    private PodamFactoryImpl factory= new PodamFactoryImpl();
        
    /**
     * 
     */
    @Inject
    private SolicitudLogic solicitudLogic;
    
    /**
     * 
     */
    @PersistenceContext
    private EntityManager em;
    
    /**
     * 
     */
    @Inject
    private UserTransaction utx;
    
    /**
     * 
     */
    private List<SolicitudEntity> data= new ArrayList<SolicitudEntity>();
    
    /**
     * 
     * @return 
     */
    @Deployment
    public static JavaArchive createDeployment(){
        
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(SolicitudEntity.class.getPackage())
                .addPackage(SolicitudLogic.class.getPackage())
                .addPackage(SolicitudPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }
    
    /**
     * 
     */
    @Before
    public void confifTest(){
        
        try{
            utx.begin();
            clearData();
            insertData();
            utx.commit();
        }catch(Exception e){
            e.printStackTrace();
            try{
                utx.rollback();
            }catch(Exception e1){
                e1.printStackTrace();
            }
        }
        
    }
    
    /**
     * Limpia las tablas que están implicadas en la prueba.
     *
     */
    private void clearData() {
        em.createQuery("delete from SolicitudEntity").executeUpdate();
    }
    
    /**
     * Inserta los datos iniciales para el correcto funcionamiento de las
     * pruebas.
     *
     */
    private void insertData() {
        for (int i = 0; i < 3; i++) {
            
            SolicitudEntity entity = factory.manufacturePojo(SolicitudEntity.class);
            
            em.persist(entity);
            
            data.add(entity);
        }
    }
    
    /**
     * 
     * @throws BusinessLogicException 
     */
   @Test
   public void createSolicitudTest()throws BusinessLogicException{
       
       SolicitudEntity newEntity= factory.manufacturePojo(SolicitudEntity.class);
       SolicitudEntity result= solicitudLogic.create(newEntity);
       Assert.assertNotNull(result);
       SolicitudEntity entity= em.find(SolicitudEntity.class, result.getId());
       Assert.assertEquals(newEntity.getId(), entity.getId());
       Assert.assertEquals(newEntity.getName(), entity.getName());
   }
   
   /**
    * 
    * @throws BusinessLogicException 
    */
   @Test
   public void getSolicitudTest()throws BusinessLogicException{
       
       SolicitudEntity entity= data.get(0);
       SolicitudEntity resultEntity= solicitudLogic.getById(entity.getId());
       Assert.assertNotNull(resultEntity);
       Assert.assertEquals(entity.getId(), resultEntity.getId());
       Assert.assertEquals(entity.getName(), resultEntity.getName());
   }
   
   /**
    * 
    * @throws BusinessLogicException 
    */
   @Test
   public void updateSolicitudTest() throws BusinessLogicException{
       
       SolicitudEntity entity= data.get(0);
       SolicitudEntity pojoEntity= factory.manufacturePojo(SolicitudEntity.class);
       
       pojoEntity.setId(entity.getId());
       
       solicitudLogic.update(pojoEntity);
       
       SolicitudEntity result= em.find(SolicitudEntity.class, entity.getId());
       
       Assert.assertEquals(pojoEntity.getId(), result.getId());
       Assert.assertEquals(pojoEntity.getName(), result.getName());
   }
   
   /**
    * 
    * @throws BusinessLogicException
    */
   @Test
    public void deleteSolicitudTest() throws BusinessLogicException {
        
        SolicitudEntity entity = data.get(0);
        solicitudLogic.delete(entity.getId());
        SolicitudEntity deleted = em.find(SolicitudEntity.class, entity.getId());
        Assert.assertNull(deleted);
    }
    
}