/*
MIT License

Copyright (c) 2017 ISIS2603

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
 */
package co.edu.uniandes.csw.lostoderos.dtos;

import co.edu.uniandes.csw.lostoderos.entities.ServicioEntity;
import java.io.Serializable;

/**
 * ServicioDTO Objeto de transferencia de datos de la entidad de Servicio. Los
 * DTO contienen las represnetaciones de los JSON que se transfieren entre el
 * cliente y el servidor. Al serializarse como JSON esta clase implementa el
 * siguiente modelo: <br>
 * <pre>
 *   {
 *      "nombre": string,
 *      "categorias": string,
 *      "descripcion": string
 *   }
 * </pre> Por ejemplo una entidad de Servicio se representa asi:<br>
 * <pre>
 *
 *   {
 *      "nombre": "Plomería",
 *      "categorias": "agua y tuberias",
 *      "descripción": "Aqui va una descripcion detallada del servicio"
 *   }
 *
 * </pre>
 *
 * @author s.naranjop1
 */
public class ServicioDTO implements Serializable {

    /**
     * Id del servicio
     */
    private Long id;

    /**
     * Nombre del servicio a prestar
     */
    private String nombre;

    /**
     * categorias a las que pertenece el servicio
     */
    private String categorias;

    /**
     * descri´pcion del servicio
     */
    private String descripcion;

    /**
     * imagen del servicio
     */
    private String imagen;

    /**
     * Constructor por defecto
     */
    public ServicioDTO() {
        // El constructor está vació porque se recomienda tener un constructor vacio cuando la clase se representa en JSON.
    }

    /**
     * Conviertir Entity a DTO (Crea un nuevo DTO con los valores que recibe en
     * la entidad que viene de argumento.
     *
     * @param servicioEntity: Es la entidad que se va a convertir a DTO
     */
    public ServicioDTO(ServicioEntity servicioEntity) {
        this.id = servicioEntity.getId();
        this.nombre = servicioEntity.getNombre();
        this.categorias = servicioEntity.getCategorias();
        this.descripcion = servicioEntity.getDescripcion();
        this.imagen = servicioEntity.getImagen();
    }

    /**
     * @return El ID de la entidad Servicio
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id El nuevo ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return El nombre de la entidad Servicio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Categorias de la entidad Servicio
     */
    public String getCategorias() {
        return categorias;
    }

    /**
     * @param categorias Las nuevas categorias de la entidad Servicio
     */
    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    /**
     * @return La descripion de la entidad Servicio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion La nueva descripcion de la entidad Servicio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return img del servicio
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * 
     * @param imagen img que se va a establecer
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Convertir DTO a Entity
     *
     * @return Un Entity con los valores del DTO
     */
    public ServicioEntity toEntity() {
        ServicioEntity entity = new ServicioEntity();
        entity.setId(this.id);
        entity.setNombre(this.nombre);
        entity.setCategorias(this.categorias);
        entity.setDescripcion(this.descripcion);
        entity.setImagen(this.imagen);
        return entity;
    }
}
