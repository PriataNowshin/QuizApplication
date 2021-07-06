/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gopro;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PRIATA
 */
public class Score extends JFrame implements ActionListener {
    Score( String username, int score){
        setBounds(600,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource(("gopro/icons/score.png")));
        Image icon2 = icon1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        JLabel label1 = new JLabel(icon3);
        label1.setBounds(0,200,300,250);
        add(label1);
        
        JLabel label2 = new JLabel("Thank you "+ username+ " for playing Go Pro ");
        label2.setBounds(45,30,700,30);
        label2.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(label2);
        
        JLabel label3 = new JLabel("Your score is: "+ score);
        label3.setBounds(350,200,300,30);
        label3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        label3.setForeground(new Color (199, 21,133));
        add(label3);
        
        JButton button1 = new JButton("Play agin");
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);
        button1.setBounds(400,270,120,30);
        button1.addActionListener(this);
        add(button1);
    }
    public static void main(String[]args){
        new Score("",0).setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        new GoPro().setVisible(true);
    }
}
