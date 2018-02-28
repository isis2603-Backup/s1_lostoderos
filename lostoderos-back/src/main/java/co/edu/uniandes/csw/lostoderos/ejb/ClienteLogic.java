/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.ejb;

import co.edu.uniandes.csw.lostoderos.entities.ClienteEntity;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import co.edu.uniandes.csw.lostoderos.persistence.ClientePersistence;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author s.naranjop1
 */
@Stateless
public class ClienteLogic 
{
    private static final Logger LOGGER = Logger.getLogger(ClienteLogic.class.getName());
    
    @Inject
    /**
     * atributo para acceder a la persistencia de la aplicacion. Es una inyeccion de dependencia
     */
    private ClientePersistence persistence;
    
    /**
     * metodo que crea la entidad de cotizacion
     * @param entity entidad que se desea crear
     * @return entidad creada
     * @throws BusinessLogicException si la entidad a crea ya existe
     */
    public ClienteEntity create(ClienteEntity entity)throws BusinessLogicException{
        
        LOGGER.info("Inicio de creación de la entidad Cotización");
        if(persistence.find(entity.getId()) != null)
            throw new BusinessLogicException("Ya existe una entidad de Cliente con el id \""+entity.getId()+"\"");
        
        persistence.create(entity);
        LOGGER.info("Creacion exitosa");
        return entity;
    }
    
    /**
     * consulta el cliente con el id deseado
     * @param id identificador que se desea consultar
     * @return entidad con el id deseado
     */
    public ClienteEntity getById(Long id){
        
        return persistence.find(id);
    }
    
    /**
     * Actualiza la entidad deseada
     * @param entity entidad que se desea actualizar
     * @return entidad actualizada
     * @throws BusinessLogicException si ya existe una entidad con el identificador
     */
    public ClienteEntity update(ClienteEntity entity)throws BusinessLogicException{
        
        if(persistence.find(entity.getId()) == null)
            throw new BusinessLogicException("No existe una entidad de Cliente con el id \""+entity.getId()+"\"");
        
        return persistence.update(entity);
    }
    
    /**
     * elimina la entidad con el id asignado
     * @param id identificador de la entidad que se desea borrar
     * @throws BusinessLogicException si la entidad no existe
     */
    public void delete(Long id)throws BusinessLogicException{
        
        LOGGER.log(Level.INFO, "Inicia el proceso de borrado en la entidad de Cliente con id={0}", id);
        persistence.delete(id);
        LOGGER.log(Level.INFO, "Borrado exitoso", id);
    }
}