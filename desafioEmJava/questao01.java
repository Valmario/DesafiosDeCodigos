package Desafio;

/* Autor Valmário Lopes

** programa que mostra uma escada de asteriscos e espaços de tamanho n
** onde a ultima linha não mostra nenhum espaçamento*/

import java.util.*;
public class questao01
{    
    public static void main(String args[])   
    {   
    // variáveis para loop
    int i, n, espaço, asteriscos;
    Scanner degraus = new Scanner(System.in);
    // números de linhas
    System.out.print("Dígite o número de degraus: ");
    n = degraus.nextInt();
 
        // loop dos degraus da escada
        for(i=1; i<=n; i++)
        {
 
            // loop para os espaços
            for(espaço=1; espaço<=n-i; espaço++)
            {
                // impressão dos espaços
                System.out.print(" ");
            }
            
            //  loop para os asteriscos
            for(asteriscos=1; asteriscos<=i; asteriscos++)
            {
                // impressão dos asteriscos
                System.out.print("*");
            }
             
            // resultado
            System.out.println();
        }
    }
 
  }

