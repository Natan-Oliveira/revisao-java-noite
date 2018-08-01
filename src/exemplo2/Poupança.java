
package exemplo2;

public class Poupança extends Conta {

	private final Float RENDIMENTO = 0.01f;

	@Override
	public Boolean saca(Float valor) {
		Float saldo = super.getSaldo();
		if (valor > 0 && saldo >= valor) {
			super.setSaldo(saldo - valor);
			return true;
		}
		return false;
	}
	
	public void rende() {
		Float novoSaldo = super.getSaldo() + super.getSaldo() * RENDIMENTO;
		super.setSaldo(novoSaldo);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [conta=" + super.toString() + "]";
	}
	
}