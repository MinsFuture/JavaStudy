package Example;

import java.util.Scanner;

public class Ex9 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] ary = null;
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    ary = makeAry();
                    break;
                case 2:
                    initAry(ary);
                    break;
                case 3:
                    printAry(ary);
                    break;
                case 4:
                    analyzeAry(ary);
                    break;
                default:
                    run = false;
                    System.out.println("프로그램을 종료합니다");
            }

        }

    }

    public static int[] makeAry() {
        System.out.print("학생수>");
        int studentNum = scanner.nextInt();
        return new int[studentNum];
    }

    public static void initAry(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print("scores[" + i + "]>");
            ary[i] = scanner.nextInt();
        }
    }

    public static void printAry(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            System.out.println("scores[" + i + "]> " + ary[i]);
        }
    }

    public static void analyzeAry(int[] ary) {
        int max = ary[0];
        int sum = 0;

        for (int i = 0; i < ary.length; i++) {
            if (max < ary[i]) {
                max = ary[i];
            }
            sum += ary[i];
        }

        double ave = (double) sum / ary.length;

        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + ave);
    }
}

