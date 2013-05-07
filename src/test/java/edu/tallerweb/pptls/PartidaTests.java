package edu.tallerweb.pptls;

import static org.junit.Assert.*;
import org.junit.Test;

public class PartidaTests {
 //Casos en donde el jugador 1 GANA
	
	@Test
	public void queSpockVaporizaPiedra() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Spock vaporiza piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
        }


	@Test
	public void queTijeraCortaPapel() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("la tijera corta al papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));
       }
	

	@Test
	public void quePapelCubrePiedra() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("el papel cubre a la piedra",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	

	@Test
	public void quePiedraAplastaLagarto() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("la piedra aplasta al lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queLagartoEnvenenaSpock() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Lagarto envenena a Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockDestrozaTijera() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Spock destroza a la tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}

	@Test
	public void queTijeraDecapitaLagarto() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("La tijera decapita al lagarto",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	

	@Test
	public void queLagartoComePapel() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("El lagarto se come al papel",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	

	@Test
	public void quePapelRefutaSpock() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("EL papel refuta a Spock",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
	

	@Test
	public void quePiedraAplastaTijera() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("La piedra aplasta a la tijera",
				Resultado.GANA, jugadorUno.jugarCon(jugadorDos));

	}
//Casos en donde EMPATA
	
	@Test
	public void quePiedraSeaIgual() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PIEDRA);

		assertEquals("Piedra con piedra",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	
    }
	
	@Test
	public void quePapelSeaIgual() {

		Mano jugadorUno = new Mano(Forma.PAPEL);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("Papel con papel",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
   }
	
	@Test
	public void queTijeraSeaIgual() {

		Mano jugadorUno = new Mano(Forma.TIJERA);
		Mano jugadorDos = new Mano(Forma.TIJERA);

		assertEquals("Tijera con tijera",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
   }
	
	@Test
	public void queLagartoSeaIgual() {

		Mano jugadorUno = new Mano(Forma.LAGARTO);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Lagarto con lagarto",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
	@Test
	public void queSpockSeaIgual() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("Spock con Spock",
				Resultado.EMPATA, jugadorUno.jugarCon(jugadorDos));
	}
	
//Algunos casos donde el jugador 1 PIERDE
	
	@Test
	public void quePiedraEsVaporizadaPorSpock() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.SPOCK);

		assertEquals("La piedra es vaporizada por Spock",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));
        }
	
	@Test
	public void quePiedraSeaCubiertaPorPapel() {

		Mano jugadorUno = new Mano(Forma.PIEDRA);
		Mano jugadorDos = new Mano(Forma.PAPEL);

		assertEquals("la piedra es cubierta por el papel",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
	@Test
	public void queSpockSeaEnvenenadoPorLagarto() {

		Mano jugadorUno = new Mano(Forma.SPOCK);
		Mano jugadorDos = new Mano(Forma.LAGARTO);

		assertEquals("Spock es envenenado por el Lagarto",
				Resultado.PIERDE, jugadorUno.jugarCon(jugadorDos));

	}
	
}

