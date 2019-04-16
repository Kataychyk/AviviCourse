package lection3;


public class HomeWork {
    public static void main(String[] args) {
        int[] numArray = {12, 34, 3, 54, 18, 89, 43, 4, 77, 63};

        int n = numArray.length;


        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (numArray[j - 1] > numArray[j]) {
                  int temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }
        for(int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + " ");
        }
    }

}