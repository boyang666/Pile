package com.polytechtours.di5.Pile.view;

import java.util.Observable;
import java.util.Observer;

public class StubViewTopPile implements Observer{

	public int countUpdate = 0; 
	
	public void update(Observable o, Object arg) {
		countUpdate++;
	}

}
