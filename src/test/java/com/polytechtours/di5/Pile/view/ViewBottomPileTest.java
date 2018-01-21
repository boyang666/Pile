package com.polytechtours.di5.Pile.view;

import com.polytechtours.di5.Pile.model.Pile;

import junit.framework.TestCase;

public class ViewBottomPileTest extends TestCase {

	ViewBottomPile bottomPile = new ViewBottomPile();
	Pile pile = new Pile();
	
	protected void setUp() throws Exception {
		super.setUp();
		pile.addObserver(bottomPile);;
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		pile.push(10);
		TestCase.assertEquals(10, bottomPile.bottomElements.get(0).intValue());
		
		pile.push(15);
		TestCase.assertEquals(10, bottomPile.bottomElements.get(0).intValue());
		TestCase.assertEquals(15, bottomPile.bottomElements.get(1).intValue());
		
		pile.pop();
		TestCase.assertEquals(10, bottomPile.bottomElements.get(0).intValue());
		TestCase.assertEquals(1, bottomPile.bottomElements.size());
	}

}
