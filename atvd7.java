public class atvd7 {
    public static void main(String[] args) {
        int num = In.lerInt("Digite um número: ");
        if (num >= 1) {
            System.out.print("1");
            for (int i = 2; i <= num; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.print(", FizzBuzz");
                } else {
                    if (i % 3 == 0) {
                        System.out.print(", Fizz");
                    }
                    if (i % 5 == 0) {
                        System.out.print(", Buzz");
                    }
                }
                if ((i % 3 != 0) && (i % 5 != 0)) {
                    System.out.print(", " + i);
                }
            }
        }
        else {
            System.out.println("erro");
        }
    }
}
