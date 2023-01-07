package Library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        int temp = 0;
        long max = (long) ( rents[0].getEnd().getTime() - rents[0].getBegin().getTime() ) / (24 * 60 * 60 * 1000);

        for (int i = 1; i < rents.length; i++) {
            long time = (long) ( rents[i].getEnd().getTime() - rents[i].getBegin().getTime() ) / (24 * 60 * 60 * 1000);

            if (time > max) {
                max = time;
                temp = i;
            }
        }

        return rents[temp];
    }
}
