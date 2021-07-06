/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gopro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PRIATA
 */
public class Rules extends JFrame implements ActionListener {
    JButton button1, button2;
    String username;
    Rules(String username){
        this.username = username;
        setBounds(525,200,800,650);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel label1 = new JLabel("Welcome "+ username + " to Go Pro");
        label1.setForeground(new Color(30,144,255));
        label1.setFont(new Font("Serif", Font.BOLD, 28));
        label1.setBounds(50,20,700,30);
        add(label1);
        
        JLabel label2 = new JLabel();
        label2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        label2.setBounds(50,90,600,350);
        label2.setText(
            "<html>"+
                "1. Answer to the point" +"<br><br>" +
                "2. Answer all 10 questions" +"<br><br>" +
                "3. You will have 20 seconds for each question. Answer in time" +"<br><br>" +
                "4. Do not get nervous" +"<br><br>" +
                "5. Do not plagiarize" +"<br><br>" +
                "6. Do not try to google it" +"<br><br>" +
                "7. You will have 50-50 lifeline where 2 options will be excluded but you can use it only once. So be wise about it." +"<br><br>" +
            "<html>"
        );
        add(label2);
        
        button1 = new JButton("Back");
        button1.setBounds(250, 500, 100, 30);
        button1.setBackground(new Color (30,144,254));
        button1.setForeground(Color. WHITE);
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("Start");
        button2.setBounds(400, 500, 100, 30);
        button2.setBackground(new Color (30,144,254));
        button2.setForeground(Color. WHITE);
        button2.addActionListener(this);
        add(button2);
        
        setVisible(true);
    }
    
    public static void main(String[]args){
        new Rules("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1){
            this.setVisible(false);
            new GoPro().setVisible(true);
        }else if(e.getSource() == button2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
}
