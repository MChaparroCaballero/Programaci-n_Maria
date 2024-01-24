package ejercicios_POO_V_4;


	import java.util.Date;
	import java.util.GregorianCalendar;

	public class Empleado {

		private String nombre;
		private double sueldo;
		private Date fecha_contrato;

		public Empleado(String nom, double sue, int agno, int mes, int dia) {// constructor//
			nombre = nom;
			sueldo = sue;

			GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
			fecha_contrato = calendario.getTime();
		}

		public String dameNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double dameSueldo() {
			return sueldo;
		}

		public void setSueldo(double sueldo) {
			this.sueldo = sueldo;
		}

		public Date dameFechaContrato() {
			return fecha_contrato;
		}

		public void setFecha_contrato(Date fecha_contrato) {
			this.fecha_contrato = fecha_contrato;
		}

	}

