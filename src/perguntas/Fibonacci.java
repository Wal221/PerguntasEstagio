package perguntas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        Integer num = ler.nextInt();
        verificaFibo(num);
    }

   public  static List<Integer> fibonac(Integer num) {
        List<Integer> lista = new ArrayList<>();

        int F = 0;
        int ant = 0;
       lista.add(F);
    //   lista.add(1);
        for (int i = 1; i <= num+1 ; i++) {

            if (i == 1) {
                F = 1;
                ant = 0;
                lista.add(F);
            } else {
                F += ant;
                ant = F - ant;
                lista.add(F);
            }

        }

        return lista;
    }
    public static void  verificaFibo(Integer num){
        for(Integer a: fibonac(num)){
            if(a == num){
                System.out.println(fibonac(num));
                System.out.println("O numero informado pertence a  sequencia");

            }else{
                System.out.println(fibonac(num));
                System.out.println("O numero não pertence a sequencia");
                break;
            }
        }



    }
}
