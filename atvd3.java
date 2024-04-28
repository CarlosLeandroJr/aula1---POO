import java.util.Random;
public class atvd3 {
    public static void main(String[] args) {
        int soma = 0, sair = 1;
        Random gerador = new Random();
        while (sair == 1) {
            for (int i = 0; i < 2; i++) {
                soma += gerador.nextInt(1, 7);
            }
            System.out.println("A soma dos dados é " + soma);
            sair = In.lerInt("Digite 1 para rolar novamente: ");
            soma = 0;
        }
    }
}