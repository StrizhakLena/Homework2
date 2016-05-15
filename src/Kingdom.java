/**
 * Created by User on 15.05.2016.
 */
public class Kingdom {
}
    protected String nameOfKingdom;
    protected String nameOfKing;
    protected String nameOfQueen;
    protected int theQuantityOfAdviser;
    protected int theQuantityOfMaid;
    protected String address;

    public void setNameOfKingdom(String nameofkingdom) {
        this.nameOfKingdom = nameofkingdom;
    }
    public String getNameOfKingdom() {return nameOfKingdom;}

    public void setNameOfKing(String nameofking) {
        this.nameOfKing = nameofking;
    }
    public String getNameofKing() {return nameOfKing;}

    public void setNameOfQueen(String nameofqueen) {
        this.nameOfQueen =nameofqueen;
    }
    public String getNameofQueen() {return nameOfQueen;}

    public void setTheQuantityOfAdviser(int thequantityofadviser) {
        this.theQuantityOfAdviser = thequantityofadviser;
    }
    public int getTheQuantityOfAdviser() {return theQuantityOfAdviser;}

    public void setTheQuantityOfMaid(int thequantityofmaid) {
        this.theQuantityOfMaid = thequantityofmaid;
    }
    public int getTheQuantityOfMaid() {return theQuantityOfMaid;}

    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getAddress() {return address;}
    public String read() {
        String result = "About kingdom \nnameOfKingdom: " + this.nameOfKingdom + "\nnameOfKing: " + this.nameOfKing + "\nnameOfQueen: " + this.nameOfQueen + "\ntheQuantityOfAdviser: " + this.theQuantityOfAdviser + "\ntheQuantityOfMaid: " + this.theQuantityOfMaid + "\naddress: " + this.address;
        return result;
    }

}
