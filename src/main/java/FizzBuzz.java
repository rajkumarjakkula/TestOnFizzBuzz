public class FizzBuzz {

    public String FizzBuzzFunction(int value) {
        if(value % 5 == 0){
            return "Buzz";
        }
        if(value % 3 == 0){
            return "Fizz";
        }

        return Integer.toString(value);
    }
}
