/*
 Complete these classes and follow the rubric for full credit.
 */
public class Driver {

    public static void main(String[] args) {

        //team 1
        Player[] gymJunkiesTeam = {
                new Player("Furrank", 89),
                new Player("Nate", 87),
                new Player("Jon", 50),
                new Player("Terminator", 99),
                new Player("Super Saiyan Frank", 92)
        };

        //team 2
        Player[] tryHardsTeam = {
                new Player("Jesse", 88),
                new Player("Xavier", 49),
                new Player("Jesus", 90),
                new Player("Andres", 99),
                new Player("Bautista", 94)
        };

        PenaltyShootout againstTryHards = new PenaltyShootout(new Player("De Gea", 85));
        PenaltyShootout againstGymJunkies = new PenaltyShootout(new Player("Blackmarket Goalie", 90));

        for (int i = 0; i < 5; i++) {
            againstTryHards.kick(gymJunkiesTeam[i]);
            againstGymJunkies.kick(tryHardsTeam[i]);
        }

        System.out.println(" ====== Gym Junkies shooting against Try Hards ====== ");
        System.out.println(againstGymJunkies.toString());
        System.out.println("\n\n ====== Try Hards shooting against Gym Junkies ====== ");
        System.out.println(againstTryHards.toString());
    }
}
