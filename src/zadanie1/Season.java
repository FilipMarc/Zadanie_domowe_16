package zadanie1;

public enum Season {

    SPRING("Wiosna", new String[] {"Marzec", "Kwiecień", "Maj"}),
    SUMMER("Lato", new String[] {"Czerwiec", "Lipiec", "Sierpien"}),
    AUTUMN("Jesien", new String[] {"Wrzesien", "Pazdziernik", "Listopad"}),
    WINTER("Zima", new String[] {"Grudzień", "Styczeń", "Luty"});


    private final String name;
    private final String[] months;

    Season(String name, String[] months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public String[] getMonths() {
        return months;
    }
}
