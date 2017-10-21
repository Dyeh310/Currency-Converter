package logic;

import java.util.Scanner;

import currency.Currency;

public class Logic {

	private Currency currency;
	private Scanner reader;
	private boolean running;
	private String answer;

	public Logic() {
		this.currency = new Currency();
		this.reader = new Scanner(System.in);
		this.running = true;
		this.answer = null;
	}

	public void start() {
		
		//Runs until quit
		while (running) {
			System.out.println("Convert US dollar into which currency? \n");
			
			currency.loadMap();
			answer = reader.nextLine();
			currency.setAnswer(answer);

			// checks to make sure the value is in the map
			if (currency.checkAnswer(currency.getAnswer()) == true) {
				System.out.println("\n" + "How many dollars would you like converted?");
				double amount = Double.parseDouble(reader.nextLine());
				currency.setAmount(amount);
				currency.multiplyCurrency(currency.getAnswer(), currency.getAmount());
				System.out.println("");
				System.out.println(currency);
				
			} else {
				System.out.println("Please select a currency");
			}

		}
	}
}
