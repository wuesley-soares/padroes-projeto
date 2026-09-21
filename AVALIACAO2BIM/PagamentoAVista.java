public class PagamentoAVista implements EstrategiaPagamento {

    @Override
    public double calcular(double valor) {

        return valor * 0.95;
    }
}