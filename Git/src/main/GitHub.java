package main;

public class GitHub {
    private int num1;
    private int num2;

 /** 
  * Constructor.
  * @param n1 num1: Primer numero.
  * @param n2 num2: Segundo numero.
  */   
   public GitHub(int n1, int n2) {
       num1 = n1;
       num2 = n2;
   }
   /**
    * Calcula la suma de los dos numeros dados anteriormente.
    * @return GitHub.
    */
   public int sumar() {
       int resultado = num1 + num2;
       return resultado;
   }
}
