
package gopro;
import java.awt.*; // for color of the frame
import java.util.*;
import javax.swing.*; // for jFrame
import java.awt.event.*;

/**
 *
 * @author PRIATA
 */
public class GoPro extends JFrame implements ActionListener{
    
    JButton button1, button2;
    JTextField text1;
    
    GoPro(){
        setBounds(360,250, 1200, 500); //distanceleft , dup, frmlength, frmheight (with respect to screen)
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("gopro/icons/login.jpeg"));
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0, 0,600,500); // with respect to frame
        add(label1);
        
        JLabel label2 = new JLabel("Go Pro");
        label2.setFont(new Font("Serif",Font.BOLD, 40));
        label2.setForeground(new Color (30,144,254));
        label2.setBounds(823, 60, 300, 45);
        add(label2);
        
        JLabel label3 = new JLabel("Enter Your Name:");
        label3.setFont(new Font("Mongolian Baiti",Font.BOLD, 18));
        label3.setForeground(new Color (30,144,254));
        label3.setBounds(810, 150, 300, 20);
        add(label3);
        
        text1 = new JTextField();
        text1.setFont(new Font("Times New Roman",Font.BOLD, 20));
        text1.setForeground(new Color (30,144,254));
        text1.setBounds(735,200 ,300, 25);
        add(text1);
        
        button1 = new JButton("Rules");
        button1.setBounds(735,280, 120, 25);
        button1.setBackground(new Color (30,144,254));
        button1.setForeground(Color. WHITE);
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton("Exit");
        button2.setBounds(915,280, 120, 25);
        button2.setBackground(new Color (30,144,254));
        button2.setForeground(Color. WHITE);
        button2.addActionListener(this);

        add(button2);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GoPro();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button1){
            String name = text1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }
    
}
