public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSaque = 17.0;

        if (saldo >= valorSaque) {
            saldo -= valorSaque;

            System.out.println(saldo);
        }
    }
}
