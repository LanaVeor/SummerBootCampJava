package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите количество монет");
        int number = new Scanner(System.in).nextInt();
        Solution solution = new Solution();
        System.out.println("Минимальное количество монет необходимо вернуть " + solution.solution(new int [number]));
    }
}
