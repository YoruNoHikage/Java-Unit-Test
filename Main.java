
public class Main {

	private static Money money1, money2;
	
	public static void main(String[] args) {
		
		money1 = new Money();
		money2 = new Money(2, "KIL");
		
		System.out.println(money1);
		System.out.println(money2);
		money1.add(money1);
		System.out.println(money1);
		money1.add(new Money(3, "EUR"));
		System.out.println(money1);
		money1.sub(new Money(1, "EUR"));
		System.out.println(money1);
	}

}
