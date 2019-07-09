/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.CountryController;
import icontrollers.ICountryController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tools.Koneksi;
import models.Country;

/**
 *
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
    }
    
    public void getDataCountry(){
        tableCountry.getDataVector().removeAllElements();
        tableCountry.fireTableDataChanged();
        for(Country country : icc.getAll() ){
            Object[] objects = new Object[3];
            objects[0] = country.getId();
            objects[1] = country.getName();
            objects[2] = country.getRegion_id();
            tableCountry.addRow(objects);
        }
    }
    
    public void resetField(){
        txtCountry_id.setText("");
        txtCountry_name.setText("");
        txtRegion_id.setText("");
    }
    
//    public void tampil_combo(){
//        cbRegion_id.removeAllItems();
//        for(Country country : icc.getJustId()){
//            Object[] objects = new Object[1];
//            objects[0] = country.getId();
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
        Tabel_Country = new javax.swing.JTable();
        lblCountry_id = new javax.swing.JLabel();
        lblCountry_name = new javax.swing.JLabel();
        lblRegion_id = new javax.swing.JLabel();
        txtCountry_id = new javax.swing.JTextField();
        txtCountry_name = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtRegion_id = new javax.swing.JTextField();

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
        jScrollPane1.setViewportView(Tabel_Country);

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

        btnHapus.setText("Hapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCountry_id)
                            .addComponent(lblCountry_name)
                            .addComponent(lblRegion_id)
                            .addComponent(btnSimpan))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCountry_id, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(txtCountry_name)
                                    .addComponent(txtRegion_id))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry_id)
                    .addComponent(txtCountry_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCountry_name)
                    .addComponent(txtCountry_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion_id)
                    .addComponent(txtRegion_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnEdit)
                    .addComponent(btnHapus))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(txtCountry_id.getText().isEmpty() || txtCountry_name.getText().isEmpty() || txtRegion_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }else{
            icc.insert(txtCountry_id.getText(), txtCountry_name.getText(), txtRegion_id.getText());
            getDataCountry();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        txtCountry_id.setEditable(true);
    }//GEN-LAST:event_btnSimpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel_Country;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCountry_id;
    private javax.swing.JLabel lblCountry_name;
    private javax.swing.JLabel lblRegion_id;
    private javax.swing.JTextField txtCountry_id;
    private javax.swing.JTextField txtCountry_name;
    private javax.swing.JTextField txtRegion_id;
    // End of variables declaration//GEN-END:variables
}
