public class atvd2 {
    public static void main(String[] args) {
        int soma = 0;
        int num = In.lerInt("Informe o número: ");
        for (int i = 0; i <= 3; i++) {
            soma += i;
        }
        System.out.println("O número informado é " + num + " e a soma dos primeiros três números naturais é " + soma + ".");
    }
}
