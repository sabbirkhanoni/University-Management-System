package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,cancel;
    JTextField tfusername;
    JPasswordField tfpassword;
    
    Login()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
         
        JLabel lbusername = new JLabel("Username");
        lbusername.setFont(new Font("serif", Font.BOLD,18));
        lbusername.setForeground(Color.WHITE);
        lbusername.setBounds(300,280,100,30);
        add(lbusername);
        
        
        JLabel lbpassword = new JLabel("Password");
        lbpassword.setFont(new Font("serif", Font.BOLD,16));
        lbpassword.setForeground(Color.WHITE);
        lbpassword.setBounds(300,380,100,30);
        add(lbpassword);
        
        tfusername = new JTextField();
        tfusername.setBounds(400,280,220,30);
        add(tfusername);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(400,380,220,30);
        add(tfpassword);
        
        login =  new JButton("Log In");
        login.setBounds(300,480,100,30);
        login.setBackground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif", Font.BOLD,18));
        add(login);
        
        cancel =  new JButton("Cancel");
        cancel.setBounds(520,480,100,30);
        cancel.setBackground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,16));
        add(cancel);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Pictures/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,50,200,200);
        add(image);
        
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
      
        if(ae.getSource() == login)
        {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from login where username='"+username+"' and password='"+password+"'";
            
            try{
                Conn c  = new Conn();
                java.sql.ResultSet rs = c.s.executeQuery(query);

                if(rs.next())
                {
                   setVisible(false); 
                   new Project();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Username Or Password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
    }
    
    
    public static void main(String[] args) {
        new Login();
    }
    
    
}
