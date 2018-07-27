package exemplo2;

public class TestaContaCorrente {

		public static void main(String[] args) {
			
			Cliente natan = new Cliente("Natan", "123.456.789-12", 25);
			Corrente contaNatan = new Corrente();
			contaNatan.setCliente(natan);
			contaNatan.setAgencia("1324-5");
			contaNatan.setNumero("123-2");
			contaNatan.setLimite(1000f);
			contaNatan.setSaldo(2000f);
			

			Cliente jackson = new Cliente("Jackson", "123.456.789-13", 43);
			Corrente contaJackson = new Corrente();
			contaJackson.setCliente(jackson);
			contaJackson.setAgencia("1324-6");
			contaJackson.setNumero("123-5");
			contaJackson.setLimite(1000f);
			contaJackson.setSaldo(3000f);
			
			
			// contaNatan.deposita(600f);
			// contaJackson.saca(500f);
			
			contaJackson.trasnfere(3200, contaNatan);
			// contaNatan.trasnfere (200f, contaJackson);
			
			System.out.println(contaNatan);
			System.out.println(contaJackson);
			
		}
}
