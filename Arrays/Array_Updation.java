//   Array Updation

package  Arrays;

public class Array_Updation {

    public static void update(int marks[], int nonchange){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }

        nonchange = 05;
    }
    public static void main(String[] args) {
        int marks[] = {90,95,97};
        int nonchange = 02;

        update(marks, nonchange);
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.print(nonchange);
    }
}
