package com.class27;

public abstract class Phone {
	
	public void makeCall() {
		System.out.println("Phone can make a call");	
	}
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void unlockPhone();
	public abstract void viewPictures();
}

class IPhone extends Phone{//concrete class= is a class that is inherited from an abstract class or implemented by interface and providing 
	//implementation of all unimplemented/abstract classes

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("To unlock Iphone we can use FaceID or FingerPrint");
	}
	@Override
	public void viewPictures() {
		// TODO Auto-generated method stub
		System.out.println("To view Pictures on Iphone we can go to images");
	}
	
}
class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		// TODO Auto-generated method stub
		System.out.println("To unlock a Samsung we can enter password");
	}

	@Override
	public void viewPictures() {
		// TODO Auto-generated method stub
		System.out.println("To view pictures on a Samsung we go to gallery");
	}
	
	
}
