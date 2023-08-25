package br.com.henrique.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleMathTest {
   
	@Test
    void testSum() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao sum
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.sum(firstNumber, secondNumber);
        double expected = 8.2D;
        assertEquals(expected, actual, 
        		() -> firstNumber + " + " + secondNumber + " did not produce " + expected);
 	}
	
	@Test
    void testSubtraction() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao subtração
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;
        assertEquals(expected, actual, 
        		() -> firstNumber + " - " + secondNumber + " did not produce " + expected);
 	}

	@Test
    void testMultiplication() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao Multiplicacao
        double firstNumber = 6D;
		double secondNumber = 2D;
		Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12D;
        assertEquals(expected, actual, 
        		() -> firstNumber + " * " + secondNumber + " did not produce " + expected);
 	}

	@Test
    void testDivision() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao Divisão
        double firstNumber = 10D;
		double secondNumber = 2D;
		Double actual = math.division(firstNumber, secondNumber);
        double expected = 5D;
        assertEquals(expected, actual, 
        		() -> firstNumber + " / " + secondNumber + " did not produce " + expected);
 	}	

	@Test
    void testMean() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao meia
        double firstNumber = 10D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6D;
        assertEquals(expected, actual, 
        		() -> "Mean of " + firstNumber + " and " + secondNumber + " did not produce " + expected);
 	}	
	
	@Test
    void testSquareRoot() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao meia
        double firstNumber = 81;
		Double actual = math.squareRoot(firstNumber);
        double expected = 9D;
        assertEquals(expected, actual, 
        		() -> "Square Root of " + firstNumber + " did not produce " + expected);
 	}	
	
}
