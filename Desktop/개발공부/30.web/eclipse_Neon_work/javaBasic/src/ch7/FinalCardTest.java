package ch7;

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 100;
	
	
	Card(int number, String kind){
		NUMBER = number;
		KIND = kind;
	}
	
	Card(){
		this(1, "HEART");
	}

	@Override
	public String toString() {
		return "Card [NUMBER=" + NUMBER + ", KIND=" + KIND + "]";
	}
	
	
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card card = new Card();
		System.out.println("card >>> : " + card.toString());
	}
	
}
