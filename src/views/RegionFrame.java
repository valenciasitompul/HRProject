/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.RegionController;
import icontrollers.IRegionController;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import models.Region;
import tools.Koneksi;

/**
 *
 * @author Bella
 */
public class RegionFrame extends javax.swing.JInternalFrame {
    Koneksi koneksi = new Koneksi();
    IRegionController irc = new RegionController(koneksi.getConnection());
    private DefaultTableModel tabregion;

    /**
     * Creates new form RegionFrame
     */
    public RegionFrame() {
        initComponents();
        tabregion = new DefaultTableModel();
        Tabel_Region.setModel(tabregion);
        tabregion.addColumn("Region ID");
        tabregion.addColumn("Region Name");
        
        getDataRegion();
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
        Tabel_Region = new javax.swing.JTable();
        Search_Text = new javax.swing.JTextField();
        Combo_Search = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        Label_Id = new javax.swing.JLabel();
        Id_Text = new javax.swing.JTextField();
        Label_Name = new javax.swing.JLabel();
        Name_Text = new javax.swing.JTextField();
        Button_Insert = new javax.swing.JButton();
        Button_Update = new javax.swing.JButton();
        Button_Delete = new javax.swing.JButton();

        setClosable(true);
        setTitle("Form Regions");

        Tabel_Region.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Region.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_RegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Region);

        Search_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TextKeyReleased(evt);
            }
        });

        Combo_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name" }));
        Combo_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo_SearchMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail of Region"));
        jPanel1.setToolTipText("");

        Label_Id.setText("Id");

        Id_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_TextActionPerformed(evt);
            }
        });

        Label_Name.setText("Name");

        Button_Insert.setText("Insert");
        Button_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InsertActionPerformed(evt);
            }
        });

        Button_Update.setText("Update");
        Button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UpdateActionPerformed(evt);
            }
        });

        Button_Delete.setText("Delete");
        Button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_Name)
                    .addComponent(Label_Id))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Id_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(Button_Insert)
                .addGap(18, 18, 18)
                .addComponent(Button_Update)
                .addGap(18, 18, 18)
                .addComponent(Button_Delete)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Id)
                    .addComponent(Id_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Name)
                    .addComponent(Name_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Insert)
                    .addComponent(Button_Update)
                    .addComponent(Button_Delete))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ColumnAdjuser()
    {
        for (int column = 0; column < Tabel_Region.getColumnCount(); column++)
        {
            TableColumn tableColumn = Tabel_Region.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();
            for (int row = 0; row < Tabel_Region.getRowCount(); row++)
            {
                TableCellRenderer cellRenderer = Tabel_Region.getCellRenderer(row, column);
                Component c = Tabel_Region.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + Tabel_Region.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);
                if (preferredWidth >= maxWidth)
                {
                    preferredWidth = maxWidth;
                    break;
                }
            }
            tableColumn.setPreferredWidth( preferredWidth );
        }
    }
    
    public void resetField(){
        Id_Text.setText("");
        Name_Text.setText("");
    }
    
    public void getDataRegion(){
        //mengosongkan textfiled id dan name
        resetField();
        
        //menghapus isi table region
        tabregion.getDataVector().removeAllElements();
        tabregion.fireTableDataChanged();
        //memanggil list data tabel region dari database
        for (Region r : irc.getAll()) {
            Object[] obj = new Object[2];
            obj[0] = r.getId();
            obj[1] = r.getName();
            tabregion.addRow(obj);
        }
        ColumnAdjuser();
    }
    
    private void Tabel_RegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_RegionMouseClicked
        tabregion = (DefaultTableModel) Tabel_Region.getModel();
        int i = Tabel_Region.getSelectedRow();
        Id_Text.setText(tabregion.getValueAt(i, 0).toString());
        Name_Text.setText(tabregion.getValueAt(i, 1).toString());
        Id_Text.setEditable(false);
        Button_Insert.setEnabled(false);
    }//GEN-LAST:event_Tabel_RegionMouseClicked

    private void Search_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TextKeyReleased
        String filter=(String)Combo_Search.getSelectedItem();
        String val=Search_Text.getText();
        switch (filter){
            case "Id":
            //System.out.println("id" +filter);

            if(val.isEmpty()){
                getDataRegion();
            }else{
                getDataRegion();
                tabregion.getDataVector().removeAllElements();
                for (Region r : irc.getById(val)) {
                    Object[] obj = new Object[2];
                    obj[0] = r.getId();
                    obj[1] = r.getName();
                    tabregion.addRow(obj);
                }
            }
            break;
            case "Name":
            try {
                //System.out.println("name" +filter);
                if(val.isEmpty()){
                    getDataRegion();
                }else{
                    getDataRegion();
                    tabregion.getDataVector().removeAllElements();
                    for (Region r : irc.getByName(val)) {
                        Object[] obj = new Object[2];
                        obj[0] = r.getId();
                        obj[1] = r.getName();
                        tabregion.addRow(obj);
                    }
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            break;
            default:
            break;
        }

        /*
        //menampilkan hasil pencarian secara umum tanpa parameter
        String val=Search_Text.getText();
        if(val.isEmpty()){
            getDataRegion();
        }else{
            getDataRegion();
            tabregion.getDataVector().removeAllElements();
            for (Region r : irc.search(val)) {
                Object[] obj = new Object[2];
                obj[0] = r.getId();
                obj[1] = r.getName();
                tabregion.addRow(obj);
            }
        }
        */
    }//GEN-LAST:event_Search_TextKeyReleased

    private void Combo_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo_SearchMouseClicked

    }//GEN-LAST:event_Combo_SearchMouseClicked

    private void Id_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_TextActionPerformed

    private void Button_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InsertActionPerformed
        if (Id_Text.getText().equals("")||(Name_Text.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        else{
            irc.insert(Id_Text.getText(), Name_Text.getText());
            getDataRegion();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
        }
        Id_Text.setEditable(true);
    }//GEN-LAST:event_Button_InsertActionPerformed

    private void Button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpdateActionPerformed
        if (Id_Text.getText().equals("")||(Name_Text.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }else{
            irc.update(Id_Text.getText(), Name_Text.getText());
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getDataRegion();
            Id_Text.setEditable(true);
            Button_Insert.setEnabled(true);
        }
    }//GEN-LAST:event_Button_UpdateActionPerformed

    private void Button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeleteActionPerformed
        tabregion = (DefaultTableModel) Tabel_Region.getModel();
        int i = Tabel_Region.getSelectedRow();

        if (i==-1){
            JOptionPane.showMessageDialog(rootPane, "Mohon Memilih Baris Data!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String del = Tabel_Region.getModel().getValueAt(i, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin Akan Menghapus Data ", "Delete", dialogButton);
            if(dialogResult == 0){
                irc.delete(del);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                getDataRegion();
                Id_Text.setEditable(true);
                Button_Insert.setEnabled(true);
            }else{
                getDataRegion();
                Id_Text.setEditable(true);
                Button_Insert.setEnabled(true);
            }
        }
    }//GEN-LAST:event_Button_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton Button_Insert;
    private javax.swing.JButton Button_Update;
    private javax.swing.JComboBox<String> Combo_Search;
    private javax.swing.JTextField Id_Text;
    private javax.swing.JLabel Label_Id;
    private javax.swing.JLabel Label_Name;
    private javax.swing.JTextField Name_Text;
    private javax.swing.JTextField Search_Text;
    private javax.swing.JTable Tabel_Region;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
