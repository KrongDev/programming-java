public class Programers {

    public static void main(String[] args) {
        int[] arr = {2,6,8,14};

        System.out.println(lcm(arr));
    }
    public static int lcm(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = gcd(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;

        for (int i = 2; i < arr.length; i++) {
            gcd = gcd(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }

        return lcm;
    }

    public static int gcd(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }
}
