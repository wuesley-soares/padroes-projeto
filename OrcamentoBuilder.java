public class OrcamentoBuilder {

    private Cliente cliente;
    private Projeto projeto;
    private Ambiente ambiente;

    private double materiais;
    private double maoDeObra;
    private double margem;
    private int validadeDias;

    public OrcamentoBuilder cliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    public OrcamentoBuilder projeto(Projeto projeto) {
        this.projeto = projeto;
        return this;
    }

    public OrcamentoBuilder ambiente(Ambiente ambiente) {
        this.ambiente = ambiente;
        return this;
    }

    public OrcamentoBuilder materiais(double materiais) {
        this.materiais = materiais;
        return this;
    }

    public OrcamentoBuilder maoDeObra(double maoDeObra) {
        this.maoDeObra = maoDeObra;
        return this;
    }

    public OrcamentoBuilder margem(double margem) {
        this.margem = margem;
        return this;
    }

    public OrcamentoBuilder validadeDias(int validadeDias) {
        this.validadeDias = validadeDias;
        return this;
    }

    public Orcamento build() {

        return new Orcamento(
                cliente,
                projeto,
                ambiente,
                materiais,
                maoDeObra,
                margem,
                validadeDias
        );
    }
}