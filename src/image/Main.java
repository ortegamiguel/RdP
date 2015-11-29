
package image;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author miguel
 */
public class Main extends javax.swing.JFrame {

    int aux=0;
    int plaza = 0;
    int transicion = 0;
    int marcaje = 0;
    String splaza;
    String strancision;
    
    ArrayList<Plaza> plazas = new ArrayList<>();
    ArrayList<Transicion> transiciones = new ArrayList<>();
    ArrayList<JLabel> labelPlaza = new ArrayList<>();
    ArrayList<JLabel> labelTran = new ArrayList<>();
    
    
    int p1x;
    int p1y;
    int p2x;
    int p2y;
    
    public Main() {
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
        plazas_CB = new javax.swing.JComboBox<>();
        transicion_CB = new javax.swing.JComboBox<>();
        btn_crearArco = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dirección_CB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 36)); // NOI18N
        jLabel1.setText("Red de Petri");

        btn_plaza.setText("Plaza");
        btn_plaza.setBorder(null);
        btn_plaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plazaActionPerformed(evt);
            }
        });

        btn_transicion.setText("Transición");
        btn_transicion.setBorder(null);
        btn_transicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transicionActionPerformed(evt);
            }
        });

        plazas_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        plazas_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazas_CBActionPerformed(evt);
            }
        });

        transicion_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        transicion_CB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transicion_CBActionPerformed(evt);
            }
        });

        btn_crearArco.setText("Agregar Arco");
        btn_crearArco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearArcoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setText("Plazas");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel3.setText("Transiciones");

        dirección_CB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--->", "<---" }));

        jLabel4.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel4.setText("Dirección");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1129, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_plaza, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_transicion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(plazas_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_crearArco, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dirección_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(transicion_CB, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_plaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btn_transicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(plazas_CB)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dirección_CB, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(transicion_CB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_crearArco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void createPlaza(int x, int y, int plaza) {
        int imageWidth = 55, imageHeight = 55, marca = 0;
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        Plaza objPLaza = new Plaza();
        marca = Integer.parseInt( JOptionPane.showInputDialog(null,"Introduzca la marca de la Plaza", "Marca", JOptionPane.QUESTION_MESSAGE) );
        objPLaza.setMarca(marca);
        objPLaza.setNombrePlaza("P" + (plaza + 1));
        objPLaza.setX(x);
        objPLaza.setY(y);
        plazas.add(objPLaza);
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
        labelPlaza.add(label);
        panel.add(label);
        
        //Actualizar lista de plazas en el comboBox
        plazas_CB.removeAllItems();
        Iterator<JLabel> itrT = labelPlaza.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            plazas_CB.addItem(tra.getText());
        }
        splaza = (String) plazas_CB.getSelectedItem();        
    }
    
    public void createTransicion(int x, int y, int transicion) {
        int imageWidth = 55, imageHeight = 55;
        panel.setLayout(null);
        MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
        JLabel label = new JLabel("T " + (transicion + 1));
        Transicion obj_Transicion = new Transicion();
        obj_Transicion.setNombreTransicion("T " + (transicion + 1));
        obj_Transicion.setX(x);
        obj_Transicion.setY(y);
        transiciones.add(obj_Transicion);
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
        labelTran.add(label);
        panel.add(label);
        
        //Actualiza la lista de transiciones
        transicion_CB.removeAllItems();
        Iterator<JLabel> itrT = labelTran.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            transicion_CB.addItem(tra.getText());
        }
    }
    
  
    
    public void createArco(){
        panel.setLayout(null);
    }
    
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
    }//GEN-LAST:event_jToggleButton2ActionPerformed
// cuando se presiona el btn se queda pegado, entonces hay que despegarlo .. xD
    private void btn_plazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plazaActionPerformed
        aux=1;
        btn_plaza.setSelected(false);
    }//GEN-LAST:event_btn_plazaActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        int x1, x2, y1, y2;
        switch (aux) {
            case 1:
                createPlaza(evt.getX(), evt.getY(), plaza);
                panel.repaint();
                aux=0;
                plaza++;
                
                Iterator<JLabel> itre = labelPlaza.iterator();
                while(itre.hasNext()){
                        JLabel pla = itre.next();
                        //System.out.println(pla.getText() + " " + pla.getX());
                }
                
                Iterator<Plaza> itr = plazas.iterator();
                while(itr.hasNext()){
                        Plaza pla = itr.next();
                        //System.out.println(pla.getNombrePlaza() + " " + pla.getMarca() + "-" + pla.getX() + " " + pla.getY());
                }
                break;
            case 2:
                createTransicion(evt.getX(), evt.getY(), transicion);
                panel.repaint();
                aux=0;
                transicion++;
                Iterator<Transicion> itrT = transiciones.iterator();
                while(itrT.hasNext()){
                        Transicion tra = itrT.next();
                        
                        //System.out.println(tra.getNombreTransicion() + " "+ tra.getX() + "-" + tra.getY());
                }
                break;
            case 3:
                
                Graphics g = panel.getGraphics();
                g.drawLine(p1x, p1y, p2x, p2y);
                
                break;
            default:
                break;
        }
  
    }//GEN-LAST:event_panelMouseClicked

    private void btn_transicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transicionActionPerformed
        aux = 2;
        btn_transicion.setSelected(false);
    }//GEN-LAST:event_btn_transicionActionPerformed

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        Graphics g = this.getGraphics();
        
    }//GEN-LAST:event_panelMousePressed

    private void plazas_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plazas_CBActionPerformed
        //Selecciona plaza de la lista y la guarda en splaza
        splaza = (String) plazas_CB.getSelectedItem();
       
    }//GEN-LAST:event_plazas_CBActionPerformed

    private void transicion_CBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transicion_CBActionPerformed
        //Selecciona la transición y la guarda en la variable strancision
        strancision = (String) transicion_CB.getSelectedItem();
    }//GEN-LAST:event_transicion_CBActionPerformed

    private void btn_crearArcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearArcoActionPerformed
        //largo de la flecha
        int dist=15;
        //puntos para la flecha
        int p1xf, p1yf, p2xf, p2yf;
        double angSep=25.0, ang=0.0;
        double ty, tx;
        
        Iterator<JLabel> itrT = labelPlaza.iterator();
        Iterator<JLabel> itrTR = labelTran.iterator();
        while(itrT.hasNext()){
            JLabel tra = itrT.next();
            if (tra.getText().equals(splaza)) {
               p1x = tra.getX() + 35;
               p1y = tra.getY() + 40;
            }
        }
        while(itrTR.hasNext()){
            JLabel tran = itrTR.next();
            if (tran.getText().equals(strancision)) {
                p2x = tran.getX() + 15;
                p2y = tran.getY() + 30;
            }
        }
        
        if (dirección_CB.getSelectedItem().equals("--->")) {
            ty=-(p1y-p2y)*1.0;
            tx=(p1x-p2x)*1.0;
            ang=Math.atan (ty/tx);
            if(tx<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(p2x+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(p2y-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(p2x+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(p2y-dist*Math.sin (ang+Math.toRadians (angSep)));



            Graphics g = panel.getGraphics();
            g.setColor(Color.red);

            g.drawLine(p1x, p1y, p2x, p2y);
            g.drawLine((int)p1xf,(int)p1yf, p2x, p2y);
            g.drawLine((int)p2xf, (int)p2yf, p2x, p2y);
        }else{
            ty=-(p2y-p1y)*1.0;
            tx=(p2x-p1x)*1.0;
            ang=Math.atan (ty/tx);
            if(tx<0)
            {// si tx es negativo aumentar 180 grados
               ang +=Math.PI;
            }
            p1xf=(int)(p1x+dist*Math.cos (ang-Math.toRadians (angSep)));
            p1yf=(int)(p1y-dist*Math.sin (ang-Math.toRadians (angSep)));
            p2xf=(int)(p1x+dist*Math.cos (ang+Math.toRadians (angSep)));
            p2yf=(int)(p1y-dist*Math.sin (ang+Math.toRadians (angSep)));



            Graphics g = panel.getGraphics();
            g.setColor(Color.blue);
            g.drawString("Hello", 10, 10);
            g.drawLine(p1x, p1y, p2x, p2y);
            g.drawLine((int)p1xf,(int)p1yf, p1x, p1y);
            g.drawLine((int)p2xf, (int)p2yf, p1x, p1y);
        }
        
        
        //System.out.println(p1xf);
        //System.out.println(p1yf);
        //System.out.println(p2xf);
        //System.out.println(p2yf);
    }//GEN-LAST:event_btn_crearArcoActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearArco;
    private javax.swing.JToggleButton btn_plaza;
    private javax.swing.JButton btn_transicion;
    private javax.swing.JComboBox<String> dirección_CB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> plazas_CB;
    private javax.swing.JComboBox<String> transicion_CB;
    // End of variables declaration//GEN-END:variables
class MyMouseAdapter extends MouseAdapter {

   private Point initialLoc;
   private Point initialLocOnScreen;
   
   public void mouseClicked(MouseEvent e) {
      Component comp = (Component)e.getSource();
      
      initialLoc = comp.getLocation();
      initialLocOnScreen = e.getLocationOnScreen();
      //System.out.println(comp.getLocation().getX());
      ///p1 = (int)comp.getLocation().getX();
      //p2 = (int)comp.getLocation().getY();
       
      
      
   }

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


class DibujaArco extends JComponent {

    private static final int N = 20;
    private Point n1, n2;

    public DibujaArco(int w, int h) {
        this.setPreferredSize(new Dimension(w, h));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.n1 = new Point(N, N);
        this.n2 = new Point(getWidth() - N, getHeight() - N);
        g.drawLine(n1.x, n1.y, n2.x, n2.y);
        double d = n1.distance(n2);
        this.setToolTipText(String.valueOf(d));
        g.drawString(String.valueOf((int) d),
            (n1.x + n2.x) / 2, (n1.y + n2.y) / 2);
    }

    private void display() {
        JFrame f = new JFrame("EdgeLabel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new DibujaArco(320, 240));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                display();
            }
        });
    }
}


}




