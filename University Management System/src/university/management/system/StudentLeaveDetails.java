package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class StudentLeaveDetails extends JFrame implements ActionListener{
    
       JButton search,print,update,add,cancel;
       JTable table;
       Choice crollno;
       
   StudentLeaveDetails()
   {
       
       getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        
        
        JLabel heading = new JLabel("Search By Roll Number");
        heading.setBounds(70,500,180,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("serif", Font.BOLD,15));
        add(heading);
        
        crollno = new Choice();
        crollno.setBounds(300,510,200,40);
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
        
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from studentleave");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,0,1050,450);
        add(jsp);
        
        
        search =  new JButton("Search");
        search.setBounds(80,560,100,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        search.setFont(new Font("serif", Font.BOLD,16));
        add(search);
        
        print =  new JButton("Print");
        print.setBounds(280,560,100,30);
        print.setBackground(Color.BLACK);
        print.setForeground(Color.WHITE);
        print.addActionListener(this);
        print.setFont(new Font("serif", Font.BOLD,16));
        add(print);
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(480,560,100,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,16));
        add(cancel);
        
        setLocation(250,50);
        setSize(1050,700);
        setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae) { 
           
       if(ae.getSource() == search)
        {
            String query = "select * from studentleave where rollno = '"+crollno.getSelectedItem()+"'";
            try{
                Conn c = new Conn();
                java.sql.ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }
       else if(ae.getSource() == print)
        {
            try{
                table.print();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
       else if(ae.getSource() == cancel)
        {
            setVisible(false);
            
        }
 
      }
   
    public static void main(String[] args) {
        
        new StudentLeaveDetails();
    }

    
}
