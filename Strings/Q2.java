package Strings;

public class Q2 {
    public static float Shortest_Path(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++){
            int direction = path.charAt(i);
            if(direction == 'S'){
                y--;
            }
            else if(direction == 'N'){
                y++;
            }
            else if(direction == 'W'){
                x--;
            }
            else{
                x++;
            }
        }

        return (float)Math.sqrt(x*x + y*y);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Shortest_Path(path));
    }
}
