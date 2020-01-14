package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pc1.Area;

class Test_Area {

	@Test
	void test_circleArea() {
		double a = Area.areaCalculate(15);
		
		assertEquals(706.5,a,.5);
	}
	@Test
	void test_rectangleArea() {
		double a = Area.areaCalculate(15,15);
		assertEquals(225,a);
	}
	
}
