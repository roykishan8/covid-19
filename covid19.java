package application;
import javax.swing.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.awt.event.*;
public class covid19 extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	
	covid19(){
		l1=new JLabel("Confirmed");
		l2=new JLabel("Active");
		l3=new JLabel("Recovered");
		l4=new JLabel("Death");
		l5=new JLabel();
		l6=new JLabel();
		l7=new JLabel();
		l8=new JLabel();
		l1.setBounds(50, 50, 80, 50);
		l2.setBounds(140, 50, 80, 50);
		l3.setBounds(220, 50, 80, 50);
		l4.setBounds(330, 50, 80, 50);
		l5.setBounds(50, 80, 80, 50);
		l6.setBounds(140, 80, 80, 50);
		l7.setBounds(220,80,80,50);
		l8.setBounds(330,80,80,50);
		b1=new JButton("Maharashtra");
		b1.setBounds(50,120,120,50);
		b1.addActionListener(this);
		b2=new JButton("Tamil Nadu");
		b2.setBounds(180,120,120,50);
		b2.addActionListener(this);
		b3=new JButton("Delhi");
		b3.setBounds(310,120,120,50);
		b3.addActionListener(this);
		b4=new JButton("Kerala");
		b4.setBounds(50,190,120,50);
		b4.addActionListener(this);
		b5=new JButton("Telangana");
		b5.setBounds(180,190,120,50);
		b5.addActionListener(this);
		b6=new JButton("Andhra Pradesh");
		b6.setBounds(310,190,150,50);
		b6.addActionListener(this);
		b7=new JButton("Rajasthan");
		b7.setBounds(50,260,120,50);
		b7.addActionListener(this);
		b8=new JButton("Uttar Pradesh");
		b8.setBounds(180,260,120,50);
		b8.addActionListener(this);
		b9=new JButton("Bihar");
		b9.setBounds(310,260,120,50);
		b9.addActionListener(this);
		b10=new JButton("Total");
		b10.setBounds(220, 400, 80, 50);
		b10.addActionListener(this);
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(b10);
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==b10) {
		covidchart l=new covidchart();
		Application.launch(covidchart.class);
		 }
		 if(e.getSource()==b1) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(0));
			 l6.setText(l.getactive(0));
			 l7.setText(l.getrecovered(0));
			 l8.setText(l.getdeath(0));
		 }
		 if(e.getSource()==b2) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(1));
			 l6.setText(l.getactive(1));
			 l7.setText(l.getrecovered(1));
			 l8.setText(l.getdeath(1));
		 }
		 if(e.getSource()==b3) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(2));
			 l6.setText(l.getactive(2));
			 l7.setText(l.getrecovered(2));
			 l8.setText(l.getdeath(2));
		 }
		 if(e.getSource()==b4) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(3));
			 l6.setText(l.getactive(3));
			 l7.setText(l.getrecovered(3));
			 l8.setText(l.getdeath(3));
		 }
		 if(e.getSource()==b5) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(4));
			 l6.setText(l.getactive(4));
			 l7.setText(l.getrecovered(4));
			 l8.setText(l.getdeath(4));
		 }
		 if(e.getSource()==b6) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(5));
			 l6.setText(l.getactive(5));
			 l7.setText(l.getrecovered(5));
			 l8.setText(l.getdeath(5));
		 }
		 if(e.getSource()==b7) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(6));
			 l6.setText(l.getactive(6));
			 l7.setText(l.getrecovered(6));
			 l8.setText(l.getdeath(6));
		 }
		 if(e.getSource()==b8) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(7));
			 l6.setText(l.getactive(7));
			 l7.setText(l.getrecovered(7));
			 l8.setText(l.getdeath(7));
		 }
		 if(e.getSource()==b9) {
			 Statelist l=new Statelist();
			 l5.setText(l.getconfirmed(8));
			 l6.setText(l.getactive(8));
			 l7.setText(l.getrecovered(8));
			 l8.setText(l.getdeath(8));
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		covid19 l=new covid19();
		 

	}

}
