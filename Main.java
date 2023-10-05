import java.io.IOException;
import java.util.*;

public class Main {

//    public static void main(String[] args) {
//        //
//        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
//        int[][] arr2 = {{3, 3}, {3, 3}};
//
//        int[][] answer = new int[arr1.length][arr2[0].length];
//
//        for (int i = 0; i < answer.length; i++) {
//            for(int j = 0; j < arr2[0].length; j++) {
//                for (int k = 0; k < arr2.length; k++) {
//                    answer[i][j] += arr1[i][k] * arr2[k][j];
//                }
//            }
//        }
//
//        for (int[] arr: answer) {
//            for(int a: arr) {
//                System.out.print(a);
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        //
//        int n = 5;
//        int f1 = 0;
//        int f2 = 1;
//        for (int i =2; i <= n; i++) {
//            int f3 = f2;
//            f2 = f2 + f1;
//            f1 = f3;
//        }
//        if(n > 2) {
//            System.out.println(n%1234567);
//        }
//        else {
//            System.out.println(f2);
//        }
//    }
//
//    static int pabo(int i) {
//        if(i == 2 || i == 1) return 1;
//        int F1 = pabo(i-1);
//        int F2 = pabo(i-2);
//        return F1 + F2;
//    }

    public static void main(String[] args) {
        int n = 437674;
        int k = 3;

        String temp = "";
        while (n!=0) {
            temp = n%k + temp;
            n/=k;
        }

        String[] arr = temp.split("0");
        int answer = 0;
        for(String s: arr) {
            if("".equals(s)) continue;
            long num = Long.parseLong(s);

            if (num < 2) continue;
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if(num%i == 0) {
                    check = true;
                    break;
                }
            }
            if(!check) answer++;
        }
        System.out.println(answer);
    }
}
