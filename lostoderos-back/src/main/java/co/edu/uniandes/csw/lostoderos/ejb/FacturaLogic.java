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
package co.edu.uniandes.csw.lostoderos.ejb;

import co.edu.uniandes.csw.lostoderos.entities.FacturaEntity;
import co.edu.uniandes.csw.lostoderos.entities.PagoEntity;
import co.edu.uniandes.csw.lostoderos.exceptions.BusinessLogicException;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import co.edu.uniandes.csw.lostoderos.persistence.FacturaPersistence;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author Santiago
 */
@Stateless

public class FacturaLogic {
       private static final Logger LOGGER = Logger.getLogger(FacturaLogic.class.getName());

    @Inject
    private FacturaPersistence persistence; // Variable para acceder a la persistencia de la aplicación. Es una inyección de dependencias.

    @Inject
    private PagoLogic pagoLogic;
     /**
     * Crea una factura en la persistencia.
     * @param entity La entidad que representa la factura a persistir.
     * @return La entiddad de la factura luego de persistirla.
     * @throws BusinessLogicException Si la factura a persistir ya existe.
     */
    public FacturaEntity createFactura(FacturaEntity entity) throws BusinessLogicException {
          LOGGER.info("Inicio de creación de la entidad factura");
        if(persistence.find(entity.getId()) != null)
            throw new BusinessLogicException("Ya existe una entidad de factura con el id \""+entity.getId()+"\"");
        
        persistence.create(entity);
        LOGGER.info("Creacion exitosa");
        return entity;
    }

    /**
     *
     * Obtener todas las facturas existentes en la base de datos.
     *
     * @return una lista de facturas.
     */
    public List<FacturaEntity> getFacturas() {
        LOGGER.info("Inicia proceso de consultar todas las Facturas");
        // Note que, por medio de la inyección de dependencias se llama al método "findAll()" que se encuentra en la persistencia.
        List<FacturaEntity> facturas = persistence.findAll();
        LOGGER.info("Termina proceso de consultar todas las Facturas");
        return facturas;
    }

    /**
     *
     * Obtener una factura por medio de su id.
     *
     * @param id: id de la factura para ser buscada.
     * @return la factura solicitada por medio de su id.
     */
    public FacturaEntity getFactura(Long id) {
        LOGGER.log(Level.INFO, "Inicia proceso de consultar factura con id={0}", id);
        // Note que, por medio de la inyección de dependencias se llama al método "find(id)" que se encuentra en la persistencia.
        FacturaEntity factura = persistence.find(id);
        if (factura == null) {
            LOGGER.log(Level.SEVERE, "La factura con el id {0} no existe", id);
        }
        LOGGER.log(Level.INFO, "Termina proceso de consultar factura con id={0}", id);
        return factura;
    }

    /**
     *
     * Actualizar una factura.
     *
     * @param id: id de la factura para buscarla en la base de datos.
     * @param entity: factura con los cambios para ser actualizada, por
     * ejemplo el nombre.
     * @return la factura con los cambios actualizados en la base de datos.
     */
    public FacturaEntity updateFactura(FacturaEntity entity) throws BusinessLogicException {
          if(persistence.find(entity.getId()) == null)
            throw new BusinessLogicException("No existe una entidad de Servicio con el id \""+entity.getId()+"\"");
        
        return persistence.update(entity);
    }

    /**
     * Borrar una factura
     *
     * @param id: id de la factura a borrar
     */
    public void deleteFactura(Long id) {
        LOGGER.log(Level.INFO, "Inicia proceso de borrar factura con id={0}", id);
        // Note que, por medio de la inyección de dependencias se llama al método "delete(id)" que se encuentra en la persistencia.
            persistence.delete(id);

            LOGGER.log(Level.INFO, "Termina proceso de borrar factura con id={0}", id);
        }
    
    /**
     * Agregar un book a la editorial
     *
     * @param pagoId El id pago a guardar
     * @param facturaId El id de la factura en la cual se va a guardar el
     * pago.
     * @return El pago que fue agregado a la factura.
     */
    public PagoEntity setPago(Long pagoId, Long facturaId) {
        FacturaEntity facturaEntity = getFactura(facturaId);
        PagoEntity pagoEntity = pagoLogic.getPago(pagoId);
        facturaEntity.setPago(pagoEntity);
        return pagoEntity;
    }

    /**
     * Borrar el pago de una factura
     *
     * @param facturaId id de La factura de la cual se desea eliminar.
     */
    public void removePago(Long facturaId) {
        FacturaEntity facturaEntity = getFactura(facturaId);
        facturaEntity.setPago(null);
    }

    /**
     * Retorna el pago asociado a una factura
     *
     * @param facturaId El id de la editorial a buscar.
     * @return El libro encontrado dentro de la editorial.
     * @throws BusinessLogicException Si el libro no se encuentra en la editorial
     */
    public PagoEntity getPago(Long facturaId) throws BusinessLogicException {
        FacturaEntity facturaEntity = getFactura(facturaId);
        PagoEntity pagoEntity = facturaEntity.getPago();
        if(pagoEntity==null)
        {
        throw new BusinessLogicException("La factura no tiene pago");
        }
        else
        return pagoEntity;

    }

}
