public class atvd6 {
    public static void main(String[] args) {
        int menor = 0, maior = 0;
        int sair = 1;
        while (sair != 0) {
            int seq = In.lerInt("Informe um número na lista, e digite 0 para parar de digitar: ");
            if (seq < menor) {
                menor = seq;
            }
            if (seq > maior) {
                maior = seq;
            }
            sair = In.lerInt("Digite 0 para sair :");
        }
        System.out.println("O menor número é " + menor + " e o maior número é " + maior);
    }
}
