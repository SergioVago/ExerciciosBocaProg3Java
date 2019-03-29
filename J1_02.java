public class J1_02 {
    public static void main(String args[]){

        for(int i = 1001; i < 9999; i++){
            int a = i/1000;
            int b = (i/100) - (a*10);
            int c = (i/10) - (a*100 + b*10);
            int d = (i) - (a*1000 + b*100 + c*10);

            int soma = (a*10 + b) + (c*10 + d);
            int e = soma/10;
            int f = soma - (e*10);

            int compara = (int) Math.pow((e*10) + f, 2);
            if(compara == i){
                System.out.println(i);
            }
        }
    }
}
