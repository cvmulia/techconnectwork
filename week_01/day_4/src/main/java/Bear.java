public class Bear {

    // Has stuff section lists the properties
    // that the object if this class will have
   private String name;

    // This is the constructor
    // It is called when we instantiate a new Bear
    // "public" is to make it visible within 1 folder
    public Bear(String namename){
        this.name = namename; // To save the object and the specs

    }


    // TODO: Does stuff section


// Accessor returnType methodName
    public String getName(){
        return this.name;
    }

    public void setName(String namename) {
        this.name = namename;
    }
}
