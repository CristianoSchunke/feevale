public class App {

    public static double fatIterativo(double num){
        double result = num;
        
        for(int i = 1; i < num; i++){
            result = result * (num - i);
        }
        return result;
    }

    public static double fatRecursivo(double num){
        if(num  == 1) {
            return 1;
        } 
        else {
            return num * fatRecursivo(num -1 );
        }
    }

    public static void main(String[] args) throws Exception {
        double num = 6;

        System.out.println("O fatorial iterativo de " + num + " é = " + fatIterativo(num));
        System.out.println("O fatorial recursivo de " + num + " é = " + fatRecursivo(num));
    }
}