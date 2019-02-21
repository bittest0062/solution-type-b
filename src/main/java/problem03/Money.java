package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	private int amount;
	

	public Money(int amount) {
		this.amount = amount;
	}

	public Money add(Money money) {
		Money m = new Money(this.amount + money.amount);
		return m;
	}

	public Money minus(Money money) {
		Money m = new Money(this.amount - money.amount);
		return m;
	}

	public Money multiply(Money money) {
		Money m = new Money(this.amount * money.amount);
		return m;
	}

	public Money devide(Money money) {
		Money m = new Money(this.amount / money.amount);
		return m;
	}
}