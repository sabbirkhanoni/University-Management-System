package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener{
    
    JButton thankyou;
    
    About()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("<html>ABC University<br>Management System</html>");
        heading.setFont(new Font("Tahoma", Font.BOLD,25));
        heading.setForeground(Color.BLACK);
        heading.setBounds(100,50,500,100);
        add(heading); 
        
        JLabel nameheading = new JLabel("All Rights Reserved By Sabbir Khan Oni");
        nameheading.setFont(new Font("Tahoma", Font.BOLD,18));
        nameheading.setForeground(Color.RED);
        nameheading.setBounds(100,300,500,100);
        add(nameheading);
        
        JLabel fheading1 = new JLabel("<html>Contact Me On :<br/>Email : sabbirkhanoni@gmail.com<br/>Phone : +8801638385951<br/>Codeforces : sabbirkhanoni<br/>Github : sabbirkhanoni");
        fheading1.setFont(new Font("Tahoma", Font.BOLD,18));
        fheading1.setForeground(Color.BLACK);
        fheading1.setBounds(100,400,500,200);
        add(fheading1);
        
        thankyou =  new JButton("Thank You");
        thankyou.setBounds(250,600,120,30);
        thankyou.setBackground(Color.BLACK);
        thankyou.setForeground(Color.WHITE);
        thankyou.addActionListener(this);
        thankyou.setFont(new Font("serif", Font.BOLD,16));
        add(thankyou);
        
        
        setLocation(250,50);
        setSize(600,700);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == thankyou)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new About();
    }
}
