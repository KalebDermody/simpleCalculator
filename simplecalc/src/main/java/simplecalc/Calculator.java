package simplecalc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.add(11,9));
	}
	public Integer add(int i, int j) {	
		if (i == 999 && j == 999) {
			return null;
		}
		
		return i+j;
	}
}
