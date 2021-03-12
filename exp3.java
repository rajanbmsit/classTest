package classTest;

class Employee{
    private String firstName;
    private String lastName;
    Employee(){
        this.firstName=null;
        this.lastName=null;
    }
    Employee(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void validation(){
        if(this.firstName==null && this.lastName==null)
        {
            try{
                throw new NullPointerException1("Entry Missing");    
            }catch(NullPointerException1 ex){
                 System.out.println(ex.getMessage());
            }
        }
        else if(this.firstName.length()<3 && this.lastName.length()<3)
        {
            try{
                throw new InvalidLengthException("Name should be minimum three characters");    
            }catch(InvalidLengthException ex){
                 System.out.println(ex.getMessage());
            }
            
        }
    }
}

class NullPointerException1 extends Exception{  
 NullPointerException1(String s){  
  super(s);  
 }  
}  

class InvalidLengthException extends Exception{
    InvalidLengthException(String s)
    {
        super(s);
    }
}


public class exp3 {

	public static void main(String[] args) {
		
		
		Employee em=new Employee();
	    em.validation();
        Employee em1=new Employee("ra","k");
        em1.validation();
	
		
	}
}