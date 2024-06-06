package calculator;

//import java.awt.Frame;
import java.awt.GridLayout;
//import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Calculator implements ActionListener {
	
	JFrame f;
	JPanel p;
	GridLayout g;
	TextField t1;
	String s1,s2,s3,s4,s5;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b_add, b_sub, b_mul, b_div, b_eq, b_clr;
	int operator, num;
	float div_num;
	
	Calculator(){
		
		JFrame f = new JFrame("Calculator");
		f.setLayout(new FlowLayout());
		
		p = new JPanel();
		
		b0 = new Button("0");
		b0.addActionListener(this);
		
		b1 = new Button("1");
		b1.addActionListener(this);
		
		b2 = new Button("2");
		b2.addActionListener(this);
		
		b3 = new Button("3");
		b3.addActionListener(this);
		
		b4 = new Button("4");
		b4.addActionListener(this);
		
		b5 = new Button("5");
		b5.addActionListener(this);
		
		b6 = new Button("6");
		b6.addActionListener(this);
		
		b7 = new Button("7");
		b7.addActionListener(this);
		
		b8 = new Button("8");
		b8.addActionListener(this);
		
		b9 = new Button("9");
		b9.addActionListener(this);
		
		b_add = new Button("+");
		b_add.addActionListener(this);
		
		b_sub = new Button("-");
		b_sub.addActionListener(this);
		
		b_mul = new Button("*");
		b_mul.addActionListener(this);
		
		b_div = new Button("/");
		b_div.addActionListener(this);
		
		b_eq = new Button("=");
		b_eq.addActionListener(this);
		
		b_clr = new Button("AC");
		b_clr.addActionListener(this);
		
		
//		t1 = new TextField(10);
		t1 = new TextField(22);
		t1.setBounds(20,20,20,20);
		p.setBounds(50, 50, 10, 10);
		
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b_add);
		p.add(b_sub);
		p.add(b_mul);
		p.add(b_div);
		p.add(b_eq);
		p.add(b_clr);
		
		g = new GridLayout(4,4,12,10);
		p.setLayout(g);
		
		f.add(t1);
		f.add(p);
		f.setSize(320,350);
		f.setVisible(true);
		f.setBackground(Color.BLACK);
		f.addWindowListener(new WindowAdapter(){
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b0) {
			
			s3 = t1.getText();
			s4 = "0";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		
		if(e.getSource()==b1) {
			
			s3 = t1.getText();
			s4 = "1";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b2) {
			
			s3 = t1.getText();
			s4 = "2";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b3) {
			
			s3 = t1.getText();
			s4 = "3";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b4) {
			
			s3 = t1.getText();
			s4 = "4";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b5) {
			
			s3 = t1.getText();
			s4 = "5";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b6) {
			
			s3 = t1.getText();
			s4 = "6";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b7) {
			
			s3 = t1.getText();
			s4 = "7";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b8) {
			
			s3 = t1.getText();
			s4 = "8";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		if(e.getSource()==b9) {
			
			s3 = t1.getText();
			s4 = "9";
			s5 = s3 + s4;
			t1.setText(s5);
			
		}
		
		if(e.getSource() == b_add) {
			s1 = t1.getText();
			t1.setText("");
			operator = 1;
			
		}
		if(e.getSource() == b_sub) {
			s1 = t1.getText();
			t1.setText("");
			operator = 2;
			
		}
		if(e.getSource() == b_mul) {
			s1 = t1.getText();
			t1.setText("");
			operator = 3;
			
		}
		if(e.getSource() == b_div) {
			s1 = t1.getText();
			t1.setText("");
			operator = 4;
			
		}
		
		if(e.getSource() == b_eq) {
			
			s2 = t1.getText();
			
			if(operator == 1) {
				num = Integer.parseInt(s1) + Integer.parseInt(s2);
				t1.setText(String.valueOf(num));
			}
			
			if(operator == 2) {
				num = Integer.parseInt(s1) - Integer.parseInt(s2);
				t1.setText(String.valueOf(num));
			}
			
			if(operator == 3) {
				num = Integer.parseInt(s1) * Integer.parseInt(s2);
				t1.setText(String.valueOf(num));
			}
			
			if(operator == 4) {
				div_num = Float.parseFloat(s1) / Float.parseFloat(s2);
				t1.setText(String.valueOf(div_num));
			}
		}
		
		if(e.getSource() == b_clr) {
			t1.setText("");
		}
		
	}

	public static void main(String[] args) {
		
		Calculator c = new Calculator();

	}



}
