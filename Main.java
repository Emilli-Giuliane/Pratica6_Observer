public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        DepartamentoVendas vendas = new DepartamentoVendas();
        DepartamentoMarketing marketing = new DepartamentoMarketing();
        DepartamentoCompras compras = new DepartamentoCompras();
        estoqueProduto.registrarObservador(vendas);
        estoqueProduto.registrarObservador(marketing);
        estoqueProduto.registrarObservador(compras);
        System.out.println("Reabastecendo o produto...");
        estoqueProduto.setEmEstoque(true);
    }
}