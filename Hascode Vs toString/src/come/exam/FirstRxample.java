package come.exam;

public class FirstRxample {
      int id;
       String name;
       
	public FirstRxample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		FirstRxample firstRxample = new FirstRxample(1, "rabbi");
		FirstRxample firstRxample2 = new FirstRxample(1, "payer");
		System.out.println(firstRxample);
		System.out.println(firstRxample2);
		//call object class toString()
		//call object class hashCode()

	}

}
