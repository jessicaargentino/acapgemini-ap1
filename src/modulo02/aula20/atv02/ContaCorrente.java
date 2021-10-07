package modulo02.aula20.atv02;

public class ContaCorrente {
    /* DEFINIÇÃO DOS ATRIBUTOS */
    private double saldo;
    private double taxaSaque;
    private int codigoCliente;

    /* DEFINIÇÃO DO MÉTODO CONSTRUTOR DA CLASSE */
    public ContaCorrente(double saldo, double taxaSaque, int codigoCliente) {
        this.saldo = saldo;
        this.taxaSaque = taxaSaque;
        this.codigoCliente = codigoCliente;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARAMETRO E O REALIZA O SAQUE DIMINUINDO O
     * MESMO DO SALDO. DIMINUI TAMBÉM A TAXA DE SAQUE DO SALDO;
     */
    public void realizaSaque(double valor) {
        this.saldo -= valor - taxaSaque;
    }

    /*
     * MÉTODO QUE RECEBE UM VALOR POR PARAMETRO E O REALIZA O O DEPÓSITO,
     * ACRESCENTANDO O VALOR AO SALDO.
     */
    public void recebeDeposito(double valor) {
        this.saldo += valor;
    }
}