
import java.util.Scanner;
public class Examen4ejercicio {

	//EJercicios realizado con ayuda de las siguientes Fuentes:
		//https://github.com/IvethS/SegundaParte/blob/master/src/SegundaParteExamen.java
		
		//Este Programa Lo que hace es hacer varias preguntas al usuario, declaramos variables
		//que leen las respuestas, despues se coloca una variable como contador
		//esta sirve para sumar todos las respuestas correctas
		//despues calcula el porcentaje.
		//muestra todas las preguntas y respuestas correctas y en base a eso hace el calculo.
	
	public static void main(String[] args) {
		Scanner lea =new Scanner(System.in);
	      
        int puntos=0;
        
       System.out.print("Cuantos años gobierna un presidente en Honduras?" );
      
       int s1 = lea.nextInt();
      
                   
           if (s1==4){
		 puntos=+1;	
            System.out.print("Correcto\n");
        }
        else {
			System.out.print("Incorrecto La respuesta correcta era 4 años\n");
   }
           
           
           System.out.print("Cual es la capital de Honduras?" );
	       
	        String s2 = lea.next();
	       
	                    
	            if (s2.equals("Tegucigalpa")){
			 puntos=+1;	
	             System.out.print("Correcto\n");
	         }
	         else {
				System.out.print("Incorrecto La respuesta correcta era Tegucigalpa\n");
	    }
	            
	            System.out.print("En que año nacio Dionisio Herrera?" );
	 	       
		        int s3 = lea.nextInt();
		       
		                    
		            if (s3==1781){
				 puntos=+1;	
		             System.out.print("Correcto\n");
		         }
		         else {
					System.out.print("Incorrecto La respuesta correcta era 1781");
		    }
		            
		  System.out.print("En que año comenzo a gobernar Dionisio Herrera en Honduras?" );
		 	       
			    int s4 = lea.nextInt();
			       
			                    
			    if (s4==1824){
					 puntos=+1;	
			             System.out.print("Correcto\n");
			         }
			         else {
						System.out.print("Incorrecto La respuesta correcta era  1824\n");
			    }
			            
			            
			            System.out.print("Quien es el presidente actual de Honduras?" );
			 	       
				        String s5 = lea.next();
				       
				                    
				            if (s5.equals("Juan Orlando Hernández")){
						 puntos=+1;	
				             System.out.print("Correcto\n");
				         }
				         else {
							System.out.print("Incorrecto La respuesta correcta era Juan Orlando Hernández\n");
				    }
				            
  System.out.print("Total de Puntos Acumulados son: "+puntos+"\n\n");
  
  int total;            
  
  total=(puntos * 100 / 5);
 
        System.out.print("El porcentaje total es: "+total+"%\n");

	}

}
