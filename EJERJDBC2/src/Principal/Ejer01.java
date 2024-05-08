package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import clases.Alumno;


public class Ejer01 {
	// el empleado numero que va hacer como id nombre y fecha de ingreso sobre un csv//

	/*************************************************************************************************************************/
	public static void CrearBBDD() {
		String cadena = "CREATE DATABASE IF NOT EXISTS CLASE2DAM";

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

	/*************************************************************************************************************************/
	public static void CrearTB() {
		String cadena = "CREATE TABLE ALUMNOS(" + "ID INT NOT NULL AUTO_INCREMENT," + "NOMBRE VARCHAR(100),"
				+ "FECHA_NAC DATE," + "PRIMARY KEY(ID)" + ")";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.execute();

			System.out.println("CREADA LA TABLA");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/*************************************************************************************************************************/
	public static void AÑADIRDATOS() {
		String cadena = "INSERT INTO ALUMNOS(NOMBRE,FECHA_NAC) VALUES(?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			sentencia.setString(1,"jose manuel");
			sentencia.setTimestamp(2, Timestamp.valueOf(LocalDate.of(1990,1,5).atTime(0, 0)));
			int row = sentencia.executeUpdate();

			System.out.println("Insertados " + row + " registros.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	/*************************************************************************************************************************/
	public static void InsertarTablaArrayList() {
		int row=0;
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		lista.add(new Alumno("ana",LocalDate.of(2000, 10,10)));
		lista.add(new Alumno("juan",LocalDate.of(2020, 11,11)));
		String cadena = "INSERT INTO ALUMNOS(NOMBRE,FECHA_NAC) VALUES(?,?)";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM", "root", "ROOT");
				PreparedStatement sentencia = con.prepareStatement(cadena);) {
			
			for(Alumno a:lista) {
				
			
			sentencia.setString(1, a.getNOMBRE());
			sentencia.setTimestamp(2, Timestamp.valueOf(a.getFECHA_NAC().atTime(0,0)));
			
			row += sentencia.executeUpdate();
			}
			System.out.println("Insertados " + row + " registros.");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	/*********************************************************************************************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//CrearBBDD();//
		//CrearTB();//
		InsertarTablaArrayList();
	}

}
