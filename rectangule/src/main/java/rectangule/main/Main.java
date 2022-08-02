package rectangule.main;

import java.util.HashMap;

import rectangule.entity.Point;
import rectangule.entity.Rectangule;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Rectangules Problem");
		// case for intersection
		Point buttonLeftA = new Point(1, 1);
		Point topRightA = new Point(5, 4);

		Point buttonLeftB = new Point(2, 2);
		Point topRightB = new Point(5, 5);
		
		// case for containment
		Point buttonLeftC = new Point(2, 2);
		Point topRightC = new Point(5, 3);

		// Adjacent subline
		Point buttonLeftD = new Point(5, 2);
		Point topRightD = new Point(6, 3);

		// Adjacent proper
		Point buttonLeftE = new Point(5, 1);
		Point topRightE = new Point(6, 4);

		//Adjacent partial
		Point buttonLeftF = new Point(5, 2);
		Point topRightF = new Point(6, 5);
		
		//Not Adjacent 
		Point buttonLeftG = new Point(6, 2);
		Point topRightG = new Point(6, 5);
		
		System.out.println("=========INTERSECTION=================");
		Rectangule rectanguleA = new Rectangule(buttonLeftA, topRightA);
		Rectangule rectanguleB = new Rectangule(buttonLeftB, topRightB);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule B " + rectanguleA.returnPoints(rectanguleB));
		System.out.println("Rectangules with intersection? " + rectanguleA.intersection(rectanguleB));

		System.out.println("=========CONTAINMENT=================");
		Rectangule rectanguleC = new Rectangule(buttonLeftC, topRightC);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule C " + rectanguleA.returnPoints(rectanguleC));
		System.out.println("Rectangule A containment rectangule C? " + rectanguleA.containment(rectanguleC));

		System.out.println("=========ADJACENT SUB-LINE=================");
		Rectangule rectanguleD = new Rectangule(buttonLeftD, topRightD);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule D " + rectanguleD.returnPoints(rectanguleD));
		HashMap<String, Boolean> responseRectangleD = rectanguleA.adjacency(rectanguleD);
		rectanguleA.printAdjacency(responseRectangleD);

		System.out.println("=========ADJACENT PROPER=================");
		Rectangule rectanguleE = new Rectangule(buttonLeftE, topRightE);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule E " + rectanguleE.returnPoints(rectanguleE));
		HashMap<String, Boolean> responseRectangleE = rectanguleA.adjacency(rectanguleE);
		rectanguleA.printAdjacency(responseRectangleE);
		
		System.out.println("=========ADJACENT PARTIAL=================");
		Rectangule rectanguleF = new Rectangule(buttonLeftF, topRightF);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule F " + rectanguleF.returnPoints(rectanguleF));
		HashMap<String, Boolean> responseRectangleF = rectanguleA.adjacency(rectanguleF);
		rectanguleA.printAdjacency(responseRectangleF);
		
		System.out.println("=========NOT ADJACENT=================");
		Rectangule rectanguleG = new Rectangule(buttonLeftG, topRightG);
		System.out.println("Rectangule A " + rectanguleA.returnPoints(rectanguleA));
		System.out.println("Rectangule G " + rectanguleG.returnPoints(rectanguleG));
		HashMap<String, Boolean> responseRectangleG = rectanguleA.adjacency(rectanguleG);
		rectanguleA.printAdjacency(responseRectangleG);

	}

}
