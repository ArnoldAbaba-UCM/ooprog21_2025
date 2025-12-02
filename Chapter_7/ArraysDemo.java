import java.util.Arrays;

public class ArraysDemo{
    public static void main (String args[]){
        int numbers[] = {0,0,0,0,0};
        
        display("Original Array:\t\t\t", numbers);

        Arrays.fill(numbers, 8);
        display("\nAfter filling with 8s:\t\t", numbers);

        numbers[4]=3;
        numbers[2]=6;
        display("\nAfter Changing two values:\t", numbers);

        Arrays.sort(numbers);
        display("\nAfter Sorting:\t\t\t", numbers);
    }

    static void display(String message, int array[]){
        System.out.print(message);
        for(int x=0; x<array.length; x++){
            System.out.print(array[x]+" ");
        }
    }
}