public class Exercicios{

    public static int fatorial(int n){
        //Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
        if( n==1 || n==0){
            return 1;
        }else{
            return n * fatorial(n-1);
        }
    }
    
    //alo
    public static int somatorio(int n){
        //Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
        if (n == 0) {
            return 0;
        } else {
            return n + somatorio(n - 1); 
        }
    }

    public static int fibonacci(int n){
        //Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}