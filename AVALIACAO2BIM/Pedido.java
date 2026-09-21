public class Pedido {

    private int id;
    private Cliente cliente;
    private Orcamento orcamento;
    private boolean orcamentoAprovado;
    private double sinalPago;

    public Pedido(
            int id,
            Cliente cliente,
            Orcamento orcamento,
            boolean orcamentoAprovado,
            double sinalPago) {

        this.id = id;
        this.cliente = cliente;
        this.orcamento = orcamento;
        this.orcamentoAprovado = orcamentoAprovado;
        this.sinalPago = sinalPago;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public boolean isOrcamentoAprovado() {
        return orcamentoAprovado;
    }

    public double getSinalPago() {
        return sinalPago;
    }
}