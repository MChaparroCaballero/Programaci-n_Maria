package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Ejer03ObtencionJugadores {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// que nos pida un club y que busque todos los nombres de ese club//
		/*
		 * String linea=
		 * "full_name,age,birthday,birthday_GMT,league,season,position,Club,minutes_played_overall,minutes_played_home,minutes_played_away,nationality,appearances_overall,appearances_home,appearances_away,goals_overall,goals_home,goals_away,assists_overall,assists_home,assists_away,penalty_goals,penalty_misses,clean_sheets_overall,clean_sheets_home,clean_sheets_away,conceded_overall,conceded_home,conceded_away,yellow_cards_overall,red_cards_overall,goals_involved_per_90_overall,assists_per_90_overall,goals_per_90_overall,goals_per_90_home,goals_per_90_away,min_per_goal_overall,conceded_per_90_overall,min_per_conceded_overall,min_per_match,min_per_card_overall,min_per_assist_overall,cards_per_90_overall,rank_in_league_top_attackers,rank_in_league_top_midfielders,rank_in_league_top_defenders,rank_in_club_top_scorer";
		 */

		String linea, campos[];
		String fichero = "C:\\FICHEROS\\jugadores.csv";

		System.out.print("Nombre Del club");
		String club = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(fichero));) {
			linea = br.readLine();
			while (linea != null) {
				/*
				 * Si tedas cuenta la primera linea del documentos son los campos, y el del club
				 * es el numero 7 nosotros al dividir por comas hara que en el array de campos
				 * el club sea lo que haya en la posicion 7 y luego simplemente comparamos que
				 * en la posicion 7 sea igual a lo que hemos introducido por escanner si es
				 * correcto te imprime la linea y porque esto no da error despues de todo
				 * estamos comprandando a campo no a linea, PUES PORQUE TODO EL CONTENIDO DEL
				 * CAMPO ES LINEA ASIQUE CON QUE DE IGUAL NOS LA IMRPIME PORQUE ES LO MISMO EN
				 * LOS DOS Y COMO VA LINEA A LINEA TE EL CICLO ES ENTRA EN EL ARCHIVO MIRA LEELE
				 * LA LINEA ENTRA AL WHILE ENTRA AL IF I COMPARA SI ES ESE CLUB TE IMPRIME LA
				 * LINEA ENTERA (PONIENDO linea en el print) try (BufferedReader br = new
				 * BufferedReader(new FileReader(fichero));) { linea = br.readLine(); while
				 * (linea != null) { campos = linea.split(","); if
				 * (campos[7].equalsIgnoreCase(club)) System.out.println(linea); linea =
				 * br.readLine(); }
				 * 
				 * 
				 * SALE DEL IF LEE LA SIGUIENTE LINEA Y EMPIEZA EL BUCLE DE NUEVO pero si
				 * quieres que te imprima ciertos campos solo debes cambiar que campos imprimir en el print:
				 */
				campos = linea.split(",");
				if (campos[7].equalsIgnoreCase(club))
					System.out.println(campos[0]+" "+campos[6]+" "+campos[7]);
				linea = br.readLine();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
