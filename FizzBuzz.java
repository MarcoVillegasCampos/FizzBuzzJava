

public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number % 5 == 0 & number % 3 == 0) {
            
            
        } else {
            if (number % 3 == 0) {
                return "Fizz";
            } else {
                if (number % 5 == 0) {
                    return "Buzz";
                } else {
                    return String.valueOf(number);

              
            }
            
        }
        
        
    }
    return "FizzBuzz";
    }

    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word){
        if (number % 5 == 0 & number % 3 == 0) {
            

            } else {
                if (number % 3 == 0) {
               
                return multOf3Word;
                } else {
                    if (number % 5 == 0) {
                  
                    return multOf5Word;
                    } else {
                        return String.valueOf(number);
                    

                }
            }
        
        }
        

        return multOf15Word;
    }

}

