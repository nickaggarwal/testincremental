package com.nilesh.incremental;

/**
 * Created by Nilesh on 14/11/16.
 */
public class Main {

    public static void main(String args[])
    {
        printMessageFine();
        Helper helper = new Helper("Hi", "Nilesh");
        helper.printMessage();
        System.out.print("Hello World End");
    }

    public static int printMessageFine(){
        String message  = "\"I am Doing Fine\"" ;
        System.out.println(message);
        return 1 ;
    }

}
