public class CalculadoraPagamento {

    private EstrategiaPagamento estrategia;

    public CalculadoraPagamento(
            EstrategiaPagamento estrategia) {

        this.estrategia = estrategia;
    }

    public double calcular(double valor) {

        return estrategia.calcular(valor);
    }
}