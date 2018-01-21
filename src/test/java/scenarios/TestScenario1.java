package scenarios;

import com.polytechtours.di5.Pile.input.StubKbdInputPile;
import com.polytechtours.di5.Pile.view.StubViewBottomPile;
import com.polytechtours.di5.Pile.view.StubViewTopPile;

import junit.framework.TestCase;

public class TestScenario1 extends TestCase {

	StubKbdInputPile kbdinput;
	StubViewTopPile viewtop;
	StubViewBottomPile viewBottom;
	
	protected void setUp() throws Exception {
		super.setUp();
		kbdinput = new StubKbdInputPile();
		kbdinput.action = "push";
		
		viewtop = new StubViewTopPile();
		viewBottom = new StubViewBottomPile();
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
			TestCase.assertEquals((i+1), viewBottom.countUpdate);
			TestCase.assertEquals((i+1), viewtop.countUpdate);
		}
		
		
		kbdinput.actionCommande();
		TestCase.assertEquals(6, kbdinput.pile.getSizeList());
		TestCase.assertEquals(5, viewBottom.countUpdate);
		TestCase.assertEquals(6, viewtop.countUpdate);
	}
}
