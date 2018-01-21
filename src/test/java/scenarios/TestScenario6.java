package scenarios;

import com.polytechtours.di5.Pile.input.ViewInputPile;
import com.polytechtours.di5.Pile.view.ViewBottomPile;
import com.polytechtours.di5.Pile.view.ViewTopPile;

import junit.framework.TestCase;

public class TestScenario6 extends TestCase {

	ViewInputPile viewInput;
	ViewBottomPile viewBottom;
	ViewTopPile viewTop;
	
	protected void setUp() throws Exception {
		super.setUp();
		viewInput = new ViewInputPile();
		
		viewBottom = new ViewBottomPile();
		viewTop = new ViewTopPile();
		viewInput.pile.addObserver(viewBottom);
		viewInput.pile.addObserver(viewTop);
		
		viewInput.action = "push";
		viewInput.num = 10;
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
		TestCase.assertEquals(0, viewBottom.bottomElements.size());
		TestCase.assertEquals(-1, viewTop.topElement);
	}

}
