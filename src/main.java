import java.util.Scanner;
public class main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int opcion=0;
		  int opcion2=0;//Inicializamos la variable a 0.
		  Scanner entrada = new Scanner(System.in);
		  cuentaBancaria cuenta = new cuentaBancaria();
		  
          do {
             System.out.println("1.-Crear cuenta");
             System.out.println("2.-Ingresar dinero");
             System.out.println("3.-Sacar dinero");
             System.out.println("4.-Mostrar datos cuenta");
             System.out.println("5.-Salir");
             System.out.println("Introduzca el numero de la opcion");
             opcion = entrada.nextInt();
             
             switch(opcion) {
             case 1: 
            	 cuenta.crearCuenta();
                 opcion2=1;
            	 break;
             case 2: 
            	 if (opcion2==1)
            	 {
            		 cuenta.ingresarSaldo();
            	 }
            	 else
            	 {
            		 System.out.println("¡Atencion! Debe crear una cuenta primero. \n");
            		 
            	 }
            	 break;
             case 3: 
            	 if (opcion2==1)
            	 {
                	 cuenta.sacarDinero(); 
            	 }
            	 else
            	 {
            		 System.out.println("¡Atencion! Debe crear una cuenta primero. \n");
            		 
            	 }
            	 break;
             case 4: 
            	 if (opcion2==1)
            	 {
            		 cuenta.MostrarCuenta ();
            	 }
            	 
            	 else
            	 {
            		 System.out.println("¡Atencion! Debe crear una cuenta primero. \n");
            		 
            	 }
            	 break;
             default: 
                 
                 break;
             }
             
             } while(opcion!=0 && opcion<5);//Condición para seleccionar una opción del menú.
          System.out.println("Gracias por utilizar la aplicación");
                 
	} 

}
