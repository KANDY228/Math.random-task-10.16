public class Main {

	public static void main(String[] args) { 
		int n1 = getFirstPlayer(1,17,94);
		int n2 = getSecondPlayer(1,17,94);
		if(n1>n2) {
			System.out.println("Число= "+n1+" больше числа= "+n2);
		}
		if(n1<n2) {
			System.out.println("Число= "+n1+" меньше числа= "+n2);
		}
	}
	public static int getFirstPlayer(int sizeOfAray, int n1, int n2) {
		int FirstPlayer=0;
		sizeOfAray = 1;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)(n1+(n2-n1)*Math.random());
			FirstPlayer = 0+numbersAray[i];
		}
		return FirstPlayer;
	}
	public static int getSecondPlayer(int sizeOfAray, int n1, int n2) {
		int SecondPlayer=0;
		sizeOfAray = 1;
		int[] numbersAray;
		numbersAray = new int[sizeOfAray];
		for (int i = 0; i < numbersAray.length; i++) {
			numbersAray[i] = (int)(n1+(n2-n1)*Math.random());
			SecondPlayer = 0+numbersAray[i];
		}
		return SecondPlayer;
	}
}