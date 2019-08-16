/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import com.sun.prism.paint.Color;
import javax.swing.JOptionPane;


public final class JugadorVrss extends javax.swing.JFrame {

    private String turno="X";
    public JugadorVrss() {
        initComponents();
        setSize(1000,650);
        transparencia();
        setLocationRelativeTo(null);
 
       
    }
    private void ganadorx(){
        
        JOptionPane.showMessageDialog(null,"El ganador es : X ","FELIZIDADES", JOptionPane.INFORMATION_MESSAGE);
    }
     private void ganadorO(){
        
        JOptionPane.showMessageDialog(null,"El ganador es: O ","FELIZIDADES", JOptionPane.INFORMATION_MESSAGE);
    }
    public void transparencia(){
    jButton1.setOpaque(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setBorderPainted(false);
    jButton2.setOpaque(false);
    jButton2.setContentAreaFilled(false);
    jButton2.setBorderPainted(false);
    jButton3.setOpaque(false);
    jButton3.setContentAreaFilled(false);
    jButton3.setBorderPainted(false);
    jButton4.setOpaque(false);
    jButton4.setContentAreaFilled(false);
    jButton4.setBorderPainted(false);
    jButton5.setOpaque(false);
    jButton5.setContentAreaFilled(false);
    jButton5.setBorderPainted(false);
    jButton6.setOpaque(false);
    jButton6.setContentAreaFilled(false);
    jButton6.setBorderPainted(false);
    jButton7.setOpaque(false);
    jButton7.setContentAreaFilled(false);
    jButton7.setBorderPainted(false);
    jButton8.setOpaque(false);
    jButton8.setContentAreaFilled(false);
    jButton8.setBorderPainted(false);
    jButton9.setOpaque(false);
    jButton9.setContentAreaFilled(false);
    jButton9.setBorderPainted(false);
     
    
    }
    private void seleccionxo(){
       if(turno.equalsIgnoreCase("X")) {
           turno="0";
       }
       else{
           turno="X";
       }
    }
    private void determinarGanado(){
        String uno =jButton1.getText();
        String dos =jButton2.getText();
        String tres =jButton3.getText();
        String cuatro =jButton4.getText();
        String cinco =jButton5.getText();
        String seis=jButton6.getText();
        String siete=jButton7.getText();
        String ocho=jButton8.getText();
        String nueve=jButton9.getText();
       if(uno.equals("X")&& dos.equals("X")&& tres.equals("X") ){
        ganadorx();
        return;
        } else if(cuatro.equals("X")&& cinco.equals("X")&& seis.equals("X")){
          ganadorx();
           return;
        } else if(siete.equals("X")&&ocho.equals("X")&& nueve.equals("X")){
           ganadorx();
           return;
        } else if(uno.equals("X")&&cuatro.equals("X")&& siete.equals("X")) {
           ganadorx();
          return;
        } else if (dos.equals("X")&&cinco.equals("X")&&ocho.equals("X")){
          ganadorx();  
          return;
        }else if(tres.equals("X")&& seis.equals("X")&& nueve.equals("X")){
         ganadorx(); 
          return;
        } else if(uno.equals("X")&&cinco.equals("X")&& nueve.equals("X")){
            ganadorx();
          return;
        }else if(tres.equals("X") && cinco.equals("X") && siete.equals("X")){
            ganadorx(); 
          return;
        } //Evaluacion para 0
        else if(uno.equals("0")&& dos.equals("0")&& tres.equals("0") ){
             ganadorO();
          return;
        } else if(cuatro.equals("0")&&(cinco.equals("0") && seis.equals("0"))){
          ganadorO();
          return;
        } else if(siete.equals("0")&&(ocho.equals("0")&& nueve.equals("0"))){
         ganadorO();
         return;
        } else if(uno.equals("0")&&(cuatro.equals("0")&&(siete.equals("0")))) {
          ganadorO();
         return;
        } else if (dos.equals("0")&&(cinco.equals("0")&&(ocho.equals("0")))){
         ganadorO();
        return;
        }else if(tres.equals("0")&&(seis.equals("0")&&nueve.equals("0"))){
         ganadorO();
        return;
        }else if(uno.equals("0")&&cinco.equals("0")&& nueve.equals("0")){
        ganadorO();
        return;
        }else if(tres.equals("0") && cinco.equals("0") && siete.equals("0")){
        ganadorO();
         return;
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Salir = new javax.swing.JToggleButton();
        Reinicio = new javax.swing.JToggleButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\od\\Desktop\\Juegos progra\\TittacFinal\\TittacFinal\\TicTacFinsl\\src\\imagenes\\Salir - copia.jpg")); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 200, 60));

        Reinicio.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Reinicio.setIcon(new javax.swing.ImageIcon("C:\\Users\\od\\Desktop\\Juegos progra\\TittacFinal\\TittacFinal\\TicTacFinsl\\src\\imagenes\\reiniciar-el-entorno-de-escritorio-linux.png")); // NOI18N
        Reinicio.setText("Reiniciar");
        Reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReinicioActionPerformed(evt);
            }
        });
        getContentPane().add(Reinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 200, 60));

        jButton9.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 100, 100));

        jButton6.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, 100));

        jButton3.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 100, 100));

        jButton8.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 100, 100));

        jButton5.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 100, 100));

        jButton2.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 100, 100));

        jButton1.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 100));

        jButton4.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 100, 100));

        jButton7.setFont(new java.awt.Font("Arial", 1, 72)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 100, 100));

        jButton10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\od\\Desktop\\Juegos progra\\TittacFinal\\TittacFinal\\TicTacFinsl\\src\\imagenes\\descargar.jfif")); // NOI18N
        jButton10.setText("Regresar ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 430, 200, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\od\\Desktop\\Juegos progra\\TittacFinal\\TittacFinal\\TicTacFinsl\\src\\imagenes\\Fondo.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     jButton1.setText(turno);
     seleccionxo();
     if(turno.equalsIgnoreCase("X")){
        jButton1.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton1.setForeground(java.awt.Color.red);
     }
     determinarGanado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      jButton6.setText(turno);
       seleccionxo();
        if(turno.equalsIgnoreCase("X")){
        jButton6.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton6.setForeground(java.awt.Color.red);
     }
                  determinarGanado();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      jButton7.setText(turno);
       seleccionxo();
        if(turno.equalsIgnoreCase("X")){
        jButton7.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton7.setForeground(java.awt.Color.red);
     }
             determinarGanado();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      jButton2.setText(turno);
       seleccionxo();
        if(turno.equalsIgnoreCase("X")){
        jButton2.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton2.setForeground(java.awt.Color.red);
     }
             determinarGanado();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jButton3.setText(turno);
     seleccionxo();
      if(turno.equalsIgnoreCase("X")){
        jButton3.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton3.setForeground(java.awt.Color.red);
     }
           determinarGanado();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(turno);
         seleccionxo();
          if(turno.equalsIgnoreCase("X")){
        jButton4.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton4.setForeground(java.awt.Color.red);
     }
               determinarGanado();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      jButton5.setText(turno);
       seleccionxo();
        if(turno.equalsIgnoreCase("X")){
        jButton5.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton5.setForeground(java.awt.Color.red);
     }
             determinarGanado();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      jButton8.setText(turno);
       seleccionxo();
        if(turno.equalsIgnoreCase("X")){
        jButton8.setForeground(java.awt.Color.WHITE);
    }else
     {
          jButton8.setForeground(java.awt.Color.red);
     }
             determinarGanado();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       jButton9.setText(turno);
        seleccionxo();
         if(turno.equalsIgnoreCase("X")){
        jButton9.setForeground(java.awt.Color.WHITE);
     }else
     {
          jButton9.setForeground(java.awt.Color.red);
     }
         
              determinarGanado();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(WIDTH);
    }//GEN-LAST:event_SalirActionPerformed

    private void ReinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReinicioActionPerformed
       boolean hola =true;
         jButton1.setText("");
         jButton2.setText("");
         jButton3.setText("");
         jButton4.setText("");
         jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    }//GEN-LAST:event_ReinicioActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      PantallaInicio regresar =new PantallaInicio();
       regresar.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JugadorVrss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugadorVrss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugadorVrss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugadorVrss.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugadorVrss().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Reinicio;
    private javax.swing.JToggleButton Salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   
}
