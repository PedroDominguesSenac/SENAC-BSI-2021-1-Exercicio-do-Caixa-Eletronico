/* Pedro Domingues
* Crie um algoritmo de caixa eletrônico que dispense
* o menor número de notas para um dado valor solicitado.
*
* Notas disponíveis:
* R$ 100,00
* R$ 50,00
* R$ 20,00
* R$ 10,00
* R$ 5,00
* R$ 2,00
* R$ 1,00
*
* Enviar a resposta via Pull Request! 
*/

package testetipos;

import java.util.Scanner;


public class ExercicioCaixa {

    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        
        int cash, nota1 = 1, nota2 = 2, nota5 = 5, nota10 = 10, nota20 = 20, nota50 = 50, nota100 = 100;
        
        System.out.print("Qual o valor do saque: ");
        cash = atm.nextInt();
        
        if (nota100 >= nota100) {
            nota100 = cash / 100;
            cash = cash % 100;
            if (nota100 != 0)
                System.out.println(nota100 + " Nota(s) de R$ 100,00");            
        }
        
        if (nota50 >= nota50) {
            nota50 = cash / 50;
            cash = cash % 50;
            if (nota50 != 0)
                System.out.println(nota50 + " Nota(s) de R$50,00");
        }
        
        if (nota20 >= nota20) {
            nota20 = cash / 20;
            cash = cash % 20;
            if (nota20 != 0)
                System.out.println(nota20 + " Nota(s) de R$20,00");
        } 
        
        if (nota10 >= nota10) {
            nota10 = cash / 10;
            cash = cash % 10;
            if (nota10 != 0)
                System.out.println(nota10 + " Nota(s) de R$10,00");
        }
        
        if (nota5 >= nota5) {
            nota5 = cash / 5;
            cash = cash % 5;
            if (nota5 != 0)
                System.out.println(nota5 + " Nota(s) de R$5,00");
        }
        
        if (nota2 >= nota2) {
            nota2 = cash / 2;
            cash = cash % 2;
            if (nota2 != 0)
                System.out.println(" Nota(s) de R$2,00");
        }
        
        if (nota1 >= nota1) {
            nota1 = cash / 1;
            cash = cash % 1;
            if (nota1 != 0)
                System.out.println(" Nota(s) de R$1,00");
        }
        
    }
}