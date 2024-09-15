package part1;

import java.util.Scanner;

public class 곱셈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int mul = 1;
        int total = 0;
        for(int i=2; i>=0; i--){
            total += Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(i)))*mul;
            System.out.println(Integer.parseInt(num1) * Integer.parseInt(String.valueOf(num2.charAt(i))));
            mul *= 10;
        }
        System.out.println(total);
    }
}
