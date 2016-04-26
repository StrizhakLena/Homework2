/**
 * Created by User on 20.04.2016.
 */
public class Land {

    protected String Name;
    protected String Posistiom;
    protected int giveLand;
    protected Kingdom[] maidArray;
    protected int number;

    public Land () {
        this.maidArray = new Maid[50];
        this.number = 0;

    }
    public void setName(String Name ) {
        this.Name = Name;
    }


    public void setAddress(String Posistiom) {
        this.Posistiom = Posistiom;
    }

    public void setgiveLand(int giveLand) {
        this.giveLand = giveLand;
    }

    public void addMaid(Kingdom maid) {
        this.maidArray[this.number] = maid;
        this.number++;
    }

    public String toString() {
        String result = "Need to get Land " + this.giveLand + " for the maid at the Kingdom " + this.name + " on position " + this.position + ":\n--------\n";
        for(int i = 0; i < this.number; i++) {
            result += this.maidArray[i].toString() + "\n--------\n";
        }
        return result;
}
}












