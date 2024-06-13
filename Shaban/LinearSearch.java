public class LinearSearch {
    
   public static int linearSearch(int[] array, int key) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == key) {
            return i;
        }
    }
         return -1;
   } 

   public static void main(String[] args) {
    int[] myArray = {1,2,3,4,5};
    int key = 3; 

    int result = linearSearch(myArray, key);
    if(result != -1) {
        System.out.println("Element found at index: " + result);
    } else {
        System.out.println("Element not found");
    }
}
}