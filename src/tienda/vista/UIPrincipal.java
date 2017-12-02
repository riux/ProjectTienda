package tienda.vista;

import javax.swing.JPanel;

/**
 *
 * @author riux
 */
public class UIPrincipal extends javax.swing.JFrame {

    public UIPrincipal() {
        initComponents(); 
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public JPanel getPanel(){
       return  this.panelPrincipal;
    }
    
    public void setPanel(JPanel panel){
        this.panelPrincipal = panel;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenuItem();
        itemSalir = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        itemInventario = new javax.swing.JMenuItem();
        itemEmpleados = new javax.swing.JMenuItem();
        itemVentas = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        itemAcercaDe.setText("Acerca de");
        menuArchivo.add(itemAcercaDe);

        itemSalir.setText("Salir");
        menuArchivo.add(itemSalir);

        jMenuBar1.add(menuArchivo);

        menuOpciones.setText("Opciones");

        itemInventario.setText("Ver inventario");
        menuOpciones.add(itemInventario);

        itemEmpleados.setText("Ver empleados");
        menuOpciones.add(itemEmpleados);

        itemVentas.setText("Ver ventas");
        menuOpciones.add(itemVentas);

        itemReportes.setText("Reportes");
        menuOpciones.add(itemReportes);

        jMenuBar1.add(menuOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemEmpleados;
    private javax.swing.JMenuItem itemInventario;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem itemVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
