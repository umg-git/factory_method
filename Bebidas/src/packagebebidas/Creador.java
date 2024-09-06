package packagebebidas;

public class Creador {
	public final static int gaseosa = 1;
	public final static int jugo = 2;
	
	public static Bebida creador(int tipo) {
		
		switch(tipo)
		{
		case gaseosa:
			return new Gaseosa();
		case jugo:
			return new Jugo();
		default: return null;	
		
		}
	}
}
