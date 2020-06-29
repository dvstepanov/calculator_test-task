public enum RomanNumerals {
    I("I",1),
    IV("IV",4),
    V("V",5),
    IX("IX",9),
    X("X",10),
    XL("XL",40),
    L("L",50),
    XC("XC",90),
    C("C",100);

    private int value;
    private String key;

    RomanNumerals(String key, int value) {
        this.value = value;
        this.key = key;
    }

    public int getValue() {
        return value;
    }
    public String getKey() {
        return key;
    }

    static int toInt(String key) {
        for (RomanNumerals i: values())
            if (i.getKey().equals(key))
                return i.getValue();

            return 0;
        }
    }