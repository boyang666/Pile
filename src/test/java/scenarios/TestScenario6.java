package scenarios;

import com.polytechtours.di5.Pile.input.StubViewInputPile;
import com.polytechtours.di5.Pile.view.StubViewBottomPile;
import com.polytechtours.di5.Pile.view.StubViewTopPile;

import junit.framework.TestCase;

public class TestScenario6 extends TestCase {

	StubViewInputPile viewInput;
	StubViewBottomPile viewBottom;
	StubViewTopPile viewTop;
	
	protected void setUp() throws Exception {
		super.setUp();
		viewInput = new StubViewInputPile();
		
		viewBottom = new StubViewBottomPile();
		viewTop = new StubViewTopPile();
		viewInput.pile.addObserver(viewBottom);
		viewInput.pile.addObserver(viewTop);
		
		viewInput.action = "push";
		for(int i=0; i<6; i++) {
			viewInput.actionCommande();
		}
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testMethod() {
		viewInput.action = "clear";
		viewInput.actionCommande();
		TestCase.assertEquals(0, viewInput.pile.getSizeList());
		TestCase.assertEquals(6, viewBottom.countUpdate);
		TestCase.assertEquals(7, viewTop.countUpdate);
	}

}
