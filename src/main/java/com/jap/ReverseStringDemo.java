package com.jap;

public class ReverseStringDemo {
    public static void main(String[] args) {
	String name = new String("Java Program"); //Create a String object.getReverseString(name);
	System.out.println("Original String :" + name);
	ReverseStringDemo object = new ReverseStringDemo();  //Create an object of the class ReverseStringDemo
	String reverse = object.getReverseString(name);  //Call the method getReverseString() and pass the parameter
	System.out.println(reverse);
    }

//Write the logic to reverse the String  inside the below method and return the reverse String.
public String getReverseString(String string){
	int length = string.length();
	String rev = "";
	for(int i = length-1; i>=0; i--){
		rev = rev + string.charAt(i);
	}
        return rev;
    }
}
