import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MoneyTest {
	
	protected Money money1, money2;
	
	@Before
	public void setUp() throws Exception {
		money1 = new Money();
		money2 = new Money(2, "KIL");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {		
		assertEquals("0.0 EUR", money1.toString());
	}
	
	@Test
	public void test2() {		
		assertEquals("2.0 KIL", money2.toString());
	}
	
	@Test
	public void test3() {		
		money1.add(money1);
		assertEquals("0.0 EUR", money1.toString());
		assertEquals("2.0 EUR", money1.toString());
	}
	
	@Test
	public void test4() {		
		money1.add(money1);
		money1.add(new Money(3, "EUR"));
		assertEquals("3.0 EUR", money1.toString());
	}
	
	@Test
	public void test5() {		
		money1.add(money1);
		money1.add(new Money(3, "EUR"));
		money1.sub(new Money(1, "EUR"));
		assertEquals("2.0 EUR", money1.toString());
	}	

}
