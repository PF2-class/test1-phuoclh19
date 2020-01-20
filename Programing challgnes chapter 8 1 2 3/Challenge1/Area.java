package Challenge1;

public class Area {
	public static double calculateCircleArea(double r) {
		return Math.PI*r*r;
	}
	public static double calculateRectangleArea(double length, double width) {
		return length*width;
	}
	public static double calculateCylinderArea(double r, double h) {
		return r*r*Math.PI*h;
	}
}
