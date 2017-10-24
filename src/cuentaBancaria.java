import java.util.Scanner;


public class cuentaBancaria {
	private float saldo;
	private String nombre;
	private float ingreso;
	private float extraer;
	private String DNI;
	private float limite=-50;
	private double movimientos[];
	private int cont=0;
	private int i=0;
	
	Scanner entrada = new Scanner(System.in);
	
	public cuentaBancaria(){
		
	}
	
	public void crearCuenta()
	{
		System.out.println("Introduzca el nombre \n");
   	 	nombre = entrada.nextLine();
   	 	System.out.println("Introduzca el DNI \n");
   	 	DNI = entrada.nextLine();
		this.nombre=nombre;
		this.DNI=DNI;
		this.saldo=0;
		movimientos=new double[5];
	
	}
	
	public void ingresarSaldo()
	{
		System.out.println("Introduzca la cantidad a ingresar \n");
   	 	ingreso = entrada.nextFloat();
		this.saldo=ingreso+this.saldo;
		if (cont >= 5)
		{
			for (i=0; i<cont-1; i++)
			{
				movimientos[i]=movimientos[i+1];
			}
			movimientos[cont-1]=ingreso;
		}
		else
		{
			movimientos[cont]=ingreso;
		}
		cont++;
		
	}
	
	public void sacarDinero()
	{
		System.out.println("Introduzca la cantidad a extraer \n");
   	 	extraer = entrada.nextFloat();
		if (this.saldo - extraer >= (this.limite))
		{
			this.saldo=this.saldo-extraer;	
			if (cont >=5)
			{
				for (i=0; i<4; i++)
				{
					movimientos[i]=movimientos[i+1];
				}
				movimientos[4]=-(extraer);
			}
			else
			{
				movimientos[cont]=-(extraer);
			}
				cont++;
				System.out.println("Recoja el dinero. Saldo actual: "+this.saldo+"\n");
		}
		else
		{
			System.out.println("Su saldo es insuficiente, no pude extraerse tal cantidad de dinero ");
		}	
	}
	
	public void MostrarCuenta ()
	{
		System.out.println("Su DNI es: "+this.DNI+"\n");
		System.out.println("Su Nombre es: "+this.nombre+"\n");
		System.out.println("Su Saldo es: "+this.saldo+"\n");
		for (i=0; i<5 && i<cont; i++)
			System.out.println(movimientos[i]);
		
	}
}
