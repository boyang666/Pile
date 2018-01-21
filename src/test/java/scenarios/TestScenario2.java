package scenarios;

import com.polytechtours.di5.Pile.input.StubViewInputPile;
import com.polytechtours.di5.Pile.view.StubViewBottomPile;
import com.polytechtours.di5.Pile.view.StubViewTopPile;

import junit.framework.TestCase;

public class TestScenario2 extends TestCase {

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
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		for(int i=0; i<5; i++) {
			viewInput.actionCommande();
			TestCase.assertEquals(i+1, viewInput.pile.getSizeList());
			TestCase.assertEquals((i+1), viewBottom.countUpdate);
			TestCase.assertEquals((i+1), viewTop.countUpdate);
		}
		
		
		viewInput.actionCommande();
		TestCase.assertEquals(6, viewInput.pile.getSizeList());
		TestCase.assertEquals(5, viewBottom.countUpdate);
		TestCase.assertEquals(6, viewTop.countUpdate);
	}

}
