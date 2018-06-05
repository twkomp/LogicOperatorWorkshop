package com.company;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.sun.tools.corba.se.idl.constExpr.Equal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
		boolean bool = true;
	    int a = 0;
	    int b = 2;
	    int c = -1;
	    int d = -1;
	    if(a==0 && b+c==1) {
			System.out.println("this and that");
		}
		if(a==0 || b==1) {
			System.out.println("this or that");
		}
		System.out.println("not inverse");
		System.out.println(bool);
		System.out.println(!bool);
    }
}
