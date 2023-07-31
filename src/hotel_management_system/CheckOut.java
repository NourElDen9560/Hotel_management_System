/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckOut extends JFrame implements ActionListener {
String  CheckMethod ="cash";
CalCost calctotal = new CalCost();
    connect_database conn = null;
    PreparedStatement pst = null;
    private JPanel contentPane;
    private JTextField t1;
    JLabel lblDateCheckin;
    JComboBox c1;
    JLabel lblPay;
    String currentDate = String.valueOf(java.time.LocalDate.now());
    JRadioButton cash, payPal, creditCard;
    double price;
    ButtonGroup methodPay;
    //PayPalStrategy payStrategy;
    CalCost cc = new CalCost();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CheckOut frame = new CheckOut();

                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void close() {
        this.dispose();
    }

    public CheckOut() throws SQLException {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        methodPay = new ButtonGroup();
        lblDateCheckin = new JLabel();

        t1 = new JTextField();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(330, 200, 900, 500);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCheckOut = new JLabel("Check Out ");
        lblCheckOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCheckOut.setBounds(70, 11, 140, 35);
        contentPane.add(lblCheckOut);
        JLabel lblName = new JLabel("residentID :");
        lblName.setBounds(20, 85, 80, 14);
        contentPane.add(lblName);
        c1 = new JComboBox();
        try {
            conn = connect_database.getInstance();
            ResultSet rs = conn.getS().executeQuery("select * from residents where Status = 'Check In'");
            while (rs.next()) {
                c1.addItem(rs.getString("residentID"));
            }
        } catch (Exception e) {
        }
        c1.setBounds(130, 82, 150, 20);
        contentPane.add(c1);

        c1.addActionListener(this);

        JLabel lblRoomNumber = new JLabel("Room Number:");
        lblRoomNumber.setBounds(20, 132, 86, 20);
        contentPane.add(lblRoomNumber);

        t1.setBounds(130, 132, 150, 20);
        contentPane.add(t1);

        JLabel lblCheckin = new JLabel("Checkin Time:");
        lblCheckin.setBounds(20, 162, 156, 20);
        contentPane.add(lblCheckin);

        lblDateCheckin.setBounds(150, 162, 256, 20);
        contentPane.add(lblDateCheckin);

        JLabel lblCheckout = new JLabel("CheckOut Time:");
        lblCheckout.setBounds(20, 202, 156, 20);
        contentPane.add(lblCheckout);

        JLabel lblDateCheckout = new JLabel();
        lblDateCheckout.setText(currentDate);
        lblDateCheckout.setBounds(150, 202, 256, 20);
        contentPane.add(lblDateCheckout);

        lblPay = new JLabel("Payment Method:");
        lblPay.setBounds(20, 240, 320, 20);
        contentPane.add(lblPay);

        cash = new JRadioButton("Cash");
        cash.setBackground(Color.WHITE);
        cash.setBounds(140, 240, 70, 27);
        add(cash);

        payPal = new JRadioButton("PayPal");
        payPal.setBackground(Color.WHITE);
        payPal.setBounds(230, 240, 100, 30);
        add(payPal);

        creditCard = new JRadioButton("Credit Card");
        creditCard.setBackground(Color.WHITE);
        creditCard.setBounds(340, 240, 150, 30);
        add(creditCard);

        methodPay.add(cash);
        methodPay.add(payPal);
        methodPay.add(creditCard);

        JButton btnCheckOut = new JButton("Check Out");
        btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               String id = c1.getSelectedItem().toString();
              String s1 = t1.getText();
              FacadeCheckout facade = new FacadeCheckout(calctotal);
              facade.CheckOutUsingFacade(id, s1, CheckMethod);
                
                
               /*
               try{
                     String id = c1.getSelectedItem().toString();
            //    String s1 = t1.getText();
                   String Residentquery = "select * from residents where residentID = "+ new Integer(id) ;
                 
               ResultSet rs = conn.getS().executeQuery(Residentquery);
               
               
               if(rs.next()){ // IF resident Founded 
                 
                   String roomID = rs.getString("RoomNumber");
                    String ChangeStatusquery = "Update residents Set Status='Check Out' where residentID = "+ new Integer(id);
                    
                     conn.getS().executeUpdate(ChangeStatusquery);
                String q2 = "UPDATE room SET availabilty = 'Available' , status = 'Not Cleaned' where roomNumber = " + new Integer(roomID);
                    conn.getS().executeUpdate(q2);
                   JOptionPane.showMessageDialog(null, "Check Out Successfully");
               }
               
               }
               catch(Exception ee){
                    JOptionPane.showMessageDialog(null, "Check Out Failed");
               }
               
               */
              
               
            }
        });
        btnCheckOut.setBounds(20, 300, 100, 25);
        btnCheckOut.setBackground(Color.BLACK);
        btnCheckOut.setForeground(Color.WHITE);
        contentPane.add(btnCheckOut);
        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reception().setVisible(true);
                setVisible(false);
            }
        });
        btnExit.setBounds(150, 300, 100, 25);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);
        getContentPane().setBackground(Color.WHITE);
    }
    String boardType, checkIn;

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try {
            connect_database conn = connect_database.getInstance();

            int number = Integer.parseInt(c1.getSelectedItem().toString());

            ResultSet rs = conn.getS().executeQuery("SELECT * FROM residents where residentID ='" + number + "'");
            System.out.println("id: " + number);
            
            
            while (rs.next()) {
                System.out.println("e: " + rs.getString("RoomNumber"));

                t1.setText(String.valueOf(rs.getString("RoomNumber")));
                lblDateCheckin.setText(String.valueOf(rs.getString("Date")));
                price = Double.parseDouble(rs.getString("totalCost"));
                System.out.println("price" + price);
                boardType = rs.getString("Boardingtype");
                System.out.println("Boardingtype: " + boardType);
            }
            
            System.out.println("price: " + price);

            LocalDate d1 = LocalDate.parse(lblDateCheckin.getText(), DateTimeFormatter.ISO_LOCAL_DATE);
            LocalDate d2 = LocalDate.parse(currentDate, DateTimeFormatter.ISO_LOCAL_DATE);
            Duration diff = Duration.between(d1.atStartOfDay(), d2.atStartOfDay());
            long diffDays = diff.toDays();

            System.out.println("time: "+diffDays);
            
            if (boardType.equals("Full Board")) {
                CalculatePrice c1 = new CalculatePrice(750*diffDays);
                calctotal.addBoarding(c1);
            } 
            else if (boardType.equals("Half Board")) {
                CalculatePrice c1 = new CalculatePrice(500*diffDays);
                calctotal.addBoarding(c1);
            } 
            else if (boardType.equals("Bed And Breakfast")) {
                CalculatePrice c1 = new CalculatePrice(250*diffDays);
                calctotal.addBoarding(c1);
            }

            CalculatePrice c2 = new CalculatePrice(price*diffDays);
            calctotal.addRoom(c2);

            cash.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
CheckMethod = "cash" ;
                    //calctotal.payTotal(new CashStrategy());
                    
                }
            });

            payPal.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
CheckMethod = "payPal";
                   // calctotal.payTotal(new PayPalStrategy());
                }
            });

            creditCard.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
CheckMethod = "creditCard";
                 //   calctotal.payTotal(new CreditCardStrategy());
                }
            });

        } catch (Exception ee) {
        }
    }

}
