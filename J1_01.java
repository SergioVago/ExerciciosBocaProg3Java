public class J1_01 {
    public static void main(String args[]){
            double s1= 0 ,s2 = 0,s3 = 0;
            double aux = 1;

            for(int i = 1; i <= 50; i++){
                s1 += (aux/i);
                aux += 2;
            }
            System.out.println("S1 = " + s1);

            aux = 1;
            for(int i = 50; i > 0; i--){
                s2 += (Math.pow(2, aux)/ i);
                aux++;
            }
            System.out.println("S2 = " + s2);

            aux = 1;
            for(int i = 1; i <=  10; i++){
                if(i % 2 == 0){
                    s3 -= (i/Math.pow(i, 2));
                } else {
                    s3 += (i/Math.pow(i, 2));
                }
            }
            System.out.println("S3 = " + s3);
    }
}
