import java.text.DecimalFormat;

// Interface para as estratégias de cálculo de média
interface ICalcMedia {
    double CalculaMedia(double p1, double p2);
    String Situacao(double media);
}