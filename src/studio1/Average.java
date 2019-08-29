package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What is the first integer?");
        int n2 = ap.nextInt("What is the second integer?");


        System.out.println("Average of " + n1 + " and " + n2 + " is " + (((double)n1)+n2)/2);

    }

}
