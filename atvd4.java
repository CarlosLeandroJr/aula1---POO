import java.lang.Math;
public class atvd4 {
    public static void main(String[] args) {
        double r = In.lerFloat("Informe o raio de um círculo: ");
        double a = Math.PI * Math.pow(r, 2);
        double p = 2 * Math.PI * r;
        System.out.println("Raíz = " + r + ", Área = " + a + ", Perímetro = " + p);
    }
}
