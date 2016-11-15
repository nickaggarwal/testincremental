package com.nilesh.incremental;

/**
 * Created by Nilesh on 15/11/16.
 */
public class Helper {

    String myName ;
    String greeting ;

    public Helper(String a , String b )
    {
        this.greeting = a ;
        this.myName = b ;
    }

    public void printMessage()
    {
        System.out.println( greeting + " " + myName) ;
    }

}
