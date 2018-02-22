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

import co.edu.uniandes.csw.lostoderos.entities.UsuarioEntity;
import java.util.List;

/**
 * Clase que extiende de {@link UsuarioDTO} para manejar la transformacion entre
 * los objetos JSON y las Entidades de la base de datos. Para conocer el
 * contenido del usuario vaya a la documentacion de {@link UsuarioDTO}
 * 
 * Al serializarse como JSON esta clase implementa el siguiente modelo: <br>
 * <pre>
 *   {
 *      "id": number,
 *      "nombre": string,
 *      "usuario": string,
 *      "contraseña": string,
 *      "correo": string,
 *      "servicios": 
 *      [
 *         {
 *           "id": number,
 *           "nombre": string,
 *           "reputacion": string,
 *           "disponibilidad": boolean
 *         },
 *         {
 *           "id": number,
 *           "nombre": string,
 *           "reputacion": string,
 *           "disponibilidad": boolean
 *         }
 *      ]
 *   }
 * </pre>
 * Por ejemplo una entidad de Servicio se representa asi:<br>
 * <pre>
 *
 *   {
 *      "id": 91852,
 *      "nombre": "Juan Perez",
 *      "usuario": "Jperez",
 *      "contraseña": "enero1999",
 *      "correo": "Jperez@gmail.com",
 *      "servicios": 
 *      [
 *         {
 *           "id": 91852,
 *           "nombre": "Plomería",
 *           "categorias": "agua y tuberias",
 *           "descripción": "Aqui va una descripcion detallada del servicio"
 *         },
 *         {
 *           "id": 91853,
 *           "nombre": "Mantenimiento sistema electrico",
 *           "categorias": "Electricidad",
 *           "descripción": "Aqui va una descripcion detallada del servicio"
 *         }
 *      ]
 *   }
 *
 * </pre>
 * @author s.naranjop1
 */
public class UsuarioDetailDTO extends UsuarioDTO
{
    
        private List<ServicioDTO> servicios;
        
        /**
	 * Constructor por defecto
	 */
        
	public UsuarioDetailDTO( )
	{
                super();
        }   
        
        public List getServicios()
        {
                return servicios;
        }

        public void setServicios(List servicios) 
        {
                this.servicios = servicios;
        }
        
        /**
	 * Transformar un DTO a un Entity
	 *
	 * @return La entidad construida a partir del DTO.
	 */
	@Override
	public UsuarioEntity toEntity( )
	{
		UsuarioEntity usuarioEntity = super.toEntity( );
		return usuarioEntity;
	}
}
