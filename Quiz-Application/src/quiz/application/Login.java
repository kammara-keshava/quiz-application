package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;
    
    public Login() {
        // Set the background color and layout of the frame
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Load and add the login image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        // Add heading label
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        // Add prompt label for name input
        JLabel nameLabel = new JLabel("Enter your name");
        nameLabel.setBounds(810, 150, 300, 20);
        nameLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        nameLabel.setForeground(new Color(30, 144, 254));
        add(nameLabel);
        
        // Add text field for name input
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        // Add the "Next" button
        rules = new JButton("Next");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.BLACK);
        rules.addActionListener(this);
        add(rules);
        
        // Add the "Back" button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);
        
        // Set frame size and location
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);  // Ensure the Rules class is defined
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
