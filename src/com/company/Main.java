package com.company;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.tools.corba.se.idl.constExpr.Equal;



public class Main {

    public static void main(String[] args) throws InterruptedException {
	    /*
	    > greater than
	    < less than
	    = equal t
	    >= greater or equal
	    <= greater or equal
	    != not equal to


	    && and
	    || or
	    ! NOT
	     */
        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a: "+a+" b: "+b+" x: "+x+" y: "+y);


	    if (a <= b) {
            System.out.println("a is less than or equal to b");
        }

        if (a >= b) {
            System.out.println("a is more than or equal to b");
        }

        if (x == y) {
            System.out.println("x is y");
        }

        if (x != y) {
            System.out.println("x is not y");
        }


    }
}
