import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        double nume1, nume2, calc,i=1;
        Scanner sc = new Scanner(System.in);

        while (i==1){
            System.out.println("Digite o primiero numero: ");
            nume1= sc.nextDouble();
            System.out.println("Digite o segundo numero: ");
            nume2= sc.nextDouble();
            calc= nume1*nume2;
            System.out.println("O resultado é : " + calc);
            System.out.println("\nVoce deseja continuar?\n 1 - sim, 2 - nao");
            i= sc.nextDouble();
        }
    }
}