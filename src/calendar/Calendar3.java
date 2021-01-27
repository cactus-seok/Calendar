package calendar;
import java.util.Scanner;
public class Calendar3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int a = scanner.nextInt();
		
		if(a % 2 == 0) {
			System.out.printf("%d월은 30일까지 있습니다.",a);
		} else if (a % 2 == 1) {
			System.out.printf("%d월은 31일까지 있습니다.",a);
//		} else (a = 2) {
//			System.out.printf("2월은 28일까지 있습니다.");
		}
	}

}
