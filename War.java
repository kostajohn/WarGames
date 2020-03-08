package game;

public class War {

	public static void main (String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		
		Player o1 = new Player("John");
		Player o2 = new Player("Michelle");
		
		for (int i = 0; i < 26; i++) {
			o1.draw(deck);
			o2.draw(deck);
		}
			
		
		for (int c = 0; c < 26; c++) {
			card o1card = o1.flip();
			card o2card = o2.flip();
			System.out.println(o1card.getName() + " " + "vs" + " " + o2card.getName());
			if (o1card.getValue() > o2card.getValue()) {
				o1.incrementScore();
				System.out.println(o1.getName() + "! " + "current score is: " + o1.getName() +  ":" + o1.getScore() + " to " + o2.getName() + ":" + o2.getScore());
			} else if (o2card.getValue() > o1card.getValue()) {
				o2.incrementScore();
				System.out.println(o2.getName() + "! " + "current score is: " + o1.getName() + ":" + o1.getScore() + " to " + o2.getName() + ":" + o2.getScore());
			} else {
				System.out.println("draw!");
			}
		}
		
		System.out.println(o1.getName() + ": " + o1.getScore() + "-------------" + o2.getName() + ": " + o2.getScore());
		if (o1.getScore() > o2.getScore()) {
			System.out.println(o1.getName() + ": " +  "YOU WIN!!" + "   " + o2.getName() + ": " + "YOU LOSE!!");
			} else if (o2.getScore() > o1.getScore()) {
				System.out.println(o2.getName() + ": " + "YOU WIN!!" + "    " + o1.getName() + ": " + "YOU LOSE!!");
			} else {
				System.out.println("TIE");
		}
	}
}
