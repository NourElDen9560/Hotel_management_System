/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel_management_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AdminDashboard extends JFrame implements Dashboard , ActionListener{
 public JButton addworker ,addroom , ViewWorkerButton;
    public AdminDashboard() {
           }

@Override
public void Draw_Dashboard(){
      getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       
        
        
            addworker = new JButton("Add Worker");
        addworker.setBounds(220,100,120,30);
        addworker.setFont(new Font("serif",Font.BOLD,15));
        addworker.addActionListener(this);
        addworker.setBackground(Color.BLACK);
        addworker.setForeground(Color.WHITE);
        add(addworker);
        
        
            addroom = new JButton("Add Room");
        addroom.setBounds(220,50,120,30);
        addroom.setFont(new Font("serif",Font.BOLD,15));
        //b1.addActionListener(this);
        addroom.setBackground(Color.BLACK);
        addroom.setForeground(Color.WHITE);
        add(addroom);
        
           ViewWorkerButton = new JButton("All Workers");
        ViewWorkerButton.setBounds(220,150,120,30);
        ViewWorkerButton.setFont(new Font("serif",Font.BOLD,15));
        ViewWorkerButton.addActionListener(this);
        ViewWorkerButton.setBackground(Color.BLACK);
        ViewWorkerButton.setForeground(Color.WHITE);
        add(ViewWorkerButton);
        
        
        
         getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setSize(600,300);
        setLocation(600,350);
      

}
  @Override
         public void actionPerformed(ActionEvent e){
             if (e.getSource() ==addworker ){
                 new AddWorker();
                         
             }
             if(e.getSource() == ViewWorkerButton){
                 new UpdateandDeleteEmployee().setVisible(true);
             }
         }
    
}
