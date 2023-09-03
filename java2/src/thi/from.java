/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author macos
 */
public class from extends javax.swing.JFrame {
    List<NhanVien> list = new ArrayList<>();
    DefaultTableModel tblModel;
    int index = -1;
    /**
     * Creates new form from
     */
    public from() {
        initComponents();
        setLocationRelativeTo(null);
        initTable();
    }

    public void initTable(){
        tblModel = (DefaultTableModel) tblBang.getModel();
        String[] cols = new String[] {"Mã NV","Họ Tên","Số Điện Thoại"};
        tblModel.setColumnIdentifiers(cols);
    }
     public void fillToTable(Object list){
        tblModel.setRowCount(0);
        for(NhanVien nv: (List<NhanVien>)(Object)list ){
            Object[] row = new Object[]{nv.getMa(),nv.getName(),nv.getSdt()};
            tblModel.addRow(row);
        }
    }
     public void clean(){
        txtName.setText(null);
        txtSDT.setText(null);
        txtMa.setText(null);
     }
     public void showDetail(int index){
        txtName.setText(list.get(index).getName());
        txtSDT.setText(list.get(index).getSdt());
        txtMa.setText(list.get(index).getMa());
     }
     //sap xep ma tăng dần
    public void sapXepMa(){
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return (o1.getMa().compareTo(o2.getMa()));
            }
        };
        Collections.sort(list, comp);
        fillToTable(list);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMa = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btn0 = new javax.swing.JButton();
        btnT1 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnSizeT1 = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã NV");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Số điện thoại");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        btn0.setText("<||");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnT1.setText("<");
        btnT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT1ActionPerformed(evt);
            }
        });

        btnC1.setText(">");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnSizeT1.setText("||>");
        btnSizeT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeT1ActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp Xếp Theo Mã NV");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnT1)
                                .addGap(49, 49, 49)
                                .addComponent(btnC1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSizeT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThem)))
                        .addGap(22, 22, 22))))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnSapXep)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnThem)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnSapXep)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnT1)
                    .addComponent(btnC1)
                    .addComponent(btnSizeT1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
         //kt trống
        if(txtMa.getText().equals("")){
            txtMa.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập mã NV!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtSDT.getText().equals("")){
            txtSDT.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //kt 
        //name
        String name = "[a-z,A-Z ]{5,32}";
        txtName.setText(txtName.getText().trim());//xóa 2 khoảng trắng đầu và cuối
        if(txtName.getText().length()<5 || !txtName.getText().contains(" ") || !txtName.getText().matches(name)){//kt số lượng và có chứa khoảng trắng
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "nhập sai định dạng tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        //sdt
        String sdt = "\\d{9,10}";
        if(!txtSDT.getText().matches(sdt)){
            txtSDT.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng SDT!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        txtMa.setBackground(Color.WHITE);
        txtName.setBackground(Color.WHITE);
        txtSDT.setBackground(Color.WHITE);
        
        NhanVien nv = new NhanVien();
        nv.setMa(txtMa.getText());
        nv.setName(txtName.getText());
        nv.setSdt(txtSDT.getText());
        list.add(nv);
        
        fillToTable(list);
        JOptionPane.showMessageDialog(this, "Đã thêm thành công!");
        clean();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        int index = tblBang.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(txtMa.getText().equals("")){
            txtMa.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập Mã NV!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //xoa
        for(NhanVien i: list){
            if(i.getMa().equals(txtMa.getText())){
                int choice = (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc muốn xóa ?", "confirm", JOptionPane.YES_NO_OPTION));
                
                if(choice == JOptionPane.YES_OPTION){
                    list.remove(i);
                    fillToTable(list);
                    JOptionPane.showMessageDialog(this, "đã xóa thành công");
                    clean();
                    return;
                }else{
                    
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Mã NV không tồn tại!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtMa.getText().equals("")){
            txtMa.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập Mã NV!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if(txtSDT.getText().equals("")){
            txtSDT.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        txtMa.setBackground(Color.WHITE);
        txtName.setBackground(Color.WHITE);
        txtSDT.setBackground(Color.WHITE);
        //sửa
        for(NhanVien i: list){
            if(i.getMa().equals(txtMa.getText())){
                int choice = (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc muốn sửa ?", "confirm", JOptionPane.YES_NO_OPTION));
                
                if(choice == JOptionPane.YES_OPTION){
                    i.setName(txtName.getText());
                    i.setSdt(txtSDT.getText());
                    fillToTable(list);
                    JOptionPane.showMessageDialog(this, "đã sửa thành công");
                    clean();
                    return;
                }else{                   
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Mã NV không tồn tại!");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        tblBang.setRowSelectionInterval(0, 0);
        index = tblBang.getSelectedRow();
        showDetail(index); 
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSizeT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeT1ActionPerformed
        tblBang.setRowSelectionInterval(list.size()-1, list.size()-1);
        index = tblBang.getSelectedRow();
        showDetail(index); 
    }//GEN-LAST:event_btnSizeT1ActionPerformed

    private void btnT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT1ActionPerformed
        // -1
        index = tblBang.getSelectedRow();
        if(index==0){
            index =list.size()-1;
            showDetail(index);   
        }else
        {
            index--;
            showDetail(index);
        }
        tblBang.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnT1ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        // +1
        index = tblBang.getSelectedRow();
        if(index==list.size()-1){
            index =0;
            showDetail(index);   
        }else
        {
            index++;
            showDetail(index);
        }
        tblBang.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        sapXepMa();
    }//GEN-LAST:event_btnSapXepActionPerformed

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
            java.util.logging.Logger.getLogger(from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(from.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new from().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSizeT1;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnT1;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}