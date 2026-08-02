package Bit_Manipulation;

public class Q9 {

    public static int countSetBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n & 1) != 0) {          // Check LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countSetBits(n));
    }
}
