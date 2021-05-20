import java.util.*;

/**
 * Class to demonstrate the Linear Search algorithm.
 */
class Main {
  /**
   * Search an array for a given key.
   * 
   * @param arr Integer array to search
   * @param key Item to search for
   * @return 1st index where key occurs, or -1 if it is not in arr
   */
  public int linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      } // if found
    } // for each index

    return -1; // not found case

  } // linearSearch

  /**
   * Application entry point.
   *
   * @param args Command line arguments; ignored by this app.
   */
  public static void main(String[] args) {
    // create and fill a random array of ints
    int[] arr = new int[16];
    Random prng = new Random();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = prng.nextInt(100);
    }

    // let user search for values
    Scanner stdin = new Scanner(System.in);
    Main m = new Main(); // class to call method from

    System.out.println("Array:");
    System.out.println(Arrays.toString(arr));

    System.out.print("Enter key, neg. to quit: ");
    int key = stdin.nextInt();
    while (key >= 0) {
      int pos = m.linearSearch(arr, key);

      if (pos == -1) {
        System.out.printf("%d not found.\n", key);
      } else {
        System.out.printf("%d found at index %d.\n", key, pos);
      }

      // get next key to search for
      System.out.println("Array:");
      System.out.println(Arrays.toString(arr));

      System.out.print("Enter key, neg. to quit: ");
      key = stdin.nextInt();
    } // while
  } // main method
} // Main class