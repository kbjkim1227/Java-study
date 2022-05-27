package ex05;

public class AnonymouseTest1 {

	  public static void main(String[] args) {
	    //익명구현 객체 fooCar
	    Car fooCar = new Car(){
	      public void run(){
	        System.out.println("달려라!");
	      }
	      
	      public void stop(){
	        System.out.println("머.. 멈춰!!!");
	      }
	    };
	    
	    fooCar.run();
	    fooCar.stop();
	  }

	}