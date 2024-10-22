package practice;

import java.util.Scanner;

public class moviechart {
    // 1. 여러 영화(max 10개)에 대한 정보를 입력
    // 2. 각 영화는 5개의 카테고리(스토리, 연출 연기, 음약, 시각효과)에 대한 평점을 받는다.
    // 각 평점은 1부터 5까지의 정수
    // 3. 사용자로부터 각 영화의 카테고리 별 평점을 입력받는다.
    // 4. 각 영화의 평균 평점을 계산
    // 5. 전체 영화중 가장 평점 높은거 출력
    // 6. 각 케테고리별 평균 평점을 출력
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String catagory[] = { "스토리", "연출", "연기", "음악", "시각효과" };

        String[] moviename = new String[10];
        int category = 5;

        System.out.print("영화 개수를 입력하시요: ");
        int numofmovie = scanner.nextInt();

        int [][]Rating = new int[numofmovie][5];

        for (int i = 0; i < numofmovie; i++) {
            System.out.print((i + 1) + "번째 영화 이름을 입력하세요: ");
            moviename[i] = scanner.nextLine();

            for (int j = 0; j < category; j++) {
                System.out.print(moviename + "의 " + catagory[j] + " 평점을 입력하세요(1~5): ");
                Rating[i][j] = scanner.nextInt();
            }
        }
        double[] movieAvg = new double[numofmovie];
        for (int i = 0; i < numofmovie; i++) {
            int sum = 0;
            for (int j = 0; j < category; j++) {
                sum += Rating[i][j];
            }
            movieAvg[i] = (double) sum / category;
        }
        //전체 중 평균평점 높은거
        int best
    }
}
