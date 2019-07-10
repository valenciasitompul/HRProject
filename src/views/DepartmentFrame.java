/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DepartmentController;
import icontrollers.IDepartmentController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tools.Koneksi;
import models.Department;

/**
 *
 * @author HARRY-PC
 */
public class DepartmentFrame extends javax.swing.JInternalFrame {
    Koneksi koneksi = new Koneksi();
    IDepartmentController icc = new DepartmentController(koneksi.getConnection());
    
    private DefaultTableModel tableDepartment;
    
    /**
     * Creates new form DepartmentFrame
     */
    public DepartmentFrame() {
        initComponents();
        
        tableDepartment = new DefaultTableModel();
        Tabel_Department.setModel(tableDepartment);
        tableDepartment.addColumn("Department ID");
        tableDepartment.addColumn("Department Name");
        tableDepartment.addColumn("Manager ID");
        tableDepartment.addColumn("Location ID");
        
        getDataDepartment();
    }
    
    public void getDataDepartment(){
        tableDepartment.getDataVector().removeAllElements();
        tableDepartment.fireTableDataChanged();
        for(Department department : icc.getAll() ){
            Object[] objects = new Object[4];
            objects[0] = department.getdptId();
            objects[1] = department.getdptName();
            objects[2] = department.getmgrId();
            objects[3] = department.getlocId();
            tableDepartment.addRow(objects);
        }
    }
    
    public void resetField(){
        txtDepartment_id.setText("");
        txtDepartment_name.setText("");
        txtManager_id.setText("");
        txtLocation_id.setText("");
    }
    
//    public void tampil_combo(){
//        cbRegion_id.removeAllItems();
//        for(Department department : icc.getJustId()){
//            Object[] objects = new Object[1];
//            objects[0] = department.getId();
//            cbRegion_id.addItem(objects[0]);
//        }
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Department = new javax.swing.JTable();
        lblDepartmnet_id = new javax.swing.JLabel();
        lblDepartment_name = new javax.swing.JLabel();
        lblManager_id = new javax.swing.JLabel();
        txtDepartment_id = new javax.swing.JTextField();
        txtDepartment_name = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtManager_id = new javax.swing.JTextField();
        lblLocation_id = new javax.swing.JLabel();
        txtLocation_id = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Form Department");

        Tabel_Department.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_DepartmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Department);

        lblDepartmnet_id.setText("Department ID");

        lblDepartment_name.setText("Department Name");

        lblManager_id.setText("Manager ID");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        lblLocation_id.setText("Location ID");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Title" }));
        cbSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbSearchMouseClicked(evt);
            }
        });
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch)
                        .addGap(18, 18, 18)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLocation_id)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDepartmnet_id)
                                .addComponent(lblDepartment_name)
                                .addComponent(lblManager_id))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnSimpan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit)
                                    .addGap(30, 30, 30)
                                    .addComponent(btnHapus))
                                .addComponent(txtDepartment_id, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(txtDepartment_name)
                                .addComponent(txtManager_id)
                                .addComponent(txtLocation_id)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartmnet_id)
                    .addComponent(txtDepartment_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment_name)
                    .addComponent(txtDepartment_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManager_id)
                    .addComponent(txtManager_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation_id)
                    .addComponent(txtLocation_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(txtDepartment_id.getText().isEmpty() || txtDepartment_name.getText().isEmpty() || txtManager_id.getText().isEmpty() || txtLocation_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }else{
            icc.insert(txtDepartment_id.getText(), txtDepartment_name.getText(), Integer.parseInt(txtManager_id.getText()),Integer.parseInt(txtLocation_id.getText()));
            getDataDepartment();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        txtDepartment_id.setEditable(true);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtDepartment_id.getText().isEmpty() || txtDepartment_name.getText().isEmpty() || txtManager_id.getText().isEmpty() || txtLocation_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }else{
            icc.update(txtDepartment_id.getText(), txtDepartment_name.getText(), Integer.parseInt(txtManager_id.getText()),Integer.parseInt(txtLocation_id.getText()));
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getDataDepartment();
            resetField();
            txtDepartment_id.setEditable(true);
            btnSimpan.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void Tabel_DepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_DepartmentMouseClicked
        tableDepartment = (DefaultTableModel) Tabel_Department.getModel();
       int i = Tabel_Department.getSelectedRow();
       txtDepartment_id.setText(tableDepartment.getValueAt(i, 0).toString());
       txtDepartment_name.setText(tableDepartment.getValueAt(i, 1).toString());
       txtManager_id.setText(tableDepartment.getValueAt(i, 2).toString());
       txtLocation_id.setText(tableDepartment.getValueAt(i, 3).toString());
       
       txtDepartment_id.setEditable(false);
       txtManager_id.setEditable(false);
      
       btnSimpan.setEnabled(false);
    }//GEN-LAST:event_Tabel_DepartmentMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        tableDepartment = (DefaultTableModel) Tabel_Department.getModel();
        int i = Tabel_Department.getSelectedRow();
        
        if(i==-1){
            JOptionPane.showMessageDialog(rootPane, "Mohon Memilih Baris Data!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String del = Tabel_Department.getModel().getValueAt(i, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin Akan Menghapus Data ", "Delete", dialogButton);
            if(dialogResult == 0){
                icc.delete(del);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                getDataDepartment();
                resetField();
                txtDepartment_id.setEditable(true);
                btnSimpan.setEnabled(true);
            }else{
                getDataDepartment();
                txtDepartment_id.setEditable(true);
                btnSimpan.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String filter=(String)cbSearch.getSelectedItem();
        String val=txtSearch.getText();
        switch (filter){
            case "Id":
                if(val.isEmpty()){
                getDataDepartment();
            }else{
                getDataDepartment();
                tableDepartment.getDataVector().removeAllElements();
               // icc.getAll();
                for (Department d: icc.getById(val)) {
                    Object[] obj = new Object[4];
                    obj[0] = d.getdptId();
                    obj[1] = d.getdptName();
                    obj[2] = d.getmgrId();
                    obj[3] = d.getlocId();
                    tableDepartment.addRow(obj);
                }
            }
            break;
            case "Title":
            try {
                    if(val.isEmpty()){
                    getDataDepartment();
                }else{
                    getDataDepartment();
                    tableDepartment.getDataVector().removeAllElements();
                    for (Department d : icc.getByName(val)) {
                        Object[] obj = new Object[4];
                        obj[0] = d.getdptId();
                        obj[1] = d.getdptName();
                        obj[2] = d.getmgrId();
                        obj[3] = d.getlocId();
                        tableDepartment.addRow(obj);
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            break;
            default:
            break;
        }  // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void cbSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbSearchMouseClicked

    }//GEN-LAST:event_cbSearchMouseClicked

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Department;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDepartment_name;
    private javax.swing.JLabel lblDepartmnet_id;
    private javax.swing.JLabel lblLocation_id;
    private javax.swing.JLabel lblManager_id;
    private javax.swing.JTextField txtDepartment_id;
    private javax.swing.JTextField txtDepartment_name;
    private javax.swing.JTextField txtLocation_id;
    private javax.swing.JTextField txtManager_id;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
