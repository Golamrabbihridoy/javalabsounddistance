package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Soundjuinttest {
	private final double time=7.2;
	private final double speed=1100;
	Sound s=new Sound();
	@Test
	void test() {
	
		assertEquals(7920.0,s.calculation(time,speed),"");
	}

}
