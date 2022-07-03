//salvar como Programacalc.java
 import javax.swing.*;
  public class Programacalc
  {
  
  public static void main (String entrada[]){
	  
	  //declaração de variaveis
	  int n1;
	  int n2;
	  int soma;
	  int sub;
	  int mult;
	  double div;
	  double raiz1,raiz2;
	  double pot;
	  
	  
	  
	  String msg = "";
	  //entrada de dados
	  n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
	  n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
	  //Processamento
	  soma=n1+n2;
	  sub=n1-n2;
	  mult=n1*n2;
	  div=n1/n2;
	  raiz1=Math.sqrt(n1);
	  raiz2=Math.sqrt(n2);
	  pot=Math.pow (n1,n2);

	  
	  //saida de resultados
	  msg= msg +"Valor da soma e:"+soma + "\n";
	  msg= msg +"Valor da subtracao e:"+sub +"\n";
	  msg= msg +"Valor da multiplicacao e:"+mult +"\n";
	  msg= msg +"Valor da divisao e:"+div +"\n";
	  msg= msg +"A raiz quadrada do primeiro numero digitado e:"+raiz1 +"\n";
	  msg= msg +"A raiz quadrada do segundo numero digitado e:"+raiz2 +"\n";
	  msg= msg +"A potencia de:"+n1+"por"+n2+"="+pot+"\n";

     JOptionPane.showMessageDialog(null,msg);
	 System.exit (0);
	  }
    }