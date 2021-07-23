package Task3;

public class Solution {
    public int solution(int A){
        String output = "";
        if (A>= 0 && A<= 100000000){
            String input = Integer.toString(A);
            char [] indexChars = input.toCharArray();
            for (int i = 0; i < indexChars.length; i++) {
                if (i % 2 ==0){
                    output += indexChars[i/2];
                }
                else {
                    output += indexChars[indexChars.length - (i/2+1)];
                }
            }
        }
        return Integer.parseInt(output);
    }
}
