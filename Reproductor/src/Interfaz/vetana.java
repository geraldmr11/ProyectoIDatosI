/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;
//package reproductor_de_musica;
import javax.swing.JOptionPane;
import reproductor.Reproductor;

/**
 *
 * @author PC
 */
public class vetana extends javax.swing.JFrame {

    /**
     * Creates new form vetana
     */
    public vetana() {
        initComponents();
        setLocationRelativeTo(null);    //Se coloca la ventana en el centro
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        Login = new javax.swing.JPanel();
        Usuario = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Contraseña = new javax.swing.JPasswordField();
        Correo = new javax.swing.JTextField();
        botonEntrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        CEMusiicPlayer = new javax.swing.JLabel();

        FondoLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        FondoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondologin.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(204, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(102, 255, 204));

        Usuario.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("Usuario:");

        Password.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Contraseña:");

        Contraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });

        Correo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoActionPerformed(evt);
            }
        });

        botonEntrar.setBackground(new java.awt.Color(51, 51, 255));
        botonEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonEntrar.setForeground(new java.awt.Color(51, 51, 51));
        botonEntrar.setText("Inicar Sesión");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 51, 204));
        Salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        CEMusiicPlayer.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        CEMusiicPlayer.setForeground(new java.awt.Color(0, 0, 0));
        CEMusiicPlayer.setText("CE Music Player");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonEntrar)
                .addGap(14, 14, 14))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(CEMusiicPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password))
                        .addGap(18, 18, 18)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addComponent(CEMusiicPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("tab1", Login);

        jPanel1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 590, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0); // Funcionalidad del boton salir
        
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * Se crea la logica del boton iniciar sesión
     * @param evt 
     */
    
    
  
    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        String CorreoCorrecto = "datos1";
        String ContraseñaCorrecta = "datos1s2";
       

        if(CorreoCorrecto.equals(Correo.getText())){
            String contraseña = ""; // Variable para poder copiar el texto de password

            for(int i=0;i<Contraseña.getPassword().length;i++){ //Recorre el largo de la contraseña
                contraseña += Contraseña.getPassword()[i]; //Copiar contraseña ingresada

            }
            if(ContraseñaCorrecta.equals(contraseña)){ //si se cumple, se ingresa al reproductor

                new Reproductor().setVisible(true);//El usuario es valido por lo que
                //la aplicacion sera dirigida al reproductor
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
            }
        }
        else{
            JOptionPane.showMessageDialog (null,"El usuario no existe");

        }
    }//GEN-LAST:event_botonEntrarActionPerformed

    private void CorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CEMusiicPlayer;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JTextField Correo;
    private javax.swing.JLabel FondoLogin;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton botonEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
