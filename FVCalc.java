// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		int rate = Integer.parseInt(args[1]);
		int number_of_years = Integer.parseInt(args[2]);
		double rate_in_percentage = (double)rate / 100;
		double future_value = currentValue * Math.pow((double)(1+rate_in_percentage),number_of_years);
		System.out.println("After " + number_of_years + " years, $" + currentValue + " saved at " + rate + "% will yield $" + (int)future_value);
	}
}