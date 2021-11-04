package rondasAleatorias;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class JuegoNumerosAleatorios {

    public static void main(String[] args) {
        //declaracion y initialisation variables
        Random numeroAleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int opcion, jugador1, jugador2, sumaRonda, contadorJugador1 , contadorJugador2 ;

        do {
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Jugar con 5");
            System.out.println("2. Jugar con 6");
            System.out.println("3. salir");
            System.out.println("Elija una opción: ");
            opcion = sc.nextInt();
            contadorJugador1 = 0;contadorJugador2=0;
            switch (opcion) {
                case 1:
                     
                    for (int i = 1; i < 6; i++) {
                        System.out.println("------------------- Ronda "+i+" -----------------------");
                        jugador1 = numeroAleatorio.nextInt(5) + 1;
                        System.out.println("el jugador1 ha salido: " + jugador1 );
                        jugador2 = numeroAleatorio.nextInt(5) + 1;
                        System.out.println("el jugador2 ha salido: " + jugador2 );
                        sumaRonda = jugador1 + jugador2;
                        System.out.println("la suma es: " + sumaRonda);
   
                        if (sumaRonda < 7) {
                            System.out.println("el jugador1 gana");
                            contadorJugador1++;
                        } else if (sumaRonda > 7) {
                            System.out.println("el jugador 2 gana");
                            contadorJugador2++;
                        } else {
                            System.out.println("nadie gana este ronda");
                        }

                        if (contadorJugador1 >= 3) {
                            System.out.println("El juego termina en ronda " + i);
                            break;
                        } else if (contadorJugador2 >= 3) {
                            System.out.println("El juego termina en ronda " + i);
                            break;
                        }else if(i==5){
                            System.out.println("El juego termina en ronda " + i);
                        }
                                
                    }
                    System.out.println("----------------  END  -------------------");
                    if(contadorJugador1>contadorJugador2){
                        System.out.println("el jugador1 gana el juego con " + contadorJugador1 + " puntos contra el jugador2 con " + contadorJugador2 + " puntos");
                    }else if(contadorJugador2>contadorJugador1){
                        System.out.println("el jugador2 gana el juego con " + contadorJugador2 + " puntos contra el jugador1 con " + contadorJugador1 + " puntos");
                    }else{
                        System.out.println("Nadie gana el juego ");
                    }
                        
                    break;
                case 2:
                    
                    for (int i = 1; i < 6; i++) {
                        System.out.println("------------------- Ronda "+i+" -----------------------");
                        jugador1 = numeroAleatorio.nextInt(6) + 1;
                        System.out.println("el jugador1 ha salido: " + jugador1 );
                        jugador2 = numeroAleatorio.nextInt(6) + 1;
                        System.out.println("el jugador2 ha salido: " + jugador2 );
                        sumaRonda = jugador1 + jugador2;
                        System.out.println("la suma es: " + sumaRonda);
   
                        if (sumaRonda < 7) {
                            System.out.println("el jugador1 gana");
                            contadorJugador1++;
                        } else if (sumaRonda > 7) {
                            System.out.println("el jugador 2 gana");
                            contadorJugador2++;
                        } else {
                            System.out.println("nadie gana este ronda");
                        }

                        if (contadorJugador1 >= 3) {
                            System.out.println("El juego termina en ronda " + i);
                            break;
                        } else if (contadorJugador2 >= 3) {
                            System.out.println("El juego termina en ronda " + i);
                            break;
                        }else if(i==5){
                            System.out.println("El juego termina en ronda " + i);
                        }
                                
                    }
                    System.out.println("----------------  END  -------------------");
                    if(contadorJugador1>contadorJugador2){
                        System.out.println("el jugador1 gana el juego con " + contadorJugador1 + " puntos contra el jugador2 con " + contadorJugador2 + " puntos");
                    }else if(contadorJugador2>contadorJugador1){
                        System.out.println("el jugador2 gana el juego con " + contadorJugador2 + " puntos contra el jugador1 con " + contadorJugador1 + " puntos");
                    }else{
                        System.out.println("Nadie gana el juego ");
                    }
                        
                    break;
                case 3:
                    System.out.println("Finalizar");
                    break;
                default:
                    System.out.println("Introduce opcion valida");
            }

        } while (opcion != 3);

    }

}
