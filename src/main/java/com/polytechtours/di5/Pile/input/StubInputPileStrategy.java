package com.polytechtours.di5.Pile.input;

import com.polytechtours.di5.Pile.model.StubPile;

public abstract class StubInputPileStrategy {
	
	public StubPile pile;
	
	public String action;
	
	public StubInputPileStrategy() {
		pile = new StubPile();
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
