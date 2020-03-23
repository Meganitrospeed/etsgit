import java.util.Scanner;

public class main {
    public static void main(String[] args) {
int i;
int ih = 0;
double n = 0;
System.out.println(" Introduce la cantidad de iteraciones");
Scanner texto = new Scanner(System.in);
i = texto.nextInt();
System.out.println("Introduce el valor de n");
n = texto.nextInt();
        while (i != ih ) {
            ih++;
            n = (n + Math.pow(n,2))/2;
            System.out.println(n);
        }
    }
}
