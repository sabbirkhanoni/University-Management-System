package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class EnterMarks extends JFrame implements ActionListener{
    
    Choice crollno;
    JComboBox cbsemester;
    JButton submit,cancel;
    JTextField tfSub1,tfSub2,tfSub3,tfSub4,tfSub5,tfMark1,tfMark2,tfMark3,tfMark4,tfMark5;
    
    EnterMarks()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel mainheading = new JLabel("Enter Marks Of Student ");
        mainheading.setFont(new Font("serif", Font.BOLD,25));
        mainheading.setForeground(Color.WHITE);
        mainheading.setBounds(400,50,300,30);
        add(mainheading);
        
        JLabel heading = new JLabel("Search By Roll Number");
        heading.setBounds(60,100,180,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("serif", Font.BOLD,15));
        add(heading);
        
        crollno = new Choice();
        crollno.setBounds(250,110,185,40);
        add(crollno);
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from student");
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        //name
        
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("serif", Font.BOLD,18));
        lbname.setForeground(Color.WHITE);
        lbname.setBounds(550,100,120,30);
        add(lbname);
        
        
        JLabel labelname = new JLabel();
        labelname.setFont(new Font("serif", Font.BOLD,22));
        labelname.setForeground(Color.WHITE);
        labelname.setBounds(700,100,200,30);
        add(labelname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setFont(new Font("serif", Font.BOLD,18));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(550,150,220,30);
        add(lblfname);
        
        
        JLabel labelfname = new JLabel();
        labelfname.setFont(new Font("serif", Font.BOLD,22));
        labelfname.setForeground(Color.WHITE);
        labelfname.setBounds(700,150,250,30);
        add(labelfname);
        
        
        //RollNumber
        JLabel lblrollno = new JLabel("Roll Number :");
        lblrollno.setFont(new Font("serif", Font.BOLD,15));
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setBounds(60,150,180,40);
        add(lblrollno);
        
        JLabel labelrollno = new JLabel();
        labelrollno.setFont(new Font("serif", Font.BOLD,25));
        labelrollno.setForeground(Color.WHITE);
        labelrollno.setBounds(250,150,200,40);
        add(labelrollno);
        
        
        JLabel lblcourse = new JLabel("Select Semester");
        lblcourse.setForeground(Color.WHITE);
        lblcourse.setFont(new Font("serif", Font.BOLD,15));
        lblcourse.setBounds(60,200,200,40);
        add(lblcourse);
        
        String semester[] ={"1st Semester", "2nd Semester", "3rd Semester", "4th Semester", "5th Semester", "6th Semester", "7th Semester", "8th Semester"};
        cbsemester = new JComboBox(semester);
        cbsemester.setBackground(Color.WHITE);
        cbsemester.setBounds(250,210,185,25);
        add(cbsemester);
        
        

        JLabel labeenterSub = new JLabel("Enter Subject");
        labeenterSub.setFont(new Font("serif", Font.BOLD,18));
        labeenterSub.setForeground(Color.WHITE);
        labeenterSub.setBounds(270,270,250,30);
        add(labeenterSub);
        
        JLabel labelenterMarks = new JLabel("Enter Marks");
        labelenterMarks.setFont(new Font("serif", Font.BOLD,18));
        labelenterMarks.setForeground(Color.WHITE);
        labelenterMarks.setBounds(570,270,250,30);
        add(labelenterMarks);
        
        
        
        
        
        submit =  new JButton("Submit");
        submit.setBounds(300,570,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD,16));
        add(submit);
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(600,570,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,16));
        add(cancel);
        
        
        
        tfSub1 = new JTextField();
        tfSub1.setBounds(220,310,220,30);
        add(tfSub1);
        
        tfSub2 = new JTextField();
        tfSub2.setBounds(220,360,220,30);
        add(tfSub2);
        
        tfSub3 = new JTextField();
        tfSub3.setBounds(220,410,220,30);
        add(tfSub3);
        
        tfSub4 = new JTextField();
        tfSub4.setBounds(220,460,220,30);
        add(tfSub4);
        
        tfSub5 = new JTextField();
        tfSub5.setBounds(220,510,220,30);
        add(tfSub5);
        
        //-----------Mark--------
        
        tfMark1 = new JTextField();
        tfMark1.setBounds(520,310,220,30);
        add(tfMark1);
        
        tfMark2 = new JTextField();
        tfMark2.setBounds(520,360,220,30);
        add(tfMark2);
        
        
        tfMark3 = new JTextField();
        tfMark3.setBounds(520,410,220,30);
        add(tfMark3);
        
        tfMark4 = new JTextField();
        tfMark4.setBounds(520,460,220,30);
        add(tfMark4);
        
        tfMark5 = new JTextField();
        tfMark5.setBounds(520,510,220,30);
        add(tfMark5);
        
        try{ 
            Conn c = new Conn();
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            java.sql.ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelrollno.setText(rs.getString("rollno"));
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        crollno.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                
                
                try{ 
            Conn c = new Conn();
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            java.sql.ResultSet rs = c.s. executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelrollno.setText(rs.getString("rollno"));
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
                
            }
        });
        
        
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
             if(ae.getSource() == submit)
             {
             
            try 
            {
                Conn c = new Conn();
                
                String query1 = "insert into subject values('"+crollno.getSelectedItem()+"','"+cbsemester.getSelectedItem()+"','"+tfSub1.getText()+"','"+tfSub2.getText()+"','"+tfSub3.getText()+"','"+tfSub4.getText()+"','"+tfSub5.getText()+"')";
                String query2 = "insert into marks values('"+crollno.getSelectedItem()+"','"+cbsemester.getSelectedItem()+"','"+tfMark1.getText()+"', '"+tfMark2.getText()+"','"+tfMark3.getText()+"','"+tfMark4.getText()+"','"+tfMark5.getText()+"')";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Student Marks Inserted Successfully");
                setVisible(false);
                
            }catch (Exception e)
            {
                e.printStackTrace();
            }
             }
    
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
    }
    
      public static void main(String[] args) {
        new EnterMarks();
    }
    
}
