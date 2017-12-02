
package tienda.control;

import tienda.vista.UIPrincipal;

/**
 *
 * @author riux
 */
public class GestionMain {
    
    public static UIPrincipal uiPrincipal;
    private GestionAcceso gestionAcceso;
    
    public GestionMain(){
        uiPrincipal = new UIPrincipal();
        gestionAcceso = new GestionAcceso();
    }
    public static void main(String args []){
        new GestionMain();
    }
    
}
