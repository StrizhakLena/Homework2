/**
 * Created by User on 14.05.2016.
 */
public class betterKingdom {

    protected String royalName;
    protected String royalAddress;
    protected int giveGoldenPicture;
    protected Kingdom[] kingdomsArray;
    protected int number;

    public betterKingdom() {
        this.kingdomsArray = new Kingdom[3];
        this.number = 0;

    }
    public void setRoyalName(String royalName) {
        this.royalName = royalName;
    }

    public String getRoyalName() {return royalName;}

    public void setRoyalAddress(String royalAddress) {
        this.royalAddress = royalAddress;
    }

    public String getRoyalAddress() {return royalAddress;}

    public void setsetgiveGoldenPicture(int giveGoldenPicture) {
        this.giveGoldenPicture = giveGoldenPicture;
    }

    public int getGiveSalary() {return giveGoldenPicture;}

    public void addKingdom(Kingdom kingdom) {
        this.kingdomsArray[this.number] = kingdom;
        this.number++;
    }

    public String toString() {
        String result = "Need to get Golden Picture " + this.giveGoldenPicture + " for the kingdoms in the World " + this.royalName + " on royalAddress " + this.royalAddress + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.kingdomsArray[i].toString() + "\n--------\n";
        }
        return result;
    }

}









