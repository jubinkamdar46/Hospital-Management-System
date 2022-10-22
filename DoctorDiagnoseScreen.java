
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Jubin Kamdar
 */
public class DoctorDiagnoseScreen extends javax.swing.JFrame {

    /**
     * Creates new form DoctorDiagnoseScreen
     */
    public DoctorDiagnoseScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        PatientDirectory.addArrayListItem(1, "Jubin", "jubin@gmail.com", "8576939957", "Male", 20, "RoxBury", "Jubinkamdar@46");
        reportIdTextField.setText(String.valueOf(ReportDirectory.arrayListLengthReturn()));
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createReportAddPanel = new javax.swing.JButton();
        viewReportAddPanel = new javax.swing.JButton();
        deleteReport = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        createReportPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientIdTextField = new javax.swing.JTextField();
        patientNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientEmailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reportIdTextField = new javax.swing.JTextField();
        reportTitleTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        reportDescTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        reportVitalSignTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        viewReportPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTable = new javax.swing.JTable();
        deleteReportPanel = new javax.swing.JPanel();
        reportIdDeleteTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        delelteSpecificReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createReportAddPanel.setText("Create Report");
        createReportAddPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReportAddPanelActionPerformed(evt);
            }
        });

        viewReportAddPanel.setText("View Reports");
        viewReportAddPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportAddPanelActionPerformed(evt);
            }
        });

        deleteReport.setText("Delete Report");
        deleteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createReportAddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewReportAddPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(deleteReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(createReportAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(viewReportAddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(deleteReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {createReportAddPanel, deleteReport, viewReportAddPanel});

        parentPanel.setLayout(new java.awt.CardLayout());

        createReportPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("New Report");

        jLabel2.setText("Patient Id");

        patientIdTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                patientIdTextFieldFocusLost(evt);
            }
        });
        patientIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIdTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Patient Name");

        jLabel4.setText("Patient Email");

        jLabel5.setText("Report Id");

        reportIdTextField.setEditable(false);

        jLabel6.setText("Report Title");

        jLabel7.setText("Report Description");

        jLabel8.setText("Vital Sign");

        jButton1.setText("Submit Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createReportPanelLayout = new javax.swing.GroupLayout(createReportPanel);
        createReportPanel.setLayout(createReportPanelLayout);
        createReportPanelLayout.setHorizontalGroup(
            createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createReportPanelLayout.createSequentialGroup()
                .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createReportPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createReportPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(createReportPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientEmailTextField))
                            .addGroup(createReportPanelLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientNameTextField))
                            .addGroup(createReportPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(createReportPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(reportIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(createReportPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(13, 13, 13)
                                    .addComponent(reportDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(createReportPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(reportVitalSignTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(createReportPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createReportPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );

        createReportPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, patientEmailTextField, patientIdTextField, patientNameTextField, reportIdTextField});

        createReportPanelLayout.setVerticalGroup(
            createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createReportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patientEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportDescTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reportVitalSignTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        createReportPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, patientEmailTextField, patientIdTextField, patientNameTextField, reportIdTextField});

        parentPanel.add(createReportPanel, "card2");

        viewReportPanel.setBackground(new java.awt.Color(255, 255, 255));

        reportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Email", "Report ID", "Title", "Description", "Vital Sign"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(reportTable);

        javax.swing.GroupLayout viewReportPanelLayout = new javax.swing.GroupLayout(viewReportPanel);
        viewReportPanel.setLayout(viewReportPanelLayout);
        viewReportPanelLayout.setHorizontalGroup(
            viewReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewReportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        viewReportPanelLayout.setVerticalGroup(
            viewReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewReportPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        parentPanel.add(viewReportPanel, "card3");

        deleteReportPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("ID");

        delelteSpecificReport.setText("Delete");
        delelteSpecificReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delelteSpecificReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteReportPanelLayout = new javax.swing.GroupLayout(deleteReportPanel);
        deleteReportPanel.setLayout(deleteReportPanelLayout);
        deleteReportPanelLayout.setHorizontalGroup(
            deleteReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteReportPanelLayout.createSequentialGroup()
                .addGroup(deleteReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteReportPanelLayout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(reportIdDeleteTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteReportPanelLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(delelteSpecificReport, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        deleteReportPanelLayout.setVerticalGroup(
            deleteReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteReportPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(deleteReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reportIdDeleteTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89)
                .addComponent(delelteSpecificReport)
                .addContainerGap(404, Short.MAX_VALUE))
        );

        parentPanel.add(deleteReportPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createReportAddPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReportAddPanelActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(createReportPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_createReportAddPanelActionPerformed

    private void viewReportAddPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportAddPanelActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel) reportTable.getModel();
        tableModel.setRowCount(0);
        ArrayList<Reports> reportDirectory = ReportDirectory.arrayReturn();
        for (int i = 0; i < ReportDirectory.arrayListLengthReturn(); i++) {
            Object[] rowData = new Object[]{
                reportDirectory.get(i).patientId,
                reportDirectory.get(i).patientName,
                reportDirectory.get(i).patientEmail,
                reportDirectory.get(i).reportId,
                reportDirectory.get(i).reportTitle,
                reportDirectory.get(i).reportDescription,
                reportDirectory.get(i).reportVitalSign,
                
            };
            tableModel.addRow(rowData);
        }
        parentPanel.removeAll();
        parentPanel.add(viewReportPanel);
        parentPanel.repaint();
        parentPanel.revalidate();


    }//GEN-LAST:event_viewReportAddPanelActionPerformed


    private void patientIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIdTextFieldActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_patientIdTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pId = patientIdTextField.getText();
        String pName = patientNameTextField.getText();
        String pEmail = patientEmailTextField.getText();
        
        String rId = reportIdTextField.getText();
        String rTitle = reportTitleTextField.getText();
        String rDesc = reportDescTextField.getText();
        String rVitalSign = reportVitalSignTextField.getText();
        
        if(pId.isEmpty() || pName.isEmpty() || pEmail.isEmpty() || rId.isEmpty() || rTitle.isEmpty() || rDesc.isEmpty() || rVitalSign.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Fill All The Fields", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            int pIdC = Integer.parseInt(pId);
            int rIDC = Integer.parseInt(rId);
            
            ReportDirectory.addArrayItem(pIdC, pName, pEmail, rIDC, rTitle, rDesc, rVitalSign);
            
            JOptionPane.showMessageDialog(this, "Report Created Successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            
            reportIdTextField.setText(String.valueOf(ReportDirectory.arrayListLengthReturn()));
            patientIdTextField.setText("");
            patientNameTextField.setText("");
            patientEmailTextField.setText("");
            reportTitleTextField.setText("");
            reportDescTextField.setText("");
            reportVitalSignTextField.setText("");
            System.out.println(ReportDirectory.arrayReturn());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientIdTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patientIdTextFieldFocusLost
        // TODO add your handling code here:
        int id = Integer.parseInt(patientIdTextField.getText());
        
        for(Patients patient: PatientDirectory.arrayReturn()){
            if(patient.id == id){
                patientNameTextField.setText(patient.name);
                patientEmailTextField.setText(patient.email);
            }
        }
        
    }//GEN-LAST:event_patientIdTextFieldFocusLost

    private void deleteReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteReportActionPerformed
        // TODO add your handling code here:
        
        parentPanel.removeAll();
        parentPanel.add(deleteReportPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_deleteReportActionPerformed

    private void delelteSpecificReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delelteSpecificReportActionPerformed
        // TODO add your handling code here:
        int reportIdToDelete = Integer.parseInt(reportIdDeleteTextField.getText());
        boolean reportFound = false;
        ArrayList<Reports> reportDirectory = ReportDirectory.arrayReturn();
        for(Reports report: reportDirectory){
            if(report.reportId == reportIdToDelete){
                reportFound = true;
                JOptionPane.showMessageDialog(this, "Report Deleted Successfully", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
                
                reportDirectory.remove(report);
                reportIdTextField.setText(String.valueOf(ReportDirectory.arrayListLengthReturn()));
                break;
            }
        }
        
        if(!reportFound){
            JOptionPane.showMessageDialog(this, "No Report Founds", "Warning",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_delelteSpecificReportActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorDiagnoseScreen.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorDiagnoseScreen.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorDiagnoseScreen.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorDiagnoseScreen.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorDiagnoseScreen().setVisible(true);
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createReportAddPanel;
    private javax.swing.JPanel createReportPanel;
    private javax.swing.JButton delelteSpecificReport;
    private javax.swing.JButton deleteReport;
    private javax.swing.JPanel deleteReportPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JTextField patientEmailTextField;
    private javax.swing.JTextField patientIdTextField;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JTextField reportDescTextField;
    private javax.swing.JTextField reportIdDeleteTextField;
    private javax.swing.JTextField reportIdTextField;
    private javax.swing.JTable reportTable;
    private javax.swing.JTextField reportTitleTextField;
    private javax.swing.JTextField reportVitalSignTextField;
    private javax.swing.JButton viewReportAddPanel;
    private javax.swing.JPanel viewReportPanel;
    // End of variables declaration//GEN-END:variables
}
