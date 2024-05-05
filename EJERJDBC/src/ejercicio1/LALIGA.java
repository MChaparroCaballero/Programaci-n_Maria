package ejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import clases.Equipo;

public class LALIGA {

	public static void main(String[] args) {
		HashMap<Integer,Equipo> LFP= new HashMap<Integer,Equipo>();
		String cadena1 = "select * from equipos";
		String cadena2 = "select * from jornadas";
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LALIGA", "root", "root");
				PreparedStatement sentencia1 = con.prepareStatement(cadena1);
				PreparedStatement sentencia2 = con.prepareStatement(cadena1);) {
	ResultSet r1=sentencia1.executeQuery();
	while(r1.next()) {
		LFP.put(r1.getInt("IDEQUIPO"),new Equipo(r1.getInt("IDEQUIPO"),r1.getString("NOMBRE")));
		
	}
/***************************************************************/
	ResultSet r2 = sentencia2.executeQuery();
	Equipo eq1,eq2;
	while (r2.next()) {
		eq1=LFP.get(r2.getInt("IDLOCAL"));
		eq2=LFP.get(r2.getInt("IDVISITANTE"));
		
		if (r2.getInt("GOL_LOCAL")>r2.getInt("GOL_VISITANTE")) {
			eq1.setPG(eq1.getPG()+1);
			eq2.setPP(eq2.getPP()+1);
			eq1.setPtos(eq1.getPtos()+3);
		}else if(r2.getInt("GOL_LOCAL")<r2.getInt("GOL_VISITANTE")) {
			eq2.setPG(eq2.getPG()+1);
			eq1.setPP(eq1.getPP()+1);
			eq2.setPtos(eq2.getPtos()+3);
		}else {
			eq1.setPE(eq1.getPE()+1);
			eq2.setPE(eq2.getPE()+1);
			
			eq1.setPtos(eq1.getPtos()+1);
			eq2.setPtos(eq2.getPtos()+1);
		}
		eq1.setGF(eq1.getGF()+r2.getInt("GOL_LOCAL"));
		eq1.setGE(eq1.getGE()+r2.getInt("GOL_VISITANTE"));
		
		eq2.setGF(eq2.getGF()+r2.getInt("GOL_VISITANTE"));
		eq2.setGE(eq2.getGE()+r2.getInt("GOL_LOCAL"));
	}

		}catch(SQLException e) {
			System.out.print(e.getMessage());
		}catch(Exception e) {
			System.out.print(e.getMessage());
	}
		for(Integer key: LFP.keySet()) {
			System.out.println(LFP.get(key));
		}
}
}
