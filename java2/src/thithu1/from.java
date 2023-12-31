/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thithu1;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab5.XFile;

/**
 *
 * @author macos
 */
public class from extends javax.swing.JFrame {
    List<SinhVien> list = new ArrayList<>();
    List<SinhVienTim> listTim = new ArrayList<>();
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
        String[] cols = new String[] {"Tên","Điểm"};
        tblModel.setColumnIdentifiers(cols);
    }
     public void fillToTable(Object list){
        tblModel.setRowCount(0);
        for(SinhVien nv: (List<SinhVien>)(Object)list ){
            Object[] row = new Object[]{nv.getName(),nv.getDiem()};
            tblModel.addRow(row);
        }
    }
     public void clean(){
        txtName.setText(null);
        txtDiem.setText(null);
     }
     public void showDetail(int index){
         txtName.setText(list.get(index).getName());
        txtDiem.setText(""+list.get(index).getDiem());
     }
      public void saveFile(){
        try {
            XFile.writeObject("/Users/macos/Desktop/thong/java/java2/dataJava2/datethithu.txt",list);
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    public void openFile(){
        try{
            list = (List<SinhVien>) XFile.readObject("/Users/macos/Desktop/thong/java/java2/dataJava2/datethithu.txt");
            if(list.size()==0){
                JOptionPane.showMessageDialog(this, "Date không có dữ liệu!");
            }else{
                JOptionPane.showMessageDialog(this, "Đọc thành công");
            }
            
        }catch(Exception ex){
            ex.getMessage();
        }
    }
//     public void tim(){
//        listTim.clear();
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).getName().contains(txtName.getText())){
//                SinhVienTim svTim = new SinhVienTim();
//                svTim.setName(list.get(i).getName());
//                svTim.setDiem(list.get(i).getDiem());
//                svTim.setIndex(i);
//                listTim.add(svTim);
//            }
//
//        }    
//        fillToTable(listTim);   
//        index = 0;
//        tblBang.setRowSelectionInterval(index, index);
//        showDetail(index); 
//        
//    }
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
        txtName = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnT1 = new javax.swing.JButton();
        btnSize = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên");

        jLabel2.setText("Điểm");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
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

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
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

        btn0.setText("<<");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnC1.setText("<|");
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnT1.setText("|>");
        btnT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnT1ActionPerformed(evt);
            }
        });

        btnSize.setText(">>");
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(161, 161, 161)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn0)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnC1)
                                .addGap(18, 18, 18)
                                .addComponent(btnT1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSize)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLuu)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoc)
                                .addGap(40, 40, 40))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnDoc))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0)
                    .addComponent(btnC1)
                    .addComponent(btnT1)
                    .addComponent(btnSize))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //kt trống
        if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtDiem.getText().equals("")){
            txtDiem.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập điểm!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //kt 
        //name
        txtName.setText(txtName.getText().trim());//xóa 2 khoảng trắng đầu và cuối
        if(txtName.getText().length()<5 || !txtName.getText().contains(" ")){//kt số lượng và có chứa khoảng trắng
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "nhập sai định dạng tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        //diem
        double diem = Double.parseDouble(txtDiem.getText());
        if(diem<0 || diem>10){
            txtDiem.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "nhập sai định dạng điểm!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtName.setBackground(Color.WHITE);
        txtDiem.setBackground(Color.WHITE);
        
        SinhVien sv = new SinhVien();
        sv.setName(txtName.getText());
        sv.setDiem(Double.parseDouble(txtDiem.getText()));
        list.add(sv);
        
        fillToTable(list);
        JOptionPane.showMessageDialog(this, "Đã thêm thành công!");
        clean();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        int index = tblBang.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblBangMouseClicked

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
//        tim();
    }//GEN-LAST:event_txtNameKeyPressed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        tblBang.setRowSelectionInterval(0, 0);
        index = tblBang.getSelectedRow();
        showDetail(index); 
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        tblBang.setRowSelectionInterval(list.size()-1, list.size()-1);
        index = tblBang.getSelectedRow();
        showDetail(index); 
    }//GEN-LAST:event_btnSizeActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed

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
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnT1ActionPerformed
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
    }//GEN-LAST:event_btnT1ActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //xoa
        for(SinhVien i: list){
            if(i.getName().equals(txtName.getText())){
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
        JOptionPane.showMessageDialog(this, "ten khong ton tai!");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(txtDiem.getText().equals("")){
            txtDiem.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chưa nhập điểm!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //diem
        double diem = Double.parseDouble(txtDiem.getText());
        if(diem<0 || diem>10){
            txtDiem.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "nhập sai định dạng điểm!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtName.setBackground(Color.WHITE);
        txtDiem.setBackground(Color.WHITE);
        //sửa
        for(SinhVien i: list){
            if(i.getName().equals(txtName.getText())){
                int choice = (JOptionPane.showConfirmDialog(this, "Bạn có chắc chắc muốn sửa ?", "confirm", JOptionPane.YES_NO_OPTION));
                
                if(choice == JOptionPane.YES_OPTION){
                    i.setDiem(Double.parseDouble(txtDiem.getText()));
                    fillToTable(list);
                    JOptionPane.showMessageDialog(this, "đã sửa thành công");
                    clean();
                    return;
                }else{                   
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "ten khong ton tai!");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        saveFile();
        clean();
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        openFile();
        fillToTable(list);
        clean();
    }//GEN-LAST:event_btnDocActionPerformed

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
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSize;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnT1;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
