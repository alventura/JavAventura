package com.class26;

public class A {
final public void method() {
	System.out.println("final method");
}

}

class B extends A{
//final public void method() {
//System.out.println("trying to override final method"); cannot be done
}
