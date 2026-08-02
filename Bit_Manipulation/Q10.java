// Fast Exponentiation

package Bit_Manipulation;

public class Q10 {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while(n > 0) {
            if((n & 1) != 0) {      // Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }

        return ans;
    }
    public static void main(String[] args) {
        int a = 5, n = 3;
        System.out.println(fastExpo(a, n));
    }
}
