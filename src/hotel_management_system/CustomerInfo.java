/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerInfo extends JFrame {

    private JPanel contentPane;
    private JLabel lblId;
    private JLabel lblNewLabel;
    private JLabel lblGender;
    private JTable table;
    private JLabel lblCountry;
    private JLabel lblPhone;
    private JLabel lblDate;
    private JLabel lblAllocateroom;
    private JLabel lblchecked;
    private JLabel lblroomTypes;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CustomerInfo frame = new CustomerInfo();
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

    public CustomerInfo() throws SQLException {
//conn = Javaconnect.getDBConnection();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(330, 100, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reception().setVisible(true);

                setVisible(false);
            }
        });
        btnExit.setBounds(450, 510, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);
        JButton btnLoadData = new JButton("Load Data");
        btnLoadData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    connect_database conn = connect_database.getInstance();
                    String displayCustomersql = "select * from residents";
                    ResultSet rs = conn.getS().executeQuery(displayCustomersql);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        
        btnLoadData.setBounds(300, 510, 120, 30);
        btnLoadData.setBackground(Color.BLACK);
        btnLoadData.setForeground(Color.WHITE);
        contentPane.add(btnLoadData);
        lblId = new JLabel("ID");
        lblId.setBounds(31, 11, 46, 14);
        contentPane.add(lblId);
        lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(130, 11, 65, 14);
        contentPane.add(lblNewLabel);
        lblGender = new JLabel("Gender");
        lblGender.setBounds(210, 11, 46, 14);
        contentPane.add(lblGender);
        lblPhone = new JLabel("Phone");
        lblPhone.setBounds(310, 11, 46, 14);
        contentPane.add(lblPhone);
        lblDate = new JLabel("Date");
        lblDate.setBounds(500, 11, 100, 14);
        contentPane.add(lblDate);
        lblAllocateroom = new JLabel("Allocate Room");
        lblAllocateroom.setBounds(550, 11, 100, 14);
        contentPane.add(lblAllocateroom);
        lblchecked = new JLabel("Checked");
        lblchecked.setBounds(720, 11, 100, 14);
        contentPane.add(lblchecked);
        lblroomTypes = new JLabel("Room Types");
        lblroomTypes.setBounds(810, 11, 100, 14);
        contentPane.add(lblroomTypes);
        
        table = new JTable();
        table.setBounds(31, 40, 800, 450);
        contentPane.add(table);
        
        getContentPane().setBackground(Color.WHITE);
    }

}
