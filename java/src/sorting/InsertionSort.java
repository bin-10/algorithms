package sorting;

public class InsertionSort {

    private static void sort(int[] numbers){
        int n=numbers.length;
        for(int i=1;i<n;i++){
            int currentNumber=numbers[i];
            int j=i-1;
            while(j>=0 && numbers[j]>currentNumber){
                numbers[j+1]=numbers[j];
                j--;
            }
            numbers[j+1]=currentNumber;
        }
    }

    public static void main(String[] args) {
        int[] numbers={9,7,8,4,6,5,0,2,1,3};
        sort(numbers);
        for (int number:numbers) {
            System.out.print(number+" ");
        }
    }
}