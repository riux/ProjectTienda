
package tienda.control;


import java.awt.FlowLayout;
import java.util.List;
import tienda.entidad.Sucursal;
import tienda.vista.UIAcceso;
import tienda.vista.UIBienvenida;

/**
 *
 * @author riux
 */
public class GestionAcceso implements InterfaceAcceso{
    
    private UIAcceso uiAcceso;
    private UIBienvenida uiBienvenida;
    
    public GestionAcceso(){
        uiAcceso = new UIAcceso(this);
        uiBienvenida = new UIBienvenida();
        
        GestionMain.uiPrincipal.getPanel().removeAll();
        GestionMain.uiPrincipal.getPanel().setLayout(new FlowLayout());
        GestionMain.uiPrincipal.getPanel().add(uiAcceso);
        GestionMain.uiPrincipal.getPanel().updateUI();
        
    }
    

    @Override
    public List<Sucursal> InterfaceAcceso() {
        return null;
    }

    @Override
    public void recibirSucursal() {
    }

    @Override
    public void recibirContrasenia() {
    }

    @Override
    public void entrar() {
        GestionMain.uiPrincipal.getPanel().removeAll();
        GestionMain.uiPrincipal.getPanel().setLayout(new FlowLayout());
        GestionMain.uiPrincipal.getPanel().add(uiBienvenida);
        GestionMain.uiPrincipal.getPanel().updateUI();
    }
    
}
