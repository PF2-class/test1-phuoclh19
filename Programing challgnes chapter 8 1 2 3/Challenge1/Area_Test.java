package Challenge1Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Challenge1.Area;

class Area_Test {

	@Test
	void test_CircleArea() {
		double circleArea  = Area.calculateCircleArea(20);
		assertEquals(1256.0,circleArea,0.5);
	}
	void test_RectangleArea() {
		double rectangleArea = Area.calculateRectangleArea(30, 4);
		assertEquals(120.0,rectangleArea,0.5);
	}
	public void test_CylinderArea() {
		double cylinderArea = Area.calculateCylinderArea(10, 35);	
		assertEquals(10990.0, cylinderArea,0.5);
	}

}
