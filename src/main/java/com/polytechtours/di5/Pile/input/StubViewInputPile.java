package com.polytechtours.di5.Pile.input;

public class StubViewInputPile extends StubInputPileStrategy{
	
	public StubViewInputPile() {
		super();
	}

	@Override
	public void actionCommande() {
		if(action.equals("pop"))
			this.pop();
		else if(action.equals("push"))
			this.push(10);
		else if(action.equals("clear"))
			this.clear();
		
	}


}
