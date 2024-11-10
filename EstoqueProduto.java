import java.util.ArrayList;
import java.util.List;

class EstoqueProduto implements Estoque {
    private List<Observer> observadores = new ArrayList<>();
    private boolean emEstoque;
    @Override
    public void registrarObservador(Observer observer) {
        observadores.add(observer);
    }
    @Override
    public void removerObservador(Observer observer) {
        observadores.remove(observer);
    }
    @Override
    public void notificarObservadores() {
        for (Observer observer : observadores) {
            observer.update("O produto voltou ao estoque!");
        }
    }
    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            notificarObservadores();
        }
    }
}
