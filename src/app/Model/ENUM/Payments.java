package app.Model.ENUM;

public enum Payments {
    CREDIT(1), DEBIT(2), PIX(3), CASH(4);
    private int valor;

    Payments(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
