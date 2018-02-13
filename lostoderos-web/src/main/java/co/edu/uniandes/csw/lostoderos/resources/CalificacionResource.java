/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.lostoderos.resources;
import co.edu.uniandes.csw.lostoderos.dtos.CalificacionDetailDTO;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * <pre>Clase que implementa el recurso "calificacion".
 * URL: /api/calificaciones
 * </pre>
 * <i>Note que la aplicación (definida en {@link RestConfig}) define la ruta "/api" y
 * este recurso tiene la ruta "calificacion".</i>
 * <p>
 * <h2>Anotaciones </h2>
 * <pre>
 * Path: indica la dirección después de "api" para acceder al recurso
 * Produces/Consumes: indica que los servicios definidos en este recurso reciben y devuelven objetos en formato JSON
 * RequestScoped: Inicia una transacción desde el llamado de cada método (servicio).
 * </pre>
 * /**
 *
 * @author s.blancoc
 */
@Path( "calificaciones" )
@Produces( "application/json" )
@Consumes( "application/json" )
@RequestScoped
public class CalificacionResource {
    

    
    /**
	 * <h1>POST /api/toderos : Crear una entidad de calificacion.</h1>
	 * <p>
	 * <pre>Cuerpo de petición: JSON {@link CalificacionDetailDTO}.
	 *
	 * Crea una nueva entidad de calificacion con la informacion que se recibe en el cuerpo
	 * de la petición y se regresa un objeto identico con un id auto-generado
	 * por la base de datos.
	 *
	 * Codigos de respuesta:
	 * <code style="color: mediumseagreen; background-color: #eaffe0;">
	 * 200 OK Creó la nueva entidad de calificacion.
	 * </code>
	 * <code style="color: #c7254e; background-color: #f9f2f4;">
	 * 412 Precodition Failed: Ya existe la entidad de calificacion.
	 * </code>
	 * </pre>
	 *
	 * @param dto {@link CalificacionDetailDTO} - La entidad de calificacion que se desea guardar.
	 * @return JSON {@link CalificacionDetailDTO}  - La entidad de calificacion guardada con el atributo id autogenerado.
	 * @throws BusinessLogicException {@link BusinessLogicExceptionMapper} - Error de lógica que se genera cuando ya existe la entidad.
	 */
	@POST
	public CalificacionDetailDTO createCalificacion( CalificacionDetailDTO dto ) throws BusinessLogicException
	{
		return dto;
	}
        
        /**
	 * <h1>GET /api/calificaciones : Obtener todas las entidades de de Calificacion.</h1>
	 * <p>
	 * <pre>Busca y devuelve todas las entidades de Calificacion que existen en la aplicacion.
	 *
	 * Codigos de respuesta:
	 * <code style="color: mediumseagreen; background-color: #eaffe0;">
	 * 200 OK Devuelve todas las entidades de Calificacion de la aplicacion.</code>
	 * </pre>
	 *
	 * @return JSONArray {@link CalificacionDetailDTO} - Las entidades de Calificacion encontradas en la aplicación. Si no hay ninguna retorna una lista vacía.
	 */
	@GET
	public List<CalificacionDetailDTO> getCalificaciones( )
	{
		return new ArrayList<>( );
	}
        
        /**
     * <h1>GET /api/calificaciones/{id} : Obtener Calificacion por id.</h1>
     * 
     * <pre>Busca el Calificacion con el id asociado recibido en la URL y la devuelve.
     * 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK Devuelve el Calificacion correspondiente al id.
     * </code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found No existe un Calificacion con el id dado.
     * </code> 
     * </pre>
     * @param id Identificador del Calificacion que se esta buscando. Este debe ser una cadena de dígitos.
     * @return JSON {@link CalificacionDetailDTO} - La Calificacion buscada
     */
    @GET
    @Path("{id: \\d+}")
    public CalificacionDetailDTO getCalificacion(@PathParam("id") Long id) {
        return null;
    }
    
    /**
     * <h1>PUT /api/calificaciones/{id} : Actualizar Calificacion con el id dado.</h1>
     * <pre>Cuerpo de petición: JSON {@link CalificacionDetailDTO}.
     * 
     * Actualiza el Calificacion con el id recibido en la URL con la informacion que se recibe en el cuerpo de la petición.
     * 
     * Codigos de respuesta:
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK Actualiza el Calificacion con el id dado con la información enviada como parámetro. Retorna un objeto identico.</code> 
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found. No existe un Calificacion con el id dado.
     * </code> 
     * </pre>
     * @param id Identificador del Calificacion que se desea actualizar.Este debe ser una cadena de dígitos.
     * @param calificacion {@link CalificacionDetailDTO} el Calificacion que se desea guardar.
     * @return JSON {@link CalificacionDetailDTO} - La Calificacion guardado.
     * @throws BusinessLogicException {@link BusinessLogicExceptionMapper} - Error de lógica que se genera al no poder actualizar el contrato porque ya existe uno.
     */
    @PUT
    @Path("{id: \\d+}")
    public CalificacionDetailDTO updateCalificacion(@PathParam("id") Long id, CalificacionDetailDTO calificacion) throws BusinessLogicException {
        return calificacion;
    }
    
    /**
     * <h1>DELETE /api/calificaciones/{id} : Borrar Calificacion por id.</h1>
     * 
     * <pre>Borra la Calificacion con el id asociado recibido en la URL.
     * 
     * Códigos de respuesta:<br>
     * <code style="color: mediumseagreen; background-color: #eaffe0;">
     * 200 OK Elimina la Calificacion correspondiente al id dado.</code>
     * <code style="color: #c7254e; background-color: #f9f2f4;">
     * 404 Not Found. No existe una Calificacion con el id dado.
     * </code>
     * </pre>
     * @param id Identificador de la Calificacion que se desea borrar. Este debe ser una cadena de dígitos.
     */
    @DELETE
    @Path("{id: \\d+}")
     public void deleteCalificacion(@PathParam("id") Long id) {
        // Void
    }
     
}



