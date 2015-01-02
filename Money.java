
abstract class Money {

	protected int amount;
	
	public static Money dollar(int amount){
		return new Dollar(amount);
	}
	
	public static Franc franc(int amount){
		return new Franc(amount);
	}
	
	public boolean equals(Object object){
		Money money = (Money)object;
		return (this.amount == money.amount) && this.getClass().equals(money.getClass());
	}
	
	abstract Money times(int multiplier);
}
