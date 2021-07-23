package Task;

import java.util.Random;

public class Solution {
    Random random = new Random();
    public int solution(int [] array){
        int n = 0;
        if (n<=100){
            n = array.length;
        }
        else{
            System.out.println("Количество монет должно быть не больше ста");
        }
        setArray(array,n);
        int NumberOfZero = 0;
        int NumberOfOne = 0;
        for (int i = 0; i < n; i++) {
            if (array[i]==0){
                NumberOfZero++;
            }
            else if (array[i]==1){
                NumberOfOne++;
            }
        }
        getArray(array);
        return NumberOfZero < NumberOfOne ? NumberOfZero : NumberOfOne;
    }
     private void setArray(int[] array, int n){
         for (int i = 0; i < n; i++) {
             array[i] = random.nextInt(2);
         }
     }
     private void getArray(int[] array){
         for (int n : array) {
             System.out.println(n);
         }
     }
}
