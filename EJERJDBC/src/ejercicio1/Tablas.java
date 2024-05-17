package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import clases.Empleado;

public class Tablas {

	public static void CrearMonedero() {

		String cadena = "CREATE TABLE MONEDERO( " + "MONEDA DECIMAL(10,2), " + "CANTIDAD INT, " + "PRIMARY KEY(MONEDA) "
				+ ")";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();
			System.out.println("TABLA CREADA");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void InsertarMonedero() {

		int tb[] = { 5, 2, 1 }, row = 0;
		String cadena = "insert into monedero values(?,?)";

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {

			for (int i = -2; i <= 2; i++) { // Para que de 0.05, 0.02,0.01, se eleva a -2
				for (int j : tb) {
					sentencia.setDouble(1, Math.pow(10, i) * j);
					sentencia.setInt(2, 10);
					row += sentencia.executeUpdate();
				}
			}

			System.out.println("INSERTADOS " + row + " registros.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void BorrarMonedero(double li, double ls) {

		String cadena = String.format("DELETE FROM MONEDERO WHERE MONEDA BETWEEN %.2f AND %.2f", li, ls);
		System.out.println(cadena);
		cadena = cadena.replace(",", ".");// Para cambiar comas por puntos

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			int row = sentencia.executeUpdate();
			System.out.println("Numero de filas borradas " + row);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void BorrarMonedero2(double li, double ls) {

		String cadena = String.format("DELETE FROM MONEDERO WHERE MONEDA BETWEEN ? AND ?");
		System.out.println(cadena);
		cadena = cadena.replace(",", ".");// Para cambiar comas por puntos

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.setDouble(1, li);
			sentencia.setDouble(2, ls);
			int row = sentencia.executeUpdate();
			System.out.println("Numero de filas borradas " + row);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void ActualizarMonedero(double incremento) {

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

	public static void consulta() {

		String cadena = "SELECT * FROM MONEDERO";
		cadena = cadena.replace(",", ".");// Para cambiar comas por puntos

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			ResultSet resultado = sentencia.executeQuery();
			while (resultado.next()) {
				System.out.printf("MONEDA=%f  CANTIDAD=%d\n ", resultado.getDouble("MONEDA"),
						resultado.getInt("CANTIDAD"));

			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		// CrearBBDD();
		// CrearTabla();
		// Insertar();
		// InsertarArrayList();
		// CrearMonedero();
		// InsertarMonedero();
		// BorrarMonedero(5,100); //Los numeros son el intervalo CORREGIR!!!!!!
		// BorrarMonedero2(0.02,10);
		// ActualizarMonedero(100);
		//consulta();//
	}

}
