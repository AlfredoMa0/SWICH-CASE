/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class SWITCHCASE {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
    }
   public static void Ejercicio1() {  
System.out.println("-------------EJERCICIO 1 -----------");
        int Valor1;
        Scanner Leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO DEL 1 AL 5: ");
        Valor1 = Leer.nextInt();
        switch (Valor1) {
            case 1:System.out.println("LUNES DE TORTAS");break;
            case 2:System.out.println("MARTES DE TACOS");break;
            case 3:System.out.println("MIERCOLES DE FLAUTAS");break;
            case 4:System.out.println("JUEVES DE SOPES");break;   
            case 5:System.out.println("VIERNES DE MOYETES");break;
            default:
                System.out.println("NO ESTA EN EL MENU");
        }
   }
    public static void Ejercicio2(){
      System.out.println("-------------EJERCICIO 2----------");  
      System.out.println("INGRESA LO QUE HACES: "); 
      Scanner Ingresar = new Scanner(System.in);
      String nombres;
      nombres = Ingresar.next();        
      switch (nombres) {
      case "correr":System.out.println("ESTAS CORRIENDO");break;
      case "saltar":System.out.println("ESTAS SALTANDO");break;
      case "dormir":System.out.println("ESTAS DURMIENDO");break;
      case "comer":System.out.println("ESTAS COMIENDO");break;
      case "estudiar":System.out.println("ESTAS ESTUDIANDO");break;
     default: System.out.println("NO HACES NADA");
                }
   }
    public static void Ejercicio3(){
        System.out.println("-------------EJERCICIO 3------------");
        System.out.println("INGRESA UNA HORA APARTIR DE LAS 6 A.M: ");  
        Scanner Valor = new Scanner(System.in);
        int Horario;
        Horario = Valor.nextInt();
        switch (Horario) {
            case 6:System.out.println("Me despierto");break;
            case 7:System.out.println("Me quedo un rato acostado");break;
            case 8: System.out.println("Me levanto y acomodo mis cosas");break;
            case 9: System.out.println("Hago un pre-Desayuno");break;
            case 10:System.out.println("Asisto a la clase de Calculo Integral");break;
            case 11:System.out.println(" Me conecto a otra clase");break;
            case 12: System.out.println("Tengo Hora libre y descanso");break;
            case 13: System.out.println("Juego un rato video Juegos");break;
            case 14:System.out.println("La Hora de Almozar");break;
            case 15:System.out.println("Descanso");break;
            case 16: System.out.println("Voy hacer ejercicio");break;
            case 17: System.out.println("Me refresco para un baño");break;
            case 18:System.out.println("Me alisto para mi clase");break;
            case 19:System.out.println("Me conecto a la clase de LP");break;
            case 20: System.out.println("Tomo apuntes de la clase");break;
            case 21: System.out.println("Termina la clase y adelanto mi tarea");break;
             case 22:System.out.println("Hago mi cena y reposo un rato antes de dormir");break;
            case 23: System.out.println("Me acuesto y escucho musica");break;
            case 00: System.out.println("Y ME DUERMO");break;
            default:
                System.out.println("NO ESTA EN EL HORARIO");
        }       
    }
    public static void Ejercicio4(){
        System.out.println("--------EJERCICIO 4------------");
        System.out.println("INGRESA UN VALOR DEL 1 AL 7:");
        Scanner Mensaje = new Scanner(System.in);
        int rango;
        
        rango = Mensaje.nextInt();
        switch (rango) {
            case 1,2,3,4,5,6,7: 
                if ( rango==1) {
                    System.out.println("DOMINGO");
                    System.out.println("SEMANA INGLESA");
                }else if (rango==2) {
                     System.out.println("LUNES");
                    System.out.println("SEMANA LABORAL");
                } else if (rango==3) {
                    System.out.println("MARTES");
                    System.out.println("SEMANA LABORAL");
                }else if (rango==4) {
                    System.out.println("MIERCOLES");
                    System.out.println("SEMANA LABORAL");
                }else if (rango==5) {
                    System.out.println("JUEVES");
                    System.out.println("SEMANA LABORAL");
                }else if (rango==6) {
                    System.out.println("VIERNES");
                    System.out.println("SEMANA LABORAL");
                }else if (rango==7) {
                    System.out.println("SABADO");
                    System.out.println("SEMANA LABORAL");
                };break;
    
            default:
                System.out.println("DIA INCORRECTO");break;   
        }
        
    }
}
