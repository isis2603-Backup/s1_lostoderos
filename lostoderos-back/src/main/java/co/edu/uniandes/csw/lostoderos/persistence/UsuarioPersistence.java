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
package co.edu.uniandes.csw.lostoderos.persistence;

import co.edu.uniandes.csw.lostoderos.entities.UsuarioEntity;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author s.naranjop1
 */

public class UsuarioPersistence 
{
    private static final Logger LOGGER = Logger.getLogger(ClientePersistence.class.getName());
    
    @PersistenceContext(unitName = "LosToderosPU")
    protected EntityManager em;
    
    public UsuarioEntity create (UsuarioEntity entity)
    {
        LOGGER.info("Creando un usuario nuevo");
        em.persist(entity);
        LOGGER.info("Usuario creado");
        return entity;
    }
    
    public UsuarioEntity find (Long id)
    {
        LOGGER.log(Level.INFO, "Consultando usuario con id={0}", id);
        return em.find(UsuarioEntity.class, id);
    }    
    
    public UsuarioEntity update(UsuarioEntity entity) 
    {
        LOGGER.log(Level.INFO, "Actualizando usuario con id={0}", entity.getId());
        return em.merge(entity);
    }

    public void delete(Long id) 
    {
        LOGGER.log(Level.INFO, "Borrando usuario con id={0}", id);
        UsuarioEntity entity = em.find(UsuarioEntity.class, id);
        em.remove(entity);
    }
}
