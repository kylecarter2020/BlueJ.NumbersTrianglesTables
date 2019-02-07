


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = "";
        
        for(int i = 0; i < stop; i++)
        {
            result += Integer.toString(i);
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        
        for(int i = start; i < stop; i++)
        {
            result += Integer.toString(i);
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        
        for(int i = start; i < stop; i+=step)
        {
            result += Integer.toString(i);
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        
        for(int i = start; i < stop; i++)
        {
            if(i % 2 == 0)
            {
                result += Integer.toString(i);
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        
        for(int i = start; i < stop; i++)
        {
            if(i % 2 != 0)
            {
                result += Integer.toString(i);
            }
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        int math = 0;
        
        for(int i = start; i <= stop; i++)
        {
            math = (int)Math.pow(i, exponent);
            result += Integer.toString(math);
        }
        return result;
    }
}
