public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = 0; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        Country temp;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[i].getPopulation()) {
                    temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        Country temp;
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[i].getPopulation()) {
                    temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        Country temp;
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        Country temp;
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - i - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() > key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 1; i < newArray.length; i++) {
            Country key = newArray[i];
            int j = i - 1;
            while (j >= 0 && newArray[j].getGdp() < key.getGdp()) {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }
            newArray[j + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {

        int countAfrica = 0;
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                countAfrica++;
            }
        }

        AfricaCountry[] africas = new AfricaCountry[countAfrica];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AfricaCountry) {
                africas[count] = (AfricaCountry) this.countries[i];
                count++;
            }

        }

        return africas;
    }

    public AsiaCountry[] filterAsiaCountry() {
        int countAsia = 0;
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                countAsia++;
            }
        }

        AsiaCountry[] asias = new AsiaCountry[countAsia];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof AsiaCountry) {
                asias[count] = (AsiaCountry) this.countries[i];
                count++;
            }

        }

        return asias;
    }

    public EuropeCountry[] filterEuropeCountry() {
        int countEurope = 0;
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                countEurope++;
            }
        }

        EuropeCountry[] europes = new EuropeCountry[countEurope];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof EuropeCountry) {
                europes[count] = (EuropeCountry) this.countries[i];
                count++;
            }

        }

        return europes;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        int countNA = 0;
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                countNA++;
            }
        }

        NorthAmericaCountry[] northAmericas = new NorthAmericaCountry[countNA];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                northAmericas[count] = (NorthAmericaCountry) this.countries[i];
                count++;
            }

        }

        return northAmericas;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        int countOceania = 0;
        int count = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                countOceania++;
            }
        }

        OceaniaCountry[] oceanias = new OceaniaCountry[countOceania];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof OceaniaCountry) {
                oceanias[count] = (OceaniaCountry) this.countries[i];
                count++;
            }
        }

        return oceanias;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        int countSouthAmeria = 0;
        int count = 0;

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                countSouthAmeria++;
            }
        }

        SouthAmericaCountry[] southAmerica = new SouthAmericaCountry[countSouthAmeria];

        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                southAmerica[count] = (SouthAmericaCountry) this.countries[i];
                count++;
            }
        }

        return southAmerica;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] mostPopulous = new Country[howMany];
        Country[] sortPopularity = sortByDecreasingPopulation();

        for (int i = 0; i < howMany; i++) {
            mostPopulous[i] = sortPopularity[i];
        }

        return mostPopulous;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] leastPopulous = new Country[howMany];
        Country[] sortPopularity = sortByIncreasingPopulation();

        for (int i = 0; i < howMany; i++) {
            leastPopulous[i] = sortPopularity[i];
        }

        return leastPopulous;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] largestArea = new Country[howMany];
        Country[] sortArea = sortByDecreasingArea();

        for (int i = 0; i < howMany; i++) {
            largestArea[i] = sortArea[i];
        }

        return largestArea;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] smallestArea = new Country[howMany];
        Country[] sortArea = sortByIncreasingArea();

        for (int i = 0; i < howMany; i++) {
            smallestArea[i] = sortArea[i];
        }

        return smallestArea;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] largestGdp = new Country[howMany];
        Country[] sortGdp = sortByDecreasingGdp();

        for (int i = 0; i < howMany; i++) {
            largestGdp[i] = sortGdp[i];
        }

        return largestGdp;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] smallestGdp = new Country[howMany];
        Country[] sortGdp = sortByIncreasingGdp();

        for (int i = 0; i < howMany; i++) {
            smallestGdp[i] = sortGdp[i];
        }

        return smallestGdp;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}