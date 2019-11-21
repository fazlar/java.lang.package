package come.exam;

public class SceondExample {
      int id;
      String name;
      
	public SceondExample(int id,String name) {
		this.id=id;
		this.name=name;
	}
	

	@Override
	public int hashCode() {
		return id;
	}


	public static void main(String[] args) {
		SceondExample example = new SceondExample(10, "payer");
		SceondExample example1 = new SceondExample(100, "payer");
         System.out.println(example);
         System.out.println(example1);
       //call object class toString()
 		//call SceondExample class hashCode()
	}

}
