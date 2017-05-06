package FileHandling;

import java.io.Serializable;

public class Pizza implements Serializable {

	private String name;
	private int quantity;
	
	public Pizza(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return  name + "|" + quantity ;
	}
	
	
}
