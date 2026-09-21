public class ServicoPagamento {

    public boolean verificarSinal(Pedido pedido) {

        System.out.println("Verificando pagamento do sinal...");

        double valorOrcamento =
                pedido.getOrcamento().getValorFinal();

        double sinalMinimo =
                valorOrcamento * 0.30;

        if (pedido.getSinalPago() >= sinalMinimo) {

            System.out.println(
                    "Sinal mínimo de 30% confirmado."
            );

            return true;
        }

        System.out.println(
                "Sinal insuficiente. Mínimo necessário: R$ "
                + sinalMinimo
        );

        return false;
    }
}