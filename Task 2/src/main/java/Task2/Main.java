package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите текст");
        Solution solution = new Solution();
        int maxCountWords = solution.solution(new Scanner(System.in).nextLine());
        System.out.println("Максимальное количество слов в предложении = " +maxCountWords);

    }
}
