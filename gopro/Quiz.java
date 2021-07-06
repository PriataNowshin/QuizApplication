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
public class Quiz extends JFrame implements ActionListener {
    
    JButton next, submit, lifeline;
    JLabel quesNo, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String arrQ_O [][] = new String[10][5];
    public static int count =0;
    
    public static int timer = 20;
    String pa [][] = new String[10][1];
    public static int ans_given = 0;
    String qa [][] = new String[10][2];
    public static int score = 0;
    
    String username;
    Quiz(String username){
        
        this.username = username;
        setBounds(250,50,1440,950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("gopro/icons/quiz.jpg"));
        JLabel label1 = new JLabel(icon1);
        label1.setBounds(0,0,1440,392);
        add(label1);
        
        
        quesNo = new JLabel("");
        quesNo.setFont(new Font("Tahoma", Font.PLAIN, 24));
        quesNo.setBounds(100,450,50,30);
        add(quesNo);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150,450,900,30);
        add(question);
        
        arrQ_O[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        arrQ_O[0][1] = "JVM";
        arrQ_O[0][2] = "JDB";
        arrQ_O[0][3] = "JDK";
        arrQ_O[0][4] = "JRE";

        arrQ_O[1][0] = "What is the return type of the hashCode() method in the Object class?";
        arrQ_O[1][1] = "int";
        arrQ_O[1][2] = "Object";
        arrQ_O[1][3] = "long";
        arrQ_O[1][4] = "void";

        arrQ_O[2][0] = "Which package contains the Random class?";
        arrQ_O[2][1] = "java.util package";
        arrQ_O[2][2] = "java.lang package";
        arrQ_O[2][3] = "java.awt package";
        arrQ_O[2][4] = "java.io package";

        arrQ_O[3][0] = "An interface with no fields or methods is known as?";
        arrQ_O[3][1] = "Runnable Interface";
        arrQ_O[3][2] = "Abstract Interface";
        arrQ_O[3][3] = "Marker Interface";
        arrQ_O[3][4] = "CharSequence Interface";

        arrQ_O[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        arrQ_O[4][1] = "Stack";
        arrQ_O[4][2] = "String memory";
        arrQ_O[4][3] = "Random storage space";
        arrQ_O[4][4] = "Heap memory";

        arrQ_O[5][0] = "Which of the following is a marker interface?";
        arrQ_O[5][1] = "Runnable interface";
        arrQ_O[5][2] = "Remote interface";
        arrQ_O[5][3] = "Readable interface";
        arrQ_O[5][4] = "Result interface";

        arrQ_O[6][0] = "Which keyword is used for accessing the features of a package?";
        arrQ_O[6][1] = "import";
        arrQ_O[6][2] = "package";
        arrQ_O[6][3] = "extends";
        arrQ_O[6][4] = "export";

        arrQ_O[7][0] = "In java, jar stands for?";
        arrQ_O[7][1] = "Java Archive Runner";
        arrQ_O[7][2] = "Java Archive";
        arrQ_O[7][3] = "Java Application Resource";
        arrQ_O[7][4] = "Java Application Runner";

        arrQ_O[8][0] = "Which of the following is a mutable class in java?";
        arrQ_O[8][1] = "java.lang.StringBuilder";
        arrQ_O[8][2] = "java.lang.Short";
        arrQ_O[8][3] = "java.lang.Byte";
        arrQ_O[8][4] = "java.lang.String";

        arrQ_O[9][0] = "Which of the following option leads to the portability and security of Java?";
        arrQ_O[9][1] = "Bytecode is executed by JVM";
        arrQ_O[9][2] = "The applet makes the Java code secure and portable";
        arrQ_O[9][3] = "Use of exception handling";
        arrQ_O[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        opt1 = new JRadioButton("");
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        opt1.setBounds(170, 520, 700, 30);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        opt2.setBounds(170, 560, 700, 30);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        opt3.setBounds(170, 600, 700, 30);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        opt4.setBounds(170, 640, 700, 30);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color (30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color (30,144,255));
        lifeline.addActionListener(this);
        lifeline.setForeground(Color.WHITE);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setEnabled(false);
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color (30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
      
        
        
        setVisible(true);
        start(0);
        
    }
    
    public void start(int count){
        quesNo.setText(""+ (count+1) + ". ");
        question.setText(arrQ_O[count][0]);
        opt1.setLabel(arrQ_O[count][1]);
        opt1.setActionCommand(arrQ_O[count][1]);
        opt2.setLabel(arrQ_O[count][2]);
        opt2.setActionCommand(arrQ_O[count][2]);
        opt3.setLabel(arrQ_O[count][3]);
        opt3.setActionCommand(arrQ_O[count][3]);
        opt4.setLabel(arrQ_O[count][4]);
        opt4.setActionCommand(arrQ_O[count][4]);
        options.clearSelection();
        
    }
    
    public static void main(String[]args){
        new Quiz("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else{
               pa[count] [0] = options.getSelection().getActionCommand();
            }
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        }else if(e.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else{
                pa[count] [0] = options.getSelection().getActionCommand();
            }

            for(int i = 0; i< pa.length; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score++;
                }else{
                    score = score;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if( e.getSource() == lifeline){
            if(count == 2 || count ==4 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time left : " + timer ;
        g.setColor(Color.RED);
        g.setFont(new Font ("Tahoma", Font.BOLD, 25));
        
        if(timer >0 ){
            g.drawString(time, 1110, 500);
        }else{
            g.drawString("Times up !", 1110, 500);
        }
        
        timer--; 
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        if(ans_given ==1){
            ans_given = 0;
            timer = 20;
        }else if(timer < 0 ){
            timer = 20;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count ==9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else{
                    pa[count] [0] = options.getSelection().getActionCommand();
                }
                
                for(int i = 0; i< pa.length; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score++;
                    }else{
                        score = score;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else{
                    pa[count] [0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }

    }
}
