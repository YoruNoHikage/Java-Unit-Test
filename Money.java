
public class Money {
	
	private float _amount;
	private String _currency;
	
	public Money() {
		this._amount = 0;
		this._currency = "EUR";
	}
	
	public Money(float amount, String currency) {
		this._amount = amount;
		this._currency = currency;
	}
	
	public float getAmount() {
		return this._amount;
	}
	
	public String getCurrency() {
		return this._currency;
	}
	
	public boolean checkCurrency(Money m) {
		return this._currency.equals(m._currency);
	}
	
	public void changeCurrency(String s, float rate) {
		this._currency = s;
		this._amount *= rate;
	}
	
	public boolean checkCurrency(String s) {
		if(s == this._currency)
			return true;
		else
			return false;
	}
	
	public void add(float amount) {
		this._amount += amount;
	}
	
	public void sub(float amount) {
		this._amount -= amount;
	}
	
	public void add(Money m) {
		if(this.checkCurrency(m))
			this.add(m._amount);
	}
	
	public void sub(Money m) {
		if(this.checkCurrency(m))
			this.sub(m._amount);
	}
	
	public String toString() {
		return this._amount + " " + this._currency;
	}
}
