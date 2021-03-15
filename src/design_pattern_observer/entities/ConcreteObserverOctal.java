package design_pattern_observer.entities;

public class ConcreteObserverOctal implements Observer {
	private String name;

	  public ConcreteObserverOctal(String name) {
	    this.name = name;
	  }

	  public void update(Integer data) {
	    System.out.println(String.format("\tFrom %s", this.name));
	    System.out.println(data);
	    System.out.println(Integer.toOctalString(data));
	  }
}
