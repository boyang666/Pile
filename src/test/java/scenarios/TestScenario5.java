package scenarios;

import com.polytechtours.di5.Pile.input.KbdInputPile;
import com.polytechtours.di5.Pile.view.ViewBottomPile;
import com.polytechtours.di5.Pile.view.ViewTopPile;

import junit.framework.TestCase;

public class TestScenario5 extends TestCase {

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
		for(int i=0; i<6; i++) {
			kbdInput.actionCommande();
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		kbdInput.action = "clear";
		kbdInput.actionCommande();
		TestCase.assertEquals(0, kbdInput.pile.getSizeList());
		TestCase.assertEquals(0, viewBottom.bottomElements.size());
		TestCase.assertEquals(-1, viewTop.topElement);
	}

}
