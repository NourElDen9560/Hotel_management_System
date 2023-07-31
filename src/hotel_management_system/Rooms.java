/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rooms extends JFrame implements ActionListener {

    public JButton addRoom, cancelRoom;
    public JTextField fieldPrice, fieldRoom;
    public  JComboBox availableComboBox, cleanComboBox,roomComboBox;
    public JLabel clean, price, roomNumber, heading, available, roomType;

    public Rooms() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        heading = new JLabel("Add Rooms");
        heading.setBounds(150, 20, 200, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);

        roomNumber = new JLabel("Room Number");
        roomNumber.setBounds(60, 80, 120, 20);
        roomNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(roomNumber);

        fieldRoom = new JTextField();
        fieldRoom.setBounds(200, 80, 150, 30);
        add(fieldRoom);

        available = new JLabel("Available");
        available.setBounds(60, 130, 120, 30);
        available.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(available);

        String availableOptions[] = {"Available", "Not Available"};
        availableComboBox = new JComboBox(availableOptions);
        availableComboBox.setBounds(200, 130, 150, 30);
        availableComboBox.setBackground(Color.WHITE);
        add(availableComboBox);

        clean = new JLabel("Clean Status");
        clean.setBounds(60, 180, 120, 30);
        clean.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(clean);

        String cleanOptions[] = {"Cleaned", "Not Cleaned"};
        cleanComboBox = new JComboBox(cleanOptions);
        cleanComboBox.setBounds(200, 180, 150, 30);
        cleanComboBox.setBackground(Color.WHITE);
        add(cleanComboBox);

        price = new JLabel("Price");
        price.setBounds(60, 230, 120, 30);
        price.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(price);

        fieldPrice = new JTextField();
        fieldPrice.setBounds(200, 230, 150, 30);
        add(fieldPrice);

        roomType = new JLabel("Room Type");
        roomType.setBounds(60, 280, 120, 30);
        roomType.setFont(new Font("Tahoma", Font.PLAIN, 15));
        add(roomType);

        String roomOptions[] = {"Single", "Double", "Triple"};
        roomComboBox = new JComboBox(roomOptions);
        roomComboBox.setBounds(200, 280, 150, 30);
        roomComboBox.setBackground(Color.WHITE);
        add(roomComboBox);

        addRoom = new JButton("Add Room");
        addRoom.setForeground(Color.WHITE);
        addRoom.setBackground(Color.BLACK);
        addRoom.addActionListener(this);
        addRoom.setBounds(60, 350, 130, 30);
        add(addRoom);

        cancelRoom = new JButton("Cancel");
        cancelRoom.setForeground(Color.WHITE);
        cancelRoom.setBackground(Color.BLACK);
        cancelRoom.addActionListener(this);
        cancelRoom.setBounds(220, 350, 130, 30);
        add(cancelRoom);

        ImageIcon iconRoom = new ImageIcon(ClassLoader.getSystemResource("icons/seventh.jpg"));
        JLabel image = new JLabel(iconRoom);
        image.setBounds(400, 10, 370, 500);
        add(image);

        setBounds(350, 200, 800, 570);
        setVisible(true);
        
    }
    public static void main(String[] args) {
       
    //    new Hotel_Management_system();
      //new Receptionist();
        new Rooms();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addRoom) 
        {
            String roomnumber=fieldRoom.getText();
            String availability=availableComboBox.getSelectedItem().toString();
            String status=cleanComboBox.getSelectedItem().toString();
            String price=fieldPrice.getText();
            String type=roomComboBox.getSelectedItem().toString();
             try{
              connect_database con = connect_database.getInstance();
              
             String query=  "INSERT INTO room values( '"+roomnumber+"', '"+availability+"', '"+status+"','"+price+"', '"+type+"')";
             con.getS().executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Room Successfully Added");
          
          }
          catch(Exception ex){
              ex.printStackTrace();
          }

            
        } else if (e.getSource() == cancelRoom) {
            setVisible(false);
        }
    }

}
