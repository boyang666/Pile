package com.polytechtours.di5.Pile.view;

import java.util.Observable;
import java.util.Observer;

import com.polytechtours.di5.Pile.model.Pile;

/**
 * To show the top of the stack
 * 
 * @author boyang
 *
 */
public class ViewTopPile implements Observer{
	
	/** top element of the stack */ 
	public int topElement;

	/**
	 * to update the view
	 */
	public void update(Observable o, Object arg) {
		Pile pile = (Pile)o;
		if(pile.getSizeList() == 0) {
			this.topElement = -1;
			System.out.println("Pile vide");
		}
		else {
			topElement = pile.getEntier(pile.getSizeList() - 1);
			System.out.println(topElement);
		}
		
	}

}
