import java.util.Arrays;

public class Remove_Elements {
    public static void main(String[] args) {
        //declaring and instantiating original array
        int[] oldArray = new int[]{1, 3, 5, 7, 9, 11};
        //converting array to string
        System.out.println("Original Array: " + Arrays.toString(oldArray));
        int[] newArray = new int[oldArray.length - 1];//declaring and instantiating new array
        int index = 3;// declaring index number to remove elements from original array
        System.out.println("Index position to be removed: " + index);
        //run loop and print numbers except when it matches the index number
        for (int i = 0, k = 0; i < oldArray.length; i++) {
            if (i != index) {
                newArray[k] = oldArray[i];
                k++;
            }
        }
        System.out.println("New Array after removal of element: " + Arrays.toString(newArray));
    }
}


