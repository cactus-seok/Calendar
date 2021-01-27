package calendar;
import java.util.Scanner;
public class Calendar2 {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int hap = num1 + num2 ;
		String string1 = "두 수의 합은";
		String string2 = "입니다";
		String string = string1 + hap + string2;
		System.out.println(string);
	}

}
