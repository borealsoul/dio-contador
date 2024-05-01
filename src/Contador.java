import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = Integer.parseInt(leitor.nextLine());

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = Integer.parseInt(leitor.nextLine());

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parâmetro 01 é menor que o Parâmetro 02");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < parametroUm - parametroDois; i++) {
            System.out.println("Imprimindo número " + (i + 1));
        }

    }
}
