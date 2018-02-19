import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int radius = in.nextInt();
		double area = Math.PI * (Math.pow(radius, 2));
		
		System.out.println(area);
	}
}
