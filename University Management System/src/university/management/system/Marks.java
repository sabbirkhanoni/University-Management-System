package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Marks extends JFrame implements ActionListener{
    
    String rollno;
    JButton print,back;
    
    Marks(String  rollno)
    {
        this.rollno = rollno;
        
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel mainheading = new JLabel("ABC University");
        mainheading.setFont(new Font("serif", Font.BOLD,25));
        mainheading.setForeground(Color.WHITE);
        mainheading.setBounds(440,50,300,30);
        add(mainheading);
        
        JLabel subheading = new JLabel("Resul Of Examination Of 2023");
        subheading.setFont(new Font("serif", Font.BOLD,20));
        subheading.setForeground(Color.WHITE);
        subheading.setBounds(400,80,320,30);
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll Number                     "+ rollno);
        lblrollno.setFont(new Font("serif", Font.BOLD,20));
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setBounds(100,150,500,30);
        add(lblrollno);
        
        JLabel lblemester = new JLabel("Semester ");
        lblemester.setFont(new Font("serif", Font.BOLD,20));
        lblemester.setForeground(Color.WHITE);
        lblemester.setBounds(100,200,320,30);
        add(lblemester);
        
        
         //name
        
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("serif", Font.BOLD,18));
        lbname.setForeground(Color.WHITE);
        lbname.setBounds(100,250,120,30);
        add(lbname);
        
        
        JLabel labelname = new JLabel();
        labelname.setFont(new Font("serif", Font.BOLD,22));
        labelname.setForeground(Color.WHITE);
        labelname.setBounds(300,250,200,30);
        add(labelname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setFont(new Font("serif", Font.BOLD,18));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(100,300,220,30);
        add(lblfname);
        
        
        JLabel labelfname = new JLabel();
        labelfname.setFont(new Font("serif", Font.BOLD,22));
        labelfname.setForeground(Color.WHITE);
        labelfname.setBounds(300,300,250,30);
        add(labelfname);
        
        
        try{ 
            Conn c = new Conn();
            String query = "select * from student where rollno = '"+rollno+"'";
            java.sql.ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
        
        JLabel labelSub1 = new JLabel();
        labelSub1.setFont(new Font("serif", Font.BOLD,18));
        labelSub1.setForeground(Color.WHITE);
        labelSub1.setBounds(150,350,500,30);
        add(labelSub1);
        
        JLabel labelSub2 = new JLabel();
        labelSub2.setFont(new Font("serif", Font.BOLD,18));
        labelSub2.setForeground(Color.WHITE);
        labelSub2.setBounds(150,400,500,30);
        add(labelSub2);
        
        JLabel labelSub3 = new JLabel();
        labelSub3.setFont(new Font("serif", Font.BOLD,18));
        labelSub3.setForeground(Color.WHITE);
        labelSub3.setBounds(150,450,500,30);
        add(labelSub3);
        
        JLabel labelSub4 = new JLabel();
        labelSub4.setFont(new Font("serif", Font.BOLD,18));
        labelSub4.setForeground(Color.WHITE);
        labelSub4.setBounds(150,500,500,30);
        add(labelSub4);
        
        JLabel labelSub5 = new JLabel();
        labelSub5.setFont(new Font("serif", Font.BOLD,18));
        labelSub5.setForeground(Color.WHITE);
        labelSub5.setBounds(150,550,1000,30);
        add(labelSub5);
        
        //-----------Mark--------
        
        JLabel labelMark1 = new JLabel();
        labelMark1.setFont(new Font("serif", Font.BOLD,18));
        labelMark1.setForeground(Color.WHITE);
        labelMark1.setBounds(500,350,500,30);
        add(labelMark1);
        
        JLabel labelMark2 = new JLabel();
        labelMark2.setFont(new Font("serif", Font.BOLD,18));
        labelMark2.setForeground(Color.WHITE);
        labelMark2.setBounds(500,400,500,30);
        add(labelMark2);
        
        
        JLabel labelMark3 = new JLabel();
        labelMark3.setFont(new Font("serif", Font.BOLD,18));
        labelMark3.setForeground(Color.WHITE);
        labelMark3.setBounds(500,450,500,30);
        add(labelMark3);
        
        JLabel labelMark4 = new JLabel();
        labelMark4.setFont(new Font("serif", Font.BOLD,18));
        labelMark4.setForeground(Color.WHITE);
        labelMark4.setBounds(500,500,500,30);
        add(labelMark4);
        
        JLabel labelMark5 = new JLabel();
        labelMark5.setFont(new Font("serif", Font.BOLD,18));
        labelMark5.setForeground(Color.WHITE);
        labelMark5.setBounds(500,550,500,30);
        add(labelMark5);
        
        try{ 
            Conn c = new Conn();
            String query1 = "select * from subject where rollno = '"+rollno+"'";
            java.sql.ResultSet rs1 = c.s.executeQuery(query1);
            
            while(rs1.next())
            {
                labelSub1.setText(rs1.getString("subject1"));
                labelSub2.setText(rs1.getString("subject2"));
                labelSub3.setText(rs1.getString("subject3"));
                labelSub4.setText(rs1.getString("subject4"));
                labelSub5.setText(rs1.getString("subject5")); 
            }
            
            String query2 = "select * from marks where rollno = '"+rollno+"'";
            java.sql.ResultSet rs2 = c.s.executeQuery(query2);
            
            while(rs2.next())
            {  
                labelSub1.setText(labelSub1.getText() + "---------------------------------------------------------------" + rs2.getString("marks1"));
                labelSub2.setText(labelSub2.getText() + "---------------------------------------------------------------" + rs2.getString("marks2"));
                labelSub3.setText(labelSub3.getText() + "---------------------------------------------------------------" + rs2.getString("marks3"));
                labelSub4.setText(labelSub4.getText() + "---------------------------------------------------------------" + rs2.getString("marks4"));
                labelSub5.setText(labelSub5.getText() + "---------------------------------------------------------------" + rs2.getString("marks5")); 
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        back =  new JButton("Back");
        back.setBounds(480,600,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("serif", Font.BOLD,16));
        add(back);
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
      
        if(ae.getSource() == back)
        {  
            setVisible(false);
            new ExaminationDetails();
        }
    }
        
    
    public static void main(String[] args) {
        new Marks("");
    }
}
