/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CountryController;
import icontrollers.ICountryController;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tools.Koneksi;
import models.Country;
import models.Region;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * fungsi untuk membuat tampilan menu item country frame yang menjalankan operasi CRUD
 * @author HARRY-PC
 */
public class CountryFrame extends javax.swing.JInternalFrame {
    Koneksi koneksi = new Koneksi();
    ICountryController icc = new CountryController(koneksi.getConnection());
    
    private DefaultTableModel tableCountry;
    
    /**
     * Creates new form CountryFrame
     */
    public CountryFrame() {
        initComponents();
        
        tableCountry = new DefaultTableModel();
        Tabel_Country.setModel(tableCountry);
        tableCountry.addColumn("Country ID");
        tableCountry.addColumn("Country Name");
        tableCountry.addColumn("Region ID");
        
        getDataCountry();
        
        tampil_combo();
    }
    
    /**
     * fungsi untuk mengambil data dari tabel COUNTRIES agar tampil di country frame
     */
    public void getDataCountry(){
        tableCountry.getDataVector().removeAllElements();
        tableCountry.fireTableDataChanged();
        load(icc.getAll());
    }
    
    /**
     * fungsi untuk meghapus nilai inputan pada text field
     */
    public void resetField(){
        txtCountry_id.setText("");
        txtCountry_name.setText("");
//        txtRegion_id.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Country = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblCountry_id = new javax.swing.JLabel();
        lblCountry_name = new javax.swing.JLabel();
        lblRegion_id = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        txtCountry_id = new javax.swing.JTextField();
        txtCountry_name = new javax.swing.JTextField();
        cbRegion_id = new javax.swing.JComboBox<>();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Countries");

        Tabel_Country.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Country.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_CountryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Country);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country ID", "Country Name" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Details of Country"));

        lblCountry_id.setText("Country ID");

        lblCountry_name.setText("Country Name");

        lblRegion_id.setText("Region ID");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRegion_id)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSimpan))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cbRegion_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountry_name)
                            .addComponent(lblCountry_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCountry_id, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                            .addComponent(txtCountry_name)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry_id)
                    .addComponent(txtCountry_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry_name)
                    .addComponent(txtCountry_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion_id)
                    .addComponent(cbRegion_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void tampil_combo(){
        for(Region r : icc.getRegionId()){
            cbRegion_id.addItem(String.valueOf(r.getId()));
        }
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(txtCountry_id.getText().isEmpty() || txtCountry_name.getText().isEmpty() || cbRegion_id.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }else{
            icc.insert(txtCountry_id.getText(), txtCountry_name.getText(), cbRegion_id.getSelectedItem().toString());
            getDataCountry();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        txtCountry_id.setEditable(true);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(txtCountry_id.getText().isEmpty() || txtCountry_name.getText().isEmpty() || cbRegion_id.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }else{
            icc.update(txtCountry_id.getText(), txtCountry_name.getText(), cbRegion_id.getSelectedItem().toString());
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getDataCountry();
            resetField();
            txtCountry_id.setEditable(true);
            btnSimpan.setEnabled(true);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void Tabel_CountryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_CountryMouseClicked
       tableCountry = (DefaultTableModel) Tabel_Country.getModel();
       int i = Tabel_Country.getSelectedRow();
       txtCountry_id.setText(tableCountry.getValueAt(i, 0).toString());
       txtCountry_name.setText(tableCountry.getValueAt(i, 1).toString());
       txtCountry_id.setEditable(false);
       btnSimpan.setEnabled(false);
    }//GEN-LAST:event_Tabel_CountryMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        tableCountry = (DefaultTableModel) Tabel_Country.getModel();
        int i = Tabel_Country.getSelectedRow();
        
        if(i==-1){
            JOptionPane.showMessageDialog(rootPane, "Mohon Memilih Baris Data!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String del = Tabel_Country.getModel().getValueAt(i, 0).toString();
            if(JOptionPane.showConfirmDialog(this, "Yakin Akan Menghapus Data ", "Delete", JOptionPane.YES_NO_OPTION) == 0){
                icc.delete(del);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                getDataCountry();
                resetField();
                txtCountry_id.setEditable(true);
                btnSimpan.setEnabled(true);
            }else{
                getDataCountry();
                txtCountry_id.setEditable(true);
                btnSimpan.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        String filter=(String)cbSearch.getSelectedItem();
        String val = txtSearch.getText();
        switch(filter){
            case "Country ID":
                searchCountry(val);
                break;
             case "Country Name":
                 searchCountry(txtSearch.getText());
                 break;
             default:
                 break;
        }
    }//GEN-LAST:event_txtSearchActionPerformed

    public void searchCountry(String val){
        try {
            if (val.isEmpty()) {
                getDataCountry();
            }else{
                getDataCountry();
                tableCountry.getDataVector().removeAllElements();
                load(icc.search(val));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void load(List<Country> data){
        for(Country c : data){
            Object[] obj = new Object[3];
            obj[0] = c.getId();
            obj[1] = c.getName();
            obj[2] = c.getRegion_id();
            tableCountry.addRow(obj); 
         }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Country;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbRegion_id;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountry_id;
    private javax.swing.JLabel lblCountry_name;
    private javax.swing.JLabel lblRegion_id;
    private javax.swing.JTextField txtCountry_id;
    private javax.swing.JTextField txtCountry_name;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
