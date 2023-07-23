package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class TeacherDetails extends JFrame implements ActionListener{
    
       JButton search,print,update,add,cancel;
       JTable table;
       Choice cEmpId;
       
   TeacherDetails()
   {
       
       getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        
        
        JLabel heading = new JLabel("Search By Employee ID");
        heading.setBounds(70,500,190,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("serif", Font.BOLD,15));
        add(heading);
        
        cEmpId = new Choice();
        cEmpId.setBounds(300,510,200,40);
        add(cEmpId);
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from teacher");
            while(rs.next())
            {
                cEmpId.add(rs.getString("empId"));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
        table = new JTable();
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from teacher");
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
        
        update =  new JButton("Update");
        update.setBounds(480,560,100,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        update.addActionListener(this);
        update.setFont(new Font("serif", Font.BOLD,16));
        add(update);
        
        add =  new JButton("Add");
        add.setBounds(680,560,100,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add.setFont(new Font("serif", Font.BOLD,16));
        add(add);
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(880,560,100,30);
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
            String query = "select * from teacher where empId = '"+cEmpId.getSelectedItem()+"'";
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
       else if(ae.getSource() == update)
        {
            setVisible(false);
            new UpdateTeacher();
        }
       else if(ae.getSource() == add)
        {
            setVisible(false);
            new AddTeacher();
        }
       else if(ae.getSource() == cancel)
        {
            setVisible(false);
           
        }
 
    }
   
    public static void main(String[] args) {
        
        new TeacherDetails();
    }

    
}
