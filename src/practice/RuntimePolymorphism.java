package practice;

/**
 *
 * @author Tony
 */
final class FinalClass{ // A final class cannot be inherited
    
}

class One{
    private final String className = this.getClass().getName();

    public One() {
        System.out.println("From first constuctor in: "+this.className);
    }
    
    public void meth(){
        System.out.println("From the method in: "+this.className);
    }
    
    final void methFinal(){ // A final method cannot be overridden
        System.out.println("This is final method in: "+this.className+"\n");
    }    
}

class Two extends One{
    private final String className = this.getClass().getName();

    public Two() {
        System.out.println("From second constuctor: "+this.className);
    }
    
    @Override
    public void meth(){
        System.out.println("From the method: "+this.className);
    }      
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        One obj;
        obj = new One();
        obj.meth(); // Dynamic binding - resolved at runtime
        obj.methFinal();
        obj = new Two();
        obj.meth();
    }
}