package sintaxebasicajava.contaBanco;

public class DadosConta {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public DadosConta() {
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numeroConta +
                " e seu saldo " + saldo + " já está disponível para saque.";
    }
}
