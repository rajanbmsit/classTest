package classTest;

class Fruit{
    String name;
    String taste;
    Fruit(){
        
    }
    public void eat(){
        System.out.println("The name of fruit is "+this.name+" and taste is "+this.taste);
    }
}

class Apple extends Fruit{
    public void eat(){
        System.out.println("The taste of an apple is "+ this.taste);
    }
}

class Orange extends Fruit{
    public void eat(){
        System.out.println("The taste of an Orange is "+ this.taste);
    }
}


public class exp1
{
	public static void main(String[] args) {
	    Orange o=new Orange();
	    o.taste="Tangy";
	    o.eat();
	    Apple a=new Apple();
	    a.taste="Sweet";
	    a.eat();
		
	}
}