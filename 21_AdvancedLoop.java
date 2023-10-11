/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa 
tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.*/

public class MyClass {
    public static void main(String args[]) {
      int num = 10;
      printNum(num);
    }
    
    public static void printNum(int a) {
        for (int i = 0; i<=a; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}