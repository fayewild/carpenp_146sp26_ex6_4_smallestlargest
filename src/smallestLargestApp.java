import java.util.Random;

/**
 * Should have added this sooner:
 * Credit to GeeksForGeeks for help with code!
 * @author Faye Carpenter
 */
public class smallestLargestApp {
    public static void main(String[] args){
        
        /*Init. Phase*/
        // Initialize Array with 20 elements
        int[] arr = new int[20];
        // Minimum Value
        int mini = 100;
        // Maximum Value
        int maxi = 0;
        // Initialize Random Number Generator
        Random rand = new Random();
        
        /*Processing Phase*/
        for (int i = 0; i < arr.length; ++i) {
        
        int random = rand.nextInt(100);
        arr[0+i] = random;
        
        if (arr[i] < mini) {
            
            mini = arr[i];
            
        }
        
        if (arr[i] > maxi) {
            
            maxi = arr[i];
            
        }
        
        } // end for
        
        System.out.println("Smallest: " + mini);
        System.out.println("Largest: " + maxi);
    
        /*Termination Phase*/
        // Print two results (smallest and largest)
    
    } // end main
} // end class
