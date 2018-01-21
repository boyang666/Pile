package com.polytechtours.di5.Pile.model;

import java.util.Observable;

public class StubPile extends Observable{
	
	public int size = 0;
	
	public int pop() {
		size--;
		this.setChanged();
		this.notifyObservers();
		return 10;
	}
	
	public void push(int num) {
		size++;
		this.setChanged();
		this.notifyObservers();
	}
	
	public void clear() {
		size = 0;
		this.setChanged();
		this.notifyObservers();
	}
	
	public int getSizeList() {
		return size;
	}
	
	public int getEntier(int index) {
		return 10;
	}
	
}
