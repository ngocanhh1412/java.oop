package Observer;

public class HexaObserver extends Observer {
    private String hexa;

    public HexaObserver(Subject subject) {
        super(subject);
        subject.attach(this);
    }

    public void update() {
        this.hexa = convertDecimalToHexa(this.subject.getState());
    }

    private String convertDecimalToHexa(int decimal) {
        int rem;
        String hexa="";
        char octalchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimal>0)
        {
            rem=decimal%16;
            hexa=octalchars[rem]+hexa;
            decimal=decimal/16;
        }

        return hexa;
    }

    @Override
    public String toString() {
        return "HexaObserver{" +
                "hexa='" + hexa + '\'' +
                '}';
    }
}
