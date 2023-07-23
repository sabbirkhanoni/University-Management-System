package university.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfname,tfbranch,tffname,tfphone,tfcourse,tfemail,tfaddress,tfclassx,tfclassxii,tffnid;
    JLabel labelrollno;
    Choice crollno;
    JButton update,cancel;
      
    UpdateStudent()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel heading = new JLabel("Update Student Details");
        heading.setFont(new Font("serif", Font.BOLD,22));
        heading.setForeground(Color.WHITE);
        heading.setBounds(400,30,250,30);
        add(heading); 
        
        JLabel lblheading = new JLabel("Select Roll Number");
        lblheading.setBounds(80,80,150,40);
        lblheading.setForeground(Color.WHITE);
        lblheading.setFont(new Font("serif", Font.BOLD,16));
        add(lblheading);
        
        crollno = new Choice();
        crollno.setBounds(230,90,180,40);
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
        
        JLabel lbname = new JLabel("Name");
        lbname.setFont(new Font("serif", Font.BOLD,25));
        lbname.setForeground(Color.WHITE);
        lbname.setBounds(80,120,120,30);
        add(lbname);
        
        
        JLabel labelname = new JLabel();
        labelname.setFont(new Font("serif", Font.BOLD,25));
        labelname.setForeground(Color.WHITE);
        labelname.setBounds(230,120,200,30);
        add(labelname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name");
        lblfname.setFont(new Font("serif", Font.BOLD,25));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(500,120,220,30);
        add(lblfname);
        
        
        JLabel labelfname = new JLabel();
        labelfname.setFont(new Font("serif", Font.BOLD,25));
        labelfname.setForeground(Color.WHITE);
        labelfname.setBounds(700,120,250,30);
        add(labelfname);
        
        
        //RollNumber
        JLabel lblrollno = new JLabel("Roll Number :");
        lblrollno.setFont(new Font("serif", Font.BOLD,25));
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setBounds(80,190,150,30);
        add(lblrollno);
        
        
        labelrollno = new JLabel();
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
        
        JLabel labeldcdob = new JLabel();
        labeldcdob.setFont(new Font("serif", Font.BOLD,25));
        labeldcdob.setForeground(Color.WHITE);
        labeldcdob.setBounds(700,190,200,30);
        add(labeldcdob);
        
        
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
        
        
        JLabel labeltfclassx = new JLabel();
        labeltfclassx.setFont(new Font("serif", Font.BOLD,25));
        labeltfclassx.setForeground(Color.WHITE);
        labeltfclassx.setBounds(700,330,200,30);
        add(labeltfclassx);
        
        
        //class xii mark
        
        JLabel lblclassxii = new JLabel("Class XII (%)");
        lblclassxii.setFont(new Font("serif", Font.BOLD,24));
        lblclassxii.setForeground(Color.WHITE);
        lblclassxii.setBounds(80,400,150,30);
        add(lblclassxii);
        
        
        JLabel labeltfclassxii = new JLabel();
        labeltfclassxii.setFont(new Font("serif", Font.BOLD,25));
        labeltfclassxii.setForeground(Color.WHITE);
        labeltfclassxii.setBounds(300,400,200,30);
        add(labeltfclassxii);
        
        //NID Number
        
        JLabel lblnid = new JLabel("NID Number");
        lblnid.setFont(new Font("serif", Font.BOLD,25));
        lblnid.setForeground(Color.WHITE);
        lblnid.setBounds(500,400,220,30);
        add(lblnid);
        
        
        JLabel labelnid = new JLabel();
        labelnid.setFont(new Font("serif", Font.BOLD,25));
        labelnid.setForeground(Color.WHITE);
        labelnid.setBounds(700,400,200,30);
        add(labelnid);
        
        
        //course
        
        JLabel lblcourse = new JLabel("Course");
        lblcourse.setFont(new Font("serif", Font.BOLD,25));
        lblcourse.setForeground(Color.WHITE);
        lblcourse.setBounds(80,470,220,30);
        add(lblcourse);
        
    
        tfcourse = new JTextField();
        tfcourse.setBackground(Color.WHITE);
        tfcourse.setBounds(230,470,200,30);
        add(tfcourse);
        
        
        //course
        
        JLabel lblbranch = new JLabel("Branch");
        lblbranch.setFont(new Font("serif", Font.BOLD,25));
        lblbranch.setForeground(Color.WHITE);
        lblbranch.setBounds(500,470,220,30);
        add(lblbranch);
        
        
        tfbranch = new JTextField();
        tfbranch.setBackground(Color.WHITE);
        tfbranch.setBounds(700,470,200,30);
        add(tfbranch);
        
        try{ 
            Conn c = new Conn();
            String query = "select * from student where rollno = '"+crollno.getSelectedItem()+"'";
            java.sql.ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
                labelname.setText(rs.getString("name"));
                labelfname.setText(rs.getString("fname"));
                labelrollno.setText(rs.getString("rollno"));
                labeldcdob.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfaddress.setText(rs.getString("address"));
                labeltfclassx.setText(rs.getString("class_x"));
                labeltfclassxii.setText(rs.getString("class_xii"));
                labelnid.setText(rs.getString("nid"));
                tfcourse.setText(rs.getString("course"));
                tfbranch.setText(rs.getString("branch"));
                
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
                labeldcdob.setText(rs.getString("dob"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfaddress.setText(rs.getString("address"));
                labeltfclassx.setText(rs.getString("class_x"));
                labeltfclassxii.setText(rs.getString("class_xii"));
                labelnid.setText(rs.getString("nid"));
                tfcourse.setText(rs.getString("course"));
                tfbranch.setText(rs.getString("branch"));
                
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
                
            }
        });
        
        update =  new JButton("Update");
        update.setBounds(300,560,100,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        update.setFont(new Font("serif", Font.BOLD,16));
        add(update);
        
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
        if(ae.getSource() == update)
        {
            
            String rollno  = labelrollno.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email  = tfemail.getText();
            String course = tfcourse.getText();
            String branch = tfbranch.getText();
             
            try 
            {
                String query = "update student set address='"+address+"',phone='"+phone+"',email='"+email+"',course='"+course+"',branch='"+branch+"' where rollno='"+rollno+"'";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Updated Successfully");
                
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
        new UpdateStudent();
    }
    
}
