package university.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StudentLeave extends JFrame implements ActionListener{
    
    Choice crollno,ctime;
    JDateChooser dcdate;
    JButton submit,cancel;
    JLabel labelrollno,labelname,labelfname;
    
    StudentLeave()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel heading = new JLabel("Apply Leave For Student");
        heading.setBounds(320,50,220,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("serif", Font.BOLD,20));
        add(heading);
        
        JLabel lblrollno = new JLabel("Search By Roll Number");
        lblrollno.setBounds(220,100,200,40);
        lblrollno.setForeground(Color.WHITE);
        lblrollno.setFont(new Font("serif", Font.BOLD,18));
        add(lblrollno);
        
        crollno = new Choice();
        crollno.setBounds(450,110,200,50);
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
        lbname.setBounds(220,165,120,30);
        add(lbname);
        
        
        labelname = new JLabel();
        labelname.setFont(new Font("serif", Font.BOLD,25));
        labelname.setForeground(Color.WHITE);
        labelname.setBounds(450,165,200,30);
        add(labelname);
        
        
         //Father's Name
        
        JLabel lblfname = new JLabel("Father's Name :");
        lblfname.setFont(new Font("serif", Font.BOLD,25));
        lblfname.setForeground(Color.WHITE);
        lblfname.setBounds(220,220,200,30);
        add(lblfname);
        
        
        labelfname = new JLabel();
        labelfname.setFont(new Font("serif", Font.BOLD,25));
        labelfname.setForeground(Color.WHITE);
        labelfname.setBounds(450,220,300,30);
        add(labelfname);
        
        
        //RollNumber
        JLabel lblrollno1 = new JLabel("Roll Number :");
        lblrollno1.setFont(new Font("serif", Font.BOLD,25));
        lblrollno1.setForeground(Color.WHITE);
        lblrollno1.setBounds(220,280,200,30);
        add(lblrollno1);
        
        
        labelrollno = new JLabel();
        labelrollno.setFont(new Font("serif", Font.BOLD,25));
        labelrollno.setForeground(Color.WHITE);
        labelrollno.setBounds(450,280,200,30);
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
        
        
        
        
        
        JLabel lbldob = new JLabel("Date ");
        lbldob.setFont(new Font("serif", Font.BOLD,18));
        lbldob.setForeground(Color.WHITE);
        lbldob.setBounds(220,350,200,40);
        add(lbldob);
        
        dcdate = new JDateChooser();
        dcdate.setBounds(450,360,200,30);
        add(dcdate);
        
        
        JLabel lbltime = new JLabel("Time Duration");
        lbltime.setBounds(220,450,200,40);
        lbltime.setForeground(Color.WHITE);
        lbltime.setFont(new Font("serif", Font.BOLD,18));
        add(lbltime);
        
        ctime = new Choice();
        ctime.setBounds(450,460,200,40);
        ctime.add("Full Day");
        ctime.add("Half Day");
        add(ctime);
        
        
        submit =  new JButton("Submit");
        submit.setBounds(200,560,100,30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD,16));
        add(submit);
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(520,560,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,16));
        add(cancel);
        
        
        setLocation(250,50); 
        setSize(900,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == submit)
        {
               String rollno = crollno.getSelectedItem();
               String date = ((JTextField) dcdate.getDateEditor().getUiComponent()).getText();
               String duration = ctime.getSelectedItem();
               
               String query = "insert into studentleave values ('"+rollno+"','"+date+"','"+duration+"')"; 
               try {
                   Conn c = new Conn();
                   c.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null,"Leave Confirmed");
                   setVisible(false);
               }catch(Exception e){
               e.printStackTrace();
        }
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
            
        }
    }
    
    public static void main(String[] args) {
        new StudentLeave();
    }

   
    
    
}
