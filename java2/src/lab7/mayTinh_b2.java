/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author macos
 */
public class mayTinh_b2 extends javax.swing.JFrame {

    /**
     * Creates new form mayTinh_b2
     */
    public mayTinh_b2() {
        initComponents();
        setLocationRelativeTo(this);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtKQ = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnCong = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();

        jButton2.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Máy Tính");

        jLabel2.setText("A =");

        jLabel3.setText("B =");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel4.setText("Kết Quả");

        txtKQ.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtKQ.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtKQ, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel6.setText("Phép Tính");

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });

        btnNhan.setText("*");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTru)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChia)
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCong)
                    .addComponent(btnTru)
                    .addComponent(btnNhan)
                    .addComponent(btnChia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        
        int a,b;
        //kt a
        try{
            a = Integer.parseInt(txtA.getText());
            txtA.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtA.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của A!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //kt b
        try{
            b = Integer.parseInt(txtB.getText());
            txtB.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtB.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của B!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtKQ.setText(""+(a+b));
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        int a,b;
        //kt a
        try{
            a = Integer.parseInt(txtA.getText());
            txtA.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtA.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của A!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //kt b
        try{
            b = Integer.parseInt(txtB.getText());
            txtB.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtB.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của B!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtKQ.setText(""+(a-b));
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        int a,b;
        //kt a
        try{
            a = Integer.parseInt(txtA.getText());
            txtA.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtA.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của A!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //kt b
        try{
            b = Integer.parseInt(txtB.getText());
            txtB.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtB.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của B!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtKQ.setText(""+(a*b));
    }//GEN-LAST:event_btnNhanActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        int a,b;
        //kt a
        try{
            a = Integer.parseInt(txtA.getText());
            txtA.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtA.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của A!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //kt b
        try{
            b = Integer.parseInt(txtB.getText());
            txtB.setBackground(Color.WHITE);
        }catch(NumberFormatException e){
            txtB.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng của B!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        double kq = (double)a/b;
        txtKQ.setText(""+kq);
    }//GEN-LAST:event_btnChiaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(mayTinh_b2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mayTinh_b2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mayTinh_b2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mayTinh_b2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mayTinh_b2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnTru;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JLabel txtKQ;
    // End of variables declaration//GEN-END:variables
}
