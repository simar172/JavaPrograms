package calculator1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calculator {
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
   JTextArea textarea=new JTextArea(2,10);
   
   JButton button1=new JButton();
   JButton button2=new JButton();
   JButton button3=new JButton();
   JButton button4=new JButton();
   JButton button5=new JButton();
   JButton button6=new JButton();
   JButton button7=new JButton();
   JButton button8=new JButton();
   JButton button9=new JButton();
   JButton button0=new JButton();
   JButton buttonadd=new JButton();
   JButton buttonsub=new JButton();
   JButton buttonmulti=new JButton();
   JButton buttondiv=new JButton();
   JButton buttonclear=new JButton();
   JButton buttondot=new JButton();
   JButton buttonequal=new JButton();
   
   double i, j,result;
   int add=0,multi=0,sub=0,div=0;
   public calculator() {
	  
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(340,450);
	   frame.setVisible(true);
	   frame.setTitle("sidhu");
	   
	   frame.setResizable(false);
	   frame.add(panel);
	   panel.setBackground(Color.LIGHT_GRAY);
	   Border border=BorderFactory.createLineBorder(Color.RED);
	   panel.add(textarea);
	   textarea.setBackground(Color.BLACK);
	   Border tborder=BorderFactory.createLineBorder(Color.BLUE,3);
	   textarea.setBorder(tborder);
	   Font font=new Font("ariel",Font.BOLD,33);
	   textarea.setFont(font);
	   textarea.setForeground(Color.WHITE);
	   textarea.setPreferredSize(new Dimension(2,10));
	   textarea.setLineWrap(true);
	   button1.setPreferredSize(new Dimension(100,40));
	   button1.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\1.JPG"));
	   button0.setPreferredSize(new Dimension(100,40));
	   button0.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\0.PNG"));
	   button2.setPreferredSize(new Dimension(100,40));
	   button2.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\2.PNG"));
	   button3.setPreferredSize(new Dimension(100,40));
	   button3.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\3.PNG"));
	   button4.setPreferredSize(new Dimension(100,40));
	   button4.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\4.JPG"));
	   button5.setPreferredSize(new Dimension(100,40));
	   button5.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\5.png"));
	   button6.setPreferredSize(new Dimension(100,40));
	   button6.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\6.png"));
	   button7.setPreferredSize(new Dimension(100,40));
	   button7.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\7.png"));
	   button8.setPreferredSize(new Dimension(100,40));
	   button8.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\8.png"));
	   button9.setPreferredSize(new Dimension(100,40));
	   button9.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\9.png"));
	   button0.setPreferredSize(new Dimension(100,40));
	   button0.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\0.png"));
	   buttonadd.setPreferredSize(new Dimension(100,40));
	   buttonadd.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\+.png"));
	   buttonsub.setPreferredSize(new Dimension(100,40));
	   buttonsub.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\m.png"));
	   buttonmulti.setPreferredSize(new Dimension(100,40));
	   buttonmulti.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\c.png"));
	   buttondiv.setPreferredSize(new Dimension(100,40));
	   buttondiv.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\d.png"));
	   buttonclear.setPreferredSize(new Dimension(100,40));
	   buttonclear.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\k.png"));
	   buttondot.setPreferredSize(new Dimension(100,40));
	   buttondot.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\dot.png"));
	   buttonequal.setPreferredSize(new Dimension(100,40));
	   buttonequal.setIcon(new ImageIcon("C:\\Users\\Harnimarpreet\\Desktop\\button\\e.png"));
	   panel.add(button0);
	   panel.add(button1);
	   panel.add(button2);
	   panel.add(button3);
	   panel.add(button4);
	   panel.add(button5);
	   panel.add(button6);
	   panel.add(button7);
	   panel.add(button8);
	   panel.add(button9);
	   panel.add(buttonsub);
	   panel.add(buttonadd);
	   panel.add(buttonmulti);
	   panel.add(buttondiv);
	   panel.add(buttonequal);
	   panel.add(buttondot);
	   panel.add(buttonclear);
	   button0.addActionListener((ActionListener) this);
	   button1.addActionListener((ActionListener) this);
	   button2.addActionListener((ActionListener) this);
	   button3.addActionListener((ActionListener) this);
	   button4.addActionListener((ActionListener) this);
	   button5.addActionListener((ActionListener) this);
	   button6.addActionListener((ActionListener) this);
	   button7.addActionListener((ActionListener) this);
	   button8.addActionListener((ActionListener) this);
	   button9.addActionListener((ActionListener) this);
	   buttonadd.addActionListener((ActionListener) this);
	   buttonsub.addActionListener((ActionListener) this);
	   buttondiv.addActionListener((ActionListener) this);
	   buttonmulti.addActionListener((ActionListener) this);
	   buttondot.addActionListener((ActionListener) this);
	   buttonclear.addActionListener((ActionListener) this);
	   buttonequal.addActionListener((ActionListener) this);
	   
   }
   public void action(ActionEvent e) {
	   Object source=e.getSource();
	   if(source==buttonclear) {
		   double button1=0.0;
		   double button2=0.0;
		   
	   }
	   if(source==button1) {
		   textarea.append("1");
		   
	   }
	   if(source==button2) {
		   textarea.append("2");
	   }
   }
}
