package recuperacion_mp05;
import java.util.*;
import java.util.ArrayList;
import java.util.Vector;
/**
 *Practica de recuperacion MP05 UF1 UF2
 * @author Sergio
 *
 */
public class vectorial {

	int[] resultado_final;

	public static void main(String[] args) {
		int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] v2 = {1,1,1,1,1,1,1,1,1,1};
		int[] v3 = {1,1,1,1,1,1,1,1,1,1};
		int[] v4;
		vectorial    vectorial    = new vectorial   ();


	/*	vectorial.sumatorio(v1,v2);
		v4=vectorial.getResultat( );

		vectorial.sumatorio(v1,v2,v3);
		v4=vectorial.getResultat( );

		vectorial.resta(v1,v2);
		v4=vectorial.getResultat( );


		vectorial.resta(v1,v2,v3);
		v4=vectorial.getResultat( );

		vectorial.multiplicacion(v1,v2);
		v4=vectorial.getResultat( );

		vectorial.multiplicacion(v1,v2,v3);
		v4=vectorial.getResultat( );
		
		vectorial.inversion(v1);
		v4=vectorial.getResultat( );

		vectorial.resultado(v2);*/
		}
/**
 * Metodo que recibe como parametro 2 arrays de la misma longitud
 * las cuales son sumados e introducidos en un nuevo vector
 * @param vector1
 * @param vector2
 */
		public void sumatorio(int  vector1[] , int vector2[]) {
			int numero=0;
			try {
				int vueltas=2;
				ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

				if (vector1.length>vector2.length) {
					vueltas=vector1.length;
				}
				else {
					vueltas=vector2.length;
				}
				for (int i=0; i<vueltas;i++){
					arrayfinal.add(vector1[i]+vector2[i]);
				}

				numero=arrayfinal.size();
				int[] vfinal=new int[numero];
				for (int y=0;y<numero;y++) {
					vfinal[y]=arrayfinal.get(y);
				}
				resultado_final=vfinal;
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Longitud de los vectores diferendes.");
				throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
			}


		}

/**
 * Metodo que recibe como parametro 3 arrays de la misma longitud
 * las cuales son sumados e introducidos en un nuevo vector
 * @param vector1
 * @param vector2
 * @param vector3
 */
		public void sumatorio(int  vector1[] , int vector2[], int vector3[]) {
			int numero=0;
			try{
				int vueltas=2;
				ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

				if(vector1.length>vector2.length && vector1.length>vector3.length) {
					vueltas=vector1.length;
				}
				else if(vector2.length>vector1.length && vector2.length>vector3.length){
					vueltas=vector2.length;
				}
				else {
					vueltas=vector3.length;
				}


				for (int i=0; i<vueltas;i++){
					arrayfinal.add(vector1[i]+vector2[i]+vector3[i]);
				}


				numero=arrayfinal.size();
				int[] vfinal=new int[numero];
				for (int y=0;y<numero;y++) {
					vfinal[y]=arrayfinal.get(y);
				}
				resultado_final=vfinal;
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Longitud de los vectores diferendes.");
				throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
			}

		}
		/**
		 * Metodo que recibe como parametro 2 arrays de la misma longitud
		 * las cuales son restados e introducidos en un nuevo vector
		 * @param vector1
		 * @param vector2
		 */

		public void resta(int  vector1[] , int vector2[]) {
			int numero=0;
			try{
				int vueltas=2;
				ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

				if (vector1.length>vector2.length) {
					vueltas=vector1.length;
				}
				else {
					vueltas=vector2.length;
				}
				for (int i=0; i<vueltas;i++){
					arrayfinal.add(vector1[i]-vector2[i]);
				}

				numero=arrayfinal.size();
				int[] vfinal=new int[numero];
				for (int y=0;y<numero;y++) {
					vfinal[y]=arrayfinal.get(y);
				}
				resultado_final=vfinal;
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Longitud de los vectores diferendes.");
				throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
			}

			}

/**
 * Metodo que recibe como parametro 3 arrays de la misma longitud
 * las cuales son restados e introducidos en un nuevo vector
 * @param vector1
 * @param vector2
 * @param vector3
 */
			public void resta(int  vector1[] , int vector2[], int vector3[]) {
				int numero=0;
				try{
					int vueltas=2;
					ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

					if(vector1.length>vector2.length && vector1.length>vector3.length) {
						vueltas=vector1.length;
					}
					else if(vector2.length>vector1.length && vector2.length>vector3.length){
						vueltas=vector2.length;
					}
					else {
						vueltas=vector3.length;
					}


					for (int i=0; i<vueltas;i++){
						arrayfinal.add(vector1[i]-vector2[i]-vector3[i]);
					}

					numero=arrayfinal.size();
					int[] vfinal=new int[numero];
					for (int y=0;y<numero;y++) {
						vfinal[y]=arrayfinal.get(y);
					}
					resultado_final=vfinal;
				}
				catch(ArrayIndexOutOfBoundsException ex){
					System.out.println("Longitud de los vectores diferendes.");
					throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
				}

			}

/**
 * Metodo que recibe como parametro 2 arrays de la misma longitud
 * las cuales son multiplicados e introducidos en un nuevo vector
 * @param vector1
 * @param vector2
 */
			public void multiplicacion(int  vector1[] , int vector2[]) {
				int numero=0;
				try{
					int vueltas=2;
					ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

					if (vector1.length>vector2.length) {
						vueltas=vector1.length;
					}
					else {
						vueltas=vector2.length;
					}
					for (int i=0; i<vueltas;i++){
						arrayfinal.add(vector1[i]*vector2[i]);
					}

					numero=arrayfinal.size();
					int[] vfinal=new int[numero];
					for (int y=0;y<numero;y++) {
						vfinal[y]=arrayfinal.get(y);
					}
					resultado_final=vfinal;
				}
				catch(ArrayIndexOutOfBoundsException ex){
					System.out.println("Longitud de los vectores diferendes.");
					throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
				}

				}

/**
 * Metodo que recibe como parametro 2 arrays de la misma longitud
 * las cuales son multiplicados e introducidos en un nuevo vector
 * @param vector1
 * @param vector2
 * @param vector3
 */
				public void multiplicacion(int  vector1[] , int vector2[], int vector3[]) {
					int numero=0;
					try{
						int vueltas=2;
						ArrayList<Integer> arrayfinal = new ArrayList<Integer>();

						if(vector1.length>vector2.length && vector1.length>vector3.length) {
							vueltas=vector1.length;
						}
						else if(vector2.length>vector1.length && vector2.length>vector3.length){
							vueltas=vector2.length;
						}
						else {
							vueltas=vector3.length;
						}


						for (int i=0; i<vueltas;i++){
							arrayfinal.add(vector1[i]*vector2[i]*vector3[i]);
						}

						numero=arrayfinal.size();
						int[] vfinal=new int[numero];
						for (int y=0;y<numero;y++) {
							vfinal[y]=arrayfinal.get(y);
						}
						resultado_final=vfinal;
					}
					catch(ArrayIndexOutOfBoundsException ex){
						System.out.println("Longitud de los vectores diferendes.");
						throw new ArrayIndexOutOfBoundsException("Los vectores han de tener la misma longitud");
					}

				}

/**
 * Metodo que recibe un vector como parametro el cual es recorrido
 * para obtener sus valores pero en orden invertido
 * @param vector
 */
				public void inversion(int vector[]) {
					int numero=0;
					ArrayList<Integer> inversion = new ArrayList<Integer>();

					for (int i=vector.length-1;i>=0;i--) {
						inversion.add(vector[i]);
					}

					numero=inversion.size();
					int[] vfinal=new int[numero];
					for (int y=0;y<numero;y++) {
						vfinal[y]=inversion.get(y);
					}
					resultado_final=vfinal;
				}
/**
 * Metodo que recibe un vector como parametro el cual es recorrido
 * para obtener el valor de todos sus elementos sumados
 * @param vector
 * @return
 */

				public int resultado(int vector[]) {
					int valor=0;
					for (int i=0;i<vector.length;i++) {
						valor+=vector[i];
					}


					return valor;

				}
/**
 * Metodo que devuelve el valor resultante del ultimo metodo ejecutado
 * @return
 */
				public int[] getResultat() {
					return resultado_final;
				}

}
