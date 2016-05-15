public class Main {
    public static void main(String[] args) {

        betterKingdom betterKingdom = new betterKingdom();
        betterKingdom.setroyalName("CNU");
        betterKingdom.setroyalAddress("Shevchenko, 81");
        betterKingdom.setgiveGoldenPicture(10);

       Kingdom kingdom = new Kingdom ();

        kingdom.setnameOfKingdom("Magic");
        kingdom.setnameOfKing("Rishard");
        kingdom.setnameOfQueen("Mary");
        kingdom.settheQuantityOfAdviser(5);
        kingdom.settheQuantityOfMaid(40);
        kingdom.setaddress("Island");
        betterKingdom.addKingdom(kingdom);

        kingdom = new Kingdom();
        kingdom.setnameOfKingdom("Shiny");
        kingdom.setnameOfKing("David");
        kingdom.setnameOfQueen("Dana");
        kingdom.settheQuantityOfAdviser(2);
        kingdom.settheQuantityOfMaid(30);
        kingdom.setaddress("Norway");
        betterKingdom.addKingdom(kingdom);

        kingdom = new Kingdom();
        kingdom.setnameOfKingdom("wonderful");
        kingdom.setnameOfKing("Tom");
        kingdom.setnameOfQueen("Vanessa");
        kingdom.settheQuantityOfAdviser(1);
        kingdom.settheQuantityOfMaid(35);
        kingdom.setaddress("England");
        betterKingdom.addKingdom(kingdom);



        System.out.println(betterKingdom.toString());
    }
}
