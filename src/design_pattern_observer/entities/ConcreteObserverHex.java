package design_pattern_observer.entities;



public class ConcreteObserverHex implements Observer {
	private String name;


	  public ConcreteObserverHex(String name) {
	    this.name = name;
	  }

	  public void update(Integer data) {
	    System.out.println(String.format("\tFrom %s", this.name));
	    System.out.println(data);
	    System.out.println(Integer.toHexString(data));


	  }

//	  public static String convertStringToHex(String str) {
//
//	        // display in uppercase
//	        //char[] chars = Hex.encodeHex(str.getBytes(StandardCharsets.UTF_8), false);
//
//	        // display in lowercase, default
//	        char[] chars = Hex.encodeHex(str.getBytes(StandardCharsets.UTF_8));
//
//	        return String.valueOf(chars);
//	    }
}
