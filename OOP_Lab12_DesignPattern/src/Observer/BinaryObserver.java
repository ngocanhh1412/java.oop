package Observer;

public class BinaryObserver extends Observer {
    private String binary;

    public BinaryObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.binary = convertDecimalToBinary(this.subject.getState());
    }

    private String convertDecimalToBinary(int decimal) {
        int rem;
        String binary="";
        char octalchars[]={'0','1'};

        while(decimal>0)
        {
            rem=decimal%2;
            binary=octalchars[rem]+binary;
            decimal=decimal/2;
        }

        return binary;
    }

    @Override
    public String toString() {
        return "BinaryObserver{" +
                "binary='" + binary + '\'' +
                '}';
    }
}
