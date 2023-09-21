package br.com.henrique.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operations in SimpliMathTest")
public class SimpleMathTest {
   
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {
		//AAA Arrange, Act, Assert
		
		//Given / Arrange 
		SimpleMath math = new SimpleMath();
        
        double firstNumber = 6.2D;
		double secondNumber = 2D;
		double expected = 8.2D;
        
		//When / Act
		Double actual = math.sum(firstNumber, secondNumber);
        
		//Then / Assert
		assertEquals(expected, actual, 
        		() -> firstNumber + " + " + secondNumber + " did not produce " + expected);
 	}
	
	@Test
	@DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {
		
		//
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
	@DisplayName("Test 6 * 2 = 12")
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
	@DisplayName("Test 10  /  2 = 5")
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
	@DisplayName("Test mean 10 and 2 = 6")
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
	@DisplayName("Test square with 81 = 9")
    void testSquareRoot() {
		
        SimpleMath math = new SimpleMath();
        
        //teste da funcao square
        double firstNumber = 81;
		Double actual = math.squareRoot(firstNumber);
        double expected = 9D;
        assertEquals(expected, actual, 
        		() -> "Square Root of " + firstNumber + " did not produce " + expected);
 	}	
	
}
