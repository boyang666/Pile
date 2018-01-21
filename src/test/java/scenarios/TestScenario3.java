package scenarios;

import com.polytechtours.di5.Pile.input.KbdInputPile;
import com.polytechtours.di5.Pile.view.ViewBottomPile;
import com.polytechtours.di5.Pile.view.ViewTopPile;

import junit.framework.TestCase;

public class TestScenario3 extends TestCase {
	
	KbdInputPile kbdInput;
	ViewBottomPile viewBottom;
	ViewTopPile viewTop;

	protected void setUp() throws Exception {
		super.setUp();
		kbdInput = new KbdInputPile();
		
		
		viewBottom = new ViewBottomPile();
		viewTop = new ViewTopPile();
		kbdInput.pile.addObserver(viewBottom);
		kbdInput.pile.addObserver(viewTop);
		
		kbdInput.action = "push";
		kbdInput.num = 10;
		for(int i=0; i<7; i++) {
			kbdInput.actionCommande();
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		kbdInput.action = "pop";
		kbdInput.actionCommande();
		TestCase.assertEquals(6, kbdInput.pile.getSizeList());
		TestCase.assertEquals(5, viewBottom.bottomElements.size());
		TestCase.assertEquals(10, viewTop.topElement);
		
		for(int i=0; i<5; i++) {
			kbdInput.actionCommande();
			TestCase.assertEquals(6-(i+1), kbdInput.pile.getSizeList());
			TestCase.assertEquals(5-i, viewBottom.bottomElements.size());
			TestCase.assertEquals(10, viewTop.topElement);
		}
	}

}
