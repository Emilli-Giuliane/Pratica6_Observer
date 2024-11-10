class DepartamentoVendas implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Departamento de Vendas: " + message + " Atualizando a disponibilidade no site.");
    }
}
class DepartamentoMarketing implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Departamento de Marketing: " + message + " Promovendo nas redes sociais.");
    }
}
class DepartamentoCompras implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Departamento de Compras: " + message + " Monitorando o estoque para futuros pedidos.");
    }
}