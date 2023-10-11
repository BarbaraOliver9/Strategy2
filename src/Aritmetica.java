// Implementação da estratégia Aritmética
class Aritmetica implements ICalcMedia {
    @Override
    public double CalculaMedia(double p1, double p2) {
        return (p1 + p2) / 2.0;
    }

    @Override
    public String Situacao(double media) {
        return media > 5.0 ? "Aprovado" : "Reprovado";
    }
}