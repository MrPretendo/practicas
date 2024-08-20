package logica;

public class GestionNotas {
	
	private double[] notas;
	private int total;
	
	public GestionNotas() {
		notas = new double[10];
		total = 0;
	}
	//Métodos
		public boolean agregarNota(double d) {
			//Si hay espacio, la agrega y si no, devuelve
			if(total<10) {
				notas[total]=d;
				total++;
				return true;
			}else {
				return false;
			}
		}
		public double media(){
			double m = 0;
			for(int i = 0 ; i<total ; i++) {
				m += notas[i];
			}
			return m/total;
			
		}
		public int aprobados() {
			int ap = 0;
			//Un recorrido del array desde la posición 0 hasta
			//donde indique la lógica de "total"
			for(int i = 0 ; i < total ; i++) {
				if(notas[i]>=5) {
					ap++;
				}
			}
			return  ap;
		}
}