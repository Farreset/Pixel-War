import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Scanner;

public class Guardar {

	private static final String USER = "DAW1_49380219R";
	private static final String PWD = "A49380219R";
	private static final String URL = "jdbc:oracle:thin:@oracle.ilerna.com:1521:xe";

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = makeConnection();
		Scanner scanner = new Scanner(System.in);
		int eleccion;

		do {
			System.out.println("Elige una de las siguientes opciones:");
			System.out.println("1-Ver todos los registros");
			System.out.println("2-Hacer un insert");
			System.out.println("0-Salir");
			eleccion = scanner.nextInt();

			switch (eleccion) {
			//case 1:
			//selectWithStatement(con);
			//break;
			//case 2:
			//createStatement(con, scanner);
			//break;
			case 0:
				System.out.println("Hasta luego");
				con.close();
				break;
			default:
				System.out.println("Eleccion no válida");
				break;
			}

		} while (eleccion != 0);

		scanner.close();
	}

	public static Connection makeConnection() {

		System.out.println("Connecting database...");

		Connection con = null;
		// intentamos la conexion a la base de datos
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(URL, USER, PWD);
			System.out.println("Database connected!");

		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database! ", e);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// devolvemos el valor de la conexion
		return con;
	}

	public static void createStatement(Connection con, Scanner scanner) {

		scanner.nextLine();

		//Creamos las variables, que seran los apartados de la tabla
		String nombre = "nombre";
		String tipo = "tipo";
		int vida = 5;
		int misiles = 6;

		if(tipo.equals("Stickman")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Link")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Link")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Sonic")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Ratchet & Clank")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Donkey Kong")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Clank")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Mario")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Pikachu")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}
		if(tipo.equals("Sub-Zero")) {
			System.out.println("Nombre:"+ nombre +"Tipo:"+ tipo +"Vidas:"+ vida +"Misiles:"+ misiles);
		}

		//Indicamos donde queremos hacer el insert con el nombre de la tabla
		String sql = "INSERT INTO PERSONAJES VALUES (nombre, tipo, vida, misiles)";

		Statement st = null;

		try {
			st = con.createStatement();

			st.execute(sql);

			st.close();

		} catch (SQLException e) {
			System.out.println("problemas en el INSERT " + e);

		}

	}


}