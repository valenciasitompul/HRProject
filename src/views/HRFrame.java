/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import tools.Koneksi;

/**
 *
 * @author HARRY-PC
 */
public class HRFrame extends javax.swing.JFrame {
    
    Koneksi koneksi = new Koneksi();
    
    JasperReport JasRep;
    JasperPrint JasPri;
    JasperDesign JasDes;
    Map param = new HashMap();
    File CountryReportAll = new File("src/reports/CountriesReport.jrxml");
    File CountryReportById = new File("src/reports/CountriesReportBYID.jrxml");
    File DepartmentReportAll = new File("src/reports/DepartmentReport.jrxml");
    File DepartmentReportById = new File("src/reports/DepartmentReportById.jrxml");
    
    File JobReportAll = new File("src/reports/JobsReportALL.jrxml");
    File JobReportById = new File("src/reports/JobsReportBYID.jrxml");
    File RegionReportAll = new File("src/reports/RegionReportAll.jrxml");
    File RegionReportById = new File("src/reports/RegionReportById.jrxml");
    File EmployeeReportAll = new File("src/reports/EmployeeReportALL.jrxml");
    File EmployeeReportById = new File("src/reports/EmployeeReportBYID.jrxml");
    File LocationReportAll = new File("src/reports/LocationReport.jrxml");
    File LocationReportById = new File("src/reports/LocationReportByID.jrxml");
    
    /**
     * Creates new form HRFrame
     */
    public HRFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu7 = new javax.swing.JMenu();
        HR_DesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        getCountryReportAll = new javax.swing.JMenuItem();
        getCountryReportById = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        getDeptReportAll = new javax.swing.JMenuItem();
        getDeptReportByID = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        getEmpAll = new javax.swing.JMenuItem();
        getEmpById = new javax.swing.JMenuItem();
        jMenuJobs = new javax.swing.JMenu();
        getJobReportAll = new javax.swing.JMenuItem();
        getJobReportById = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        getRegionReportAll = new javax.swing.JMenuItem();
        getRegionReportById = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        getLocationReportAll = new javax.swing.JMenuItem();
        getLocationReportById = new javax.swing.JMenuItem();

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HR_DesktopPane.setToolTipText("");

        javax.swing.GroupLayout HR_DesktopPaneLayout = new javax.swing.GroupLayout(HR_DesktopPane);
        HR_DesktopPane.setLayout(HR_DesktopPaneLayout);
        HR_DesktopPaneLayout.setHorizontalGroup(
            HR_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1202, Short.MAX_VALUE)
        );
        HR_DesktopPaneLayout.setVerticalGroup(
            HR_DesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 773, Short.MAX_VALUE)
        );

        jMenu1.setText("File Master");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Countries");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Departments");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Employees");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Jobs");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Locations");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Regions");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Laporan");

        jMenu3.setText("Countries");

        getCountryReportAll.setText("Semua Data");
        getCountryReportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCountryReportAllActionPerformed(evt);
            }
        });
        jMenu3.add(getCountryReportAll);

        getCountryReportById.setText("Berdasarkan ID");
        getCountryReportById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getCountryReportByIdActionPerformed(evt);
            }
        });
        jMenu3.add(getCountryReportById);

        jMenu2.add(jMenu3);

        jMenu4.setText("Departments");

        getDeptReportAll.setText("Semua Data");
        getDeptReportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDeptReportAllActionPerformed(evt);
            }
        });
        jMenu4.add(getDeptReportAll);

        getDeptReportByID.setText("Berdasarkan ID");
        getDeptReportByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDeptReportByIDActionPerformed(evt);
            }
        });
        jMenu4.add(getDeptReportByID);

        jMenu2.add(jMenu4);

        jMenu5.setText("Employees");

        getEmpAll.setText("Semua Data");
        getEmpAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmpAllActionPerformed(evt);
            }
        });
        jMenu5.add(getEmpAll);

        getEmpById.setText("Berdasarkan ID");
        getEmpById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmpByIdActionPerformed(evt);
            }
        });
        jMenu5.add(getEmpById);

        jMenu2.add(jMenu5);

        jMenuJobs.setText("Jobs");

        getJobReportAll.setText("Semua Data");
        getJobReportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getJobReportAllActionPerformed(evt);
            }
        });
        jMenuJobs.add(getJobReportAll);

        getJobReportById.setText("Berdasarkan ID");
        getJobReportById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getJobReportByIdActionPerformed(evt);
            }
        });
        jMenuJobs.add(getJobReportById);

        jMenu2.add(jMenuJobs);

        jMenu8.setText("Regions");

        getRegionReportAll.setText("Semua Data");
        getRegionReportAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRegionReportAllActionPerformed(evt);
            }
        });
        jMenu8.add(getRegionReportAll);

        getRegionReportById.setText("Berdasarkan ID");
        getRegionReportById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getRegionReportByIdActionPerformed(evt);
            }
        });
        jMenu8.add(getRegionReportById);

        jMenu2.add(jMenu8);

        jMenu6.setText("Locations");

        getLocationReportAll.setText("Semua Data");
        jMenu6.add(getLocationReportAll);

        getLocationReportById.setText("Berdasarkan ID");
        getLocationReportById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLocationReportByIdActionPerformed(evt);
            }
        });
        jMenu6.add(getLocationReportById);

        jMenu2.add(jMenu6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HR_DesktopPane)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HR_DesktopPane)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CountryFrame cf = new CountryFrame();
        HR_DesktopPane.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JobFrame jf = new JobFrame();
        HR_DesktopPane.add(jf);
        jf.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            // TODO add your handling code here:
        DepartmentFrame df = new DepartmentFrame();
        HR_DesktopPane.add(df);
        df.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        LocationFrame lf = new LocationFrame();
        HR_DesktopPane.add(lf);
        lf.setVisible(true);  
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        EmployeesFrame ef = new EmployeesFrame();
        HR_DesktopPane.add(ef);
        ef.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void getCountryReportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCountryReportAllActionPerformed
        try {
            JasDes = JRXmlLoader.load(CountryReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getCountryReportAllActionPerformed

    private void jMenuIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIDActionPerformed
    
     
    }//GEN-LAST:event_jMenuIDActionPerformed

    private void jMenuAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAllActionPerformed
        
    }//GEN-LAST:event_jMenuAllActionPerformed

    private void getCountryReportByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCountryReportByIdActionPerformed
        String CountryId = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(CountryId.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(CountryReportById);
                param.put("country_id", CountryId);
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Countries Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getCountryReportByIdActionPerformed

    private void getDeptReportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDeptReportAllActionPerformed
        // TODO add your handling code here:
          try {
            JasDes = JRXmlLoader.load(DepartmentReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getDeptReportAllActionPerformed

    private void getDeptReportByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDeptReportByIDActionPerformed
        // TODO add your handling code here:
       String DepartmentId = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(DepartmentId.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(DepartmentReportById);
                param.put("Department_Id", DepartmentId);
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Department Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getDeptReportByIDActionPerformed

    private void getRegionReportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRegionReportAllActionPerformed
         try {
            JasDes = JRXmlLoader.load(RegionReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }       // TODO add your handling code here:
    }//GEN-LAST:event_getRegionReportAllActionPerformed

    private void getRegionReportByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getRegionReportByIdActionPerformed
        String regionId = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(regionId.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(RegionReportById);
                param.put("region_id", regionId);
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Region Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_getRegionReportByIdActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RegionFrame rf = new RegionFrame();
        HR_DesktopPane.add(rf);
        rf.setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void getJobReportAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getJobReportAllActionPerformed
         try {
            JasDes = JRXmlLoader.load(JobReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getJobReportAllActionPerformed

    private void getJobReportByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getJobReportByIdActionPerformed
        String jobId = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(jobId.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(JobReportById);
                param.put("job_id", jobId);
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Jobs Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_getJobReportByIdActionPerformed

    private void getEmpAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmpAllActionPerformed
        // TODO add your handling code here:
        try {
            JasDes = JRXmlLoader.load(EmployeeReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_getEmpAllActionPerformed

    private void getEmpByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmpByIdActionPerformed
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(EmployeeReportById);
                param.put("emp_id", Integer.parseInt(id));
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Jobs Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getEmpByIdActionPerformed

    private void getLocationReportAllActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
       try {
            JasDes = JRXmlLoader.load(LocationReportAll);
            param.clear();
            JasRep = JasperCompileManager.compileReport(JasDes);
            JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
            JInternalFrame frame = new JInternalFrame("Laporan");
            frame.getContentPane().add(new JRViewer(JasPri));
            frame.pack();
            frame.setResizable(true);
            frame.setClosable(true);
            frame.setMaximizable(true);
            frame.setSize(1000,800);
            frame.setVisible(true);
            //JasperViewer.viewReport(JasPri, false);
            HR_DesktopPane.add(frame);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }  
    
    private void getLocationReportByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getLocationReportByIdActionPerformed
        // TODO add your handling code here:
        String id = JOptionPane.showInputDialog(rootPane, "Masukkan id");
        try {
            if(id.isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Masukkan inputan!!!!");
            }else{
                JasDes = JRXmlLoader.load(LocationReportById);
                param.put("emp_id", Integer.parseInt(id));
                JasRep = JasperCompileManager.compileReport(JasDes);
                JasPri = JasperFillManager.fillReport(JasRep, param, koneksi.getConnection());
                JInternalFrame frame = new JInternalFrame("Laporan Location Berdasarkan ID");
                frame.getContentPane().add(new JRViewer(JasPri));
                frame.pack();
                frame.setResizable(true);
                frame.setClosable(true);
                frame.setMaximizable(true);
                frame.setSize(1000,800);
                frame.setVisible(true);
                HR_DesktopPane.add(frame);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_getLocationReportByIdActionPerformed

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
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane HR_DesktopPane;
    private javax.swing.JMenuItem getCountryReportAll;
    private javax.swing.JMenuItem getCountryReportById;
    private javax.swing.JMenuItem getDeptReportAll;
    private javax.swing.JMenuItem getDeptReportByID;
    private javax.swing.JMenuItem getEmpAll;
    private javax.swing.JMenuItem getEmpById;
    private javax.swing.JMenuItem getJobReportAll;
    private javax.swing.JMenuItem getJobReportById;
    private javax.swing.JMenuItem getLocationReportAll;
    private javax.swing.JMenuItem getLocationReportById;
    private javax.swing.JMenuItem getRegionReportAll;
    private javax.swing.JMenuItem getRegionReportById;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenu jMenuJobs;
    // End of variables declaration//GEN-END:variables
}
