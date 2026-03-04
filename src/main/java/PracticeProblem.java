import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

	q1();
	q2();
	q3();
	q4();
	q5();

	scanner.close();
	}

	public static void q1() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        double absValue = Math.abs(num);
        System.out.println(absValue);
		scanner.close();
	}

	public static void q2() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input another number: ");
        double num2 = scanner.nextDouble();

		double division = num1 / num2;
        double floorResult = Math.floor(division);
        double ceilResult = Math.ceil(division);

        System.out.println(floorResult);
        System.out.println(ceilResult);
		scanner.close();
	}

	public static void q3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
        double num = scanner.nextDouble();
        double sqrt = Math.sqrt(num);
        long rounded = Math.round(sqrt);
        System.out.println(rounded);
		scanner.close();
	}

	public static void q4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scanner.nextDouble();
        System.out.print("Input another number: ");
        double num2 = scanner.nextDouble();

        double powerResult = Math.pow(num1, num2);
        System.out.println(powerResult);
		scanner.close();
	}

	public static void q5() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = scanner.nextDouble();
        System.out.print("Input another number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input one more number: ");
        double num3 = scanner.nextDouble();

        double max = Math.max(num1, Math.max(num2, num3));
        double min = Math.min(num1, Math.min(num2, num3));

        System.out.println(max);
        System.out.println(min);
		scanner.close();
	}

}
