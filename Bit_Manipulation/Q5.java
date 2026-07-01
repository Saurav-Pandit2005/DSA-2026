// Update ith Bit

package Bit_Manipulation;

public class Q5 {

    // Set ith Bit
    public static int Set_ith_Bit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // Clear ith Bit
    public static int Cleat_ith_Bit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int Update_ith_Bit(int n, int i, int newBit) {
        // Method 1

        if(newBit == 0) {
            return Cleat_ith_Bit(n, i);
        } else {
            return Set_ith_Bit(n, i);
        }

        // Method 2

        // n = Cleat_ith_Bit(n, i);
        // int BitMask = newBit<<i;
        // return n|BitMask;
    }
    public static void main(String[] args) {
        int n = 10, i = 2, newBit = 1;
        System.out.println(Update_ith_Bit(n, i, newBit));
    }
}
