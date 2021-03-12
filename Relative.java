public class Relative {
}

class Father extends Relative {
    public Father(){
        System.out.println("Luke, I am your father.");
    }
}

class Sister extends Relative {
    public Sister(){
        System.out.println("Luke, I am your sister.");
    }
}

class BrotherInLaw extends Relative {
    public BrotherInLaw(){
        System.out.println("Luke, I am your brother in law.");
    }
}

class Droid extends Relative {
    public Droid(){
        System.out.println("Luke, I am your droid.");
    }
}
class LukeSkywalker {

    private String father;
    private String sister;
    private String brotherinlaw;
    private String droid;

    public void setFatherName(String name) {
        if(name.matches("^[a-zA-Z\\s]+"))
            father = name;
    }
    public void setSisterName(String name) {
        if(name.matches("^[a-zA-Z\\s]+"))
            sister = name;
    }
    public void setBrotherinlawName(String name) {
        if(name.matches("^[a-zA-Z\\s]+"))
            brotherinlaw = name;
    }
    public void setDroidName(String name) {
        if(name.matches("^[a-zA-Z0-9\\s]+"))
            droid = name;
    }
    private Relative relative;
    public void relationToLuke(String name){
        if(name == father){
            relative = new Father();
        } else if(name == sister){
            relative = new Sister();
        } else if(name == brotherinlaw){
            relative = new BrotherInLaw();
        }else if(name == droid) {
            relative = new Droid();
        } else{
            System.out.println("Luke, I am your null.");
        }
    }
}