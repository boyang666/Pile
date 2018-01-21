package scenarios;

import com.polytechtours.di5.Pile.input.ViewInputPile;
import com.polytechtours.di5.Pile.view.ViewBottomPile;
import com.polytechtours.di5.Pile.view.ViewTopPile;

import junit.framework.TestCase;

public class TestScenario2 extends TestCase {

	ViewInputPile viewInput;
	ViewBottomPile viewBottom;
	ViewTopPile viewTop;
	
	protected void setUp() throws Exception {
		super.setUp();
		viewInput = new ViewInputPile();
		viewInput.action = "push";
		viewInput.num = 10;
		viewBottom = new ViewBottomPile();
		viewTop = new ViewTopPile();
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
			TestCase.assertEquals((i+1), viewBottom.bottomElements.size());
			TestCase.assertEquals(10, viewTop.topElement);
		}
		
		
		viewInput.actionCommande();
		TestCase.assertEquals(6, viewInput.pile.getSizeList());
		TestCase.assertEquals(5, viewBottom.bottomElements.size());
		TestCase.assertEquals(10, viewTop.topElement);
	}

}
