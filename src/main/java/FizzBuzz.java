public class FizzBuzz
{
    int number;
    public FizzBuzz(int number)
    {
        this.number=number;
    }
    public String checkFizzOrBuzz() {
        if(number>=1 && number<=100) {
            if (number % 3 == 0)
                return "Fizz";
            else if(number %5 ==0)
                return "Buzz";
            else
                return "FizzBuzz";
        }
        return "null";
    }

    public String checkNumberIsIn() {
        int rem=0;
        while(number!=0)
        {
            rem=number%10;
            if(rem==3 || rem==5)
                break;
            number=number/10;
        }
        if(number%3==0 || rem==3)
            return "Fizz";
        else
            return "Buzz";
    }
}
