/**
 * 
 */
package rectangule;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import rectangule.entity.Point;
import rectangule.entity.Rectangule;

/**
 * @author DIEGO
 *
 */
public class RectanguleTest {
	static Rectangule rectanguleA;

	@Before
	public void prepareScenarios() {
		// Rectangle A with its points
		Point buttonLeftA = new Point(1, 1);
		Point topRightA = new Point(5, 4);
		rectanguleA = new Rectangule(buttonLeftA, topRightA);

	}

	@Test
	public void intersectionTest() {
		// Defining the scenario
		// Rectangle B
		Point buttonLeftB = new Point(2, 2);
		Point topRightB = new Point(5, 5);
		Rectangule rectanguleB = new Rectangule(buttonLeftB, topRightB);

		boolean expectedValue = true;

		// Execute the code
		boolean result = rectanguleA.intersection(rectanguleB);

		// Validate the results

		assertEquals(expectedValue, result);
	}

	@Test
	public void containmentTest() {
		// Defining the scenario
		// Rectangle C
		Point buttonLeftC = new Point(2, 2);
		Point topRightC = new Point(5, 3);
		Rectangule rectanguleC = new Rectangule(buttonLeftC, topRightC);

		boolean expectedValue = true;

		// Execute the code
		boolean result = rectanguleA.containment(rectanguleC);

		// Validate the results

		assertEquals(expectedValue, result);
	}

	@Test
	public void adjacentSubLineTest() {
		// Defining the scenario
		// Rectangle D
		Point buttonLeftD = new Point(5, 2);
		Point topRightD = new Point(6, 3);
		Rectangule rectanguleD = new Rectangule(buttonLeftD, topRightD);

		boolean expectedValue = true;

		// Execute the code
		HashMap<String, Boolean> result = rectanguleA.adjacency(rectanguleD);

		// Validate the results
		boolean resultValue = result.get("Adjacent (Sub-line)");
		assertEquals(expectedValue, resultValue);
	}

	@Test
	public void adjacentProperTest() {
		// Defining the scenario
		// Rectangle E
		Point buttonLeftE = new Point(5, 1);
		Point topRightE = new Point(6, 4);
		Rectangule rectanguleE = new Rectangule(buttonLeftE, topRightE);

		boolean expectedValue = true;

		// Execute the code
		HashMap<String, Boolean> result = rectanguleA.adjacency(rectanguleE);

		// Validate the results
		
		boolean resultValue = result.get("Adjacent (Proper)");
		assertEquals(expectedValue, resultValue);
	}

	@Test
	public void adjacentPartialTest() {
		// Defining the scenario
		// Rectangle F
		Point buttonLeftF = new Point(5, 2);
		Point topRightF = new Point(6, 5);
		Rectangule rectanguleF = new Rectangule(buttonLeftF, topRightF);

		boolean expectedValue = true;

		// Execute the code
		HashMap<String, Boolean> result = rectanguleA.adjacency(rectanguleF);

		// Validate the results

		System.out.println(result);
		boolean resultValue = result.get("Adjacent (Partial)");
		assertEquals(expectedValue, resultValue);
	}

	@Test
	public void adjacentNotAdjacentTest() {
		// Defining the scenario
		// Rectangle G
		Point buttonLeftG = new Point(6, 2);
		Point topRightG = new Point(6, 5);
		Rectangule rectanguleG = new Rectangule(buttonLeftG, topRightG);

		boolean expectedValue = true;

		// Execute the code
		HashMap<String, Boolean> result = rectanguleA.adjacency(rectanguleG);

		// Validate the results

		boolean resultValue = result.get("Not Adjacent");
		assertEquals(expectedValue, resultValue);
	}

}
