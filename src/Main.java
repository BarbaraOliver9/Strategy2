import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Aritmetica calculoAritmetico = new Aritmetica();
        Geometrica calculoGeometrico = new Geometrica();

        Disciplina dAritmetica = new Disciplina(calculoAritmetico);
        dAritmetica.setNome("Padroes de Desenvolvimento");
        dAritmetica.setP1(10);
        dAritmetica.setP2(5);
        dAritmetica.CalcularMedia();
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("P1: " + df.format(dAritmetica.getP1()) +
                ", P2: " + df.format(dAritmetica.getP2()) +
                ", Media: " + df.format(dAritmetica.getMedia()) +
                ", Situacao: " + dAritmetica.getSituacao());

        Disciplina dGeometrica = new Disciplina(calculoGeometrico);
        dGeometrica.setNome("Padroes de Desenvolvimento");
        dGeometrica.setP1(10);
        dGeometrica.setP2(5);
        dGeometrica.CalcularMedia();
        System.out.println("P1: " + df.format(dGeometrica.getP1()) +
                ", P2: " + df.format(dGeometrica.getP2()) +
                ", Media: " + df.format(dGeometrica.getMedia()) +
                ", Situacao: " + dGeometrica.getSituacao());
    }
}