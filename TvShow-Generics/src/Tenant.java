//Creating a Tenant class that holds all attribute for the tenants whom live in the apartment building based on
// the Tv show "Only Murders in the Building."
public class Tenant{
   private String name;
   private int aptNumber;
   private char sideBuilding;
   private String involvement;

    //Constructor
    public Tenant(String name, int aptNumber, char sideBuilding, String involvement){
        this.name = name;
        this.aptNumber = aptNumber;
        this.sideBuilding = sideBuilding;
        this.involvement = involvement;
    }

    //Lines 18-50 are the setter and getter methods.
    public String getName()
    {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAptNumber()
    {
        return this.aptNumber;
    }

    public void setAptNumber(int aptNumber)
    {
        this.aptNumber = aptNumber;
    }

    public char getSideBuilding(){
        return this.sideBuilding;
    }

    public void setSideBuilding(char sideBuilding){
        this.sideBuilding = sideBuilding;
    }

    public String getInvolvement(){
        return this.involvement;
    }
    public void setInvolvement(String involvement){
        this.involvement = involvement;
    }

    //An override toString method that displays a list of the attributes of tenants.
    @Override
    public String toString() {
        return "Tenant: {name = " + name + ", aptNumber = " + aptNumber + ", sideBuilding = " + sideBuilding +
                ", involvement = " + involvement + '}';
    }
}