package logic;

import java.util.Scanner;

import currency.Currency;

public class Logic {

	private Currency currency;
	private Scanner reader;
	private boolean running;
	private boolean check;

	public Logic() {
		this.currency = new Currency();
		this.reader = new Scanner(System.in);
		this.running = true;
		this.check = true;
	}

	public void start() {
		
		//Runs until quit
		while (running) {
			System.out.println("Convert US dollar into which currency?");
			currency.loadMap();
			String answer = reader.nextLine();
			currency.setAnswer(answer);

			// checks to make sure the value is in the map
			if (currency.checkAnswer(currency.getAnswer()) == true) {
				System.out.println("\n" + "How many dollars would you like converted?");
				double amount = reader.nextDouble();
				currency.setAmount(amount);
				currency.multiplyCurrency(currency.getAnswer(), currency.getAmount());
				System.out.println("");
				System.out.println(currency);
				

			} else {
				System.out.println("Please select a currency from the list.");
			}

		}
	}
}
