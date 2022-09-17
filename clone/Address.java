package clone;

public class Address implements Cloneable{
	private int street;
	private int pn;
	private String city;
	
	 public Address() {
		// System.err.println("default");
	 }

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public int getPn() {
		return pn;
	}

	public void setPn(int pn) {
		this.pn = pn;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}



	
	
	 
	
	
	


}