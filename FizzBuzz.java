public class FizzBuzz {
    public String fizzBuzz (int number){
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