package calculator;

public class Calculator {

    /**
     * Implement a method that takes a string and returns the sum of all numbers found within the string.
     *
     * task 1: if no numbers are found in the string, return -1
     * task 2: if the string consist of an integer only, parse and return it as an integer
     * task 3: if the string consist of multiple integers separated by any string, return the sum
     * task 4: if the string consist of one or more numbers and one or more powers (x^z), return the sum
     */
    public int sum(String str) {

        // empty
        if(str == null || str.isEmpty()) {
            return -1;
        }

        // single int
        if(isInteger(str)) {
            return Integer.parseInt(str);
        }


        // separate ints
        char[] chars = str.toCharArray();
        StringBuffer buffer;
        int sum = 0;

        for (int i = 0; i < chars.length; i++) {

            buffer = new StringBuffer();
            while(Character.isDigit(chars[i])) {
                buffer.append(chars[i]);
                i++;
                if(chars.length <= i) {
                    break;
                }
            }

            System.out.println(buffer.toString());

            if(buffer.length() > 0) {
                int num = Integer.parseInt(buffer.toString());
                sum += num;

                System.out.println(num);
            }

        }

        if (sum == 0){
            return -1;
        }
        return sum;
    }


    private boolean isInteger(String str) {
        for (char c : str.toCharArray()) {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
