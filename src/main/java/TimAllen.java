public class TimAllen implements Tradable, Domesticatable {
     /**
     * @return The monetary value of Tim Allen represented by an int.
     */
    @Override
    public int getPrice() {
        return 4;
    }

    /**
     * @return A string representation of the sound Colin Walton makes in the
     *         intro sequence of Home Improvement.
     *         (https://www.youtube.com/watch?v=Ji9qSuQapFY)
     */
    @Override
    public String sound() {
        return "AEUUUGH???";
    }
}
