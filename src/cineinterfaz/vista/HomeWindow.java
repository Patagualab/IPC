package cineinterfaz.vista;

import cineinterfaz.controlador.ControladorHomeWindow;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Vista de home.
 */
public class HomeWindow extends javax.swing.JFrame {

    private ControladorHomeWindow miControlador;
    private ModeloCineInterfaz miModelo;

    /**
     * Creates new form HomeWindow
     */
    public HomeWindow(ModeloCineInterfaz miModelo) {
        initComponents();
        this.miModelo = miModelo;
        miControlador = new cineinterfaz.controlador.ControladorHomeWindow(this, miModelo);
        establecerPopulares();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pop1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pop2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        pop3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        pop4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pop5 = new javax.swing.JLabel();
        menuBar = new javax.swing.JPanel();
        cartelera = new javax.swing.JButton();
        proximos = new javax.swing.JButton();
        infantil = new javax.swing.JButton();
        imagenCine = new javax.swing.JButton();
        populares = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setResizable(false);

        jPanel1.setLayout(new java.awt.GridLayout(1, 5));

        pop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pop1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pop1)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pop1)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);

        pop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pop2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pop2)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pop2)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        pop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pop3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pop3)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pop3)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        pop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pop4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(pop4)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(pop4)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        pop5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pop5MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(pop5)
                .addGap(0, 207, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(pop5)
                .addGap(0, 286, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);

        menuBar.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        cartelera.setText("Cartelera");
        cartelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carteleraActionPerformed(evt);
            }
        });
        menuBar.add(cartelera);

        proximos.setText("Próximos");
        proximos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximosActionPerformed(evt);
            }
        });
        menuBar.add(proximos);

        infantil.setText("Infantil");
        infantil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infantilActionPerformed(evt);
            }
        });
        menuBar.add(infantil);

        imagenCine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cineuvalogo.png"))); // NOI18N
        imagenCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenCineActionPerformed(evt);
            }
        });

        populares.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        populares.setForeground(new java.awt.Color(239, 106, 60));
        populares.setText("Populares");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenCine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(58, 58, 58)
                        .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(populares))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenCine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(populares, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pop1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop1MouseReleased
        miControlador.pelicula(miModelo.getPopulares()[0]);
    }//GEN-LAST:event_pop1MouseReleased

    private void pop2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop2MouseReleased
        miControlador.pelicula(miModelo.getPopulares()[1]);
    }//GEN-LAST:event_pop2MouseReleased

    private void pop3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop3MouseReleased
        miControlador.pelicula(miModelo.getPopulares()[2]);
    }//GEN-LAST:event_pop3MouseReleased

    private void pop4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop4MouseReleased
        miControlador.pelicula(miModelo.getPopulares()[3]);
    }//GEN-LAST:event_pop4MouseReleased

    private void pop5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pop5MouseReleased
        miControlador.pelicula(miModelo.getPopulares()[4]);
    }//GEN-LAST:event_pop5MouseReleased

    private void imagenCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenCineActionPerformed
    }//GEN-LAST:event_imagenCineActionPerformed

    private void proximosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximosActionPerformed
        miControlador.proximos();
    }//GEN-LAST:event_proximosActionPerformed

    private void infantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infantilActionPerformed
        miControlador.infantil();
    }//GEN-LAST:event_infantilActionPerformed

    private void carteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteleraActionPerformed
        miControlador.cartelera();
    }//GEN-LAST:event_carteleraActionPerformed

    public void establecerPopulares() {
        pop1.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPopulares()[0].getCartel())));
        pop2.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPopulares()[1].getCartel())));
        pop3.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPopulares()[2].getCartel())));
        pop4.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPopulares()[3].getCartel())));
        pop5.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPopulares()[4].getCartel())));
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartelera;
    private javax.swing.JButton imagenCine;
    private javax.swing.JButton infantil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel menuBar;
    private javax.swing.JLabel pop1;
    private javax.swing.JLabel pop2;
    private javax.swing.JLabel pop3;
    private javax.swing.JLabel pop4;
    private javax.swing.JLabel pop5;
    private javax.swing.JLabel populares;
    private javax.swing.JButton proximos;
    // End of variables declaration//GEN-END:variables
}
