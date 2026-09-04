public class App {
    public static void main(String[] args) throws Exception {
      int num = 12;

      System.out.println("O número de Fibonacci na posição " + num + " é " + fibonacciInterativo(num));
      System.out.println("O número de Fibonacci na posição " + num + " é " + fibonacciRecursivo(num));
    }

    public static long fibonacciInterativo(int num) {
        long result = 0, lastButOne = 1, lastButTwo = 1;

        if (num == 1 || num == 2) {
            return 1;
        }

        for (int i = 3; i <= num; i++) {
            result = lastButOne + lastButTwo;
            lastButOne = lastButTwo;
            lastButTwo = result;
        }
        return result;
    }

        public static long fibonacciRecursivo(int num) {
        if (num == 1 || num == 2)
            return 1;
        else 
            return fibonacciRecursivo(num - 1) + fibonacciRecursivo(num - 2);
    }
}