/*     linear Search     */

package  Arrays;

public class Q1{

    public static int linearSearch(int numbers[], int target){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,7,8,17,20,14};
        int target = 17;

        int result = linearSearch(numbers, target);
        if(result == -1){
            System.out.println("Element not found in the Array");
        }else{
            System.out.println("Element found at index : " + result);   
        }
    }
}
