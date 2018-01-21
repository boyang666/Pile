package com.polytechtours.di5.Pile.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Class Pile for manage the stack
 * 
 * @author boyang
 *
 */
public class Pile extends Observable{

	/** for store the elements of stack */ 
	List<Integer> elements;
	
	public Pile() {
		elements = new ArrayList<Integer>();
	}
	
	/**
	 * return the size of stack
	 * @return size of stack
	 */
	public int getSizeList() {
		return elements.size();
	}
	
	/**
	 * return the element according to the index
	 * @param index
	 * @return
	 */
	public int getEntier(int index) {
		return elements.get(index);
	}
	
	/**
	 * push a number into the stack
	 * @param element
	 */
	public void push(int element) {
		elements.add(element);
	}
	
	/**
	 * return the top of stack
	 * @return the top of stack
	 */
	public int pop() {
		return elements.get(elements.size()-1);
	}
	
	/**
	 * clear the stack
	 */
	public void clear() {
		elements.clear();
	}
}
