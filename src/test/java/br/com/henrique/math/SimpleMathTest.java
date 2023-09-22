package br.com.henrique.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math operations in SimpliMathTest")
public class SimpleMathTest {
	
	SimpleMath math;
   
	@BeforeAll
	static void setup() {
		System.out.println("BeforAll method");
	}
	
	@AfterAll
	static void cleanup() {
		System.out.println("AfterAll method");
	}
	
	@BeforeEach
	void beforeEachMethod() {
		math = new SimpleMath();
		System.out.println("BeforeEach method");
	}
	
	@AfterEach
	void afterEachMethod() {
		math = new SimpleMath();
		System.out.println("AfterEach method");
	}
	
	@Test
	@DisplayName("Test 6.2 + 2 = 8.2")
    void testSum() {

		System.out.println("Test Sum");
		
		//AAA Arrange, Act, Assert
		
		//Given / Arrange 
		
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

		System.out.println("Test subtraction method");
		//
        
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

		System.out.println("Test multiplication method");
		
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
		

		System.out.println("Test Division method");
		
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

		System.out.println("Test Mean method");
		
        //teste da funcao meia
        double firstNumber = 10D;
		double secondNumber = 2D;
		Double actual = math.mean(firstNumber, secondNumber);
        double expected = 6D;
        
        assertEquals(expected, actual, 
        		() -> "Mean of " + firstNumber + " and " + secondNumber + " did not produce " + expected);
 	}	
	
	//@Disabled("Precisamos melhorar este teste")//Anotation para desabilitar um teste.
	@Test
	@DisplayName("Test square with 81 = 9")
    void testSquareRoot() {

		System.out.println("Test square method");
		
        //teste da funcao square
        double firstNumber = 81;
		Double actual = math.squareRoot(firstNumber);
        double expected = 9D;
        
        assertEquals(expected, actual, 
        		() -> "Square Root of " + firstNumber + " did not produce " + expected);
 	}	
	
}
