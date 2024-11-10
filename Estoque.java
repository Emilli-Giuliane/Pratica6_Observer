interface Estoque {
    void registrarObservador(Observer observer);
    void removerObservador(Observer observer);
    void notificarObservadores();
}