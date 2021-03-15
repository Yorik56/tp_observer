package design_pattern_observer.entities;

public class ConcreteObserverBinary implements Observer {
	private String name;

	  public ConcreteObserverBinary(String name) {
	    this.name = name;
	  }

	  public void update(Integer data) {
	    System.out.println(String.format("\tFrom %s", this.name));
	    System.out.println(data);
	    Integer.toBinaryString(data);
	    System.out.println(Integer.toBinaryString(data));
	  }
}
