package Model.ENUM;

public enum Status {
    WAITING(1), PROGRESS(2), FINISHED(3), CANCELED(4);
    private int valor;

    Status(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
