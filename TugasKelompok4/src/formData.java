/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 5470
 */
public class formData extends javax.swing.JFrame {

    /**
     * Creates new form formData
     */
    public formData() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtNama = new javax.swing.JLabel();
        txtNim = new javax.swing.JLabel();
        txtNilaiTugas = new javax.swing.JLabel();
        txtNilaiKuis = new javax.swing.JLabel();
        txtNilaiUts = new javax.swing.JLabel();
        txtNilaiUas = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        inputNim = new javax.swing.JTextField();
        inputNilaiTugas = new javax.swing.JTextField();
        inputNilaiKuis = new javax.swing.JTextField();
        inputNilaiUts = new javax.swing.JTextField();
        inputNilaiUas = new javax.swing.JTextField();
        txtShowNama = new javax.swing.JLabel();
        txtShowNim = new javax.swing.JLabel();
        txtShowRerata = new javax.swing.JLabel();
        txtShowKeterangan = new javax.swing.JLabel();
        txtShowGrade = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dataNama = new javax.swing.JLabel();
        dataNim = new javax.swing.JLabel();
        dataRerata = new javax.swing.JLabel();
        dataGrade = new javax.swing.JLabel();
        dataKeterangan = new javax.swing.JLabel();
        buttonHitung = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNama.setText("Nama");

        txtNim.setText("NIM");

        txtNilaiTugas.setText("Nilai Tugas");

        txtNilaiKuis.setText("Nilai Kuis");

        txtNilaiUts.setText("Nilai UTS");

        txtNilaiUas.setText("Nilai UAS");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        inputNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNimActionPerformed(evt);
            }
        });

        inputNilaiKuis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiKuisActionPerformed(evt);
            }
        });

        txtShowNama.setText("Nama");

        txtShowNim.setText("NIM");

        txtShowRerata.setText("Rerata");

        txtShowKeterangan.setText("Keterangan");

        txtShowGrade.setText("Grade");

        jLabel13.setText(":");

        jLabel14.setText(":");

        jLabel15.setText(":");

        jLabel16.setText(":");

        jLabel17.setText(":");

        buttonHitung.setText("HITUNG");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        buttonReset.setText("RESET");

        buttonSave.setText("SIMPAN");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNim)
                            .addComponent(txtNilaiTugas)
                            .addComponent(txtNilaiKuis)
                            .addComponent(txtNilaiUts)
                            .addComponent(txtNilaiUas)
                            .addComponent(txtNama))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputNilaiUas, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(inputNilaiUts)
                                .addComponent(inputNilaiKuis)
                                .addComponent(inputNilaiTugas)
                                .addComponent(inputNim, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtShowNama)
                            .addComponent(txtShowKeterangan)
                            .addComponent(txtShowGrade)
                            .addComponent(txtShowRerata)
                            .addComponent(txtShowNim))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(dataNim))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(dataRerata))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(dataGrade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(dataKeterangan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(dataNama))))
                    .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNama)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowNama)
                    .addComponent(jLabel13)
                    .addComponent(dataNama))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNim)
                    .addComponent(inputNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowNim)
                    .addComponent(jLabel14)
                    .addComponent(dataNim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilaiTugas)
                    .addComponent(inputNilaiTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowRerata)
                    .addComponent(jLabel15)
                    .addComponent(dataRerata))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilaiKuis)
                    .addComponent(inputNilaiKuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowGrade)
                    .addComponent(jLabel16)
                    .addComponent(dataGrade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilaiUts)
                    .addComponent(inputNilaiUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowKeterangan)
                    .addComponent(jLabel17)
                    .addComponent(dataKeterangan))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNilaiUas)
                    .addComponent(inputNilaiUas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHitung)
                    .addComponent(buttonReset)
                    .addComponent(buttonSave))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNimActionPerformed

    private void inputNilaiKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiKuisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNilaiKuisActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // Show data
        dataNama.setText(inputNama.getText());
        dataNim.setText(inputNim.getText());
        
        String keterangan, grade;
        double nilaiKuis, nilaiTugas, nilaiUts, nilaiUas, total, rerata;
        
        nilaiKuis = Double.parseDouble(inputNilaiKuis.getText());
        nilaiTugas = Double.parseDouble(inputNilaiTugas.getText());
        nilaiUts = Double.parseDouble(inputNilaiUts.getText());
        nilaiUas = Double.parseDouble(inputNilaiUas.getText());

  
        rerata = (nilaiKuis + nilaiTugas + nilaiUts + nilaiUas ) / 4.0;
        
        
        if (rerata >= 90) {
            grade = "A";
            keterangan = "Dinyatakan lulus";
        } else if (rerata >= 80) {
            grade = "B";
            keterangan = "Dinyatakan lulus";
        } else if (rerata >= 70) {
            grade = "C";
            keterangan = "Dinyatakan lulus";
        } else if (rerata >= 60) {
            grade = "D";
            keterangan = "Dinyatakan tidak lulus";
        } else if (rerata >= 50) {
            grade = "E";
            keterangan = "Dinyatakan tidak lulus";
        } else {
            grade = "F";
            keterangan = "Dinyatakan tidak lulus";
        }
        
        dataRerata.setText(Double.toString(rerata));
        dataGrade.setText(grade.toString());
        dataKeterangan.setText(keterangan.toString());


    }//GEN-LAST:event_buttonHitungActionPerformed

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
            java.util.logging.Logger.getLogger(formData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel dataGrade;
    private javax.swing.JLabel dataKeterangan;
    private javax.swing.JLabel dataNama;
    private javax.swing.JLabel dataNim;
    private javax.swing.JLabel dataRerata;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNilaiKuis;
    private javax.swing.JTextField inputNilaiTugas;
    private javax.swing.JTextField inputNilaiUas;
    private javax.swing.JTextField inputNilaiUts;
    private javax.swing.JTextField inputNim;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtNama;
    private javax.swing.JLabel txtNilaiKuis;
    private javax.swing.JLabel txtNilaiTugas;
    private javax.swing.JLabel txtNilaiUas;
    private javax.swing.JLabel txtNilaiUts;
    private javax.swing.JLabel txtNim;
    private javax.swing.JLabel txtShowGrade;
    private javax.swing.JLabel txtShowKeterangan;
    private javax.swing.JLabel txtShowNama;
    private javax.swing.JLabel txtShowNim;
    private javax.swing.JLabel txtShowRerata;
    // End of variables declaration//GEN-END:variables
}