package Bit_Manipulation;

public class Q3 {
    // Set ith Bit

    public static int Set_ith_Bit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        int n = 10, i = 2;
        System.out.println(Set_ith_Bit(n, i));
    }
}
