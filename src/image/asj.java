
package image;

import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author miguel
 */
public class asj extends javax.swing.JFrame {

    int aux=0;
    int plaza = 0;
    int transicion = 0;
    int marcaje = 0;
    
    public asj() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_plaza = new javax.swing.JToggleButton();
        btn_transicion = new javax.swing.JButton();

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(254, 254, 254));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.setPreferredSize(new java.awt.Dimension(800, 600));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 855, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setText("Red de Petri");

        btn_plaza.setText("Nueva Plaza");
        btn_plaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plazaActionPerformed(evt);
            }
        });

        btn_transicion.setText("Nueva Transición");
        btn_transicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transicionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_plaza)
                        .addGap(18, 18, 18)
                        .addComponent(btn_transicion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_plaza)
                            .addComponent(btn_transicion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void createPlaza(int x, int y, int plaza) {
        int imageWidth = 55, imageHeight = 55;
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        JLabel label = new JLabel("P" + (plaza + 1));
        ImageIcon icon = new ImageIcon("circulo.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        int eb = 0;
        Border insideBorder = new EmptyBorder(eb, eb, eb, eb);          
        label.setIcon(icono); 
        label.setSize(label.getPreferredSize());
        label.setOpaque(false);
        label.setLocation(x, y);
        label.addMouseListener(myMouseAdapter);
        label.addMouseMotionListener(myMouseAdapter);
        panel.add(label);
    }
    
    public void createTransicion(int x, int y, int transicion) {
        int imageWidth = 55, imageHeight = 55;
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        JLabel label = new JLabel("T" + (transicion + 1));
        ImageIcon icon = new ImageIcon("linea.png");
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imageWidth,imageHeight , Image.SCALE_DEFAULT));
        int eb = 0;
        Border insideBorder = new EmptyBorder(eb, eb, eb, eb);          
        label.setIcon(icono); 
        label.setSize(label.getPreferredSize());
        label.setOpaque(false);
        label.setLocation(x, y);
        label.addMouseListener(myMouseAdapter);
        label.addMouseMotionListener(myMouseAdapter);
        panel.add(label);
    }

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed
// cuando se presiona el btn se queda pegado, entonces hay que despegarlo .. xD
    private void btn_plazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plazaActionPerformed
        aux=1;
        btn_plaza.setSelected(false);
    }//GEN-LAST:event_btn_plazaActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        if (aux == 1) {
            createPlaza(evt.getX(), evt.getY(), plaza);
            panel.repaint();
            aux=0;
            plaza++;
        }else if (aux == 2) {
            createTransicion(evt.getX(), evt.getY(), transicion);
            panel.repaint();
            aux=0;
            transicion++;
        }
  
    }//GEN-LAST:event_panelMouseClicked

    private void btn_transicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transicionActionPerformed
        aux = 2;
        btn_transicion.setSelected(false);
    }//GEN-LAST:event_btn_transicionActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(asj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_plaza;
    private javax.swing.JButton btn_transicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}


class MyMouseAdapter extends MouseAdapter {

   private Point initialLoc;
   private Point initialLocOnScreen;

   @Override
   public void mousePressed(MouseEvent e) {
      Component comp = (Component)e.getSource();
      initialLoc = comp.getLocation();
      initialLocOnScreen = e.getLocationOnScreen();
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      Component comp = (Component)e.getSource();
      Point locOnScreen = e.getLocationOnScreen();

      int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
      int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
      comp.setLocation(x, y);
   }

   @Override
   public void mouseDragged(MouseEvent e) {
      Component comp = (Component)e.getSource();
      Point locOnScreen = e.getLocationOnScreen();

      int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
      int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
      comp.setLocation(x, y);
   }
}


