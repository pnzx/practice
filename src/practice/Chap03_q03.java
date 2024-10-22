package practice;

import java.util.Random;
import java.util.Scanner;

public class Chap03_q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();

        String[] product_names = { "A", "B", "C", "D", "E" };
        int[][] product_sells = new int[12][product_names.length];

        for (int i = 0; i < 12; i++) {
            System.out.printf("=== %d월의 판매 데이터 ===\n", i + 1);
            for (int j = 0; j < product_names.length; j++) {
                System.out.printf("상품 %s의 판매 수량을 입력하세요: ", product_names[j]);
                product_sells[i][j] = (int) (Math.random() * 10000) % 100;
            }
            System.out.println();
        }

        // 연간 판매량
        int[] yearly_sells = new int[product_names.length];
        for (int p = 0; p < product_names.length; p++) {
            for (int i = 0; i < 12; i++) {
                yearly_sells[p] += product_sells[i][p];
            }
        }

        System.out.println("=== 상품별 연간 판매 현황 ===");

        for (int p = 0; p < product_names.length; p++) {
            System.out.printf("상품 %s: 총 판매 수량 = %d, 평균 판매 수량 = %.2f\n",
                    product_names[p], yearly_sells[p],
                    (double) yearly_sells[p] / 12);
        }

    }
}
