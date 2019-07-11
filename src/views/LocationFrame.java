package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import controllers.LocationController;
import icontrollers.ILocationController;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import models.Location;
import tools.Koneksi;

/**
 * fungsi untuk membuat tampilan menu item location frame yang menjalankan operasi CRUD
 * @author Fachrurrozy
 */
public class LocationFrame extends javax.swing.JInternalFrame {
    Koneksi koneksi = new Koneksi();
    ILocationController ilc = new LocationController(koneksi.getConnection());
    private DefaultTableModel tablocation;
     Map param = new HashMap();
    
    /**
     * Creates new form LocationFram
     */
    public LocationFrame() {
        initComponents();
        tablocation = new DefaultTableModel();
        Tabel_Location.setModel(tablocation);
        tablocation.addColumn("Location ID");
        tablocation.addColumn("Street ad ");
        tablocation.addColumn("Pose code ");
        tablocation.addColumn("City ");
        tablocation.addColumn("staProv ");
        tablocation.addColumn("Country Id");
        
        getDataLocation();
    }
    
    public void ColumnAdjuser()
    {
        for (int column = 0; column < Tabel_Location.getColumnCount(); column++)
        {
            TableColumn tableColumn = Tabel_Location.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();
            for (int row = 0; row < Tabel_Location.getRowCount(); row++)
            {
                TableCellRenderer cellRenderer = Tabel_Location.getCellRenderer(row, column);
                Component c = Tabel_Location.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + Tabel_Location.getIntercellSpacing().width;
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
    
    /**
     * fungsi untuk mengambil data dari tabel LOCATIONS agar tampil di location frame
     */
    public void getDataLocation(){
        resetField();
        
        //menghapus isi table
        tablocation.getDataVector().removeAllElements();
        tablocation.fireTableDataChanged();
        //memanggil list data tabel dari database
        for (Location l : ilc.getAll()) {
            Object[] obj = new Object[6];
            obj[0] = l.getlocId();
            obj[1] = l.getstrAdd();
            obj[2] = l.getposCode();
            obj[3] = l.getCity();
            obj[4] = l.getstaProv();
            obj[5] = l.getcounId();
            tablocation.addRow(obj);
        }
        ColumnAdjuser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Search_Text = new javax.swing.JTextField();
        Combo_Search = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Location = new javax.swing.JTable();
        City_Text = new javax.swing.JTextField();
        SP_Text = new javax.swing.JTextField();
        Country_Text = new javax.swing.JTextField();
        Label_CountryID = new javax.swing.JLabel();
        Label_StateProvince = new javax.swing.JLabel();
        Label_City = new javax.swing.JLabel();
        LocId_Text = new javax.swing.JTextField();
        SA_Text = new javax.swing.JTextField();
        Postal_Text = new javax.swing.JTextField();
        Button_Delete = new javax.swing.JButton();
        Button_Update = new javax.swing.JButton();
        Button_Insert = new javax.swing.JButton();
        Label_PostalCode = new javax.swing.JLabel();
        Label_StreetAddress = new javax.swing.JLabel();
        Label_LocationID = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Form Locations");

        Search_Text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TextKeyReleased(evt);
            }
        });

        Combo_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LocId", "City" }));
        Combo_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo_SearchMouseClicked(evt);
            }
        });

        Tabel_Location.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_LocationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Location);

        Label_CountryID.setText("Country ID");

        Label_StateProvince.setText("State Province");

        Label_City.setText("City");

        LocId_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocId_TextActionPerformed(evt);
            }
        });

        Postal_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Postal_TextActionPerformed(evt);
            }
        });

        Button_Delete.setText("Delete");
        Button_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DeleteActionPerformed(evt);
            }
        });

        Button_Update.setText("Update");
        Button_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_UpdateActionPerformed(evt);
            }
        });

        Button_Insert.setText("Insert");
        Button_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_InsertActionPerformed(evt);
            }
        });

        Label_PostalCode.setText("Postal Code");

        Label_StreetAddress.setText("Street Addres");

        Label_LocationID.setText("Location ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button_Insert)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Update)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Delete)
                        .addGap(370, 370, 370))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_StreetAddress)
                                .addComponent(Label_LocationID)
                                .addComponent(Label_PostalCode))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LocId_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(SA_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(Postal_Text))
                            .addGap(64, 64, 64)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Label_City)
                                .addComponent(Label_StateProvince)
                                .addComponent(Label_CountryID))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(City_Text)
                                .addComponent(SP_Text)
                                .addComponent(Country_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search_Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_LocationID)
                    .addComponent(LocId_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_City)
                    .addComponent(City_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_StreetAddress)
                    .addComponent(SA_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_StateProvince)
                    .addComponent(SP_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_PostalCode)
                    .addComponent(Postal_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_CountryID)
                    .addComponent(Country_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Insert)
                    .addComponent(Button_Update)
                    .addComponent(Button_Delete))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * fungsi untuk meghapus nilai inputan pada text field
     */
    public void resetField(){
        locId_Text.setText("");
        SA_Text.setText("");
        Postal_Text.setText("");
        City_Text.setText("");
        SP_Text.setText("");
        Country_Text.setText("");
    }
     
       
    
    private void Search_TextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TextKeyReleased
        String filter=(String)Combo_Search.getSelectedItem();
        String val=Search_Text.getText();
        switch (filter){
            case "locId":
            System.out.println("locId" +filter);
                System.out.println(val);

            if(val.isEmpty()){
                getDataLocation();
            }else{
                getDataLocation();
                tablocation.getDataVector().removeAllElements();
                for (Location l : ilc.getLocById(val)) {
                    Object[] obj = new Object[6];
                     obj[0] = l.getlocId();
                    obj[1] = l.getstrAdd();
                    obj[2] = l.getposCode();
                    obj[3] = l.getCity();
                    obj[4] = l.getstaProv();
                    obj[5] = l.getcounId();
                    tablocation.addRow(obj);
                }
            }
            break;
            case "City":
            try {
                System.out.println("City" +filter);
                System.out.println(val);                    //System.out.println("name" +filter);
                if(val.isEmpty()){
                     getDataLocation();
                }else{
                     getDataLocation();
                     tablocation.getDataVector().removeAllElements();
                     for (Location l : ilc.getByCity(val)) {
                     Object[] obj = new Object[6];
                       obj[0] = l.getlocId();
                       obj[1] = l.getstrAdd();
                       obj[2] = l.getposCode();
                       obj[3] = l.getCity();
                       obj[4] = l.getstaProv();
                       obj[5] = l.getcounId();
                      tablocation.addRow(obj);
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

        
    }//GEN-LAST:event_Search_TextKeyReleased

    private void Combo_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo_SearchMouseClicked

    }//GEN-LAST:event_Combo_SearchMouseClicked

    private void Tabel_LocationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_LocationMouseClicked
        tablocation = (DefaultTableModel) Tabel_Location.getModel();
        int i = Tabel_Location.getSelectedRow();
        locId_Text.setText(tablocation.getValueAt(i, 0).toString());
        SA_Text.setText(tablocation.getValueAt(i, 1).toString());
        Postal_Text.setText(tablocation.getValueAt(i, 2).toString());
        City_Text.setText(tablocation.getValueAt(i, 3).toString());
        SP_Text.setText(tablocation.getValueAt(i, 4).toString());
        Country_Text.setText(tablocation.getValueAt(i, 5).toString());
        locId_Text.setEditable(false);
        Button_Insert.setEnabled(false);
    }//GEN-LAST:event_Tabel_LocationMouseClicked

    private void locId_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locId_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locId_TextActionPerformed

    private void Postal_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Postal_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Postal_TextActionPerformed

    private void Button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeleteActionPerformed
        tablocation = (DefaultTableModel) Tabel_Location.getModel();
        int i = Tabel_Location.getSelectedRow();

        if (i==-1){
            JOptionPane.showMessageDialog(rootPane, "Mohon Memilih Baris Data!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String del = Tabel_Location.getModel().getValueAt(i, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin Akan Menghapus Data ", "Delete", dialogButton);
            if(dialogResult == 0){
                ilc.delete(del);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                getDataLocation();
                locId_Text.setEditable(true);
                Button_Insert.setEnabled(true);
            }else{
                getDataLocation();
                locId_Text.setEditable(true);
                Button_Insert.setEnabled(true);
            }
        }
    }//GEN-LAST:event_Button_DeleteActionPerformed

    private void Button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpdateActionPerformed
        if (locId_Text.getText().equals("")||SA_Text.getText().equals("")||Postal_Text.getText().equals("")||City_Text.getText().equals("")||SP_Text.getText().equals("")||Country_Text.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }else{
            ilc.update(locId_Text.getText(), SA_Text.getText(), Postal_Text.getText(), City_Text.getText(), SP_Text.getText(), Country_Text.getText());
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getDataLocation();
            locId_Text.setEditable(true);
            Button_Insert.setEnabled(true);
        }
    }//GEN-LAST:event_Button_UpdateActionPerformed

    private void Button_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InsertActionPerformed
        if (locId_Text.getText().equals("")||(SA_Text.getText().equals(""))||(Postal_Text.getText().equals(""))||(City_Text.getText().equals(""))
            ||(SP_Text.getText().equals(""))||(Country_Text.getText().equals(""))) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        else{
            ilc.insert(locId_Text.getText(), SA_Text.getText(),Postal_Text.getText(),City_Text.getText(),SP_Text.getText(),Country_Text.getText());
            getDataLocation();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
        }
        locId_Text.setEditable(true);
    }//GEN-LAST:event_Button_InsertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton Button_Insert;
    private javax.swing.JButton Button_Update;
    private javax.swing.JTextField City_Text;
    private javax.swing.JComboBox<String> Combo_Search;
    private javax.swing.JTextField Country_Text;
    private javax.swing.JLabel Label_City;
    private javax.swing.JLabel Label_CountryID;
    private javax.swing.JLabel Label_LocationID;
    private javax.swing.JLabel Label_PostalCode;
    private javax.swing.JLabel Label_StateProvince;
    private javax.swing.JLabel Label_StreetAddress;
    private javax.swing.JTextField LocId_Text;
    private javax.swing.JTextField Postal_Text;
    private javax.swing.JTextField SA_Text;
    private javax.swing.JTextField SP_Text;
    private javax.swing.JTextField Search_Text;
    private javax.swing.JTable Tabel_Location;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
