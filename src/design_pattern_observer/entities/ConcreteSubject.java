package design_pattern_observer.entities;

public class ConcreteSubject extends Subject {
	private Integer state;
	private String name;
	  private String data;

	  public ConcreteSubject(Integer state, String name) {
	    this.state = state;
	    this.name = name;
	  }

	  public String getData() {
	    return data;
	  }

	  public void setData(String data) {
	    this.data = data;
	    System.out.println(String.format("From %s", this.state));
	    this.notifyObservers(data);
	  }

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
		this.notifyObservers(state);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




}
