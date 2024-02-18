package ejercicicios_POO_IX_abstract_4;

import javax.swing.JOptionPane;
import java.util.ArrayList;

import javax.swing.JOptionPane;
	public class PersistenciaArchivo extends Persistencia {
		// atributos//
		String datos;
		 

		public PersistenciaArchivo() {
			
		}

		@Override
		public void cargarDatos() {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Datos cargados desde archivo: " + datos.toString());
		}

		@Override
		public void guardarDatos(String dato) {
			// TODO Auto-generated method stub
			dato = JOptionPane.showInputDialog(null, "Dato" + dato +  "guardado en archivo: " + datos);
			datos = dato;
		}

		public String getDatos() {
			return datos;
		}

		public void setDatos(String datos) {
			this.datos = datos;
		}

		

		

	}

