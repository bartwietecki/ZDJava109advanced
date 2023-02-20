package practicalTasks.one.person;

public enum Gender {
    MALE("m", "male", "mężczyzna"),
    FEMALE("f", "female", "kobieta");

    private String abbrv;
    private String translationEng;
    private String translationPl;

    Gender(String abbrv, String translationEng, String translationPl) {
        this.abbrv = abbrv;
        this.translationEng = translationEng;
        this.translationPl = translationPl;
    }

    public String getAbbrv() {
        return abbrv;
    }

    public String getTranslationEng() {
        return translationEng;
    }

    public String getTranslationPl() {
        return translationPl;
    }

    // metoda
    public static Gender findByAbbrv(String abbrv) {
        for (Gender g : Gender.values()) {
            if(g.abbrv.equals(abbrv)) {
                return g;
            }
        }
        return null;
    }
}
