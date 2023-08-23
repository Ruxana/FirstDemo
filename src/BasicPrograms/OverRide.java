package BasicPrograms;

class Fruits{
    String name;
    void taste(String t){
        System.out.println("Fruit taste is "+t);
    }
}
class Grapes extends Fruits{
  
    void taste(String x){
    	super.taste("Sour");
    	System.out.println("This fruit name is " +name);
        System.out.println("This fruit taste is "+x);
    }
}
public class OverRide {
	public static void main(String[] args){
        Grapes f1=new Grapes();
        f1.name="Grapes";
        f1.taste("sweet");
    }

}
