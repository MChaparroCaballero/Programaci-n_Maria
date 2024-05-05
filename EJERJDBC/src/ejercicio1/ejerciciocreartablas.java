package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

import clases.Empleado;

public class ejerciciocreartablas {

	public static void CrearBBDD() {
		String cadena = "CREATE DATABASE IF NOT EXISTS CLASELINKIAFP";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();
			System.out.println("BASE DE DATOS CREADA");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void CrearTABLA() {
		String cadena = "CREATE TABLE EMPLEADOS( " + "ID INT NOT NULL AUTO_INCREMENT, "
				+ "NOMBRE VARCHAR(100) NOT NULL, " + "SALARIO DECIMAL(10,2) NOT NULL, " + "FECHA DATE NOT NULL, "
				+ "PRIMARY KEY(ID) " + ")";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "root");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();
			System.out.println("TABLA CREADA");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void InsertarTabla() {

		String cadena = "INSERT INTO EMPLEADOS(NOMBRE,SALARIO,FECHA) VALUES(?,?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "root");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.setString(1, "jose manuel");
			sentencia.setDouble(2, 5500);
			sentencia.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
			int row = sentencia.executeUpdate();

			System.out.println("Insertados " + row + " registros.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void InsertarTablaArrayList() {
		int row=0;
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		lista.add(new Empleado("ana",6666,LocalDateTime.of(2000, 10,10)));
		lista.add(new Empleado("juan",5666,LocalDateTime.of(2020, 11,11)));
		String cadena = "INSERT INTO EMPLEADOS(NOMBRE,SALARIO,FECHA) VALUES(?,?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASELINKIAFP", "root", "root");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			
			for(Empleado a:lista) {
				
			
			sentencia.setString(1, a.getNombre());
			sentencia.setDouble(2, a.getSalario());
			sentencia.setTimestamp(3, Timestamp.valueOf(a.getFecha().atTime(0,0)));
			
			row += sentencia.executeUpdate();
			}
			System.out.println("Insertados " + row + " registros.");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {
		// CrearBBDD();//
		//CrearTABLA();//
		//InsertarTabla();//
		InsertarTablaArrayList();
		
	}

}
