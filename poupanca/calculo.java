import java.util.Scanner;

public class calculo {

        public static void main(String[] args) {

            int juros;
            int anos;
            double deposito;
            double poupanca;

            Scanner scanner = new Scanner (System.in);

            System.out.println("Juros ao mês: ");
            juros = scanner.nextInt();

            System.out.println("Número de anos: ");
            anos = scanner.nextInt();

            System.out.println("Depósito mensal: ");
            deposito = scanner.nextDouble();

            poupanca = (deposito*juros);

            System.out.println("Total poupado R$: "+poupanca);
        }
}