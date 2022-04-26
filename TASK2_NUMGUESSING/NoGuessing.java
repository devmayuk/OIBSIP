package Task2_NumGuessing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NoGuessing {
    private static JFrame f;
    private static JLabel l;
    private static JTextField t;
    private static JButton b1;
    private static JButton b2;
    private static JLabel att;
    private static JLabel suc;
    private static JLabel res;
    public static int n;
    public static int c=0;



    public static void main(String[] args) {
        Random r=new Random();
        n=r.nextInt(100);
        JPanel p=new JPanel();
        f=new JFrame();
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(p);
        p.setLayout(null);

        l=new JLabel("ENTER NUMBER (1-100)");
        l.setBounds(80,20,250,25);
        l.setFont(new Font("Serif",Font.BOLD,20));
        p.add(l);

        t=new JTextField();
        t.setBounds(80,60,210,25);
        p.add(t);

        b1=new JButton("SUBMIT");
        b1.setBounds(80,90,100,25);
        ActionListener l=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=t.getText();
                int b=Integer.parseInt(s);
                if(c>=10){
                    suc.setText("ATTEMPTS EXCEEDED 10!! TRY AGAIN !");
                }
                else if(b==n){
                    suc.setText("CORRECT,YOU WON !");
                    res.setText("SCORE : "+(10-c));
                }
                else if(b>n){
                    att.setText("ATTEMPTS : "+(c+1));
                    suc.setText("NUMBER IS LESS THAN "+b);
                }
                else if(b<n){
                    att.setText("ATTEMPTS : "+(c+1));
                    suc.setText("NUMBER IS GREATER THAN "+b);
                }
                c++;

            }

        };
        b1.addActionListener(l);
        p.add(b1);

        b2=new JButton("RETRY");
        b2.setBounds(190,90,100,25);
        ActionListener l1=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                att.setText("ATTEMPTS : "+0);
                suc.setText("");
                res.setText("");
                n=r.nextInt(10);
                c=0;
            }
        };
        b2.addActionListener(l1);
        p.add(b2);

        att=new JLabel("ATTEMPTS : "+c);
        att.setBounds(20,140,200,25);
        att.setFont(new Font("Serif",Font.BOLD,15));
        p.add(att);

        suc=new JLabel("");
        suc.setBounds(20,170,300,25);
        suc.setFont(new Font("Serif",Font.BOLD,15));
        p.add(suc);

        res=new JLabel("");
        res.setBounds(20,200,300,25);
        res.setFont(new Font("Serif",Font.BOLD,15));
        p.add(res);
        f.setVisible(true);

    }
}
