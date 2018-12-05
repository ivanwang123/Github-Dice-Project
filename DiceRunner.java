public class DiceRunner {
	public static void main(String[] args) {
		//Test 1
		DiceHolder diceHolder = new DiceHolder();
		Die die1 = new Die();
		Die die2 = new Die();
		diceHolder.addDie(die1);
		diceHolder.addDie(die2);

		boolean rolling = true;
		int rolls = 0;

		while(rolling) {
			rolls++;
			diceHolder.shake();
			System.out.println(diceHolder.toString());

			if (die1.getValue() == die2.getValue() == 1) {
				rolling = false;
			}
		}
		System.out.println("It took " + rolls + " rolls to get a snake eye");

		//Test 2
		DiceHolder diceHolder2 = new DiceHolder();

		int full = 1;
		while(full != -1) {
			int sides = (int)(Math.random() * 10) + 2
			Die die = new Die(sides);
			full = diceHolder2.addDie(die);
		}
		diceHolder2.shake();
		System.out.println(diceHolder2.toString());
	}
}