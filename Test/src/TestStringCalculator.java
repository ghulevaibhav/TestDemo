import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
  
@Test
public class TestStringCalculator {

	private Calculator calculator;
	
	@BeforeTest
	public void init() {
		calculator =new Calculator();
	}
	
	public void returnsZero() {
		assertEquals(calculator.calculator(""), 0);
	}
	
	public void returnsValue() {
		assertEquals(calculator.calculator("1"), 1);
	}
	public void sumOfNumbers() {
		assertEquals(calculator.calculator("1,2"), 3);
	}
}
