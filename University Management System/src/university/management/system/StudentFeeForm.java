package university.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentFeeForm extends JFrame implements ActionListener{
    
    Choice crollno;
    JLabel labelrollno,amountTaka,labelname,labelfname;
    JComboBox cbcourse,cbbranch,cbsemester;
    JButton calculate,pay,cancel;
    
    StudentFeeForm()
    {
        
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel heading = new JLabel("Payment Fees");
        heading.setFont(new Font("serif", Font.BOLD,22));
        heading.setForeground(Color.WHITE);
        heading.setBounds(400,30,250,30);
        add(heading); 
        
        JLabel lblheading = new JLabel("Select Roll Number");
        lblheading.setBounds(100,100,150,40);
        lblheading.setForeground(Color.WHITE);
        lblheading.setFont(new Font("serif", Font.BOLD,16));
        add(lblheading);
        
        crollno = new Choice();
        crollno.setBounds(300,110,180,40);
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
        
        
        //Name
        
        JLabel lbname = new JLabel("Name :");
        lbname.setFont(new Font("serif", Font.BOLD,25));
        lbname.setForeground(Color.WHITE);
        lbname.setBounds(100,150,120,30);
        add(lbname);
        
        
        labelname = new JLabel();
        labelname.setFont(new Font("serif", Font.BOLD,25));
        labelname.setForeground(Color.WHITE);
        labelname.setBounds(300,150,200,30);
        add(labelname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name :");
        lblfname.setFont(new Font("serif", Font.BOLD,25));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(100,200,200,30);
        add(lblfname);
        
        
        labelfname = new JLabel();
        labelfname.setFont(new Font("serif", Font.BOLD,25));
        labelfname.setForeground(Color.WHITE);
        labelfname.setBounds(300,200,300,30);
        add(labelfname);
        
        
        //RollNumber
        JLabel lblrollno = new JLabel("Roll Number :");
        lblrollno.setFont(new Font("serif", Font.BOLD,25));
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setBounds(100,250,200,30);
        add(lblrollno);
        
        
        labelrollno = new JLabel();
        labelrollno.setFont(new Font("serif", Font.BOLD,25));
        labelrollno.setForeground(Color.WHITE);
        labelrollno.setBounds(300,250,200,30);
        add(labelrollno);
        
        
        
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
        
        
         //course
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setFont(new Font("serif", Font.BOLD,25));
        lblcourse.setForeground(Color.WHITE);
        lblcourse.setBounds(100,300,200,30);
        add(lblcourse);
        
        String course[] ={"B.Tech", "BBA", "BCA", "BSc", "MSc", "MCA", "B.Com", "M.Com", "MA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBackground(Color.WHITE);
        cbcourse.setBounds(300,300,200,30);
        add(cbcourse);
        
        
        //course
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setFont(new Font("serif", Font.BOLD,25));
        lblbranch.setForeground(Color.WHITE);
        lblbranch.setBounds(100,350,200,30);
        add(lblbranch);
        
        String branch[] ={"CSE", "EEE", "ME", "Textail", "Civil", "ICE", "GE", "NE", "Architechture"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBackground(Color.WHITE);
        cbbranch.setBounds(300,350,200,30);
        add(cbbranch);
        
        JLabel lblSemester = new JLabel("Select Semester");
        lblSemester.setForeground(Color.WHITE);
        lblSemester.setFont(new Font("serif", Font.BOLD,25));
        lblSemester.setBounds(100,400,200,40);
        add(lblSemester);
        
        String semester[] ={"semester1", "semester2", "semester3", "semester4", "semester5", "semester6", "semester7", "semester8"};
        cbsemester = new JComboBox(semester);
        cbsemester.setBackground(Color.WHITE);
        cbsemester.setBounds(300,400,200,30);
        add(cbsemester);
        
        
        JLabel amount = new JLabel("Total Amount");
        amount.setFont(new Font("serif", Font.BOLD,25));
        amount.setForeground(Color.WHITE);
        amount.setBounds(100,450,200,30);
        add(amount);
        
        
        amountTaka = new JLabel();
        amountTaka.setFont(new Font("serif", Font.BOLD,25));
        amountTaka.setForeground(Color.WHITE);
        amountTaka.setBounds(300,450,200,30);
        add(amountTaka);
        
        
        calculate =  new JButton("Calculate");
        calculate.setBounds(200,560,100,30);
        calculate.setBackground(Color.BLACK);
        calculate.setForeground(Color.WHITE);
        calculate.addActionListener(this);
        calculate.setFont(new Font("serif", Font.BOLD,16));
        add(calculate);
        
        pay =  new JButton("Pay");
        pay.setBounds(400,560,100,30);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.WHITE);
        pay.addActionListener(this);
        pay.setFont(new Font("serif", Font.BOLD,16));
        add(pay);
        
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(600,560,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,16));
        add(cancel);
        
        
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == calculate)
        {
            String branch = (String) cbbranch.getSelectedItem();
            String semester = (String) cbsemester.getSelectedItem();
            
            try{
                Conn c = new Conn();
                String query = "select * from fee where branch='"+branch+"'";
               java.sql.ResultSet rs = c.s.executeQuery(query);
               while(rs.next())
               {
                   amountTaka.setText(rs.getString(semester));
               }
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == pay)
        {   
            String name = labelname.getText();
            String fname = labelfname.getText();
            String rollno = crollno.getSelectedItem();
            String course =(String) cbcourse.getSelectedItem();
            String semester =(String)cbsemester.getSelectedItem();
            String branch =(String) cbbranch.getSelectedItem();
            String amttaka = amountTaka.getText();
            String status = "Paid";
             try 
            {
                String query = "insert into universityfee values('"+name+"', '"+fname+"','"+rollno+"','"+course+"','"+semester+"','"+branch+"','"+amttaka+"','"+status+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Payment Paid Successfully");
                
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            
        }
        
        
        if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
    }
        
    public static void main(String[] args) {
        new StudentFeeForm();
    }
}
