package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import Clases.Alumno;

public class Ejer01 {
	
	public static void LeerFichero() {
		String fichero="c:\\empleados.csv";
		String linea,campos[];
		Alumno al=null;
		ArrayList<Alumno> lista=new ArrayList<Alumno>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(fichero));){
			
			linea=br.readLine();
			while(linea!=null) {
				campos=linea.split(",");
				try {
			      al=new Alumno(Integer.valueOf(campos[0]),campos[1],LocalDate.parse(campos[7]));
			      lista.add(al);	
				}catch(Exception e) {}
				linea=br.readLine();
			}
					}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//for(Alumno a:lista)System.out.println(a);
		InsertarTabla(lista);
		
	}
	
public static void InsertarTabla(ArrayList<Alumno> lista) {
		int row=0;
		String cadena="INSERT INTO ALUMNOS VALUES(?,?,?)";
		try(
			Connection con=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM","root","ROOT");	
			PreparedStatement sentencia=con.prepareStatement(cadena);
				){
		
			for(Alumno a:lista) {
			sentencia.setInt(1, a.getId());
			sentencia.setString(2, a.getNombre());
			sentencia.setTimestamp(3,Timestamp.valueOf(a.getFecha().atTime(0, 0)));			
			row +=sentencia.executeUpdate();
			}
			
			System.out.println("Insertados "+row+" registros.");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
	
	
  public static void InsertarTabla() {
		
		String cadena="INSERT INTO ALUMNOS(NOMBRE,FECHA_NAC) VALUES(?,?)";
		try(
			Connection con=
			DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM","root","ROOT");	
			PreparedStatement sentencia=con.prepareStatement(cadena);
				){
		
			sentencia.setString(1, "jose manuel");
			sentencia.setTimestamp(2, Timestamp.valueOf(LocalDate.of(1990, 1, 5).atTime(0, 0)));
			
			int row=sentencia.executeUpdate();
			
			System.out.println("Insertados "+row+" registros.");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static void CrearBBDD() {
		String cadena="CREATE SCHEMA IF NOT EXISTS CLASE2DAM";
		try(
	         Connection con=
	         DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","ROOT");	
			 PreparedStatement sentencia = con.prepareStatement(cadena);
		    ){
			
			sentencia.execute();
			System.out.println("BBDD CREADA");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void CrearTabla() {
		String cadena="CREATE TABLE ALUMNOS("
				+ "ID INT auto_increment,"
				+ "NOMBRE VARCHAR(40),"
				+ "FECHA_NAC DATE,"
				+ "PRIMARY KEY(ID))";
		try(
	         Connection con=
	         DriverManager.getConnection("jdbc:mysql://localhost:3306/CLASE2DAM","root","ROOT");	
			 PreparedStatement sentencia = con.prepareStatement(cadena);
		    ){
			
			sentencia.execute();
			System.out.println("TABLA CREADA");
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		//CrearBBDD(); 
		//CrearTabla();
		//InsertarTabla();//
		LeerFichero();
	}

}


