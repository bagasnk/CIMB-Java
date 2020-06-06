package InheritancePolymorphism.src;

public class Input {
    private boolean isEnabled = true;

    public Input(){
        // System.out.println("ini class input");
        // this.isEnabled = isEnabled;
    }

    public void render(){
        
    }

    public void disable(){
        this.isEnabled = false;
    }
    
    public boolean isEnabled(){
        return this.isEnabled;
    }

    @Override
    public String toString(){
        return "ini toString Input";
    }
    

}