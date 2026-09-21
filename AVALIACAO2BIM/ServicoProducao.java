public class ServicoProducao {

    public void iniciarProducao(Pedido pedido) {

        System.out.println(
                "Produção iniciada para o pedido "
                + pedido.getId()
        );
    }
}