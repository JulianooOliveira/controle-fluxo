import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //verificar se o segundo parâmetro é maior que o primeiro
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem

            for (int i = 1; i <= contagem; i++) {
                	System.out.println("Imprimindo o " + i + "º número: " + (parametroUm + i));
            }
        }

    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            super("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}
