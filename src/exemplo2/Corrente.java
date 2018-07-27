package exemplo2;

public class Corrente extends Conta {
	
	private float limite;
	private float tarifa;
	
	public Corrente() {}

		
		public Corrente(Cliente cliente, String agencia, String numero, float saldo, float limite) {
			super(cliente, agencia, numero, saldo);
			this.limite = limite;
		}


		public float getLimite() {
			return limite;
		}


		public void setLimite(float limite) {
			this.limite = limite;
		}


		public float getTarifa() {
			return tarifa;
		}


		public void setTarifa(float tarifa) {
			this.tarifa = tarifa;
		}


		@Override
		public String toString() {
			return "Corrente [conta=" + super.toString() + limite + ", tarifa=" + tarifa + "]";
		}
		
		@Override
		public Boolean saca(float valor) {
			float saldoVirtual = super.getSaldo() + this.limite;
			if(valor > 0 && saldoVirtual >= valor) {
				float novoSaldo = super.getSaldo() - valor;
				super.setSaldo(novoSaldo);
				return true;
			}
			return false;
		}
	}	
	

