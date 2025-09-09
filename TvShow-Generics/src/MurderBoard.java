//Creating a MurderBoard class to help create objects in the TvShowApp.
//The murder board is a significant aspect of the show to help some tenant investigate a death
// in the building.
public class MurderBoard {
    private String victim;
    private boolean assailant;
    private String suspectName;

    //Constructor
    public MurderBoard(String victim, String suspectName, boolean assailant)
    {
        this.victim = victim;
        this.assailant = assailant;
        this.suspectName = suspectName;
    }

    //Lines 20-40 are setter and getter methods
    public String getVictim(){
        return this.victim;
    }
    public void setVictim(String victim){
        this.victim = victim;
    }

    public boolean getAssailant(){
        return this.assailant;
    }

    public void setAssailant(boolean assailant){
        this.assailant = assailant;
    }

    public String getSuspectName()
    {
        return this.suspectName;
    }

    public void setSuspectName(String suspectName){
        this.suspectName = suspectName;
    }

    //Override toString method that displays the attributes of the murder board.
    @Override
    public String toString(){
        return "MurderBoard: {Victim = " + victim + ", assailant = " + assailant + ", suspectName = " + suspectName + '}';
    }
}
