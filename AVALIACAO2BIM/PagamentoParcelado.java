public class PagamentoParcelado implements EstrategiaPagamento {

    @Override
    public double calcular(double valor) {

        return valor * 1.10;
    }
}