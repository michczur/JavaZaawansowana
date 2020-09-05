package ZadaniaEnum.zad1;

public enum Weekday {
    PONIEDZIALEK, WTOREK, SRODA, CZWARTEK, PIATEK, SOBOTA, NIEDZIELA;

    public boolean isWeekday(Weekday weekday) {

        if (weekday == SOBOTA || weekday == NIEDZIELA) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isHoliday(Weekday weekday) {
        if (weekday == SOBOTA || weekday == NIEDZIELA) {
            return true;
        } else {
            return false;
        }
    }

    static void whichIsGreater(Weekday dzien) {
        System.out.println("Dzien poprzedzający: " + Weekday.values()[(dzien.ordinal() - 1)]);
        System.out.println("Dzien następujący: " + Weekday.values()[(dzien.ordinal() + 1)]);
        //weekday.compareTo();

    }
}
