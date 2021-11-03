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
        int opcion, jugador1, jugador2,sumaRonda,contadorJugador1 = 0,contadorJugador2 = 0;

        do {
            System.out.println("Menú de opciones");
            System.out.println("-------------------------");
            System.out.println("1. Jugar");
            System.out.println("2. salir");
            System.out.println("Elija una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    for(int i=0;i<5;i++){
                        
                        jugador1 = numeroAleatorio.nextInt(5)+1;
                        System.out.println("el jugador ha salido:"+jugador1);
                        jugador2=numeroAleatorio.nextInt(5)+1;
                        System.out.println(" el jugador2 ha salido:"+jugador2);
                        sumaRonda=jugador1+jugador2;  
                        System.out.println("la suma es: "+sumaRonda);
                        
                    if(sumaRonda<7){
                        System.out.println("el jugador1 gana");
                        contadorJugador1++;
                    }else if(sumaRonda>7){
                        System.out.println("el jugador 2 gana");
                        contadorJugador2++;
                    }else{
                        System.out.println("nadie gana este ronda");
                    }
                        
                    }
                    if(contadorJugador1>contadorJugador2 && contadorJugador1>3){
                        System.out.println("el jugador que gana el 5 rondas es:Jugador1 con " +contadorJugador1 +"puntos" );
                        break;
                    }else{
                        System.out.println("el jugador que gana el 5 rondas es:Jugador2 con " +contadorJugador2 +"puntos");
                    }
                    break;
                case 2:
                    System.out.println("Finalizar");
                    break;
                default :
                     System.out.println("Introduce opcion valida");
            }

        } while (opcion != 2);

    }
}
