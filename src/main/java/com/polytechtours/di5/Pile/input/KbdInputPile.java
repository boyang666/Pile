package com.polytechtours.di5.Pile.input;

import java.util.Scanner;

/**
 * Input from keyboard
 * 
 * @author boyang
 *
 */
public class KbdInputPile extends InputPileStrategy{

	/** action of user */
	public String action;
	
	/** number to push */ 
	public int num;
	
	public Scanner sc;
	
	public void input() {
		sc = new Scanner(System.in);
		while(true) {
			action = sc.nextLine();
			if(action.equals("pop")) {
				break;
			}
			else if(action.equals("push")) {
				num = Integer.parseInt(sc.nextLine());
				break;
			}
			else if(action.equals("clear")) {
				break;
			}	
		}
		
		this.actionCommande();
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
