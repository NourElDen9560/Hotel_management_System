/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import com.mysql.cj.protocol.Resultset;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
  public  JLabel l1,l2;
  public  JTextField Usernamefield ;
 public  JPasswordField passwordfield;
   public JButton loginbutton,cancelbutton;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
 
        Usernamefield=new JTextField();
        Usernamefield.setBounds(150,20,150,30);
        add(Usernamefield);

        passwordfield=new JPasswordField();
        passwordfield.setBounds(150,70,150,30);
        add(passwordfield);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,10,150,150);
        add(l3);
        
      
        //Buttons 
          loginbutton = new JButton("Login");
        loginbutton.setBounds(40,140,120,30);
        loginbutton.setFont(new Font("serif",Font.BOLD,15));
        loginbutton.addActionListener(this);
        loginbutton.setBackground(Color.BLACK);
        loginbutton.setForeground(Color.WHITE);
        add(loginbutton);

        cancelbutton=new JButton("Cancel");
        cancelbutton.setBounds(180,140,120,30);
        cancelbutton.setFont(new Font("serif",Font.BOLD,15));
        cancelbutton.setBackground(Color.BLACK);
        cancelbutton.setForeground(Color.WHITE);
        cancelbutton.addActionListener(this);
        add(cancelbutton);
        
       //  b2.addActionListener(this);
        
         getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(600,300);
        setLocation(600,350);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource() == loginbutton){
          String username = Usernamefield.getText();
          String password = passwordfield.getText();
          try{
              connect_database con =connect_database.getInstance();
              
              String query = "select * from login where Username = '" + username + "' and Password =  '" + password + "'  ";
              ResultSet res =  con.getS().executeQuery(query);
              System.out.println(res);
              if(res.next()){
                  setVisible(false);
                  FactoryDashboard factory = new FactoryDashboard();
                  Dashboard d ; 
                
                     d = factory.GetDashBoard(username);
                     d.Draw_Dashboard();
                  
              }
              else {
                  JOptionPane.showMessageDialog(null, "Invlid Usernme or password ... Try again !");
                  //setVisible(false);
              }
          
          
          }
          catch(Exception ex){
              
          }
      }
      else if(e.getSource() == cancelbutton) {
          setVisible(false);
      }
    }
    
   
}
