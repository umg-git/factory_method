package packagebebidas;

public class main {

	public static void main(String[] args) 
	{
		Bebida oBebida = Creador.creador(Creador.gaseosa);
		System.out.println(oBebida.cuantoMeRefresca());
	}

}
