package com.polytechtours.di5.Pile.input;

import com.polytechtours.di5.Pile.model.Pile;

/**
 * Strategy of input
 * 
 * @author boyang
 *
 */
public abstract class InputPileStrategy {
	
	/** stack to use */
	public Pile pile;
	
	/** action of user */
	public String action;
	
	/**
	 * constructor
	 */
	public InputPileStrategy() {
		pile = new Pile();
	}
	
	/**
	 * get the user's command
	 */
	public abstract void actionCommande();
	
	/**
	 * apply for the pop
	 * @return top element
	 */
	public int pop() {
		return pile.pop();
	}
	
	/**
	 * apply for the push
	 * @param num
	 */
	public void push(int num) {
		pile.push(num);
	}
	
	/**
	 * apply for the clear
	 */
	public void clear() {
		pile.clear();
	}
}
