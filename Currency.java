package currency;

import java.util.HashMap;
import java.util.Map;

public class Currency {

	private Map<String, Double> ct;
	private double newCurrency;
	private String answer;
	private double amount;

	public Currency() {
		this.ct = new HashMap<String, Double>();
	}

	
	//Getters and Setters
	public void setAnswer (String answer) {
		this.answer = answer;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAmount (double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	// Current available currencies
	public void loadMap() {
		ct.put("Pound", 0.76);
		ct.put("Euro", 0.85);
		ct.put("Yen", 112.23);
		ct.put("Yuan", 6.61);

		System.out.println(ct.keySet());

	}

	// Multiples amount times currency
	public double multiplyCurrency(String answer, double amount) {

		newCurrency += ct.get(answer) * amount;

		return newCurrency;

	}
	
	public double getNewCurrency() {
		return this.newCurrency;
	}

	// Checks user if Map contains userinput.
	public boolean checkAnswer(String userCurrency) {
		if (!ct.containsKey(userCurrency)) {
			return false;
		} else {
			return true;
		}
	}

	//This needs to be fixed. <--------------------
	@Override
	public String toString() {
		return "You have converted $" + getAmount() + " into " + getNewCurrency() + " " + this.answer + "\n";
	}

}
