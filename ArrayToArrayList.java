/*
Tanishq Jain
22070126119
AIML B2
*/import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Author: [Your Name]
        // PRN: [Your PRN]
        // Batch: [Your Batch]

        // Convert Array to ArrayList
        Integer[] array = {1, 2, 3, 4, 5};
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);

        // Convert ArrayList to Array
        Integer[] newArray = arrayList.toArray(new Integer[0]);

        System.out.print("Array: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
