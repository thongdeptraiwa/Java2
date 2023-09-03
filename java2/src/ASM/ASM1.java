/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASM;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.* ;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lab5.XFile;
/**
 *
 * @author macos
 */
public class ASM1 extends javax.swing.JFrame implements Runnable{
    List<NhanVien> list = new ArrayList<>();
    List<NhanVienTim> listTim = new ArrayList<>();
    DefaultTableModel tblModel;
    Thread t1 = new Thread(this);
    int index = -1;
    /**
     * Creates new form ASM1
     */
    public ASM1() {
        initComponents();
        setLocationRelativeTo(null);//run ra giua
        //hien gio
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();
//        sdf.applyPattern("hh:mm");
//        lblGio.setText(String.valueOf(sdf.format(date)));
        
        initTable();
        
        //đa luồng cho gio
        t1.start();
    }
    //làm mới
    private void clean(){
        txtMa.setText(null);
        txtName.setText(null);
        txtOld.setText(null);
        txtEmail.setText(null);
        txtLuong.setText(null);
    }
    //set colum table
    public void initTable(){
        tblModel = (DefaultTableModel) tblDanhSachNV.getModel();
        String[] cols = new String[] {"Mã NV","Họ và Tên","Tuổi","Email","Luong"};
        tblModel.setColumnIdentifiers(cols);
    }
    //onclick table
    public void showDetail(int index){     
        txtMa.setText(list.get(index).getMa());
        txtName.setText(list.get(index).getName());
        txtOld.setText(String.valueOf(list.get(index).getOld()));
        txtEmail.setText(list.get(index).getEmail());
        txtLuong.setText(String.valueOf(list.get(index).getLuong()));
        
    }
    public void fillToTable(Object list){
        tblModel.setRowCount(0);
        for(NhanVien nv: (List<NhanVien>)(Object)list ){
            Object[] row = new Object[]{nv.getMa(),nv.getName(),nv.getOld(),nv.getEmail(),nv.getLuong()};
            tblModel.addRow(row);
        }
    }
    public void tim(){
        listTim.clear();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMa().contains(txtMa.getText())){
                NhanVienTim nvTim = new NhanVienTim();
                nvTim.setMa(list.get(i).getMa());
                nvTim.setName(list.get(i).getName());
                nvTim.setOld(list.get(i).getOld());
                nvTim.setEmail(list.get(i).getEmail());
                nvTim.setLuong(list.get(i).getLuong());
                nvTim.setIndex(i);
                listTim.add(nvTim);
            }

        }    
        fillToTable(listTim);   
        index = 0;
        tblDanhSachNV.setRowSelectionInterval(index, index);
        showDetail(index); 
        
    }
    public void saveFile(){
        try {
            XFile.writeObject("/Users/macos/Desktop/thong/java/java2/dataJava2/dateASM.txt",list);
            JOptionPane.showMessageDialog(this, "Lưu thành công");
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
    public void openFile(){
        try{
            list = (List<NhanVien>) XFile.readObject("/Users/macos/Desktop/thong/java/java2/dataJava2/dateASM.txt");
        }catch(Exception ex){
            ex.getMessage();
        }
    }
    //time
    @Override
    public void run() {
        while (true) {            
            Date now = new Date();
            SimpleDateFormat sdf =new SimpleDateFormat("HH:mm");
            lblGio.setText(sdf.format(now));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtOld = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachNV = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblGio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("MÃ NHÂN VIÊN");

        jLabel3.setText("HỌ VÀ TÊN");

        jLabel4.setText("TUỔI");

        jLabel5.setText("EMAIL");

        jLabel6.setText("LƯƠNG");

        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        tblDanhSachNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ));
        tblDanhSachNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachNV);

        jButton1.setText("|<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(">|");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("FIND");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("OPEN");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit))
        );

        lblGio.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblGio.setForeground(new java.awt.Color(255, 51, 51));
        lblGio.setText("giờ");

        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("record 1 of 10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblGio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))
                                .addGap(20, 20, 20)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblGio)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clean();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
          //thong bao chua nhap
        if(txtMa.getText().equals("")){
            txtMa.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chua nhap Ma!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        if(txtName.getText().equals("")){
            txtName.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chua nhap ho va ten!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(new String(txtOld.getText()).equals("")){
            txtOld.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chua nhap tuoi!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(new String(txtEmail.getText()).equals("")){
            txtEmail.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chua nhap Email!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(new String(txtLuong.getText()).equals("")){
            txtLuong.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "Chua nhap luong!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int luong = Integer.parseInt(txtLuong.getText());
        if(luong <=0){
            txtLuong.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "luong sai dinh dang!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int tuoi = Integer.parseInt(txtOld.getText());
        if(tuoi<=18 && tuoi<=65){
            txtOld.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(this, "tuoi sai dinh dang!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        NhanVien nv = new NhanVien();
        
        nv.setMa(txtMa.getText());
        txtMa.setBackground(Color.WHITE);
        
        //test định dạng
        String reTuoi = "\\d{1,2}";
        String reEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        
        
        //name
        txtName.setText(txtName.getText().trim());//xóa 2 khoảng trắng đầu và cuối
        if(txtName.getText().length()<5 || !txtName.getText().contains(" ")){//kt số lượng và có chứa khoảng trắng
            txtName.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng ho va ten!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }  
        nv.setName(txtName.getText());
        txtName.setBackground(Color.WHITE);
        
        //tuoi
        if(!txtOld.getText().matches(reTuoi)){
            txtOld.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng tuoi!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        nv.setOld(Integer.parseInt(txtOld.getText()));          
        txtOld.setBackground(Color.WHITE);
        
        //email
        if(!txtEmail.getText().matches(reEmail)){
            txtEmail.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng email!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        nv.setEmail(txtEmail.getText());
        txtEmail.setBackground(Color.WHITE);
       
        //luong
        try {
            nv.setLuong(Double.parseDouble(txtLuong.getText()));
            txtLuong.setBackground(Color.WHITE);
        } catch (Exception ex) {
            txtLuong.setBackground(Color.RED);
            JOptionPane.showMessageDialog(this, "Nhap sai định dạng luong!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        list.add(nv);
        fillToTable(list);  
        JOptionPane.showMessageDialog(this, "Đã Save thanh cong!");
        saveFile();
        clean();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblDanhSachNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachNVMouseClicked
        int index = tblDanhSachNV.getSelectedRow();
        showDetail(index);
    }//GEN-LAST:event_tblDanhSachNVMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtMa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Chua nhap Ma NV!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //xoa
        for(NhanVien i: list){
            if(i.getMa().equals(txtMa.getText())){
                int choice = (JOptionPane.showConfirmDialog(this, "Detele ?", "confirm", JOptionPane.YES_NO_OPTION));
                
                if(choice == JOptionPane.YES_OPTION){
                    list.remove(i);
                    fillToTable(list);
                    JOptionPane.showMessageDialog(this, "da xoa");
                    clean();
                    return;
                }else{
                    
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "Ma NV khong ton tai!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if(txtMa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Chua nhap Ma NV!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        //find
//        for(NhanVien i: list){
//            if(i.getMa().equals(txtMa.getText())){
//                
//                txtName.setText(i.getName());
//                txtOld.setText(String.valueOf(i.getOld()));
//                txtEmail.setText(i.getEmail());
//                txtLuong.setText(String.valueOf(i.getLuong()));
//                return;
//            }
//        }
        tim();
        
    }//GEN-LAST:event_btnFindActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //quay ve 0
//        int index = tblDanhSachNV.getSelectedRow();
//        index = 0;
//        showDetail(index);
//        tblDanhSachNV.setSelectedRow(index);
        tblDanhSachNV.setRowSelectionInterval(0, 0);
        index = tblDanhSachNV.getSelectedRow();
        showDetail(index); 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//        //len n-1
//        int index = tblDanhSachNV.getSelectedRow();
//        index = list.size()-1;
//        showDetail(index);    
        tblDanhSachNV.setRowSelectionInterval(list.size()-1, list.size()-1);
        index = tblDanhSachNV.getSelectedRow();
        showDetail(index); 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // lui ve -1
        index = tblDanhSachNV.getSelectedRow();
        if(index==0){
            index =list.size()-1;
            showDetail(index);   
        }else
        {
            index--;
            showDetail(index);
        }
        tblDanhSachNV.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //len +1
        index = tblDanhSachNV.getSelectedRow();
        if(index == list.size()-1){
            index = 0;
            showDetail(index);
        }else{
            index++;
            showDetail(index);   
        }
        tblDanhSachNV.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        openFile();
        fillToTable(list);
        clean();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        
    }//GEN-LAST:event_txtMaKeyPressed

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
            java.util.logging.Logger.getLogger(ASM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ASM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ASM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ASM1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ASM1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGio;
    private javax.swing.JTable tblDanhSachNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOld;
    // End of variables declaration//GEN-END:variables
}