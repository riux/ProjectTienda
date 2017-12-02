package tienda.control;

import java.util.List;
import tienda.entidad.Sucursal;

/**
 *
 * @author riux
 */

public interface InterfaceAcceso {
    
    public List<Sucursal> InterfaceAcceso();
    
    public void recibirSucursal();
    
    public void recibirContrasenia();
    
    public void entrar();
    
}
