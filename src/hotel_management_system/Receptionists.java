/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_management_system;

import java.awt.Choice;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class Receptionists extends javax.swing.JFrame {

    connect_database connect = connect_database.getInstance();
    Choice c1 = new Choice();
    String[] nameRoom;
    String type;
    //jTable1 table;
    String currentDate=String.valueOf(java.time.LocalDate.now());
    

    /**
     * Creates new form Receptionists
     */
    public Receptionists() {
        initComponents();
date.setText(currentDate);
        try {
            System.out.println("date: "+date.getText());
            jTable1.setModel(DbUtils.resultSetToTableModel(connect.getS().executeQuery("select * from residents")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        roomType.addItem("Single");
        roomType.addItem("Double");
        roomType.addItem("Triple");
        
        boardingType.addItem("Full Board");
        boardingType.addItem("Half Board");
        boardingType.addItem("Bed And Breakfast");
        
        date.setText(currentDate);

        Gender.addItem("Male");
        Gender.addItem("Female");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        residentId = new javax.swing.JTextField();
        ResidentId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Phone = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        roomType = new javax.swing.JComboBox<>();
        roomNumber = new javax.swing.JComboBox<>();
        boardingType = new javax.swing.JComboBox<>();
        Gender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");

        ResidentId.setText("Resident Id");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Resident Id", "Name", "Gender", "Phone", "Date", "Room Number", "Room Type", "Boarding Type"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Phone");

        jLabel2.setText("Name");

        jButtonAdd.setText("Add Resident");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit Resident");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabel4.setText("Gender");

        jButtonDelete.setText("Delete Resident");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        jLabel8.setText("Date");

        jLabel9.setText("Room Number");

        jLabel10.setText("Room Tyoe");

        jLabel11.setText("BoardingType");

        roomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeActionPerformed(evt);
            }
        });

        roomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumberActionPerformed(evt);
            }
        });

        boardingType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardingTypeActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1094, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(ResidentId))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(residentId, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomNumber, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(boardingType, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ResidentId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(residentId, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel10))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boardingType, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomType, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDelete)
                    .addComponent(jButton1))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String resident_ID = table.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String name = table.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String gender = table.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String phone = table.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String Date = table.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String roomNum = table.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String roomsType = table.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String boardingTypes = table.getValueAt(jTable1.getSelectedRow(), 7).toString();
        residentId.setText(resident_ID);
        Name.setText(name);
        Phone.setText(phone);
        
        
        //getContentPane.add(c1);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        setVisible(true);

        try {
            String resident_Id = residentId.getText();
            String name = Name.getText();
            String gender = Gender.getSelectedItem().toString();
            String phone = Phone.getText();
            
            String roomNum = String.valueOf(roomNumber.getSelectedItem());
            String boardingTypes = String.valueOf(boardingType.getSelectedItem());
            String roomstype = String.valueOf(roomType.getSelectedItem());

            if (roomstype.equals("single") && boardingType.equals("full")) {

            }

            //String query = "INSERT INTO residents values( '" + resident_Id + "', '" + name + "', '" + gender + "', '" + phone + "', '" + Date + "','" + roomNum + "', '" + roomstype + "' , '" + boardingTypes +"' ,'"+1000 +"')";
            String price="";
            String returnquery = "select * from room where roomNumber = " + new Integer(roomNum);

 

            ResultSet res =  connect.getS().executeQuery(returnquery);
            if (res.next()){
                price = res.getString("price");

            }          
            double Totalprice = Double.parseDouble(price);

           /* String query = "INSERT INTO residents values( '" + resident_Id + "', '" + name + "', '" + gender + "', '" + phone + "', '" + currentDate + "','" + roomNum + "', '" + roomstype + "' , '" + boardingTypes + "' , '"+price+"')";
            
            String q2 = "UPDATE room SET availabilty = 'Not Available' where RoomNumber = " + new Integer(roomNum);

            connect.getS().executeUpdate(query);
            connect.getS().executeUpdate(q2);*/
           
           ProxyBooking proxyBooking=new ProxyBooking();
           proxyBooking.Book(resident_Id, name, gender, phone, date.getText(), roomNum, roomstype, boardingTypes, price);
            //JOptionPane.showMessageDialog(null, "New Resident Added Successfully");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invlid Data or ID Already exist");
        }


    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount() == 1) {
            table.setValueAt(residentId.getText(), jTable1.getSelectedRow(), 0);
            table.setValueAt(Name.getText(), jTable1.getSelectedRow(), 1);
            table.setValueAt(Gender.getSelectedItem(), jTable1.getSelectedRow(), 2);
            table.setValueAt(Phone.getText(), jTable1.getSelectedRow(), 3);
            table.setValueAt(date.getText(), jTable1.getSelectedRow(), 4);
            table.setValueAt(roomNumber.getSelectedItem(), jTable1.getSelectedRow(), 5);
            table.setValueAt(roomType.getSelectedItem(), jTable1.getSelectedRow(), 6);
            table.setValueAt(boardingType.getSelectedItem(), jTable1.getSelectedRow(), 7);
            try {

                connect.getS().executeUpdate("Update residents set Name = '" + Name.getText() + "' ,  Gender = '" + Gender.getSelectedItem()+ "' ,Phone = '" + Phone.getText() + "' , Date = '" + date.getText() + "' , RoomNumber = '" + roomNumber.getSelectedItem() + "', typeRoom = '" + roomType.getSelectedItem() + "', Boardingtype = '" + boardingType.getSelectedItem() + "' where residentID = '" + residentId.getText() + "' ");
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                JOptionPane.showMessageDialog(this, "Update Successfully...");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty...");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row...");

            }
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        String resident_Id = residentId.getText();
        if (jTable1.getSelectedRowCount() == 1) {
            table.removeRow(jTable1.getSelectedRow());
            try {
                System.out.println(residentId);
                connect.getS().executeUpdate("DELETE FROM residents WHERE residentID = '" + resident_Id + "' ");
                //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table Empty...");

            } else {
                JOptionPane.showMessageDialog(this, "Please Select Single Row...");

            }
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void roomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumberActionPerformed
       

    }//GEN-LAST:event_roomNumberActionPerformed

    private void roomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeActionPerformed
        // TODO add your handling code here:
        type=roomType.getSelectedItem()+"";
        try {

            roomNumber.removeAllItems();

                ResultSet rs = connect.getS().executeQuery("select * from room where roomtype = '"+type+"'");
                while (rs.next()) {
                    roomNumber.addItem(rs.getString("roomNumber"));
                    System.out.println("room: "+rs.getString("roomNumber"));
                
                
            }
           
        } catch (Exception e) {
        }

    }//GEN-LAST:event_roomTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Reception();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boardingTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardingTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardingTypeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

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
            java.util.logging.Logger.getLogger(Receptionists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Receptionists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Receptionists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Receptionists.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receptionists().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel ResidentId;
    private javax.swing.JComboBox<String> boardingType;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField residentId;
    private javax.swing.JComboBox<String> roomNumber;
    private javax.swing.JComboBox<String> roomType;
    // End of variables declaration//GEN-END:variables
}
