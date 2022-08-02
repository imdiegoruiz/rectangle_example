package rectangule.entity;

import java.util.HashMap;
import java.util.Map.Entry;

public class Rectangule {
	
	private Point bottomLeft;
	private Point topRight;

	public Rectangule(Point bottomLeft, Point topRight) {
		super();
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}

	public Point getBottomLeft() {
		return bottomLeft;
	}

	public void setBottomLeft(Point bottomLeft) {
		this.bottomLeft = bottomLeft;
	}

	public Point getTopRight() {
		return topRight;
	}

	public void setTopRight(Point topRight) {
		this.topRight = topRight;
	}

	public boolean intersection(Rectangule rectangule) {

		if (this.topRight.getY() < rectangule.bottomLeft.getY()
				|| this.bottomLeft.getY() > rectangule.topRight.getY()) {
			return false;
		}
		if (this.topRight.getX() < rectangule.bottomLeft.getX()
				|| this.bottomLeft.getX() > rectangule.topRight.getX()) {
			return false;
		}
		return true;
	}

	public boolean containment(Rectangule rectangule) {

		if (this.topRight.getY() >= rectangule.topRight.getY() && this.topRight.getX() >= rectangule.topRight.getX()
				&& this.bottomLeft.getY() <= rectangule.bottomLeft.getY()
				&& this.bottomLeft.getX() <= rectangule.bottomLeft.getX()) {
			return true;
		}

		return false;
	}

	public HashMap<String, Boolean> adjacency(Rectangule rectangule) {
		HashMap<String, Boolean> response = new HashMap<String, Boolean>();

		if (this.topRight.getX() == rectangule.bottomLeft.getX() && rectangule.bottomLeft.getY() < this.topRight.getY()
				&& rectangule.topRight.getY() < this.topRight.getY()) {
			response.put("Adjacent (Sub-line)", true);
		} else if (this.topRight.getX() == rectangule.bottomLeft.getX()
				&& this.topRight.getX() == rectangule.topRight.getY()) {
			response.put("Adjacent (Partial)", true);
		} else if (this.topRight.getX() == rectangule.bottomLeft.getX()
				&& (rectangule.bottomLeft.getY() <= this.topRight.getY()
						&& rectangule.bottomLeft.getY() >= this.bottomLeft.getY())) {
			response.put("Adjacent (Proper)", true);
		} else {
			response.put("Not Adjacent", true);
		}

		return response;
	}

	public String returnPoints(Rectangule rectangule) {
		return "with points: [" + rectangule.bottomLeft.getX() + "," + rectangule.bottomLeft.getY() + "],["
				+ rectangule.topRight.getX() + "," + rectangule.topRight.getY() + "]";

	}

	public void printAdjacency(HashMap<String, Boolean> response) {
		for (Entry<String, Boolean> entry : response.entrySet()) {
			String key = entry.getKey();
			Boolean val = entry.getValue();
			System.out.println("Rectangule " + key + " with rectangule? " + val);
		}
	}

}
