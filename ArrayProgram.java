class InvalidSizeException extends Exception {
    InvalidSizeException(String msg) {
        super(msg);
    }
}

public class ArrayProgram {

    public static void main(String[] args) {

        int size = 5;  
        int[] arr = {10, 25,5,18,30};

        try {
                if (size <= 0) {
                throw new InvalidSizeException("Array size must be greater than 0");
            }

            
            int max = arr[0];
            for (int num : arr) {
                if (num > max) max = num;
            }

            System.out.println("Enter size of array: " + size);
            System.out.print("Enter " + size + " elements: ");
            for (int num : arr)
                System.out.print(num + " ");


            System.out.println("\n\nMenu:");
            System.out.println("1. Display");
            System.out.println("2. Max");
            System.out.println("3. Sum");
            System.out.println("4. Search");
            System.out.println("5. Exit");


            System.out.println("Enter choice: 2");
            System.out.println("Largest element: " + max);

          
            int key = 18;
            int pos = -1;

            for (int i = 0; i < size; i++) {
                if (arr[i] == key) {
                    pos = i + 1;
                    break;
                }
            }

            System.out.println("\nEnter choice: 4");
            System.out.println("Enter element to search: " + key);

            if (pos != -1)
                System.out.println("Element found at position: " + pos);
            else
                System.out.println("Element not found");

        } catch (InvalidSizeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
