import java.util.Scanner;

public class J1_03 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);

        int x = entrada.nextInt();
        int y = entrada.nextInt();

        int mdc = calculaMDC(x,y);
        System.out.println(mdc);
    }


    public static int calculaMDC(int x, int y){
        if(x == y){
            return x;
        }

        if(x > y){
            return calculaMDC(x -y, y);
        } else {
            return calculaMDC(y,x);
        }
    }
}
