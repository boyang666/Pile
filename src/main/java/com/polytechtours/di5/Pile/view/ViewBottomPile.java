package com.polytechtours.di5.Pile.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.polytechtours.di5.Pile.model.Pile;

/**
 * For the view of the last 5 elements
 * 
 * @author boyang
 *
 */
public class ViewBottomPile implements Observer{
	
	/**
	 * for stocking the elements
	 */
	public List<Integer> bottomElements = new ArrayList<Integer>();

	/**
	 * update the view
	 */
	public void update(Observable o, Object arg) {
		Pile pile = (Pile)o;
		if(pile.getSizeList() >=0 && pile.getSizeList() <=5) {
			bottomElements.clear();
			for(int i=0; i<pile.getSizeList(); i++) {
				bottomElements.add(pile.getEntier(i));
			}
		}
		
		System.out.println(this.toString());
	}
	
	@Override
	public String toString() {
		if(bottomElements.size() == 0) {
			return "Pile vide";
		}
		else {
			StringBuilder result = new StringBuilder("");
			for(int i=0; i<bottomElements.size(); i++) {
				result.append(Integer.toString(bottomElements.get(i))).append(",");
			}
			result.deleteCharAt(result.length() - 1);
			return result.toString();
		}
		
	}

}
