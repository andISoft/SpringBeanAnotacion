package test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.assertEquals;
import concursantes.Concursante;
import concursantes.Malabarista;
import concursantes.Musico;

public class TestConcursoTalentos {
	/*
	 * private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	 * private Concursante malabarista1;
	 * 
	 * @Before public void before() { ApplicationContext ctx = new
	 * ClassPathXmlApplicationContext("applicationContext.xml"); malabarista1 =
	 * (Concursante) ctx.getBean("solei"); }
	 * 
	 * @Test public void testMalabarista() {
	 * logger.info("Inicio de ejecutar Malabarista"); int noPelotas = 10;
	 * malabarista1.ejecutar(); assertEquals(noPelotas, ((Malabarista)
	 * malabarista1).getPelotas()); logger.info("Fin de Ejecutar Malabarista");
	 * }
	 */

	private static Log logger = LogFactory.getLog("TestConcursoTalentos");
	private Concursante malabarista1,malabarista2,musico1,musico2;

	@Before
	public void before() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		malabarista1 = (Concursante) ctx.getBean("solei");
		malabarista2 = (Concursante) ctx.getBean("soleiRecitador");
		musico1 = (Concursante) ctx.getBean("jasonPiano");
		musico2 = (Concursante) ctx.getBean("jasonSaxofon");
		
	}

	@Test
	public void testMalabarista() {
		logger.info("Inicio de ejecutar Malabarista");
		int noPelotas = 10;
		malabarista1.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
		logger.info("Fin de Ejecutar Malabarista");
		System.out.println();
		logger.info("Inicio de ejecutar MalabaristaRecitador");
		noPelotas = 15;
		malabarista2.ejecutar();
		assertEquals(noPelotas, ((Malabarista) malabarista2).getPelotas());
		logger.info("Fin de Ejecutar MalabaristaRecitador");
		
		logger.info("Inicio de ejecutar Pianista");
		String cancion = "Noche de Paz";
		musico1.ejecutar();
		assertEquals(cancion, ((Musico)musico1).getCancion() );
		logger.info("Fin de Ejecutar Pianista");
		System.out.println();
		logger.info("Inicio de ejecutar Saxofonista");
		cancion = "Flor de la Canela";
		musico2.ejecutar();
		assertEquals(cancion, ((Musico)musico2).getCancion() );
		logger.info("Fin de Ejecutar Saxofonista");
		
		
	}
}