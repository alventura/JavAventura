package com.clas17_2;

public class ExamplesMethods {

	public static void main(String[] args) {
	ExamplesMethods example=new ExamplesMethods();
	
	example.example();
	example.example2("Alvaro");
	example.example3();
	example.example4("Alvaro");
	
	
	}
   

void example() {

    System.out.println("No return value and NO Parameters");
}

void example2(String name) {

    System.out.println("No return value but with Parameter : "  + name);
}

boolean example3() {

    System.out.println("With return value and NO Parameters");
    return true;
}

String example4(String name) {

    System.out.println("No return value but with Parameter : " + name);
    
    return name;
}


boolean example5(String name) {

    System.out.println("No return value but with Parameter : " + name);
    
    return false;
}


short example6(short name) {

    System.out.println("No return value but with Parameter : " + name);
    
    return name;
}

}
