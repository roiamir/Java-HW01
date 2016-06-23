package HW01;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlowerBedTest {
	FlowerBed flowerBed = new FlowerBed();
	@Test
	public final void testCirc0() {
		assertEquals(0, flowerBed.calcCirc(0), 0);
	}
	
	@Test
	public final void testCirc1() {
		assertEquals(2*Math.PI, flowerBed.calcCirc(1), 0.00001);
	}

	@Test
	public final void testCirc100() {
		assertEquals(200*Math.PI, flowerBed.calcCirc(100), 0.00001);
	}

	@Test
	public final void testCircHalf() {
		assertEquals(Math.PI, flowerBed.calcCirc(0.5), 0.00001);
	}

	@Test
	public final void testArea1() {
		assertEquals(Math.PI, flowerBed.calcArea(1), 0.00001);
	}

	@Test
	public final void testArea0() {
		assertEquals(0, flowerBed.calcArea(0), 0.00001);
	}

	@Test
	public final void testArea5() {
		assertEquals(25*Math.PI, flowerBed.calcArea(5), 0.00001);
	}

		
	
}
