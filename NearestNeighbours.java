public class NearestNeighbours {
    public static void main(String[] args) {
        // Author: [Your Name]
        // PRN: [Your PRN]
        // Batch: [Your Batch]

        int[] array = {5, 10, 3, 8, 15, 20};  // Example array, replace with user input

        int minDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < array.length - 1; i++) {
            int distance = Math.abs(array[i] - array[i + 1]);

            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        System.out.println("Index of the first number in the pair with the smallest distance: " + minIndex);
    }
}
