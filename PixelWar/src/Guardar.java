import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Guardar {

	private static final String USER = "DAW1_49380219R";
	private static final String PWD = "A49380219R";
	private static final String URL = "jdbc:oracle:thin:@192.168.3.26:1521:xe";

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
			case 2:
				createStatement(con, scanner);
				break;
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
	/*static void guardarDatos(ArrayList <Equipo> EquiposCreados,String nombre,int ronda) throws SQLException, ClassNotFoundException {

int fecha = 0;
insertDatos_partida(nombre,ronda);

for (int i = 0; i < EquiposCreados.size();i++) {
nombre = EquiposCreados.get(i).getNombre();
Object tipo = EquiposCreados.get(i).getTipo();
Object vida = EquiposCreados.get(i).getVida();
int misiles = EquiposCreados.get(i).getMisiles();


insertPersonajes(fecha, nombre,tipo,vida,misiles);
}
}
	 */


	public static void createStatement(Connection con, Scanner scanner) {

		scanner.nextLine();


		String sql = "INSERT INTO DATOS(EQUIPO1) VALUES (equipo('g',3,4,'w',1,8,'2'))";

		Statement st = null;

		try {
			st = con.createStatement();

			st.execute(sql);

			st.close();

		} catch (SQLException e) {
			System.out.println("The INSERT had problems!! " + e);

		}

	}
	/*private static void insertPersonajes() throws SQLException {

String insertTabla = "INSERT INTO DATOS(EQUIPO) VALUES ('78',3,4,'a',9,8,'b')";
Connection con = null;
PreparedStatement insert = con.prepareStatement(insertTabla);



insert.executeUpdate();
}

	 */
	/*
private static void insertDatos_partida(String nombre, int ronda) throws SQLException {
try {
System.out.println("ASD");
String insertTabla = "INSERT INTO datos_partida (nombre,ronda) VALUES (?,?)";

Connection con = null;
PreparedStatement insert = con.prepareStatement(insertTabla);
insert.setString(1, nombre);
insert.setInt(2, ronda);
insert.executeUpdate();
} catch(Exception e) {
System.out.println(e);
}
}



static ArrayList<String> cargardatos_partida() throws SQLException, ClassNotFoundException {
ArrayList <String> datosCarga = new ArrayList<String>();
int codic = 0;
String nombre = "";
int ronda = 0;
String datos = "";
Connection con = null;
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM datos_partida ORDER BY fecha");

while(rs.next()) {
codic = rs.getInt("fecha");
nombre = rs.getString("nombre");
ronda = rs.getInt("ronda");
datos = (codic + " , " + nombre + " , " + ronda).toString();
datosCarga.add(datos);
}
return datosCarga;
}



static ArrayList<String> cargarPersonajes(int fecha) throws SQLException, ClassNotFoundException {
ArrayList <String> datosCarga = new ArrayList<String>();
int codic = 0;
String nombre = "";
int vida = 0;
String tipo = "";
int misiles = 0;
String datos = "";
Connection con = null;
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("SELECT * FROM Personajes WHERE fecha = '" + fecha + "' ORDER BY fecha");

while(rs.next()) {
codic = rs.getInt("fecha");
nombre = rs.getString("nombre");
tipo = rs.getString("tipo");
vida = rs.getInt("vida");
misiles = rs.getInt("misiles");
datos = (codic + "," + nombre + "," + tipo + "," + vida +  "," + misiles).toString();
datosCarga.add(datos);
}
return datosCarga;
}

	 */

}