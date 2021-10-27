public class FizzBuzz {
    public static void fizzBuzz (int number){
        for (int i=1; i<=number; i++){
            if (number % 3 == 0) {
                if (number % 5 == 0){
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if(number % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}