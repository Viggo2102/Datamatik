package Øvelse;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] num = new int[5];
        num[0] = 3;
        num[1] = 2;
        num[2] = 6;
        num[3] = 8;
        num[4] = 9;

        int[] num2 = {5,4,6,7,8,4,4,3,6,7,8,3,4};

        for (int i = 0; i<num.length; i++) {
            System.out.println(num[i]);
        }

        int s = sum(num);
        System.out.println("Sum = " + s);
        for (int i =0; i<num.length; i++) {
            System.out.println(num[i]);
        }
        int s2 = sum(num2);
        System.out.println("sum af num 2 = " + s2);
        for (int i =0; i<num2.length; i++) {
            System.out.println(num2[i]);
        }
    }

    static int sum(int[] arr) {
        int result = 0;
        for (int i = 0; i<arr.length; i++) {
            result+=arr[i];
            arr[2] = 1000;
        }
        return result;
    }
}
