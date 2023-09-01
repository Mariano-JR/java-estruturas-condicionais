public class Ternaria {
    public static void main(String[] args) throws Exception {
        // Quando temos uma condicional composta, podemos utilizar a condicional ternaria como uma forma de abreviar nosso código, o tornando mais simples e legivel;
        // A condição ternaria é utilizando com o ? :, onde o "?" é o If e ":" o Else.

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);

        // A condicional Composta tambem funciona com encadeadas, onde após o ":" passaremos uma nova condição a ser explorada.

        String boletin = nota >= 7 ? "Aprovado": nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(boletin);
    }
}
