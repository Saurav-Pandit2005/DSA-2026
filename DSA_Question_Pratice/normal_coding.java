import java.util.Scanner;

public class normal_coding {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int n = sc.nextInt();

        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum : " + sum);

        // int i = 1;

        // while (i <= n) {
        //     System.out.print(i + " ");
        //     i++;
        // }
        // int day = 4;

        // switch(day) {
        //     case 1 : System.out.println("Monday"); break;
        //     case 2 : System.out.println("Tuesday"); break;
        //     case 3 : System.out.println("Wednedday"); break;
        //     case 4 : System.out.println("Thursday"); break;
        //     case 5 : System.out.println("Friday"); break;
        //     case 6 : System.out.println("Saturday"); break;
        //     case 7 : System.out.println("Sunday"); break;
        //     default : System.out.println("Invalid day"); 
        //}

        // int i = 0; 
        // while (i < 10) {
        //     System.out.print(i + " ");
        //     i++;
        // }

        sc.close();
    }
}


