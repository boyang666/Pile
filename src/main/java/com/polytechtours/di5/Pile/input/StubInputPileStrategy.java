package com.polytechtours.di5.Pile.input;

import com.polytechtours.di5.Pile.model.Pile;

public abstract class StubInputPileStrategy {
	
	public Pile pile;
	
	public String action;
	
	public StubInputPileStrategy() {
		pile = new Pile();
	}
	
	public abstract void actionCommande();
	
	public int pop() {
		return pile.pop();
	}
	
	public void push(int num) {
		pile.push(num);
	}
	
	public void clear() {
		pile.clear();
	}
}
