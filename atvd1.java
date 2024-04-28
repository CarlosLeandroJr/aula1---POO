public class atvd1 {
    public static void main(String[] args) {
        int idade = In.lerInt("Informe sua idade: ");
        String nome = In.lerString("Informe seu nome: ");
        if (idade >= 18) {
            System.out.println(nome + "você é maior de idade.");
        }
        else {
            System.out.println(nome + ", você é menor de idade.");
        }
    }
}
