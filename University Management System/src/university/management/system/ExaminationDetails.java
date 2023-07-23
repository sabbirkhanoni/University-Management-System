package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
    
    JTextField search;
    JButton result,back;
    JTable table;
    
    ExaminationDetails()
    {
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        JLabel mainheading = new JLabel("Check Exam Result");
        mainheading.setFont(new Font("serif", Font.BOLD,25));
        mainheading.setForeground(Color.WHITE);
        mainheading.setBounds(400,50,300,30);
        add(mainheading);
        
        JLabel lbenterroll = new JLabel("Enter Roll Number");
        lbenterroll.setFont(new Font("serif", Font.BOLD,25));
        lbenterroll.setForeground(Color.WHITE);
        lbenterroll.setBounds(100,100,200,30);
        add(lbenterroll);
        
        search = new JTextField();
        search.setBounds(350,100,220,30);
        add(search);
        
        result =  new JButton("Result");
        result.setBounds(150,180,100,30);
        result.setBackground(Color.BLACK);
        result.setForeground(Color.WHITE);
        result.addActionListener(this);
        result.setFont(new Font("serif", Font.BOLD,16));
        add(result);
        
        back =  new JButton("Back");
        back.setBounds(400,180,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setFont(new Font("serif", Font.BOLD,16));
        add(back);
        
        
         table = new JTable();
        
        try{
            Conn c = new Conn();
            java.sql.ResultSet rs = c.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,250,1000,450);
        add(jsp);
        
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me)
            {
                int row = table.getSelectedRow();
                search.setText(table.getModel().getValueAt(row,2).toString());
            }
        });
        
        setLocation(250,50);
        setSize(1000,700);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == result)
        {
            setVisible(false);
            new Marks(search.getText());
        }
        else if(ae.getSource() == back)
        {
           setVisible(false);
        }
                
    }
    
    public static void main(String[] args) {
        new ExaminationDetails();
    }
}
