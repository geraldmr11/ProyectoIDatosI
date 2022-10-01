package reproductor;

import javazoom.jlgui.basicplayer.BasicPlayerException;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reproductor extends javax.swing.JFrame {
    
    private lista list = new lista();
    private nodo actual = null;
    private final Zplayer player;
    private Short x = 0;
    private final DefaultListModel lista_modelo = new DefaultListModel();
    private boolean cambios = false;
    protected boolean detenido = false;
  
    public Reproductor() {
        
        setTitle("Reproductor de musica mp3");
        setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconos/icono.png"));
        setIconImage(icon);
        initComponents();
        setLocationRelativeTo(null);
        nombre_can.setEditable(false);
        ControlaVolumen.setEnabled(false);
        
        lista_can.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                JList lista = (JList) evt.getSource();
                if (evt.getClickCount() == 2) {
                    int index = lista.locationToIndex(evt.getPoint());
                    if (index != -1) {
                        actual = list.get_cancion(index);
                        x = 0;
                        playActionPerformed(null);
                    }
                }
            }
        });

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent evt) {
                if (!list.IsEmpety() && cambios) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Guardar cambios?");
                    if (opcion == JOptionPane.YES_OPTION) {
                    }
                }
                System.exit(0);
            }
        });
        player = new Zplayer(this);
    }
    
/**
 * Se guarda las canciones que se habian añadido a la lista 
 * @param dir 
 */
    public void guardarLista(String dir) {
        try {
            BufferedWriter guardar = new BufferedWriter(new FileWriter(dir));
            guardar.write("\r\n");

            nodo aux = list.first;
            while (aux != null) {
                guardar.append(aux.nombre + "<" + aux.direccion + "\r\n");
                aux = aux.siguiente;
            }

            guardar.close();
            cambios = false;
        } catch (Exception e) {
        }
    }
/**
 * Se crea una lista con las canciones previamente guardadas
 */
    public String crearLista() {
        String n = JOptionPane.showInputDialog("digite el nombre de la lista");
        if (n == null || n.isEmpty()) {
            return null;
        }
        
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int seleccion = chooser.showOpenDialog(this);
        File ruta;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            ruta = chooser.getSelectedFile();
        } else {
            return null;
        }
        File save = new File(ruta.getAbsolutePath() + "\\" + n + ".lis");
        if (save.exists()) {
            save.delete();
        }
        return save.getAbsolutePath();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        agregar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        detener = new javax.swing.JButton();
        play = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        anterior = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipo_reproduccion = new javax.swing.JComboBox<>();
        nombre_can = new javax.swing.JTextField();
        ControlaVolumen = new javax.swing.JSlider();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_can = new javax.swing.JList<>();
        GuardarList = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("tipo de reproduccion");

        agregar.setText("Agregar canción");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        eliminar.setText("Quitar canción actual");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        detener.setText("Detener reproducción");
        detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detenerActionPerformed(evt);
            }
        });

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/play.png"))); // NOI18N
        play.setBorderPainted(false);
        play.setContentAreaFilled(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguiente.png"))); // NOI18N
        siguiente.setToolTipText("");
        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/anterior.png"))); // NOI18N
        anterior.setBorderPainted(false);
        anterior.setContentAreaFilled(false);
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sonido.png"))); // NOI18N

        tipo_reproduccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal" }));
        tipo_reproduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo_reproduccionActionPerformed(evt);
            }
        });

        nombre_can.setText("...");
        nombre_can.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_canActionPerformed(evt);
            }
        });

        ControlaVolumen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ControlaVolumenStateChanged(evt);
            }
        });

        jScrollPane2.setViewportView(lista_can);

        GuardarList.setText("GuardarLista");
        GuardarList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarListActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tipo_reproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_can, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(189, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ControlaVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anterior)
                                .addGap(24, 24, 24)
                                .addComponent(play)
                                .addGap(18, 18, 18)
                                .addComponent(siguiente)))
                        .addGap(304, 304, 304))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(21, 21, 21))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(eliminar)
                            .addGap(111, 111, 111)
                            .addComponent(detener)
                            .addGap(83, 83, 83)))))
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(GuardarList)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregar)
                            .addComponent(eliminar)
                            .addComponent(detener))
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombre_can, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(siguiente)
                                    .addComponent(anterior)
                                    .addComponent(play))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ControlaVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addGap(36, 36, 36)
                                .addComponent(tipo_reproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(GuardarList)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
 * Este boton sirve para agregar canciones a la lista del reproductor
 * @param evt 
 */
    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivo MP3", "mp3", "mp3"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(true);
        int seleccion = fileChooser.showOpenDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File files[] = fileChooser.getSelectedFiles();
            boolean noMp3 = false, repetidos = false;
            cambios = true;

            for (File file : files) {
                String name = file.getName();
                if (name.length() < 4 || !name.substring(name.length() - 4, name.length()).equalsIgnoreCase(".mp3")) {
                    noMp3 = true;
                    continue;
                }
                if (list.buscar(file.getName(), file.getPath())) {
                    repetidos = true;
                    continue;
                }
                list.insertar(file.getName(), file.getPath());
                System.out.println(file.getName());
                System.out.println(file.getPath());
                lista_modelo.addElement(file.getName());
                lista_can.setModel(lista_modelo);
            }
            if (noMp3) {
                JOptionPane.showMessageDialog(null, "Se encontro archivo(s) no mp3", "alerta", 0);
            }
            if (repetidos) {
                JOptionPane.showMessageDialog(null, "Se encontraron repetidos", "alerta", 0);
            }
        }
    }//GEN-LAST:event_agregarActionPerformed

/**
 * Este boton sirve para eliminar la cancion seleccionada de la lista
 * @param evt 
 */    
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (list.IsEmpety()) {
            return;
        }
        int b = list.indice(actual);
        if (b == -1) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un\nerror inesperado!!!", "alerta", 1);
        } else {
            lista_modelo.remove(b);
            list.borrar(actual);
            detenerActionPerformed(evt);
            if (list.IsEmpety()) {
                actual = null;
                nombre_can.setText("...");
            } else {
                if (list.tam == 1) {
                    actual = list.first;
                } else {
                    if (actual.siguiente == null) {
                        actual = actual.anterior;
                    } else {
                        actual = actual.siguiente;
                    }
                }
                nombre_can.setText(actual.nombre);
            }
        }
        cambios = true;
    }//GEN-LAST:event_eliminarActionPerformed

    /**
     * Este boton sirve para detener por completo la cancion que se esta reproduciendo
     * el cual la reiniciaria desde el principio la cancion
     * @param evt 
     */
    private void detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detenerActionPerformed
        detenido = true;
        play.setIcon(new ImageIcon(getClass().getResource("/iconos/play.png")));
        try {
            player.control.stop();
            x = 0;
            ControlaVolumen.setEnabled(false);

        } catch (BasicPlayerException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
        detenido = false;
    }//GEN-LAST:event_detenerActionPerformed

/**
 * Al presionar el icono de play se comenzaria a reproducir la musica seleccionada previamente agregada a la lista,
 * de igual manera que el icono de pausar, cuando se presione se pausara la musica.
 * @param evt 
 */
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        detenido = true;
        if (list.IsEmpety()) {
            JOptionPane.showMessageDialog(null, "no hay canciones", "alerta", 1);
        } else {
            if (actual == null) {
                actual = list.first;
            }
            try {
                if (x == 0) {
                    player.control.open(new URL("file:///" + actual.direccion));
                    player.control.play();
                    System.out.println("se inicia");
                    nombre_can.setText(actual.nombre);
                    ControlaVolumen.setEnabled(true);

                    x = 1;
                    play.setIcon(new ImageIcon(getClass().getResource("/iconos/pausa.png")));
                } else {
                    if (x == 1) {
                        player.control.pause();
                        System.out.println("se pausa!!!");
                        x = 2;
                        play.setIcon(new ImageIcon(getClass().getResource("/iconos/play.png")));
                    } else {
                        player.control.resume();
                        System.out.println("se continua!!!");
                        x = 1;
                        play.setIcon(new ImageIcon(getClass().getResource("/iconos/pausa.png")));
                    }
                }
            } catch (BasicPlayerException ex) {
                JOptionPane.showMessageDialog(null, "error al abrir\nla cancion!!!", "alerta", 1);
                x = 0;
            } catch (MalformedURLException ex) {
                Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "error al abrir la direccion\nde la cancion!!!", "alerta", 1);
                x = 0;
            }
        }
        detenido = false;
    }//GEN-LAST:event_playActionPerformed

/**
 * Cuando se presione este icono se reproduciria la siguiente cancion 
 * @param evt 
 */
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        if (actual == null) {
            return;
        }

        switch (tipo_reproduccion.getSelectedIndex()) {
            case 0:
            if (actual.siguiente == null) {
                return;
            }
            actual = actual.siguiente;
            break;

            case 1:
            if (actual.anterior == null) {
                return;
            }
            actual = actual.anterior;
            break;
        }

        x = 0;
        playActionPerformed(evt);
    }//GEN-LAST:event_siguienteActionPerformed

/**
 * Cuando se presione este icono se reproduciria la anterior cancion 
 * @param evt 
 */
    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if (actual == null) {
            return;
        }

        switch (tipo_reproduccion.getSelectedIndex()) {
            case 0:
            if (actual.anterior == null) {
                return;
            }
            actual = actual.anterior;
            break;

            case 1:
            if (actual.siguiente == null) {
                return;
            }
            actual = actual.siguiente;
            break;
        }

        x = 0;
        playActionPerformed(evt);
    }//GEN-LAST:event_anteriorActionPerformed

    private void tipo_reproduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo_reproduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo_reproduccionActionPerformed

    private void nombre_canActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_canActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_canActionPerformed

/**
 * Este control dislizante nos ayuda a bajor y sibir el volumen de la cancion
 * @param evt 
 */
    private void ControlaVolumenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ControlaVolumenStateChanged
        // TODO add your handling code here:
        try {
            player.control.setGain((double) ControlaVolumen.getValue() / 100);
        } catch (BasicPlayerException ex) {
            Logger.getLogger(Reproductor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ControlaVolumenStateChanged

    private void GuardarListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarListActionPerformed
        if (list.IsEmpety()) {
            JOptionPane.showMessageDialog(null, "no hay canciones!!!", "alerta", 1);
            return;
        }
        guardarLista(crearLista());
    }//GEN-LAST:event_GuardarListActionPerformed

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reproductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider ControlaVolumen;
    private javax.swing.JButton GuardarList;
    private javax.swing.JButton agregar;
    private javax.swing.JButton anterior;
    private javax.swing.JButton detener;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista_can;
    private javax.swing.JTextField nombre_can;
    private javax.swing.JButton play;
    private javax.swing.JButton siguiente;
    private javax.swing.JComboBox<String> tipo_reproduccion;
    // End of variables declaration//GEN-END:variables
}