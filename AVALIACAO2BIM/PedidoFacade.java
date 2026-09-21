public class PedidoFacade {

    private ServicoOrcamento servicoOrcamento;
    private ServicoPagamento servicoPagamento;
    private ServicoEstoque servicoEstoque;
    private ServicoProducao servicoProducao;

    public PedidoFacade(
            ServicoOrcamento servicoOrcamento,
            ServicoPagamento servicoPagamento,
            ServicoEstoque servicoEstoque,
            ServicoProducao servicoProducao) {

        this.servicoOrcamento = servicoOrcamento;
        this.servicoPagamento = servicoPagamento;
        this.servicoEstoque = servicoEstoque;
        this.servicoProducao = servicoProducao;
    }

    public void confirmarPedido(Pedido pedido) {

        System.out.println();
        System.out.println("===== CONFIRMAÇÃO DO PEDIDO =====");

        boolean orcamentoOk =
                servicoOrcamento.verificarAprovacao(pedido);

        if (!orcamentoOk) {

            System.out.println(
                    "Pedido não pode ser confirmado."
            );

            return;
        }

        boolean pagamentoOk =
                servicoPagamento.verificarSinal(pedido);

        if (!pagamentoOk) {

            System.out.println(
                    "Pedido não pode ser confirmado."
            );

            return;
        }

        boolean estoqueOk =
                servicoEstoque.reservarMateriais(pedido);

        if (!estoqueOk) {

            System.out.println(
                    "Pedido não pode ser confirmado."
            );

            return;
        }

        servicoProducao.iniciarProducao(pedido);

        System.out.println(
                "Pedido confirmado com sucesso."
        );
    }
}