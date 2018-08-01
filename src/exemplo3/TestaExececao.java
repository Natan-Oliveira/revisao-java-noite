package exemplo3;

public class TestaExececao {

	public static void main(String[] args) {
		
		int x = 2;
		int y = 0;
		try {
			System.out.println(dividir(x, y));
		} catch (ErroExeption e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static int dividir(int a, int b ) throws ErroExeption {	
		if(b == 0) {
			throw new ErroExeption("Não pode dividir por ZERO");
		}
		return a / b;
	}

}
