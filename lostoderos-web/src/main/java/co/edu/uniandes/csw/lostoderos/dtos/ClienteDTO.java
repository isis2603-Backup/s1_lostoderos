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

import co.edu.uniandes.csw.lostoderos.entities.ClienteEntity;
import java.util.Date;

/**
 * ServicioDTO Objeto de transferencia de datos de la entidad de Servicio. Los
 * DTO contienen las representaciones de los JSON que se transfieren entre el
 * cliente y el servidor. Al serializarse como JSON esta clase implementa el
 * siguiente modelo: <br>
 * <pre>
 *   {
 *      "id": number,
 *      "nombre": string,
 *      "usuario": string,
 *      "contraseña": string,
 *      "correo": string,
 *      "fecha_nacimiento" string,
 *      "forma_pago" string,
 *      "direccion": string
 *
 *   }
 * </pre> Por ejemplo una entidad de Servicio se representa asi:<br>
 * <pre>
 *
 *   {
 *      "nombre": "Juan Perez",
 *      "usuario": "Jperez",
 *      "contraseña": "enero1999",
 *      "correo": "Jperez@gmail.com",
 *      "fecha_nacimiento": "1999-04-14T00:00:00-05:00",
 *      "forma_pago" "Efectivo",
 *      "direccion": "Carrera 5 #62-08"
 *   }
 *
 * </pre>
 *
 * @author s.naranjop1
 */
public class ClienteDTO extends UsuarioDTO {

    /**
     * fecha de nacimiento del cliente
     */
    private Date fecha_nacimiento;

    /**
     * forma de pago que el cliente desea efectuar
     */
    private String forma_pago;

    /**
     * direccion del cliente
     */
    private String direccion;

    /**
     * Constructor por defecto
     */
    public ClienteDTO() {
        // El constructor está vació porque se recomienda tener un constructor vacio cuando la clase se representa en JSON.    
    }

    /**
     * Conviertir Entity a DTO (Crea un nuevo DTO con los valores que recibe en
     * la entidad que viene de argumento.
     *
     * @param clienteEntity: Es la entidad que se va a convertir a DTO
     */
    public ClienteDTO(ClienteEntity clienteEntity) {
        super(clienteEntity);
        if (clienteEntity != null) {
            this.fecha_nacimiento = clienteEntity.getFecha_nacimiento();

            this.direccion = clienteEntity.getDireccion();

            this.forma_pago = clienteEntity.getForma_pago();
        }
    }

    /**
     * @return La fecha de nacimiento de la entidad Cliente
     */
    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    /**
     * @param fecha_nacimiento La nueva fecha de nacimiento
     */
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * @return La forma de pago de la entidad Cliente
     */
    public String getForma_pago() {
        return forma_pago;
    }

    /**
     * @param forma_pago La nueva forma de pago
     */
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    /**
     * @return La direccion de la entidad Cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion La nueva direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Convertir DTO a Entity
     *
     * @param entity Entidad de la subclase
     * @return Un Entity con los valores del DTO
     */
    public ClienteEntity toEntity(ClienteEntity entity) {
        super.toEntity(entity);
        entity.setFecha_nacimiento(this.fecha_nacimiento);
        entity.setDireccion(this.direccion);
        entity.setForma_pago(this.forma_pago);

        return entity;
    }

    /**
     * Metodo que convierte el obj json en el front a una entidad de la misma
     * @return 
     */
    public ClienteEntity toEntity() {
        ClienteEntity entity = new ClienteEntity();
        super.toEntity(entity);
        entity.setFecha_nacimiento(this.fecha_nacimiento);
        entity.setDireccion(this.direccion);
        entity.setForma_pago(this.forma_pago);

        return entity;
    }
}
