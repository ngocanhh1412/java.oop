package Observer;

public class OctalObserver extends Observer {
    private String octal;

    public OctalObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.octal = convertDecimalToOctal(this.subject.getState());
    }

    private String convertDecimalToOctal(int decimal) {
        int rem;
        String octal="";
        char octalchars[]={'0','1','2','3','4','5','6','7'};

        while(decimal>0)
        {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }

        return octal;
    }

    @Override
    public String toString() {
        return "OctalObserver{" +
                "octal='" + octal + '\'' +
                '}';
    }
}
