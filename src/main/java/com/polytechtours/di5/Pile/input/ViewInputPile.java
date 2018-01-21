package com.polytechtours.di5.Pile.input;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ViewInputPile extends InputPileStrategy{

	public String action;
	JFrame jf = new JFrame();
	JButton jbPush = new JButton();
	JButton jbPop = new JButton();
	JButton jbClear= new JButton();
	JTextField jtf = new JTextField();
	
	public int num = 0;
	
	public ViewInputPile(){
		jf.setSize(500, 400);
		jf.setVisible(true);
		jbPush.setBounds(100, 100, 100, 50);
		jtf.setBounds(300, 100, 100, 50);
		jbPop.setBounds(100, 200, 300, 50);
		jbClear.setBounds(100, 300, 300, 50);
		jf.add(jbPush);
		jf.add(jtf);
		jf.add(jbPop);
		jf.add(jbClear);
		jbPush.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				action = "push";
				num =Integer.parseInt(jtf.getText());
				actionCommande();
			}
			
		});
		jbPop.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				action = "pop";
				actionCommande();
			}
			
		});
		jbClear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				action = "clear";
				actionCommande();
			}
			
		});
	} 
	
	@Override
	public void actionCommande() {
		if(action.equals("pop"))
			this.pop();
		else if(action.equals("push"))
			this.push(num);
		else if(action.equals("clear"))
			this.clear();
	}

}
