package university.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener{
    
    Project()
    {
        setSize(1560,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Pictures/main_cover_2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1560,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.decode("#4169E1"));
        
        //New Information
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.WHITE);
        newInformation.setFont(new Font("serif", Font.BOLD,25));
        mb.add(newInformation);
        
        JMenuItem facultyInformation = new JMenuItem("New Faculty Information");
        newInformation.add(facultyInformation);
        facultyInformation.setFont(new Font("serif", Font.BOLD,18));
        facultyInformation.setBackground(Color.BLUE);
        facultyInformation.setForeground(Color.WHITE);
        facultyInformation.addActionListener(this);
        
        JMenuItem studentInformation = new JMenuItem("New Student Information");
        newInformation.add(studentInformation);
        studentInformation.setFont(new Font("serif", Font.BOLD,18));
        studentInformation.setBackground(Color.BLUE);
        studentInformation.setForeground(Color.WHITE);
        studentInformation.addActionListener(this);
        
        
        //View Faculty Details
        
        JMenu viewDetails = new JMenu("View Details");
        viewDetails.setForeground(Color.BLACK);
        viewDetails.setFont(new Font("serif", Font.BOLD,25));
        mb.add(viewDetails);
        
        JMenuItem ViewStudenDetails = new JMenuItem("View Student Details");
        viewDetails.add(ViewStudenDetails);
        ViewStudenDetails.setFont(new Font("serif", Font.BOLD,18));
        ViewStudenDetails.setBackground(Color.BLUE);
        ViewStudenDetails.setForeground(Color.WHITE);
        ViewStudenDetails.addActionListener(this);
        
        
        JMenuItem ViewFacultyDetails = new JMenuItem("View Faculty Details");
        viewDetails.add(ViewFacultyDetails);
        ViewFacultyDetails.setFont(new Font("serif", Font.BOLD,18));
        ViewFacultyDetails.setBackground(Color.BLUE);
        ViewFacultyDetails.setForeground(Color.WHITE);
        ViewFacultyDetails.addActionListener(this);
        
        
        //Apply Leave
        
        
        JMenu applyForLeave = new JMenu("Apply For Leave");
        applyForLeave.setForeground(Color.WHITE);
        applyForLeave.setFont(new Font("serif", Font.BOLD,25));
        mb.add(applyForLeave);
        
        JMenuItem FacultyLeave = new JMenuItem("Faculty Leave");
        applyForLeave.add(FacultyLeave);
        FacultyLeave.setFont(new Font("serif", Font.BOLD,18));
        FacultyLeave.setBackground(Color.BLUE);
        FacultyLeave.setForeground(Color.WHITE);
        FacultyLeave.addActionListener(this);
        
        JMenuItem StudenLeave = new JMenuItem("Student Leave");
        applyForLeave.add(StudenLeave);
        StudenLeave.setFont(new Font("serif", Font.BOLD,18));
        StudenLeave.setBackground(Color.BLUE);
        StudenLeave.setForeground(Color.WHITE);
        StudenLeave.addActionListener(this);
        
        
         //View Leave Details
        
        
        JMenu viewLeaveDetails = new JMenu("View Leave Details");
        viewLeaveDetails.setForeground(Color.BLACK);
        viewLeaveDetails.setFont(new Font("serif", Font.BOLD,25));
        mb.add(viewLeaveDetails);
        
        JMenuItem FacultyLeaveDetails = new JMenuItem("View Faculty Leave Details");
        viewLeaveDetails.add(FacultyLeaveDetails);
        FacultyLeaveDetails.setFont(new Font("serif", Font.BOLD,18));
        FacultyLeaveDetails.setBackground(Color.BLUE);
        FacultyLeaveDetails.setForeground(Color.WHITE);
        FacultyLeaveDetails.addActionListener(this);
        
        JMenuItem StudenLeaveDetails = new JMenuItem("View Student Leave Details");
        viewLeaveDetails.add(StudenLeaveDetails);
        StudenLeaveDetails.setFont(new Font("serif", Font.BOLD,18));
        StudenLeaveDetails.setBackground(Color.BLUE);
        StudenLeaveDetails.setForeground(Color.WHITE);
        StudenLeaveDetails.addActionListener(this);
        
        
        //Examination
        
        
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.WHITE);
        exam.setFont(new Font("serif", Font.BOLD,25));
        mb.add(exam);
        
        JMenuItem examinationDetails = new JMenuItem("Examination Result");
        exam.add(examinationDetails);
        examinationDetails.setFont(new Font("serif", Font.BOLD,18));
        examinationDetails.setBackground(Color.BLUE);
        examinationDetails.setForeground(Color.WHITE);
        examinationDetails.addActionListener(this);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks");
        exam.add(entermarks);
        entermarks.setFont(new Font("serif", Font.BOLD,18));
        entermarks.setBackground(Color.BLUE);
        entermarks.setForeground(Color.WHITE);
        entermarks.addActionListener(this);
        
        
        //Upadate Info
        
        
        JMenu upadateDetails = new JMenu("Update Details");
        upadateDetails.setForeground(Color.BLACK);
        upadateDetails.setFont(new Font("serif", Font.BOLD,25));
        mb.add(upadateDetails);
        
        JMenuItem updateFacultyDetails = new JMenuItem("Update Faculty Details");
        upadateDetails.add(updateFacultyDetails);
        updateFacultyDetails.setFont(new Font("serif", Font.BOLD,18));
        updateFacultyDetails.setBackground(Color.BLUE);
        updateFacultyDetails.setForeground(Color.WHITE);
        updateFacultyDetails.addActionListener(this);
        
        JMenuItem updatestudentDetails = new JMenuItem("Update Student Details");
        upadateDetails.add(updatestudentDetails);
        updatestudentDetails.setFont(new Font("serif", Font.BOLD,18));
        updatestudentDetails.setBackground(Color.BLUE);
        updatestudentDetails.setForeground(Color.WHITE);
        updatestudentDetails.addActionListener(this);
        
        
        //Fees
        
        
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.WHITE);
        fee.setFont(new Font("serif", Font.BOLD,25));
        mb.add(fee);
        
        JMenuItem feeStructure = new JMenuItem("Fee Structure");
        fee.add(feeStructure);
        feeStructure.setFont(new Font("serif", Font.BOLD,18));
        feeStructure.setBackground(Color.BLUE);
        feeStructure.setForeground(Color.WHITE);
        feeStructure.addActionListener(this);
        
        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        fee.add(feeForm);
        feeForm.setFont(new Font("serif", Font.BOLD,18));
        feeForm.setBackground(Color.BLUE);
        feeForm.setForeground(Color.WHITE);
        feeForm.addActionListener(this);
        
        JMenuItem feeDetails = new JMenuItem("Student Fee Details");
        fee.add(feeDetails);
        feeDetails.setFont(new Font("serif", Font.BOLD,18));
        feeDetails.setBackground(Color.BLUE);
        feeDetails.setForeground(Color.WHITE);
        feeDetails.addActionListener(this);
        
        
        //Utility
        
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        utility.setFont(new Font("serif", Font.BOLD,25));
        mb.add(utility);
        
        JMenuItem notepad = new JMenuItem("Notepad");
        utility.add(notepad);
        notepad.setFont(new Font("serif", Font.BOLD,18));
        notepad.setBackground(Color.BLUE);
        notepad.setForeground(Color.WHITE);
        notepad.addActionListener(this);
        
        JMenuItem calc = new JMenuItem("Calculator");
        utility.add(calc);
        calc.setFont(new Font("serif", Font.BOLD,18));
        calc.setBackground(Color.BLUE);
        calc.setForeground(Color.WHITE);
        calc.addActionListener(this);
        
        //about
        
        JMenu about = new JMenu("About");
        about.setForeground(Color.WHITE);
        about.setFont(new Font("serif", Font.BOLD,25));
        mb.add(about);
        
        JMenuItem ab = new JMenuItem("About");
        about.add(ab);
        ab.setFont(new Font("serif", Font.BOLD,18));
        ab.setBackground(Color.BLUE);
        ab.setForeground(Color.WHITE);
        ab.addActionListener(this);
        
        //exit
        
        
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        exit.setFont(new Font("serif", Font.BOLD,25));
        mb.add(exit);
        
        JMenuItem ex = new JMenuItem("Exit");
        exit.add(ex);
        ex.setFont(new Font("serif", Font.BOLD,18));
        ex.setBackground(Color.BLUE);
        ex.setForeground(Color.WHITE);
        ex.addActionListener(this);
        
        
        setJMenuBar(mb);
        
        
        
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit"))
        {
            setVisible(false);
        }
        else if(msg.equals("Notepad"))
        {
            try{
                
                Runtime.getRuntime().exec("notepad.exe");
               
            }catch (Exception e) {
                
            }
        }
        else if(msg.equals("Calculator"))
        {
            try{
                
                Runtime.getRuntime().exec("calc.exe");
               
            }catch (Exception e) {
                
            }
        }
        else if(msg.equals("New Faculty Information"))
        {
            new AddTeacher();
        }
        else if(msg.equals("New Student Information"))
        {
            new AddStudent();
        }
        else if(msg.equals("View Student Details"))
        {
            new StudentDetails();
        }
        else if(msg.equals("View Faculty Details"))
        {
            new TeacherDetails();
        }
        else if(msg.equals("Student Leave"))
        {
            new StudentLeave();
        }
        else if(msg.equals("Faculty Leave"))
        {
            new TeacherLeave();
        }
        else if(msg.equals("View Student Leave Details"))
        {
            new StudentLeaveDetails();
        }
        else if(msg.equals("View Faculty Leave Details"))
        {
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Update Student Details"))
        {
            new UpdateStudent();
        }
        else if(msg.equals("Update Faculty Details"))
        {
            new UpdateTeacher();
        }
        else if(msg.equals("Enter Marks"))
        {
            new EnterMarks();
        }
        else if(msg.equals("Examination Result"))
        {
            new ExaminationDetails();
        }
        else if(msg.equals("About"))
        {
            new About();
        }
        else if(msg.equals("Fee Structure"))
        {
            new FeeStructure();
        }
        else if(msg.equals("Student Fee Form"))
        {
            new StudentFeeForm();
        }
        else if(msg.equals("Student Fee Details"))
        {
            new StudentFeeDetails();
        }
        
         
        
         
        
    }
    
    public static void main(String[] args) {
        new Project();
    }
}
