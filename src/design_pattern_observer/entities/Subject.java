package design_pattern_observer.entities;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private final List<Observer> observers = new ArrayList<Observer>();

	  public void attach(Observer observer) {
	    if (!observers.contains(observer)) {
	      this.observers.add(observer);
	    }
	  }

	  public void detach(Observer observer) {
	    if (observers.contains(observer)) {
	      this.observers.remove(observer);
	    }
	  }

	  protected void notifyObservers(String data) {
	    for (Observer observer : observers) {
//	      observer.update(data);
	    }
	  }

	  protected void notifyObservers(Integer state) {
		    for (Observer observer : observers) {
		      observer.update(state);
		    }
		  }
}
