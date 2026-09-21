public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("João da Silva");

        Projeto projeto = new Projeto("Cozinha Planejada");

        Ambiente ambiente = new Ambiente("Cozinha");

        Orcamento orcamento = new OrcamentoBuilder()
                .cliente(cliente)
                .projeto(projeto)
                .ambiente(ambiente)
                .materiais(5000.00)
                .maoDeObra(2500.00)
                .margem(20)
                .validadeDias(15)
                .build();

        orcamento.exibir();
    }
}