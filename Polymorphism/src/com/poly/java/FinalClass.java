package com.poly.java;
 class Bike11{    //final class
	
}
class Honda extends Bike11{
	void run()
	
	{
		System.out.println("running safely with 100kmph");
	}
}
public class FinalClass {
	public static void main(String[] args) {
		Honda h =new Honda();
		h.run();
	}

}


//If you make any class as final, you cannot extend it