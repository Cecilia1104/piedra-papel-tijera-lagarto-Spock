package edu.tallerweb.pptls;

public class Mano {

	private Forma forma;

	public Mano(final Forma forma) {
		this.forma = forma;
	}

	public Resultado jugarCon(final Mano otra) {
	 if (this.forma == otra.forma)
	 {
      return Resultado.EMPATA;
	 }
	 else
	   if (this.forma == Forma.SPOCK && (otra.forma == Forma.TIJERA || otra.forma == Forma.PIEDRA))
	    {
		   return Resultado.GANA;
	    }
	   else
		 if (this.forma == Forma.PIEDRA && (otra.forma == Forma.TIJERA || otra.forma == Forma.LAGARTO))
		  {
			 return Resultado.GANA;
		  }
		 else
		   if (this.forma == Forma.LAGARTO && (otra.forma == Forma.SPOCK || otra.forma == Forma.PAPEL))
		    {
			   return Resultado.GANA;
		    }
		   else
		     if (this.forma == Forma.PAPEL && (otra.forma == Forma.PIEDRA || otra.forma == Forma.SPOCK))
			  {
		    	 return Resultado.GANA;
			  }
			 else
			   if (this.forma == Forma.TIJERA && (otra.forma == Forma.PAPEL || otra.forma == Forma.LAGARTO))
				{
				   return Resultado.GANA;
				}
			   else
			   {
				 return Resultado.PIERDE;
			   }
      }
}
