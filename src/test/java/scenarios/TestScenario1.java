package scenarios;

import java.util.Scanner;

import com.polytechtours.di5.Pile.input.KbdInputPile;
import com.polytechtours.di5.Pile.view.ViewBottomPile;
import com.polytechtours.di5.Pile.view.ViewTopPile;

import junit.framework.TestCase;

public class TestScenario1 extends TestCase {

	KbdInputPile kbdinput;
	ViewTopPile viewtop;
	ViewBottomPile viewBottom;
	
	protected void setUp() throws Exception {
		super.setUp();
		kbdinput = new KbdInputPile();
		kbdinput.action = "push";
		kbdinput.num = 10;
		
		viewtop = new ViewTopPile();
		viewBottom = new ViewBottomPile();
		kbdinput.pile.addObserver(viewtop);
		kbdinput.pile.addObserver(viewBottom);
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		for(int i=0; i<5; i++) {
			kbdinput.actionCommande();
			TestCase.assertEquals(i+1, kbdinput.pile.getSizeList());
			TestCase.assertEquals(10, viewtop.topElement);
			TestCase.assertEquals(i+1, viewBottom.bottomElements.size());
		}
		
		
		kbdinput.actionCommande();
		TestCase.assertEquals(6, kbdinput.pile.getSizeList());
		TestCase.assertEquals(5, viewBottom.bottomElements.size());
		TestCase.assertEquals(10, viewtop.topElement);
	}
}
