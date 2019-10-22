package tic;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	void test() {
		
		
		Game obj = new Game("X","O",true);
		Intelegence i = new Intelegence(obj);
		String[][] testBoard = {
				{"O","X","X"},
				{"X","-","X"},
				{"O","X","O"}};
		
		int output = i.winloss(testBoard);
		assertEquals(0,output);
	}

}
