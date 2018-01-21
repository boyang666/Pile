package com.polytechtours.di5.Pile.view;

import com.polytechtours.di5.Pile.model.Pile;

import junit.framework.TestCase;

public class ViewTopPileTest extends TestCase {
	
	ViewTopPile topPile = new ViewTopPile();
	Pile pile = new Pile();

	protected void setUp() throws Exception {
		super.setUp();
		pile.addObserver(topPile);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		pile.push(10);
		TestCase.assertEquals(10, topPile.topElement);
		
		pile.push(15);
		TestCase.assertEquals(15, topPile.topElement);
		
		pile.pop();
		TestCase.assertEquals(10, topPile.topElement);
	}

}
