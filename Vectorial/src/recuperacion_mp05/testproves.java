package recuperacion_mp05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


/**
 * Practica de recuperacion MP05 UF1 UF2
 * @author Sergio
 *
 */
class testproves {
vectorial vectorial=new vectorial();
	
	int v1[]= {5,5,5};
	int v2[]= {2,2,2};
	int v3[]= {1,1,1};
	int v4[]= {1,2,3};
	int v5[]= {1,1,1,1};
	
	@Test
	public  void sumatorio() {
		vectorial.sumatorio(v2, v1);
		int [] resultado=vectorial.getResultat();
		int esperado1[]= {7,7,7};
		assertArrayEquals(esperado1,resultado);
		
		
		vectorial.sumatorio(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultat();
		int esperado2[]= {8,8,8};
		assertArrayEquals(esperado2,resultado2);
	}
	
	@Test
	public void testResta() {
		vectorial.resta(v1, v2);
		int resultado1[]=vectorial.getResultat();
		int esperado1[]= {3,3,3};
		assertArrayEquals(esperado1,resultado1);
		
		vectorial.resta(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultat();
		int esperado2[]= {2,2,2};
		assertArrayEquals(esperado2,resultado2);
	}
	
	@Test
	public void testMultiplicacion() {
		vectorial.multiplicacion(v1, v2);
		int resultado1[]=vectorial.getResultat();
		int esperado1[]= {10,10,10};
		assertArrayEquals(esperado1,resultado1);
		
		vectorial.multiplicacion(v1, v2 ,v3);
		int resultado2[]=vectorial.getResultat();
		int esperado2[]= {10,10,10};
		assertArrayEquals(esperado2,resultado2);
	}
	
	@Test
	public void TestInversion() {
		vectorial.inversion( v4);
		int resultado1[]=vectorial.getResultat();
		int esperado1[]= {3,2,1};
		assertArrayEquals(esperado1,resultado1);
	}
	
	@Test
	public void TestResultat() {
		
		int resultado1=vectorial.resultado( v4);
		int esperado1=6;
		assertEquals(esperado1,resultado1);
	}
	
	@Test
	public void testErrorSuma() {
		vectorial.sumatorio(v1, v2);
		int resultado1[]=vectorial.getResultat();
			int error[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
		vectorial.sumatorio(v1, v2,v3);
		int resultado2[]=vectorial.getResultat();
			int error2[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
	
	}
	
	@Test
	public void testErrorResta() {
		vectorial.resta(v1, v2);
		int resultado1[]=vectorial.getResultat();
			int error[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
		vectorial.resta(v1, v2,v3);
		int resultado2[]=vectorial.getResultat();
			int error2[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
	}
	
	@Test
	public void testErrorMultiplicacion() {
		vectorial.multiplicacion(v1, v2);
		int resultado1[]=vectorial.getResultat();
			int error[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
		vectorial.multiplicacion(v1, v2,v3);
		int resultado2[]=vectorial.getResultat();
			int error2[]= {7,7,7,7};
			assertArrayEquals(error,resultado1);
	}
	
}
	
