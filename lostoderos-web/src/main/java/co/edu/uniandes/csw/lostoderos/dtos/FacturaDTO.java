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

import co.edu.uniandes.csw.lostoderos.entities.FacturaEntity;
import java.io.Serializable;

/**
 * ServicioDTO Objeto de transferencia de datos de la entidad de Factura. Los
 * DTO contienen las representaciones de los JSON que se transfieren entre el
 * cliente y el servidor.
 *
 * Al serializarse como JSON esta clase implementa el siguiente modelo: <br>
 * <pre>
 *   {
 *      "id": Number,
 *      "producto": String,
 *      "formaPago": String,
 *      "subTotal": Integer,
 *      "total": Integer,
 *
 *   }
 * </pre> Por ejemplo una entidad de Factura se representa asi:<br>
 *
 * <pre>
 *
 *   {
 *     "id": 14654,
 *      "producto": "Plomeria",
 *      "formaPago": "tarjetaCredito",
 *      "subTotal": 1000000,
 *      "total": 10005467
 *   }
 *
 * </pre>
 *
 * @author s.rangel
 */
public class FacturaDTO implements Serializable {

    private Long id;
    private String producto;
    private String formaPago;
    private Integer total;
    private Integer subtotal;

    /**
     * construcor por defecto
     */
    public FacturaDTO() {
        // El constructor está vació porque se recomienda tener un constructor vacio cuando la clase se representa en JSON.

    }

    /**
     * Conviertir Entity a DTO (Crea un nuevo DTO con los valores que recibe en
     * la entidad que viene de argumento.
     *
     * @param facturaEntity: Es la entidad que se va a convertir a DTO
     */
    public FacturaDTO(FacturaEntity facturaEntity) {
        if (facturaEntity != null) {
            this.id = facturaEntity.getId();
            this.producto = facturaEntity.getProducto();
            this.subtotal = facturaEntity.getSubtotal();
            this.total = facturaEntity.getTotal();
            this.formaPago = facturaEntity.getFormaPago();
        }
    }

    /**
     * @return el ID de la entidad Factura
     */
    public Long getID() {
        return id;
    }

    /**
     * @return el producto de la entidad Factura
     */
    public String getProducto() {
        return producto;
    }

    /**
     * @return el total de la entidad Factura
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @return la forma de pago de la entidad Factura
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * @return el subtotal de la entidad Factura
     */
    public Integer getSubtotal() {
        return subtotal;
    }

    /**
     * @param id El nuevo ID de la entidad Factura
     */
    public void setID(Long id) {
        this.id = id;
    }

    /**
     * @param producto El nuevo producto medio de la entidad Factura
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }

    /**
     * @param total El nuevo total de la entidad Factura
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @param subtotal El nuevo subtotal de la entidad Factura
     */
    public void setSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @param formaPago El nuevo subtotal de la entidad Factura
     */

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    /**
     * Convertir DTO a Entity
     *
     * @return Un Entity con los valores del DTO
     */
    public FacturaEntity toEntity() {
        FacturaEntity entity = new FacturaEntity();
        entity.setId(this.id);
        entity.setProducto(this.producto);
        entity.setSubtotal(this.subtotal);
        entity.setTotal(this.total);
        entity.setFormaPago(this.formaPago);
        return entity;
    }

}
