/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.ejb;

import co.edu.uniandes.csw.lostoderos.entities.ServicioEntity;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.lostoderos.persistence.ServicioPersistence;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author s.naranjop1
 */
@Stateless
public class ServicioLogic 
{
    private static final Logger LOGGER = Logger.getLogger(ServicioLogic.class.getName());
    
    @Inject
    /**
     * atributo para acceder a la persistencia de la aplicacion. Es una inyeccion de dependencia
     */
    private ServicioPersistence persistence;
    
    /**
     * metodo que crea la entidad de servicio
     * @param entity entidad que se desea crear
     * @return entidad creada
     * @throws BusinessLogicException si la entidad a crea ya existe
     */
    public ServicioEntity create(ServicioEntity entity)throws BusinessLogicException{
        
        LOGGER.info("Inicio de creación de la entidad Servicio");  
        persistence.create(entity);
        LOGGER.info("Creacion exitosa");
        return entity;
    }
    
    /**
     *
     * Obtener todos los servicios existentes en la base de datos.
     *
     * @return una lista de servicios.
     */
    public List<ServicioEntity> getAll( ){
        
	LOGGER.info( "Inicia proceso de consultar todas las entidades de Servicio" );
	List<ServicioEntity> entities = persistence.findAll( );
	LOGGER.info( "Termina proceso de consultar todas las entidades de Servicio" );
	return entities;
    }
    
    /**
     * consulta el servicio con el id deseado
     * @param id identificador que se desea consultar
     * @return entidad con el id deseado
     */
    public ServicioEntity getById(Long id){
        
        return persistence.find(id);
    }
    
    /**
     * Actualiza la entidad deseada
     * @param entity entidad que se desea actualizar
     * @return entidad actualizada
     * @throws BusinessLogicException si ya existe una entidad con el identificador
     */
    public ServicioEntity update(ServicioEntity entity)throws BusinessLogicException{
        
        if(persistence.find(entity.getId()) == null)
            throw new BusinessLogicException("No existe una entidad de Servicio con el id \""+entity.getId()+"\"");
        //TODO: NO hay ninguna regla de negocio? 
        return persistence.update(entity);
    }
    
    /**
     * elimina la entidad con el id asignado
     * @param id identificador de la entidad que se desea borrar
     * @throws BusinessLogicException si la entidad no existe
     */
    public void delete(Long id)throws BusinessLogicException{
        
        LOGGER.log(Level.INFO, "Inicia el proceso de borrado en la entidad de Servicio con id={0}", id);
        //TODO: qué pasa is no existe un servicio con ese id?
        persistence.delete(id);
        LOGGER.log(Level.INFO, "Borrado exitoso", id);
    }
}
