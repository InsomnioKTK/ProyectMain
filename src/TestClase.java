import org.junit.Assert;
import org.junit.Test;

public class TestClase {
	
	@Test
	public void prueba () {
		Ejemplo ejemplo = new Ejemplo();
		int respuesta = ejemplo.sumna(4, 2);
		int resultadoEsperado = 6;
		Assert.assertEquals(resultadoEsperado, resultadoEsperado);
			
	}
	
}
