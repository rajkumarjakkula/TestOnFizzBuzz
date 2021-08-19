public class FizzBuzz {

    public String FizzBuzzFunction(int value) {
        if (value % 5 == 0){
            return "Buzz";
        }
        if (value % 3 == 0){
            return "Fizz";
        }

        return Integer.toString(value);
    }

    public String FizzOrBuzz(int value) {
        String stringValue=Integer.toString(value);
        if (value % 3 ==0 && value % 5 == 0)
        {
            return "FizzBuzz";
        }
        if (value % 3 ==0 || stringValue.contains("3"))
        {
            return "Fizz";
        }
        if (value % 5 ==0 || stringValue.contains("5"))
        {
            return "Buzz";
        }

        return stringValue;
    }
}
