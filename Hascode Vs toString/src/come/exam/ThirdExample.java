package come.exam;

public class ThirdExample {
	int id;
	String name;

	public ThirdExample(int id, String name) {
		this.id=id;
		this.name=name;
	}
	

	

	@Override
	public String toString() {
		return  id+","+name;
	}

   


	@Override
	public int hashCode() {
	      
		return id;
	}




	public static void main(String[] args) {
		ThirdExample example = new ThirdExample(10, "payer");
		ThirdExample example1 = new ThirdExample(100, "payer");
         System.out.println(example);
         System.out.println(example1);
       //call SceondExample class toString()
 		//may call SceondExample class hashCode()
	}

}
