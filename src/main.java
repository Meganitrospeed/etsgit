import java.util.Scanner;

public class main {
    public static void main(String[] args) {
int i;
int n = 0;
System.out.println(" Introduce la cantidad de iteraciones");
Scanner texto = new Scanner(System.in);
i = texto.nextInt();
System.out.println("Introduce el valor de n");
n = texto.nextInt();
        while (i != n) {
            i++;
            n = n+n;
            System.out.println(n);
        }
    }
}
