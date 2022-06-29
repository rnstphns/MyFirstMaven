package furtherexercisesapp;

public class FurtherExercisesApp {

    public static void main(String[] args) {
        printHelloWorld(new int [] {3,5,7,35});
        System.out.println("Second Largest: " + getSecondLargest(new int[] {17,13,22,44,1,3}));
    }

    public static void printHelloWorld(int[] ints){
        for(int i: ints){
            if(i % 5 == 0 && i % 7 == 0)
                System.out.println("HelloWorld " + i);
            else if(i % 5 == 0)
                System.out.println("Hello " + i);
            else if(i % 7 == 0)
                System.out.println("World " + i);
        }
    }

    public static int getSecondLargest(int[] intArray){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
            for (int i = 0; i < intArray.length; ++i) {
                if (intArray[i] > largest) {
                    second = largest;
                    largest = intArray[i];
                }
            }
        return second;
    }

}
