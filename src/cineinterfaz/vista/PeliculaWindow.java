package cineinterfaz.vista;

import cineinterfaz.controlador.ControladorPeliculaWindow;

/**
 * @author Andrés Cabero Mata
 * @author Patricia Aguado Labrador
 *
 * Vista de pelicula.
 */
public class PeliculaWindow extends javax.swing.JFrame {

    private ControladorPeliculaWindow miControlador;
    private ModeloCineInterfaz miModelo;

    /**
     * Creates new form PeliculaWindow
     */
    public PeliculaWindow(ModeloCineInterfaz miModelo) {
        initComponents();
        this.miModelo = miModelo;
        this.miControlador = new cineinterfaz.controlador.ControladorPeliculaWindow(this, miModelo);
        establecerPelicula();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        menuBar = new javax.swing.JPanel();
        cartelera = new javax.swing.JButton();
        proximos = new javax.swing.JButton();
        infantil = new javax.swing.JButton();
        cartel = new javax.swing.JPanel();
        pelicula = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        hora1 = new javax.swing.JButton();
        hora2 = new javax.swing.JButton();
        hora3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sinopsis = new javax.swing.JTextArea();
        imagenCine = new javax.swing.JButton();
        dia = new javax.swing.JComboBox<>();
        duracion = new javax.swing.JLabel();
        nEntradas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        javax.swing.GroupLayout cartelLayout = new javax.swing.GroupLayout(cartel);
        cartel.setLayout(cartelLayout);
        cartelLayout.setHorizontalGroup(
            cartelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
        cartelLayout.setVerticalGroup(
            cartelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pelicula, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        titulo.setFont(new java.awt.Font("Noto Sans", 1, 24)); // NOI18N
        titulo.setText("Título");

        hora1.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        hora1.setForeground(new java.awt.Color(6, 185, 210));
        hora1.setText("17:15");
        hora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora1ActionPerformed(evt);
            }
        });

        hora2.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        hora2.setForeground(new java.awt.Color(6, 185, 210));
        hora2.setText("20:30");
        hora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora2ActionPerformed(evt);
            }
        });

        hora3.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        hora3.setForeground(new java.awt.Color(6, 185, 210));
        hora3.setText("22:45");
        hora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hora3ActionPerformed(evt);
            }
        });

        sinopsis.setEditable(false);
        sinopsis.setColumns(20);
        sinopsis.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        sinopsis.setRows(5);
        sinopsis.setBorder(null);
        jScrollPane1.setViewportView(sinopsis);

        imagenCine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cineuvalogo.png"))); // NOI18N
        imagenCine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagenCineActionPerformed(evt);
            }
        });

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));

        nEntradas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        jLabel1.setText("Entradas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(duracion)
                    .addComponent(imagenCine)
                    .addComponent(cartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(dia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(26, 26, 26)
                                            .addComponent(hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(titulo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(191, 191, 191))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hora1, hora2, hora3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagenCine, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(duracion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(nEntradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hora3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(hora1)
                                .addComponent(hora2)))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hora1, hora2, hora3});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagenCineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagenCineActionPerformed
        miControlador.home();
    }//GEN-LAST:event_imagenCineActionPerformed

    private void carteleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carteleraActionPerformed
        miControlador.cartelera();
    }//GEN-LAST:event_carteleraActionPerformed

    private void proximosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximosActionPerformed
        miControlador.proximos();
    }//GEN-LAST:event_proximosActionPerformed

    private void infantilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infantilActionPerformed
        miControlador.infantil();
    }//GEN-LAST:event_infantilActionPerformed

    private void hora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora1ActionPerformed
        miControlador.hora1(dia.getSelectedItem().toString(), hora1.getText(), Integer.parseInt(nEntradas.getSelectedItem().toString()));
    }//GEN-LAST:event_hora1ActionPerformed

    private void hora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora2ActionPerformed
        miControlador.hora2(dia.getSelectedItem().toString(), hora2.getText(), Integer.parseInt(nEntradas.getSelectedItem().toString()));
    }//GEN-LAST:event_hora2ActionPerformed

    private void hora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hora3ActionPerformed
        miControlador.hora3(dia.getSelectedItem().toString(), hora3.getText(), Integer.parseInt(nEntradas.getSelectedItem().toString()));
    }//GEN-LAST:event_hora3ActionPerformed

    public void establecerPelicula() {
        pelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource(miModelo.getPelicula().getCartel())));
        titulo.setText(miModelo.getPelicula().getTitulo());
        sinopsis.setText(miModelo.getPelicula().getSinopsis());
        duracion.setText(String.valueOf(miModelo.getPelicula().getDuracion()) + " min");
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartel;
    private javax.swing.JButton cartelera;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JLabel duracion;
    private javax.swing.JButton hora1;
    private javax.swing.JButton hora2;
    private javax.swing.JButton hora3;
    private javax.swing.JButton imagenCine;
    private javax.swing.JButton infantil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JPanel menuBar;
    private javax.swing.JComboBox<String> nEntradas;
    private javax.swing.JLabel pelicula;
    private javax.swing.JButton proximos;
    private javax.swing.JTextArea sinopsis;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
