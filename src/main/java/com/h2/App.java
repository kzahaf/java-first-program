package com.h2;

/**
 * Hello world 2!
 *
 */
public class App
{
    public static void main(  String[] args )
    {
        System.out.println( "Hello World! 2" );
    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }
    private static int add( int[] numbers ) {
        int sum=0;
        for (int i : numbers) {
            sum += i;
        }
        return sum; }
}
