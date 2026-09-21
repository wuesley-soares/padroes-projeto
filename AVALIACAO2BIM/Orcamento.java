public class Orcamento {

    private Cliente cliente;
    private Projeto projeto;
    private Ambiente ambiente;

    private double materiais;
    private double maoDeObra;
    private double margem;
    private int validadeDias;
    private double valorFinal;

    public Orcamento(
            Cliente cliente,
            Projeto projeto,
            Ambiente ambiente,
            double materiais,
            double maoDeObra,
            double margem,
            int validadeDias) {

        this.cliente = cliente;
        this.projeto = projeto;
        this.ambiente = ambiente;
        this.materiais = materiais;
        this.maoDeObra = maoDeObra;
        this.margem = margem;
        this.validadeDias = validadeDias;

        double subtotal = materiais + maoDeObra;

        this.valorFinal = subtotal + (subtotal * margem / 100);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public double getMateriais() {
        return materiais;
    }

    public double getMaoDeObra() {
        return maoDeObra;
    }

    public double getMargem() {
        return margem;
    }

    public int getValidadeDias() {
        return validadeDias;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void exibir() {

        System.out.println("===== ORÇAMENTO =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Projeto: " + projeto.getNome());
        System.out.println("Ambiente: " + ambiente.getNome());
        System.out.println("Materiais: R$ " + materiais);
        System.out.println("Mão de obra: R$ " + maoDeObra);
        System.out.println("Margem: " + margem + "%");
        System.out.println("Validade: " + validadeDias + " dias");
        System.out.println("Valor final: R$ " + valorFinal);
    }
}