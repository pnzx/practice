package practice;

import java.util.Scanner;

public class hospitial {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] subject = { "내과", "외과", "소아과", "정형외과" }; // 진료 과목
		String[][] time = {
				{ "09:00", "10:00", "11:00" },
				{ "13:00", "14:00", "15:00" },
				{ "10:00", "11:00", "12:00" },
				{ "14:00", "15:00", "16:00" } }; // 진료 시간

		int[][] reservations = new int[subject.length][3]; // 예약 정보

		while (true) {
			System.out.println("=== 병원 예약 시스템 ===");
			System.out.println("1. 예약하기");
			System.out.println("2. 예약 현황 보기");
			System.out.println("3. 종료");
			System.out.print("원하시는 작업을 입력해주세요 : ");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = scanner.next();
				System.out.println("진료과목을 선택하세요");
				for (int i = 0; i < subject.length; i++) {
					System.out.println((i + 1) + "." + subject[i]);
				}
				System.out.print("번호를 입력하세요 : ");
				int sub_choice = scanner.nextInt() - 1;
				System.out.println(subject[sub_choice] + "의 예약 가능한 시간대 : ");
				for (int i = 0; i < time[sub_choice].length; i++) {
					System.out.println((i + 1) + "." + time[sub_choice][i] + "(예약 가능 : "
							+ (3 - reservations[sub_choice][i]) + ")");
				}
				System.out.print("번호를 입력하세요 : ");
				int time_choice = scanner.nextInt() - 1;
				if (reservations[sub_choice][time_choice] < 3) {
					reservations[sub_choice][time_choice] += 1;
					System.out.println("예약이 완료되었습니다." + subject[sub_choice] + " 과목의 " + time[sub_choice][time_choice]
							+ "시간대로 예약되었습니다.");
				} else {
					System.out.println("선택하신 시간대는 이미 마감되었습니다.");
				}
			}

			else if (choice == 2) {
				System.out.println("===== 예약 현황 =====");
				for (int i = 0; i < subject.length; i++) {
					System.out.println(subject[i] + " : ");
					for (int j = 0; j < time[i].length; j++) {
						System.out.println(time[i][j] + " - 예약 현황 : " + reservations[i][j] + "/3");
					}
					System.out.println("");
				}
			}

			else if (choice == 3) {
				System.out.println("예약 시스템을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다");
			}
		}

	}

}
