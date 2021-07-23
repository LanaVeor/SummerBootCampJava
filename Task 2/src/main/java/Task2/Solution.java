package Task2;

public class Solution {
    public int solution(String s) {
        String[] sentences = s.split("\\s*(\\.|!|\\?)\\s*");
        int index = 0;
        int maxCountWords = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] word = sentences[i].split("\\s+");
            if (maxCountWords < word.length) {
                maxCountWords = word.length;
                index = i;
            }
        }
            System.out.println("Предложение с максимальным количеством слов: " + sentences[index]);
            return maxCountWords;

    }
}