public enum KickResults {
    SCORED, SAVED;

    /**
     * @return true if equal to saved false if equal to scored;
     */
    public boolean toBoolean() {
        switch (this) {
            case SAVED: return false;
            default: return true;
        }
    }


    public static KickResults getRandomResult() {
        return Math.random() > 0.5 ? KickResults.SAVED : KickResults.SCORED;
    }
}
