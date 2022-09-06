/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

//IMPORTAÇÃO
import java.util.Scanner;
/**
 *
 * @author TI01
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SCANNER
        Scanner teclado = new Scanner(System.in);

        //MENSAGEM
        System.out.print("Digite o nome do aluno: ");
        
        //STRING ATRAVÉS DO TECLADO
        String nome = teclado.nextLine();    
        
        //MENSAGEM DE NOTA
        System.out.print("Digite a nota de " + nome + ": ");
        
        //FLOAT ATRAVÉS DO TECLADO
        float nota = teclado.nextFloat();
        
        //SAÍDA DE DADOS
        System.out.printf("A nota de %s é: %.2f\n", nome, nota);
        
        System.out.println("------------------------------------------");
        
        //Tipo FLOAT
        System.out.print("A nota do aluno é: " + nota);
        System.out.println("\nA nota é: " + nota);

        System.out.println("==========================================");
        //FLOAT + STRING
        System.out.printf("A nota de %s é: %.2f \n", nome, nota);
        System.out.format("A nota de %s é: %.2f \n", nome, nota);
         
        System.out.println("::::::::::::::::::::::::::::::::::::::::::");
        
        //CONVERTENDO DADOS INT -> VALOR
        int idade = 30;
        String valor = Integer.toString(idade);
        //SAÍDA
        System.out.println("Valor: " + valor);
        
        
        //CONVERTENDO DADOS VALOR -> INT
        String valor2 = "20";
        int idade2 = Integer.parseInt(valor2);
        //SAÍDA
        System.out.println("Idade: " + idade2);
    }
    
}
