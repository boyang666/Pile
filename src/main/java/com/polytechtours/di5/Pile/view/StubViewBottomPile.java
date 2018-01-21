package com.polytechtours.di5.Pile.view;

import java.util.Observable;
import java.util.Observer;

import com.polytechtours.di5.Pile.model.Pile;

public class StubViewBottomPile implements Observer{
	
	public int countUpdate = 0;

	public void update(Observable o, Object arg) {
		Pile pile = (Pile)o;
		if(pile.getSizeList() >= 0 && pile.getSizeList() <= 5) {
			countUpdate ++;
		}
	}

}
