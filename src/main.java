import java.util.Scanner;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class main extends FuncionesMongo {

	static MongoClient mongo = crearConexion();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("1- Comprar Vuelo");
		System.out.println("2- Cancelar Vuelo");
		System.out.println("3- Modificar Vuelo");
		//int num = 1;
		int num = sc.nextInt();
		if (num == 1) {
			verVuelos(mongo);
			System.out.println("Elija un vuelo:");
			String xd = sc.nextLine();
			String vuelo = sc.nextLine();
			
			System.out.println("Inserte sus datos: ");
			System.out.println("DNI del pasajero:");
			String dniPasajero = sc.nextLine();
			System.out.println("Nombre del pasajero:");
			String nombre = sc.nextLine();
			System.out.println("Apellido del pasajero:");
			String apellido = sc.nextLine();
			System.out.println("DNI del pagador:");
			String dniPagador = sc.nextLine();
			System.out.println("Tarjeta de credito:");
			String tarjeta = sc.nextLine();
			comprarVuelo(vuelo, dniPasajero, nombre, apellido, dniPagador, tarjeta);
		} else if (num == 2) {
			verVuelos(mongo);
			System.out.println("Elija un vuelo:");
			String vuelo = sc.nextLine();
			System.out.println("Inserte sus datos: ");
			System.out.println("DNI del pasajero:");
			String dniPasajero = sc.nextLine();
			System.out.println("Codigo de venta del pasajero");
			String codigoVenta = sc.nextLine();
			borrarVuelo(vuelo, dniPasajero, codigoVenta);
		} else if (num == 3) {
			verVuelos(mongo);
			System.out.println("Elija un vuelo:");
			String xd = sc.nextLine();
			String vuelo = sc.nextLine();
			System.out.println("Inserte sus datos: ");
			System.out.println("DNI del pasajero:");
			String dniPasajero = sc.nextLine();
			System.out.println("Codigo de venta del pasajero");
			String codigoVenta = sc.nextLine();
			modificarVuelo(vuelo, dniPasajero, codigoVenta);
		}

	}
}
