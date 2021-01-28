public class PenaltyShootout {

    private int scoredCounter;
    private int totalKicked;
    private final Player goalie;

    public PenaltyShootout(Player goalie) {
        this.goalie = goalie;
        this.scoredCounter = 0;
        this.totalKicked = 0;
    }

    /*
    You'll notice the kicker is changed out each time. This makes it so
    you can change kickers whenever you want

    This method should check to compare the levels of the kicker and the goalie
    to decide who should win this penalty kick.

    Use the Player#compareTo(Player) method for assistance.

    If the kicker and goalie both have the same level, make the winner random.
    To do this, use Math.random() which returns a double between 0.0 and 1.0.
    From there, check if the number returned is less than 0.5. This gives a 50%
    chance. More examples can be found online.
     */
    public KickResults kick(Player kicker) {
        switch (goalie.compareTo(kicker)) {
            case -1: {
                increment(true);
                return KickResults.SCORED;
            }
            case 1: {
                increment(false);
                return KickResults.SAVED;
            }
            default: {
                KickResults result = KickResults.getRandomResult();
                increment(result.toBoolean());
                return result;
            }
        }
    }

    /*
     When would it make sense to use this method? You can decide
     for yourself when this should be called
     */
    private void increment(boolean didScore) {
        if(didScore) {
            scoredCounter++;
        }
        totalKicked++;
    }

    @Override
    public String toString() {
        return "PenaltyShootout {\n" +
                "\tscoredCounter=" + scoredCounter + ",\n" +
                "\ttotalKicked=" + totalKicked + ",\n" +
                "\tSCORE=" + Math.abs(scoredCounter-totalKicked) + "\n" +
                '}';
    }
}
