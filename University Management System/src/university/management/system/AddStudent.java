package university.management.system;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfphone,tfemail,tfaddress,tfclassx,tfclassxii,tffnid;
    JLabel labelrollno;
    JComboBox cbcourse,cbbranch;
    JButton submit,cancel;
    
    JDateChooser dcdob;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    AddStudent()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel heading = new JLabel("New Student Details");
        heading.setFont(new Font("serif", Font.BOLD,25));
        heading.setForeground(Color.WHITE);
        heading.setBounds(400,50,220,30);
        add(heading); 
        
        //Name
        
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("serif", Font.BOLD,25));
        lbname.setForeground(Color.WHITE);
        lbname.setBounds(80,120,120,30);
        add(lbname);
        
        
        tfname = new JTextField();
        tfname.setBounds(230,120,200,30);
        add(tfname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setFont(new Font("serif", Font.BOLD,25));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(500,120,220,30);
        add(lblfname);
        
        
        tffname = new JTextField();
        tffname.setBounds(700,120,200,30);
        add(tffname);
        
        
        //RollNumber
        JLabel lblrollno = new JLabel("Roll Number :");
        lblrollno.setFont(new Font("serif", Font.BOLD,25));
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setBounds(80,190,150,30);
        add(lblrollno);
        
        
        labelrollno = new JLabel("1533"+first4);
        labelrollno.setFont(new Font("serif", Font.BOLD,25));
        labelrollno.setForeground(Color.WHITE);
        labelrollno.setBounds(300,190,150,30);
        add(labelrollno);
        
         //Date OF Birth
         
        JLabel lbldob = new JLabel("Date OF Birth :");
        lbldob.setFont(new Font("serif", Font.BOLD,25));
        lbldob.setForeground(Color.WHITE);
        lbldob.setBounds(500,190,220,30);
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(700,190,200,30);
        add(dcdob);
        
        
        //Phone
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("serif", Font.BOLD,25));
        lblphone.setForeground(Color.WHITE);
        lblphone.setBounds(80,260,150,30);
        add(lblphone);
        
        
        tfphone = new JTextField();
        tfphone.setBounds(230,260,200,30);
        add(tfphone);
        
        
        //emailid
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setFont(new Font("serif", Font.BOLD,25));
        lblemail.setForeground(Color.WHITE);
        lblemail.setBounds(500,260,150,30);
        add(lblemail);
        
        
        tfemail = new JTextField();
        tfemail.setBounds(700,260,200,30);
        add(tfemail);
        
        
        
        //Address
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setFont(new Font("serif", Font.BOLD,25));
        lbladdress.setForeground(Color.WHITE);
        lbladdress.setBounds(80,330,220,30);
        add(lbladdress);
        
        
        tfaddress = new JTextField();
        tfaddress.setBounds(230,330,200,30);
        add(tfaddress);
        
        
        //classx mark
        
        JLabel lblclassx = new JLabel("Class X (%)");
        lblclassx.setFont(new Font("serif", Font.BOLD,25));
        lblclassx.setForeground(Color.WHITE);
        lblclassx.setBounds(500,330,220,30);
        add(lblclassx);
        
        
        tfclassx = new JTextField();
        tfclassx.setBounds(700,330,200,30);
        add(tfclassx);
        
        
        //class xii mark
        
        JLabel lblclassxii = new JLabel("Class XII (%)");
        lblclassxii.setFont(new Font("serif", Font.BOLD,24));
        lblclassxii.setForeground(Color.WHITE);
        lblclassxii.setBounds(80,400,150,30);
        add(lblclassxii);
        
        
        tfclassxii = new JTextField();
        tfclassxii.setBounds(230,400,200,30);
        add(tfclassxii);
        
        //NID Number
        
        JLabel lblnid = new JLabel("NID Number");
        lblnid.setFont(new Font("serif", Font.BOLD,25));
        lblnid.setForeground(Color.WHITE);
        lblnid.setBounds(500,400,220,30);
        add(lblnid);
        
        
        tffnid = new JTextField();
        tffnid.setBounds(700,400,200,30);
        add(tffnid);
        
        
        //course
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setFont(new Font("serif", Font.BOLD,25));
        lblcourse.setForeground(Color.WHITE);
        lblcourse.setBounds(80,470,220,30);
        add(lblcourse);
        
        String course[] ={"B.Tech", "BBA", "BCA", "BSc", "MSc", "MCA", "B.Com", "M.Com", "MA"};
        cbcourse = new JComboBox(course);
        cbcourse.setBackground(Color.WHITE);
        cbcourse.setBounds(230,470,200,30);
        add(cbcourse);
        
        
        //course
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setFont(new Font("serif", Font.BOLD,25));
        lblbranch.setForeground(Color.WHITE);
        lblbranch.setBounds(500,470,220,30);
        add(lblbranch);
        
        String branch[] ={"CSE", "EEE", "ME", "Textail", "Civil", "ICE", "GE", "NE", "Architechture"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBackground(Color.WHITE);
        cbbranch.setBounds(700,470,200,30);
        add(cbbranch);
        
        
        submit =  new JButton("Submit");
        submit.setBounds(300,560,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD,16));
        add(submit);
        
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
        if(ae.getSource() == submit)
        {
            String name = tfname.getText();
            String fname = tffname.getText();
            String rollno  = labelrollno.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email  = tfemail.getText();
            String x  = tfclassx.getText();
            String xii  = tfclassxii.getText();
            String nid = tffnid.getText();
            String course = (String) cbcourse.getSelectedItem();
            String branch = (String) cbbranch.getSelectedItem();
             
            try 
            {
                String query = "insert into student values('"+name+"', '"+fname+"','"+rollno+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+nid+"','"+course+"','"+branch+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            
            tfname.setText("");
            tffname.setText("");
            labelrollno.setText("");
            ((JTextField) dcdob.getDateEditor().getUiComponent()).setText("");
            tfaddress.setText("");
            tfphone.setText("");
            tfemail.setText("");
            tfclassx.setText("");
            tfclassxii.setText("");
            tffnid.setText("");
            
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddStudent();
    }
    
}
