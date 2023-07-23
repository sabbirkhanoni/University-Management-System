package university.management.system;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class FeeStructure extends JFrame{
    
    FeeStructure()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel heading = new JLabel("Fee Structure");
        heading.setFont(new Font("serif", Font.BOLD,25));
        heading.setForeground(Color.WHITE);
        heading.setBounds(400,50,220,30);
        add(heading); 
        
        JTable table = new JTable();
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from fee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {
            e.printStackTrace();
        }
                
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,200,1000,500);
        add(jsp);
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FeeStructure();
    }
}
