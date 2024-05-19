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
import CLASES.Generales;

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
		String cadena = "CREATE TABLE ARTICULOS(" + "ID INT NOT NULL AUTO_INCREMENT," + "DESCRIPCION VARCHAR(500),"
				+ "PRECIO_DE_COMPRA DECIMAL(10,2)," + "PRECIO_DE_VENTA DECIMAL(10,2)," + "STOCK INT CHECK(STOCK>=0),"
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

	public static void InsertarTablaArrayList() {
		int row = 0;
		ArrayList<Articulo> lista = new ArrayList<Articulo>();
		lista.add(new Articulo(1, "fruta", 10, 15, 30));
		lista.add(new Articulo(2, "especias", 15, 20, 50));
		lista.add(new Articulo(3, "limpieza", 20, 25, 100));
		String cadena = "INSERT INTO ARTICULOS(DESCRIPCION,PRECIO_DE_COMPRA,PRECIO_DE_VENTA,STOCK) VALUES(?,?,?,?)";
		// las interrogantes simbolizan cada una un campo//
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {

			for (Articulo a : lista) {

				// para cada resgristro de aqui tenemos que cojer los datos relativa del l y
				// remplazarlos en la sentencia//
				sentencia.setString(1, a.getDESCRIPCION());// asigna a la primera interrogante//
				sentencia.setDouble(2, a.getPRECIO_DE_COMPRA());// asigna a la segunda interrogante//
				sentencia.setDouble(3, a.getPRECIO_DE_VENTA());// asigna a la tercera interrogante//
				sentencia.setInt(4, a.getSTOCK());// asigna a la cuarta interrogante//

				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
			}
			System.out.println("Insertados " + row + " registros.");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void listado() {

		String cadena = "SELECT * FROM ARTICULOS";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {

			ResultSet r1 = sentencia.executeQuery();// EL REGISTRO//

			// MIENTRAS HALLA SIGUIENTE NOS IMRPIME EL REGISTRO//
			while (r1.next()) {
				System.out.printf("ID=%4d DESCRIPCION=%50s PRECIO_DE_COMPRA=%10.2f PRECIO_DE_VENTA=%10.2f STOCK=%5d\n",
						r1.getInt("ID"), r1.getString("DESCRIPCION"), r1.getDouble("PRECIO_DE_COMPRA"),
						r1.getDouble("PRECIO_DE_VENTA"), r1.getInt("STOCK"));
				// eso es para obtener los datos alamcenados en las clases que representan cada
				// uno un registro//

			}
			// para los formatos el print f enteros es d, string s, los decimales es .2f y
			// la \n final es que le indicamos que nos salte de linea)//
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void alta() {

		// las variables de campos que cabiamos, como tenemos autoincementane la de id
		// es opcional lo unico que cambiaria es que quitas una interrogante//
		int stock;
		String descripcion;
		double Preciocompra, Precioventa;
		/********************************************/
		// System.out.print("Dime el codigo / id");ID=Integer.valueOf(sc.nextLine());//
		System.out.print("Dime la descripcion");
		descripcion = sc.nextLine();
		System.out.print("Dime el precio compra");
		Preciocompra = Double.valueOf(sc.nextLine());
		System.out.print("Dime el precio venta");
		Precioventa = Double.valueOf(sc.nextLine());
		System.out.print("Dime el stock");
		stock = Integer.valueOf(sc.nextLine());

		/********************************************/
		String cadena = "INSERT INTO ARTICULOS(DESCRIPCION,PRECIO_DE_COMPRA,PRECIO_DE_VENTA,STOCK) VALUES(?,?,?,?)";
		// siempre que no actualizamos todos los interrogantes poenmos los
		// interrogante//
		// si es actualizar lo ponemos asi//
		int row = 0;
		// las interrogantes simbolizan cada una un campo//
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {

			// para cada resgristro de aqui tenemos que cojer los datos relativa del l y
			// remplazarlos en la sentencia//
			sentencia.setString(1, descripcion);// asigna a la primera interrogante//
			sentencia.setDouble(2, Preciocompra);// asigna a la segunda interrogante//
			sentencia.setDouble(3, Precioventa);// asigna a la tercera interrogante//
			sentencia.setInt(4, stock);// asigna a la cuarta interrogante//

			row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
			System.out.println("El numero de registros insertados es " + row);

		} catch (SQLException f) {
			System.out.println(f.getMessage());
		} catch (Exception z) {
			System.out.println(z.getMessage());
		}
	}

	public static void baja() {

		// las variables de campos que cabiamos, como tenemos autoincementane la de id
		// es opcional lo unico que cambiaria es que quitas una interrogante//
		int stock;
		String descripcion;
		double Preciocompra, Precioventa;
		/********************************************/
		System.out.print("cual quieres eliminar que tiene que campo");
		String campo = (sc.nextLine()).toUpperCase();
		System.out.print("con que valor");

		if (campo == "ID") {
			int valor = Integer.valueOf(sc.nextLine());
			String cadena = "DELETE FROM ARTICULOS WHERE" + campo + "=" + valor;
			// siempre que no actualizamos todos los interrogantes poenmos los
			// interrogante//
			// si es actualizar lo ponemos asi//
			int row = 0;
			// las interrogantes simbolizan cada una un campo//
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
					PreparedStatement sentencia = con.prepareStatement(cadena);) {
				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
				System.out.println("El numero de registros eliminados es " + row);

			} catch (SQLException f) {
				System.out.println(f.getMessage());
			} catch (Exception z) {
				System.out.println(z.getMessage());
			}
		} else if (campo == "DESCRIPCION") {
			String valor = sc.nextLine();
			String cadena = "DELETE FROM ARTICULOS WHERE" + campo + "=" + valor;
			// siempre que no actualizamos todos los interrogantes poenmos los
			// interrogante//
			// si es actualizar lo ponemos asi//
			int row = 0;
			// las interrogantes simbolizan cada una un campo//
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
					PreparedStatement sentencia = con.prepareStatement(cadena);) {
				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
				System.out.println("El numero de registros eliminados es " + row);

			} catch (SQLException f) {
				System.out.println(f.getMessage());
			} catch (Exception z) {
				System.out.println(z.getMessage());
			}
		} else if (campo == "PRECIO_DE_COMPRA") {
			double valor = Double.valueOf(sc.nextLine());
			String cadena = "DELETE FROM ARTICULOS WHERE" + campo + "=" + valor;
			// siempre que no actualizamos todos los interrogantes poenmos los
			// interrogante//
			// si es actualizar lo ponemos asi//
			int row = 0;
			// las interrogantes simbolizan cada una un campo//
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
					PreparedStatement sentencia = con.prepareStatement(cadena);) {
				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
				System.out.println("El numero de registros eliminados es " + row);

			} catch (SQLException f) {
				System.out.println(f.getMessage());
			} catch (Exception z) {
				System.out.println(z.getMessage());
			}
		} else if (campo == "PRECIO_DE_VENTA") {
			double valor = Double.valueOf(sc.nextLine());
			String cadena = "DELETE FROM ARTICULOS WHERE" + campo + "=" + valor;
			// siempre que no actualizamos todos los interrogantes poenmos los
			// interrogante//
			// si es actualizar lo ponemos asi//
			int row = 0;
			// las interrogantes simbolizan cada una un campo//
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
					PreparedStatement sentencia = con.prepareStatement(cadena);) {
				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
				System.out.println("El numero de registros eliminados es " + row);

			} catch (SQLException f) {
				System.out.println(f.getMessage());
			} catch (Exception z) {
				System.out.println(z.getMessage());
			}
		} else if (campo == "STOCK") {
			int valor = Integer.valueOf(sc.nextLine());
			String cadena = "DELETE FROM ARTICULOS WHERE" + campo + "=" + valor;
			// siempre que no actualizamos todos los interrogantes poenmos los
			// interrogante//
			// si es actualizar lo ponemos asi//
			int row = 0;
			// las interrogantes simbolizan cada una un campo//
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/GESTISIMAL", "root", "ROOT");
					PreparedStatement sentencia = con.prepareStatement(cadena);) {
				row += sentencia.executeUpdate();// nos da el numero de filas actualizadas,//
				System.out.println("El numero de registros eliminados es " + row);

			} catch (SQLException f) {
				System.out.println(f.getMessage());
			} catch (Exception z) {
				System.out.println(z.getMessage());
			}
		} else {
			System.out.print("error");
		}

		/********************************************/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CrearBBDD();//
		// CrearTB();//
		// InsertarTablaArrayList();//

		int op;
		String[] opciones = { "1.listar", "2.mostrar alta", "3.baja", "4.modificación", "5.Entrada de mercancía",
				"6.salida de mercancia", "7.salir" };
		do {
			op = Generales.menu(opciones, sc);
			switch (op) {
			case 1:
				listado();
				break;

			case 2:
				alta();
				break;

			case 3:
				baja();

			}
		} while (op != opciones.length);

	}

}
