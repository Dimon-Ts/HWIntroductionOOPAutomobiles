public class Main {
    public static void main(String[] args) {
        Automobile[] automobiles = new Automobile[5];
        automobiles[0] = new Automobile("Lada", "Granta", 1.7f, "жёлтый", 2015, "Россия");
        automobiles[1] = new Automobile("Audi", "A8 50 L TDI quattro", 3.0f, "чёрный", 2020, "Германия");
        automobiles[2] = new Automobile("BMW", "Z8", 3.0f, "чёрный", 2021, "Германия");
        automobiles[3] = new Automobile("KIA", "Sportage 4-го поколения", 2.4f, "красный", 2018, "Южная Корея");
        automobiles[4] = new Automobile("Hyundai", "Avante", 1.6f, "оранжевый", 2016, "Южная Корея");

        for (Automobile automobile : automobiles) {
            if (automobile != null) {
                System.out.println(automobile);
            }
        }
    }
}

