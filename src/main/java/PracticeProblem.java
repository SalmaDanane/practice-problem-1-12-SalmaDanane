import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input an integer: ");
		int num = input.nextInt();
		System.out.println(num + 3);
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner (System.in);

		System.out.print("Input a number: ");
		String user = input.nextLine();
		user = user + "4";
		double num = Double.parseDouble(user) + 2;
		System.out.println(num);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a radius: ");
		double rad = input.nextDouble();
		int cir = (int)rad;

		System.out.println(cir * cir * 3.14);
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		double num = input.nextDouble();
		num = num * 12;
		num = Math.floor(num);
		System.out.println(num);
	}

}
