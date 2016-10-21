/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg20;

import java.util.Scanner;

/**
 *
 * @author Samsung
 */
public class Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULAR SI DOS NUMEROS SON AMIGOS O NO
        int numero1, numero2;
        numero1 = solicitarNumero("primer numero");
        numero2 = solicitarNumero("segundo numero");
        calcularRespuesta(numero1, numero2);
    }
    
    //ESCANEO DEL DATO INGRESADO POR EL USUARIO
    public static int solicitarNumero(String dato){
        int numero;
        System.out.println("Ingresa el " + dato);
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    
    public static void calcularRespuesta (int numero1, int numero2){
        int resultado = 0;
        for(int i=1; i<numero1; i++){
            if(numero1%i==0){
               resultado =  (resultado + i);
            }
        }
            if(resultado == numero2){
                resultado = 0;
                for(int i=1; i<numero2; i++){
                    if(numero2%i==0){
                        resultado = (resultado +1);
                    }
                }
                if(resultado == numero1){
                    System.out.println("Los dos numeros ingresados SON AMIGOS");
                }else{
                    System.out.println("Los numero ingresados NO SON AMIGOS");
                }
            }else{
                    System.out.println("Los numeros ingresados NO SON AMIGOS");
                }
    }
    }
