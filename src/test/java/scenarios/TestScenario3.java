package scenarios;

import com.polytechtours.di5.Pile.input.StubKbdInputPile;
import com.polytechtours.di5.Pile.view.StubViewBottomPile;
import com.polytechtours.di5.Pile.view.StubViewTopPile;

import junit.framework.TestCase;

public class TestScenario3 extends TestCase {
	
	StubKbdInputPile kbdInput;
	StubViewBottomPile viewBottom;
	StubViewTopPile viewTop;

	protected void setUp() throws Exception {
		super.setUp();
		kbdInput = new StubKbdInputPile();
		
		viewBottom = new StubViewBottomPile();
		viewTop = new StubViewTopPile();
		kbdInput.pile.addObserver(viewBottom);
		kbdInput.pile.addObserver(viewTop);
		
		kbdInput.action = "push";
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
		TestCase.assertEquals(6, kbdInput.pile.size);
		TestCase.assertEquals(5, viewBottom.countUpdate);
		TestCase.assertEquals(8, viewTop.countUpdate);
		
		for(int i=0; i<6; i++) {
			kbdInput.actionCommande();
			TestCase.assertEquals(6-(i+1), kbdInput.pile.size);
			TestCase.assertEquals(5+(i+1), viewBottom.countUpdate);
			TestCase.assertEquals(8+(i+1), viewTop.countUpdate);
		}
	}

}
