// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int rnum1 = (int)(lim * Math.random());
		int rnum2 = (int)(lim * Math.random());
		int rnum3 = (int)(lim * Math.random());

		System.out.println(rnum1 + " " + rnum2 + " " + rnum3);

		int midmin = Math.min(rnum1, rnum2);
		int min = Math.min(rnum3, midmin);

		int midmax = Math.max(rnum1, rnum2);
		int max = Math.max(rnum3, midmax);
		
		int mid = Math.max(Math.min(rnum1, rnum3), Math.max(Math.min(rnum1, rnum2), Math.min(rnum2, rnum3)));
		System.out.println(min + " " + mid + " " + max);

		

		
	}
}
