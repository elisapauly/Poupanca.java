public class calculo {

    public static double calcularPoupanca(double juros, int anos, double deposito) {
        int meses = anos * 12;
        double total = 0;

        for (int i = 0; i < meses; i++) {
            total += deposito;
            total += total * (juros / 100.0); 
        }

        return total;
    }
}

