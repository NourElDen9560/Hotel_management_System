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
public class AddWorker extends JFrame implements ActionListener{
    JTextField NametextField,AgetextField,WorkerIDtextField,salarytextField,PhoneetextField,passtextField;
    JLabel WorkerID ,Agelabel ,  Gender,job , Salarylabel , PhoneLabel,password,NameLabel;
    JButton AddButton,BackButton ; 
    JRadioButton RoomserviceButton , ReceptionistserviceButton ,GenderRadio,FemaleRadio;
       
    ButtonGroup genderGroup, jobGroup;

    public AddWorker() {
         getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            
            genderGroup=new ButtonGroup();
            jobGroup=new ButtonGroup();
            
            JLabel textt = new JLabel("ADD EMPLOYEE DETAILS");
            textt.setForeground(Color.GREEN);
            textt.setFont(new Font("Tahoma", Font.PLAIN, 31));
            textt.setBounds(280, 0, 442, 35);
            add(textt);
            
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            NameLabel = new JLabel("NAME");
            NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
            NameLabel.setBounds(300, 80, 150, 27);
            add(NameLabel);
            
            NametextField = new JTextField();
            NametextField.setBounds(440, 80, 150, 27);
            add(NametextField);
	
            Agelabel = new JLabel("AGE");
            Agelabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Agelabel.setBounds(300, 120, 150, 27);
            add(Agelabel);
			
            AgetextField = new JTextField();
            AgetextField.setBounds(440, 120, 150, 27);
            add(AgetextField);
            
             Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(300, 160, 150, 27);
            add(Gender);
		
             GenderRadio = new JRadioButton("MALE");
            GenderRadio.setBackground(Color.WHITE);
            GenderRadio.setBounds(440, 160, 70, 27);
            add(GenderRadio);
	
             FemaleRadio = new JRadioButton("FEMALE");
            FemaleRadio.setBackground(Color.WHITE);
            FemaleRadio.setBounds(520, 160, 150, 30);
            add(FemaleRadio);
            
            genderGroup.add(GenderRadio);
            genderGroup.add(FemaleRadio);
            ///
              job = new JLabel("Job");
            job.setFont(new Font("Tahoma", Font.PLAIN, 17));
            job.setBounds(300, 200, 150, 27);
            add(job);
		
             RoomserviceButton = new JRadioButton("Room service");
            RoomserviceButton.setBackground(Color.WHITE);
            RoomserviceButton.setBounds(440, 200, 150, 30);
            RoomserviceButton.addActionListener(this);
            add(RoomserviceButton);
	
             ReceptionistserviceButton = new JRadioButton("Receptionist");
            ReceptionistserviceButton.setBackground(Color.WHITE);
            ReceptionistserviceButton.setBounds(590, 200, 150, 30);
            ReceptionistserviceButton.addActionListener(this);
            add(ReceptionistserviceButton);
            
            jobGroup.add(RoomserviceButton);
            jobGroup.add(ReceptionistserviceButton);
           
             Salarylabel = new JLabel("SALARY");
            Salarylabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Salarylabel.setBounds(300, 240, 150, 27);
            add(Salarylabel);
			
            salarytextField = new JTextField();
            salarytextField.setBounds(440, 240, 150, 27);
            add(salarytextField);
	
             PhoneLabel = new JLabel("PHONE");
            PhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PhoneLabel.setBounds(300, 280, 150, 27);
            add(PhoneLabel);
	
            PhoneetextField = new JTextField();
            PhoneetextField.setBounds(440, 280, 150, 27);
            add(PhoneetextField);
	
             password = new JLabel("Password");
            password.setFont(new Font("Tahoma", Font.PLAIN, 17));
            password.setBounds(300, 320, 150, 27);
            add(password);
			
            passtextField = new JTextField();
            passtextField.setBounds(440, 320, 150, 27);
            add(passtextField);
	
             WorkerID = new JLabel("WorkerID");
            WorkerID.setFont(new Font("Tahoma", Font.PLAIN, 17));
            WorkerID.setBounds(300, 360, 150, 27);
            add(WorkerID);
			
            WorkerIDtextField = new JTextField();
            WorkerIDtextField.setBounds(440, 360, 150, 27);
            add(WorkerIDtextField);
            
           
	
            setVisible(true);
	
          
            
            		
            AddButton = new JButton("Add");
            AddButton.setBounds(350, 450, 150, 30);
            AddButton.setBackground(Color.BLACK);
            AddButton.setForeground(Color.WHITE);
            AddButton.addActionListener(this);
            add(AddButton);
			
            BackButton = new JButton("Back");
            BackButton.setBounds(500, 450, 150, 30);
            BackButton.setBackground(Color.BLACK);
            BackButton.setForeground(Color.WHITE);
            BackButton.addActionListener(this);
            add(BackButton);
            
            
             setSize(900,600);
            setVisible(true);
            setLocation(530,200);
    }
        
        @Override
             public void actionPerformed(ActionEvent e){
                 
                 if(e.getSource() == RoomserviceButton ){
                     passtextField.setVisible(false);
                     password.setVisible(false);
                   
                 }
                  if(e.getSource() == ReceptionistserviceButton ){
                     passtextField.setVisible(true);
                     password.setVisible(true);
                     
                 }

                 
                 if(e.getSource() == AddButton ){
                String gender = null ; 
                String job = null ; 
                
                 if(GenderRadio.isSelected())
                        gender = "male";
                        
                 else if(FemaleRadio.isSelected())
                        gender = "female";
                    
                 if(RoomserviceButton.isSelected())
                     job = "Room service";
                 
                     
                 else if(ReceptionistserviceButton.isSelected())
                     job = "receptionist";
                 
                 try{
                     String Id = WorkerIDtextField.getText();
                     String name = NametextField.getText();
                     String age = AgetextField.getText();
                     String salaString = salarytextField.getText();
                     String phone = PhoneetextField.getText();
                     String PassString =passtextField.getText();
                     System.out.println(Id + name + age + gender + job+salaString + phone + PassString);
                     
                     connect_database connect =connect_database.getInstance();
                   
                        String query = "INSERT INTO workers values( '"+Id+"', '"+name+"', '"+age+"', '"+gender+"', '"+job+"','"+salaString+"', '"+phone+"' , '"+PassString+"')";

                          connect.getS().executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Employee Added Successfully");
                        
                 }
                 catch(Exception ex){
                     JOptionPane.showMessageDialog(null, "Invlid Data or ID Already exist ");
                 }
                 
                     
                 
                 
                 
                     
                 }
                 
                 
             }
            

    
}
