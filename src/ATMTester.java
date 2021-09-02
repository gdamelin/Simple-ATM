
public class ATMTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleATM atm = new SimpleATM();
		atm.deposit("Winfrey", 25159684372.43);
		atm.deposit("Bezos", 193495330293.43);
		atm.deposit("Bezos", 20394353.35);
		atm.withdraw("Bezos", 3593293.66);
		atm.deposit("MrTheiss",64033.55);
		atm.withdraw("MrTheiss", 443964.46);
		atm.checkBalance("Bezos");
		atm.checkBalance("Winfrey");
		atm.checkBalance("YoMama");
		atm.checkBalance("MrTheiss");
	}

}
