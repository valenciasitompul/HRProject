/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeesController;
import icontrollers.IEmployeesController;
import java.awt.Component;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import tools.Koneksi;
import models.Employees;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.JOptionPane;

/**
 *
 * @author RRAAAA
 */
public class EmployeesFrame extends javax.swing.JInternalFrame {
    Koneksi koneksi = new Koneksi();
    IEmployeesController iec = new EmployeesController(koneksi.getConnection());
    private DefaultTableModel tabEmployees;
    JasperDesign JasDes;
    JasperReport JasRep;
    JasperPrint JasPri;

    Map param = new HashMap();
    File All = new File("EmptyReportEmployees.jrxml");
    File byId = new File("EmptyEmployeesReportbyId.jrxml");
    File byName = new File("EmptyRegionReportbyName.jrxml");

    /**
     * Creates new form EmployeesFrame
     */
    public EmployeesFrame() {
        initComponents();
        tabEmployees = new DefaultTableModel();
        Tabel_Employees.setModel(tabEmployees);
        tabEmployees.addColumn("Employee ID");
        tabEmployees.addColumn("First Name");
        tabEmployees.addColumn("Last Name");
        tabEmployees.addColumn("Email");
        tabEmployees.addColumn("Phone Number");
        tabEmployees.addColumn("Hire Date");
        tabEmployees.addColumn("Job ID");
        tabEmployees.addColumn("Salary");
        tabEmployees.addColumn("Commission Percent");
        tabEmployees.addColumn("Manager ID");
        tabEmployees.addColumn("Department ID");

        getDataEmployees();
    }
    /**
     * method untuk menyesuaikan lebar kolom pada tabel sesuai dengan datanya
     */
    public void ColumnAdjuser() {
        for (int column = 0; column < Tabel_Employees.getColumnCount(); column++) {
            TableColumn tableColumn = Tabel_Employees.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();
            for (int row = 0; row < Tabel_Employees.getRowCount(); row++) {
                TableCellRenderer cellRenderer = Tabel_Employees.getCellRenderer(row, column);
                Component c = Tabel_Employees.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + Tabel_Employees.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);
                if (preferredWidth >= maxWidth) {
                    preferredWidth = maxWidth;
                    break;
                }
            }
            tableColumn.setPreferredWidth(preferredWidth);
        }
    }
        public void getDataEmployees(){
        //mengosongkan textfiled id dan name
        resetField();
        
        //menghapus isi table region
        tabEmployees.getDataVector().removeAllElements();
        tabEmployees.fireTableDataChanged();
        //memanggil list data tabel region dari database
        for (Employees emp : iec.getAll()) {
            Object[] obj = new Object[11];
            obj[0] = emp.getId();
            obj[1] = emp.getFName();
            obj[2] = emp.getLName();
            obj[3] = emp.getEmail();
            obj[4] = emp.getPNumber();
            obj[5] = emp.getHiredate();
            obj[6] = emp.getJobid();
            obj[7] = emp.getSalary();
            obj[8] = emp.getCommissionpct();
            obj[9] = emp.getManagerid();
            obj[10] = emp.getDepartmentid();
            tabEmployees.addRow(obj);
        }
        ColumnAdjuser();
    }
        
    public void resetField() {
        txtEmployeeId.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtEmail.setText("");
        txtPNumber.setText("");
        txtHireDate.setText("");
        txtJobId.setText("");
        txtSalary.setText("");
        txtCommission.setText("");
        txtManagerId.setText("");
        txtDepartmentId.setText("");
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtHireDate = new javax.swing.JTextField();
        Label_hireDate = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        txtJobId = new javax.swing.JTextField();
        Label_jobId = new javax.swing.JLabel();
        Label_salary = new javax.swing.JLabel();
        Label_FName = new javax.swing.JLabel();
        Label_commissionPct = new javax.swing.JLabel();
        Label_LName = new javax.swing.JLabel();
        Label_managerId = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        Label_departmentId = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        txtDepartmentId = new javax.swing.JTextField();
        Button_Insert = new javax.swing.JButton();
        Button_Update = new javax.swing.JButton();
        txtManagerId = new javax.swing.JTextField();
        txtCommission = new javax.swing.JTextField();
        Button_Delete = new javax.swing.JButton();
        txtEmployeeId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Employees = new javax.swing.JTable();
        Label_employeeId = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        Combo_Search = new javax.swing.JComboBox<>();
        Label_email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPNumber = new javax.swing.JTextField();
        Label_pNumber = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Employees Frame");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        Label_hireDate.setText("Hire Date");

        txtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalaryActionPerformed(evt);
            }
        });

        txtJobId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobIdActionPerformed(evt);
            }
        });

        Label_jobId.setText("Job ID");

        Label_salary.setText("Salary");

        Label_FName.setText("First Name");

        Label_commissionPct.setText("Commission");

        Label_LName.setText("Last Name");

        Label_managerId.setText("Manager ID");

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        Label_departmentId.setText("Department ID");

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

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        Tabel_Employees.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel_Employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_EmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_Employees);

        Label_employeeId.setText("Employee ID");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        Combo_Search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Name" }));
        Combo_Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo_SearchMouseClicked(evt);
            }
        });

        Label_email.setText("Email");

        txtPNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNumberActionPerformed(evt);
            }
        });

        Label_pNumber.setText("Phone Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_Insert)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Update)
                                .addGap(18, 18, 18)
                                .addComponent(Button_Delete))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Label_email)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Label_FName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Label_hireDate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Label_employeeId)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_salary)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_managerId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(180, 180, 180)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Label_commissionPct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCommission, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Label_departmentId)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Label_pNumber)
                                                .addComponent(Label_LName)
                                                .addComponent(Label_jobId))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtPNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(136, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_employeeId)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_FName)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHireDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_hireDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_salary))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_managerId)
                            .addComponent(txtManagerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_LName))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_pNumber)
                            .addComponent(txtPNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_jobId, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtJobId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_commissionPct)
                            .addComponent(txtCommission, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Label_departmentId)
                            .addComponent(txtDepartmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Insert)
                    .addComponent(Button_Update)
                    .addComponent(Button_Delete))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalaryActionPerformed

    private void txtJobIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobIdActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void Button_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_InsertActionPerformed
        if (txtEmployeeId.getText().equals("")||txtFName.getText().equals("")||txtLName.getText().equals("")||txtEmail.getText().equals("")||txtPNumber.getText().equals("")||txtHireDate.getText().equals("")||txtJobId.getText().equals("")||txtSalary.getText().equals("")||txtCommission.getText().equals("")||txtManagerId.getText().equals("")||txtDepartmentId.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            resetField();
        }
        else{
            iec.insert(txtEmployeeId.getText(), txtFName.getText(), txtLName.getText(), txtEmail.getText(), txtPNumber.getText(), txtHireDate.getText(), txtJobId.getText(), txtSalary.getText(), txtCommission.getText(), txtManagerId.getText(), txtDepartmentId.getText());
            getDataEmployees();
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Disimpan", "Saved", JOptionPane.INFORMATION_MESSAGE);
        }
        txtFName.setEditable(true);
    }//GEN-LAST:event_Button_InsertActionPerformed

    private void Button_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_UpdateActionPerformed
        //        if (txtEmployeeId.getText().equals("")||txtFName.getText().equals("")||txtLName.getText().equals("")||txtEmail.getText().equals("")||txtPNumber.getText().equals("")||txtHireDate.getText().equals("")||txtJobId.getText().equals("")||txtSalary.getText().equals("")||txtCommission.getText().equals("")||txtManagerId.getText().equals("")||txtDepartmentId.getText().equals("")) {
            //            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            //        }else{
            //        iec.update(txtEmployeeId.getText(), txtFName.getText(), txtLName.getText(), txtEmail.getText(), txtPNumber.getText(), txtHireDate.getText(), txtJobId.getText(), txtSalary.getText(), txtCommission.getText(), txtManagerId.getText(), txtDepartmentId.getText());
            //        JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            //        getDataEmployees();
            //        txtFName.setEditable(true);
            //        Button_Insert.setEnabled(true);
            //        }
        if (txtEmployeeId.getText().equals("")||txtSalary.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Mohon Mengisi Data Secara Lengkap!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }else{
            iec.update(txtEmployeeId.getText(), txtSalary.getText());
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Diperbaharui", "Updated", JOptionPane.INFORMATION_MESSAGE);
            getDataEmployees();
            txtFName.setEditable(true);
            Button_Insert.setEnabled(true);
        }
    }//GEN-LAST:event_Button_UpdateActionPerformed

    private void Button_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DeleteActionPerformed
        tabEmployees = (DefaultTableModel) Tabel_Employees.getModel();
        int i = Tabel_Employees.getSelectedRow();

        if (i==-1){
            JOptionPane.showMessageDialog(rootPane, "Mohon Memilih Baris Data!", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {

            String del = Tabel_Employees.getModel().getValueAt(i, 0).toString();
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Yakin Akan Menghapus Data ", "Delete", dialogButton);
            if(dialogResult == 0){
                iec.delete(del);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dihapus", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                getDataEmployees();
                txtEmployeeId.setEditable(true);
                Button_Insert.setEnabled(true);
            }else{
                getDataEmployees();
                txtEmployeeId.setEditable(true);
                Button_Insert.setEnabled(true);
            }
        }
    }//GEN-LAST:event_Button_DeleteActionPerformed

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void Tabel_EmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_EmployeesMouseClicked
        tabEmployees = (DefaultTableModel) Tabel_Employees.getModel();
        int i = Tabel_Employees.getSelectedRow();
        txtEmployeeId.setText(tabEmployees.getValueAt(i, 0).toString());
        txtFName.setText(tabEmployees.getValueAt(i, 1).toString());
        txtLName.setText(tabEmployees.getValueAt(i, 2).toString());
        txtEmail.setText(tabEmployees.getValueAt(i, 3).toString());
        txtPNumber.setText(tabEmployees.getValueAt(i, 4).toString());
        txtHireDate.setText(tabEmployees.getValueAt(i, 5).toString());
        txtJobId.setText(tabEmployees.getValueAt(i, 6).toString());
        txtSalary.setText(tabEmployees.getValueAt(i, 7).toString());
        txtCommission.setText(tabEmployees.getValueAt(i, 8).toString());
        txtManagerId.setText(tabEmployees.getValueAt(i, 9).toString());
        txtDepartmentId.setText(tabEmployees.getValueAt(i, 10).toString());

        txtEmployeeId.setEditable(false);
        Button_Insert.setEnabled(false);
    }//GEN-LAST:event_Tabel_EmployeesMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String filter=(String)Combo_Search.getSelectedItem();
        String val=txtSearch.getText();
        switch (filter){
            case "Id":
            //System.out.println("id" +filter);

            if(val.isEmpty()){
                getDataEmployees();
            }else{
                getDataEmployees();
                tabEmployees.getDataVector().removeAllElements();
                for (Employees emp : iec.getById(val)) {
                    Object[] obj = new Object[11];
                    obj[0] = emp.getId();
                    obj[1] = emp.getFName();
                    obj[2] = emp.getLName();
                    obj[3] = emp.getEmail();
                    obj[4] = emp.getPNumber();
                    obj[5] = emp.getHiredate();
                    obj[6] = emp.getJobid();
                    obj[7] = emp.getSalary();
                    obj[8] = emp.getCommissionpct();
                    obj[9] = emp.getManagerid();
                    obj[10] = emp.getDepartmentid();
                    tabEmployees.addRow(obj);
                }
            }
            break;
            case "Name":
            try {
                //System.out.println("name" +filter);
                if(val.isEmpty()){
                    getDataEmployees();
                }else{
                    getDataEmployees();
                    tabEmployees.getDataVector().removeAllElements();
                    for (Employees emp : iec.getByName(val)) {
                        Object[] obj = new Object[11];
                        obj[0] = emp.getId();
                        obj[1] = emp.getFName();
                        obj[2] = emp.getLName();
                        obj[3] = emp.getEmail();
                        obj[4] = emp.getPNumber();
                        obj[5] = emp.getHiredate();
                        obj[6] = emp.getJobid();
                        obj[7] = emp.getSalary();
                        obj[8] = emp.getCommissionpct();
                        obj[9] = emp.getManagerid();
                        obj[10] = emp.getDepartmentid();
                        tabEmployees.addRow(obj);
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
            getDataEmployees();
        }else{
            getDataEmployees();
            tabregion.getDataVector().removeAllElements();
            for (Region r : iec.search(val)) {
                Object[] obj = new Object[2];
                obj[0] = r.getId();
                obj[1] = r.getName();
                tabregion.addRow(obj);
            }
        }
        */
    }//GEN-LAST:event_txtSearchKeyReleased

    private void Combo_SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo_SearchMouseClicked

    }//GEN-LAST:event_Combo_SearchMouseClicked

    private void txtPNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNumberActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Button_Insert.setEnabled(true);
    }//GEN-LAST:event_formMouseClicked
    
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
            java.util.logging.Logger.getLogger(EmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Delete;
    private javax.swing.JButton Button_Insert;
    private javax.swing.JButton Button_Update;
    private javax.swing.JComboBox<String> Combo_Search;
    private javax.swing.JLabel Label_FName;
    private javax.swing.JLabel Label_LName;
    private javax.swing.JLabel Label_commissionPct;
    private javax.swing.JLabel Label_departmentId;
    private javax.swing.JLabel Label_email;
    private javax.swing.JLabel Label_employeeId;
    private javax.swing.JLabel Label_hireDate;
    private javax.swing.JLabel Label_jobId;
    private javax.swing.JLabel Label_managerId;
    private javax.swing.JLabel Label_pNumber;
    private javax.swing.JLabel Label_salary;
    private javax.swing.JTable Tabel_Employees;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCommission;
    private javax.swing.JTextField txtDepartmentId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtHireDate;
    private javax.swing.JTextField txtJobId;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtManagerId;
    private javax.swing.JTextField txtPNumber;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
