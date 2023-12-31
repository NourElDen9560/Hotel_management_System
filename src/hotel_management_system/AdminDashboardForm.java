/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

/**
 *
 * @author ayamo
 */
public class AdminDashboardForm extends javax.swing.JFrame implements Dashboard {

    /**
     * Creates new form AdminDashboardForm
     */
    public AdminDashboardForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addWorker = new javax.swing.JButton();
        addRoom = new javax.swing.JButton();
        allWorkers = new javax.swing.JButton();
        Incomebtn = new javax.swing.JButton();
        logOutbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(200, 30));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,120));

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Dashboard");

        addWorker.setBackground(new java.awt.Color(24, 130, 203));
        addWorker.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        addWorker.setForeground(new java.awt.Color(255, 255, 255));
        addWorker.setText("Add Worker");
        addWorker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWorker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addWorkerMouseClicked(evt);
            }
        });

        addRoom.setBackground(new java.awt.Color(24, 130, 203));
        addRoom.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        addRoom.setForeground(new java.awt.Color(255, 255, 255));
        addRoom.setText("Add Room");
        addRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addRoomMouseClicked(evt);
            }
        });

        allWorkers.setBackground(new java.awt.Color(24, 130, 203));
        allWorkers.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        allWorkers.setForeground(new java.awt.Color(255, 255, 255));
        allWorkers.setText("All Workers");
        allWorkers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allWorkersMouseClicked(evt);
            }
        });

        Incomebtn.setBackground(new java.awt.Color(24, 130, 203));
        Incomebtn.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        Incomebtn.setForeground(new java.awt.Color(255, 255, 255));
        Incomebtn.setText("Income");
        Incomebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Incomebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncomebtnMouseClicked(evt);
            }
        });
        Incomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomebtnActionPerformed(evt);
            }
        });

        logOutbtn.setBackground(new java.awt.Color(24, 130, 203));
        logOutbtn.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        logOutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logOutbtn.setText("Log Out");
        logOutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutbtnMouseClicked(evt);
            }
        });
        logOutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addWorker, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(logOutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(allWorkers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Incomebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(129, 129, 129))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2)
                .addGap(55, 55, 55)
                .addComponent(addWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(allWorkers, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Incomebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(logOutbtn)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 540, 560));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home_admin.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 594));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 594));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 594));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addWorkerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addWorkerMouseClicked
       dispose();
        new AddWorkerForm().setVisible(true);
    }//GEN-LAST:event_addWorkerMouseClicked

    private void addRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addRoomMouseClicked
       dispose();
            new AddRoomsForm().setVisible(true);
    }//GEN-LAST:event_addRoomMouseClicked

    private void allWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allWorkersMouseClicked
        dispose();
            new UpdateandDeleteEmployeeForm().setVisible(true);
    }//GEN-LAST:event_allWorkersMouseClicked

    private void IncomebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncomebtnMouseClicked
        dispose();
        new IncomeForm().setVisible(true);
    }//GEN-LAST:event_IncomebtnMouseClicked

    private void logOutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutbtnMouseClicked
       dispose();
    }//GEN-LAST:event_logOutbtnMouseClicked

    private void IncomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomebtnActionPerformed
        dispose();
            new IncomeForm().setVisible(true);
    }//GEN-LAST:event_IncomebtnActionPerformed

    private void logOutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutbtnActionPerformed
        dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_logOutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminDashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Incomebtn;
    private javax.swing.JButton addRoom;
    private javax.swing.JButton addWorker;
    private javax.swing.JButton allWorkers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutbtn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Draw_Dashboard() {
        initComponents();
    }
}
