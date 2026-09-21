public class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. BUILDER
        // Criação do orçamento
        // ==========================================

        Cliente cliente =
                new Cliente("João da Silva");

        Projeto projeto =
                new Projeto("Cozinha Planejada");

        Ambiente ambiente =
                new Ambiente("Cozinha");

        Orcamento orcamento =
                new OrcamentoBuilder()
                        .cliente(cliente)
                        .projeto(projeto)
                        .ambiente(ambiente)
                        .materiais(5000.00)
                        .maoDeObra(2500.00)
                        .margem(20)
                        .validadeDias(15)
                        .build();

        orcamento.exibir();


        // ==========================================
        // 2. FACADE
        // Confirmação do pedido
        // ==========================================

        Pedido pedido =
                new Pedido(
                        101,
                        cliente,
                        orcamento,
                        true,
                        2700.00
                );

        ServicoOrcamento servicoOrcamento =
                new ServicoOrcamento();

        ServicoPagamento servicoPagamento =
                new ServicoPagamento();

        ServicoEstoque servicoEstoque =
                new ServicoEstoque();

        ServicoProducao servicoProducao =
                new ServicoProducao();

        PedidoFacade pedidoFacade =
                new PedidoFacade(
                        servicoOrcamento,
                        servicoPagamento,
                        servicoEstoque,
                        servicoProducao
                );

        pedidoFacade.confirmarPedido(pedido);


        // ==========================================
        // 3. STRATEGY
        // Cálculo do pagamento
        // ==========================================

        System.out.println();
        System.out.println("===== CÁLCULO DO PAGAMENTO =====");

        EstrategiaPagamento estrategia =
                new PagamentoAVista();

        CalculadoraPagamento calculadora =
                new CalculadoraPagamento(estrategia);

        double valorFinal =
                calculadora.calcular(
                        orcamento.getValorFinal()
                );

        System.out.println(
                "Valor do orçamento: R$ "
                + orcamento.getValorFinal()
        );

        System.out.println(
                "Pagamento à vista: R$ "
                + valorFinal
        );
    }
}