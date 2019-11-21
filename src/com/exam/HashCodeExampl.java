package com.exam;

public class HashCodeExampl {
      int id;
	String namel;

	public HashCodeExampl(int id,String namel) {
		
		this.namel = namel;
		this.id=id;
	}
     //Override impoper way
	
	/*
	 * @Override public int hashCode(){
	 * 
	 * return 100; }
	 */
	
 
	 
	@Override
	public int hashCode() {
		
		return id;
	}
    
	public static void main(String[] args) {
	   HashCodeExampl hashCodeExampl=new HashCodeExampl(1,"rabbi");
	   HashCodeExampl hascodeExampl2=new HashCodeExampl(2,"payer");
	   System.out.println(hashCodeExampl.hashCode());
	   System.out.println(hascodeExampl2.hashCode());

	}



	
	
}
