package com.polytechtours.di5.Pile.model;

import junit.framework.TestCase;

public class PileTest extends TestCase {
	
	Pile pile;

	protected void setUp() throws Exception {
		super.setUp();
		pile = new Pile();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		pile.elements.clear();
	}
	
	public void testPush() {
		for(int i=0; i<6; i++)
			pile.push(10);
		
		TestCase.assertEquals(6, pile.elements.size());
	}
	
	public void testGetSize() {
		for(int i=0; i<6; i++)
			pile.push(10);
		
		TestCase.assertEquals(6, pile.getSizeList());
	}
	
	public void testPop() {
		for(int i=0; i<6; i++)
			pile.push(10);
		
		TestCase.assertEquals(10, pile.pop());
		TestCase.assertEquals(5, pile.getSizeList());
	}
	
	public void testClear() {
		for(int i=0; i<6; i++)
			pile.push(10);
		
		pile.clear();
		
		TestCase.assertEquals(0, pile.getSizeList());
	}

}
