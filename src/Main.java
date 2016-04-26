/**
 * Created by User on 26.04.2016.
 */
public class Main {
}
    public static void main(String[] args) {

        Land Land = new Land();
        Land.setName("Kingdom1");
        Land.setPosistiom("difmaid");
       Land.setgiveLand(1);

        Maid maid = new Maid ();

        maid.setSurname("Ivanova");
        maid.setName("Lena");
        maid.setPosistiom("gardener");
                Land.addMaid(Maid);

        maid = new Worker();
        maid.setSurname("Sidorov");
        maid.setName("Ivan");
        maid.setPosistiom("shef");
        Land.addMaid(Maid);

        maid = new Worker();
        maid.setSurname("Matveeva");
        maid.setName("Ira");
        maid.setPosistiom("cleaner");
        Land.addMaid(Maid);




        System.out.println(Land.toString());
    }
}
