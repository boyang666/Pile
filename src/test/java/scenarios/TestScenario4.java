package scenarios;

import com.polytechtours.di5.Pile.input.StubViewInputPile;
import com.polytechtours.di5.Pile.view.StubViewBottomPile;
import com.polytechtours.di5.Pile.view.StubViewTopPile;

import junit.framework.TestCase;

public class TestScenario4 extends TestCase {

	StubViewInputPile viewInput;
	StubViewBottomPile viewBottom;
	StubViewTopPile viewTop;
	
	protected void setUp() throws Exception {
		super.setUp();
		viewInput = new StubViewInputPile();
		viewInput.action = "push";
		
		viewBottom = new StubViewBottomPile();
		viewTop = new StubViewTopPile();
		viewInput.pile.addObserver(viewBottom);
		viewInput.pile.addObserver(viewTop);
		
		for(int i=0; i<7; i++) {
			viewInput.actionCommande();
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMethod() {
		viewInput.action = "pop";
		viewInput.actionCommande();
		TestCase.assertEquals(6, viewInput.pile.size);
		TestCase.assertEquals(5, viewBottom.countUpdate);
		TestCase.assertEquals(8, viewTop.countUpdate);
		
		for(int i=0; i<5; i++) {
			viewInput.actionCommande();
			TestCase.assertEquals(6-(i+1), viewInput.pile.size);
			TestCase.assertEquals(5+(i+1), viewBottom.countUpdate);
			TestCase.assertEquals(8+(i+1), viewTop.countUpdate);
		}
	}
}
