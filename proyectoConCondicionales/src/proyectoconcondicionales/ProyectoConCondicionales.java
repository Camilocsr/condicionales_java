package proyectoconcondicionales;

import java.util.Scanner;

public class ProyectoConCondicionales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("¿Edad?");
        numero = entrada.nextInt();
        if(numero < 18){
        String denegado = "No te puedo permitir entrar.";
            System.out.println(denegado);
        } else {
        String entras = "Puedes ingresar a este establecimiento..";
            System.out.println(entras);
        }
    }
    
}
