package romanos;

public class Romanos {
	
		
		 public static void main (String[]args)

		  {

		    char romanos[] = new char[]{ 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		    int num[] = new int[]{ 1, 5, 10, 50, 100, 500, 1000 };
		    String numeral = "MMMDCCCLXXXVIII";
		    int inverte[] = new int[numeral.length ()];
		    int x = 0;
		    
		    for (int i = numeral.length () - 1; i >= 0; i--)

		      {


		for (int j = 0; j < romanos.length; j++)

		  {


		    if (romanos[j] == numeral.charAt (i))

		      {

		inverte[x] = num[j];


		x++;


		      }

		  }



		      }

		    int resultado=inverte[0];

		    for (int i = 0; i < inverte.length; i++)

		      {

		    

		        if (i + 1 < inverte.length && inverte[i + 1] < inverte[i])

		         {

		        resultado = resultado - inverte[i + 1];

		         }

		        else if (i + 1 < inverte.length && inverte[i + 1] >= inverte[i])

		         {

		        resultado = resultado + inverte[i + 1];

		        }

		      }

		System.out.print (resultado);

		  }

}
