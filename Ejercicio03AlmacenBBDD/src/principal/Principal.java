package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import CLASES.Articulo;

public class Principal {

	static Scanner sc = new Scanner(System.in);

	public static void CrearBBDD() {
		String cadena = "CREATE DATABASE IF NOT EXISTS GESTISIMAL";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();

			System.out.println("BASE DE DATOS CREADA");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void CrearTB() {
		String cadena = "CREATE TABLE ARTICULOS(" 
				+ "ID INT NOT NULL AUTO_INCREMENT," 
				+ "DESCRIPCION VARCHAR(500),"
				+ "PRECIO_DE_COMPRA DECIMAL(10,2)," 
				+ "PRECIO_DE_VENTA DECIMAL(10,2)," 
				+ "STOCK INT CHECK(STOCK>=0),"
				+ "PRIMARY KEY(ID)" + ")";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();

			System.out.println("CREADA LA TABLA");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void AÑADIRDATOS() {
		String cadena = "INSERT INTO ARTICULOS(DESCRIPCION,PRECIO_DE_COMPRA,PRECIO_DE_VENTA,STOCK) VALUES(?,?,?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.setString(1, "jose manuel");
			sentencia.setTimestamp(2, Timestamp.valueOf(LocalDate.of(1990, 1, 5).atTime(0, 0)));
			int row = sentencia.executeUpdate();

			System.out.println("Insertados " + row + " registros.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void InsertarTablaArrayList() {
		int row = 0;
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		lista.add(new Articulo(1, "fruta", 10, 15, 30));
		lista.add(new Articulo(2, "especias", 15, 20, 50));
		lista.add(new Articulo(3, "limpieza", 20, 25, 100));
		String cadena = "INSERT INTO ARTICULOS(DESCRIPCION,PRECIO_DE_COMPRA,PRECIO_DE_VENTA,STOCK) VALUES(?,?,?,?)";
		//las interrogantes simbolizan cada una un campo//
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {

			for (Articulo a : lista) {

				//para cada resgristro de aqui tenemos que cojer los datos relativa del l y remplazarlos en la sentencia//
				sentencia.setString(1, a.getDESCRIPCION());//asigna a la primera interrogante//
				sentencia.setDouble(2, a.getPRECIO_DE_COMPRA());//asigna a la segunda interrogante//
				sentencia.setDouble(3, a.getPRECIO_DE_VENTA());//asigna a la tercera interrogante//
				sentencia.setInt(4, a.getSTOCK());//asigna a la cuarta interrogante//

				row += sentencia.executeUpdate();//nos da el numero de filas actualizadas,//
			}
			System.out.println("Insertados " + row + " registros.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void consulta() {

		String cadena = "SELECT * FROM ARTICULOS";
		cadena = cadena.replace(",", ".");// Para cambiar comas por puntos

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				System.out.printf("ID=%5d\n DESCRIPCION=%5s\n PRECIO_DE_COMPRA=%5s\n PRECIO_DE_VENTA=%5s\n STOCK=%5d\n",
						resultado.getInt("ID"), resultado.getString("DESCRIPCION"),
						resultado.getDouble("PRECIO_DE_COMPRA"), resultado.getDouble("PRECIO_DE_VENTA"),
						resultado.getInt("STOCK"));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	
	
	public static void ActualizaTabla(double incremento) {

		String cadena = "UPDATE MONEDERO SET CANTIDAD=CANTIDAD + ?";
		cadena = cadena.replace(",", ".");// Para cambiar comas por puntos

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.setDouble(1, incremento);
			int row = sentencia.executeUpdate();
			System.out.println("Numero de filas actualizadas " + row);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CrearBBDD();//
		//CrearTB();//
		// InsertarTablaArrayList();//

		int op;
		String[] opciones = { "1.listar", "2.mostrar alta", "3.baja", "4.modificación", "5.Entrada de mercancía",
				"6.salida de mercancia", "7.salir" };
		do {
			op = CLASES.Generales.menu(opciones, sc);
			switch (op) {
			case 1:
				consulta();
				break;

			case 2:
				break;

			case 3:

				break;

			case 4:
				break;

			case 5:

				break;
			case 6:
				break;

			case 7:
				break;
			}
		} while (op != opciones.length);

	}

}
