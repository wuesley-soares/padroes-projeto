public class ServicoOrcamento {

    public boolean verificarAprovacao(Pedido pedido) {

        System.out.println("Verificando aprovação do orçamento...");

        if (pedido.isOrcamentoAprovado()) {

            System.out.println("Orçamento aprovado.");

            return true;
        }

        System.out.println("Orçamento não aprovado.");

        return false;
    }
}