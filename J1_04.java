import java.util.Scanner;

public class J1_04 {
    public static void main(String args[]) {
        int[] vet = new int[10];
        int x;
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            vet[i] = entrada.nextInt();
        }
        x = entrada.nextInt();

        achaMaiorPar(vet);
        System.out.printf("%s", dizOrdem(vet));
        comparaX(x, vet);
    }

    public static void achaMaiorPar(int[] vet) {
        int maior = 0;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < vet.length - 1; i++) {
            int calcMaior = (vet[i + 1] - vet[i]);
            if (i != 0) {
                if (calcMaior > maior) {
                    maior = calcMaior;
                    p1 = i;
                    p2 = i + 1;
                }
            } else {
                maior = calcMaior;
                p1 = i;
                p2 = i + 1;
            }
        }

        System.out.printf("%d %d", p1, p2);
    }

    public static String dizOrdem(int[] vet){
        int cres = 0, decres = 0;

        for(int i = 0; i < vet.length - 1; i++){
            if(vet[i] > vet[i + 1]){
                decres += 1;
            } else {
                cres += 1;
            }
        }

        if(decres == 9){
            return " decrescente ";
        } else if(cres == 9) {
            return " crescente ";
        } else {
            return" nao ordenado ";
        }
    }

    public static void comparaX(int x, int[] vet){
        int maior = 0, menor = 0, igual = 0;

        for(int i = 0; i < vet.length; i++){
            if(vet[i] > x){
                maior++;
            } else if(vet[i] < x){
                menor++;
            } else {
                igual++;
            }
        }

        System.out.printf("%d %d %d\n", maior, menor, igual);
    }
}
