package co.edu.poli.examen.view;


import java.util.*;

import co.edu.poli.examen.model.Disponibilidad;
import co.edu.poli.examen.model.Estudiante;
import co.edu.poli.examen.model.Horario;
import co.edu.poli.examen.model.Profesor;
import co.edu.poli.examen.model.Reserva;

/**
 * 
 */
public class Principal {

   
    public static void main(String [] arg) {
    	
    	
    	Disponibilidad dis = new Disponibilidad(true,false,true,true,true,true);
    	Estudiante estu = new Estudiante("juan","toro","H876N90");
    	Profesor Profe = new Profesor("Matematicas","Manuel","Montero","Matematico","GU7589H");
    	Horario hora = new Horario("9:00 am","10:30 am",Profe,dis);
    	Reserva re = new Reserva(estu,hora,"KY758K98");
    	
    	System.out.println(dis);
    	System.out.println(" ");
    	System.out.println(estu);
    	System.out.println(" ");
    	System.out.println(Profe);
    	System.out.println(" ");
    	System.out.println(hora);
    	System.out.println(" ");
    	System.out.println(re);
    	System.out.println(" ");
    	System.out.println(" ");
    	
    	Scanner scanner = new Scanner(System.in);
       System.out.println("Bienvenido a la plataforma de tutorias \n Escoge una opcion \n 1. Estudiante \n 2. Tutor \n 3. Registro ");
     
	int n = scanner.nextInt();
		
		do {
			switch(n){
			case 1:

				System.out.println("\n Escriba tu nombre");
				int s = scanner.nextInt();
				
				System.out.println("\n Escriba tu id");
				int i = scanner.nextInt();
				
				break;
				
			case 2:
				
				System.out.println("\n Escriba tu nombre");
				int o = scanner.nextInt();
				
				System.out.println("\n Escriba tu id");
				int p = scanner.nextInt();
				
				break;
			case 3:
				System.out.println("Deseas registrarte escoge una opcion: \n 1.Estudiante \n Tutor  ");
				int f = scanner.nextInt();
				if (f == 1) {
				System.out.println("Escribe tu nombre:");
				//String n1 = scanner.findInLine(n1);
				System.out.println("Escribe tu id:");
				int T = scanner.nextInt();
				
				ArrayList <String> nomestuden = new ArrayList <>();
				ArrayList <Integer> idestuden = new ArrayList <>();
				
				for (String h :nomestuden );
				
				
					}else if (f == 2) {
						System.out.println("Escribe tu nombre:");
					//	String n2 = scanner.findInLine(n2);
						System.out.println("Escribe tu id:");
						int T = scanner.nextInt();
						
						ArrayList <String> nomestuden = new ArrayList <>();
						ArrayList <Integer> idestuden = new ArrayList <>();
						
						for (String u :nomestuden );
					
				}else {
					System.out.println("Elije una opcion valida");
					break;
				}
				break;
			
				
			
			}
			System.out.println("Que quieres hacer con los robots: \n1. Crear un nuevo robot y agregarlo al arreglo\n2. Buscar un robot\n3. Actualizar un robot\n4. Eliminar un robot\n5. Agregar el arreglo al archivo\n6. Buscar un arreglo en el archivo\n7. Salir");
			n = scanner.nextInt();
			}while (n != 3);
		scanner.close();
		}
		
       
       
       
       
    }
   
