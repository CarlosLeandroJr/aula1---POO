import java.util.Random;
public class atvd5 {
    public static void main(String[] args) {
        int escolha = In.lerInt("Digite 0 para pedra, 1 para papel e 2 para tesoura: ");
        Random gerador = new Random();
        if ((escolha == 0) || (escolha == 1) || (escolha == 2)) {
            int bot = gerador.nextInt(0, 3);
            if ((bot == 0) && (escolha == 1)) {
                System.out.println("O bot Jogou pedra, você ganhou.");
            }
            if ((bot == 1) && (escolha == 2)) {
                System.out.println("O bot Jogou papel, você ganhou.");
            }
            if ((bot == 2) && (escolha == 0)) {
                System.out.println("O bot Jogou tesoura, você ganhou.");
            }
            if ((bot == 0) && (escolha == 0)) {
                System.out.println("O bot Jogou pedra, você empatou.");
            }
            if ((bot == 1) && (escolha == 1)) {
                System.out.println("O bot Jogou papel, você empatou.");
            }
            if ((bot == 2) && (escolha == 2)) {
                System.out.println("O bot Jogou tesoura, você empatou.");
            }
            if ((bot == 1) && (escolha == 0)) {
                System.out.println("O bot Jogou papel, você perdeu.");
            }
            if ((bot == 2) && (escolha == 1)) {
                System.out.println("O bot Jogou tesoura, você perdeu.");
            }
            if ((bot == 0) && (escolha == 2)) {
                System.out.println("O bot Jogou pedra, você perdeu.");
            }
        }
    }
}