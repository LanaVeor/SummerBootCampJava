package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите число");
        Solution solution = new Solution();
        System.out.println(solution.solution(new Scanner(System.in).nextInt()));
    }
}
