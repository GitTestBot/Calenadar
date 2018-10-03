package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] last_day = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int lastday(int num) {
		return last_day[num-1];
	}
	
	public void showCalendar() {
		System.out.println("일 	월 	화 	수 	목 	금 	토");
		System.out.println("-------------------------------------------");
		System.out.println("1	2	3	4	5	6	7");
		System.out.println("8	9	10	11	12	13	14");
		System.out.println("15	16	17	18	19	20	21");
		System.out.println("22	23	24	25	26	27	28");
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Calendar cal = new Calendar();
		System.out.println("달을 입력하세요.");
		
		int num = scan.nextInt();
		if(1<= num && num<= 12) {
			System.out.println(num+"월은 "+cal.lastday(num)+"까지 있습니다.");
		}
	}
}
