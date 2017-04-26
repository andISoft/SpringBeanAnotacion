package prueba;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import concursantes.Concursante;
import concursantes.Malabarista;
import concursantes.MalabaristaRecitador;
import concursantes.Musico;

public class PruebaConcursoTalentos {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Concursante malabarista1 = (Concursante) ctx.getBean("soleiRecitador");
		malabarista1.ejecutar();
		
		System.out.println("------ Otra Categoria X------");
		
		Concursante musico1 = (Musico) ctx.getBean("jasonPiano");
		musico1.ejecutar();
	}
	
}
