package cls3polyabstract;

public class Admin {

    private Viajes[] viajesList;

    public Admin() {
        viajesList = new Viajes[8];
        AddList();
    }

    private void AddList() {
        // Listas
        viajesList[0] = new Nacionales("Antonio", 11111111, "Antonio@gmail.com", "San Jose", 2, true, 100);
        viajesList[1] = new Nacionales("Marisol", 22222222, "Marisol@gmail.com", "Heredia", 1, true, 100);
        viajesList[2] = new Nacionales("Franklin", 33333333, "Franklin@gmail.com", "Cartago", 4, true, 100);
        viajesList[3] = new Nacionales("Ignacion", 44444444, "Ignacio@gmail.com", "Limon", 3, true, 100);
        viajesList[4] = new Internacionales("Valeria", 55555555, "Valeria@gmail.com", "New York", 3, true, "Hilton", "Panam", 1, 2000, 0.15);
        viajesList[5] = new Internacionales("Ileana", 66666666, "Ileana@gmail.com", "California", 4, true, "Hollywood Roosevelt", "Avianca", 5, 4000, 0.16);
        viajesList[6] = new Internacionales("Daniel", 77777777, "Daniel@gmail.com", "Las Vegas", 1, true, "Planet Hollywood", "Volaris", 3, 5000, 0.10);
        viajesList[7] = new Internacionales("Maria", 88888888, "Maria@gmail.com", "Orlando", 2, true, "The Peabody", "American Airline", 2, 1000, 0);
    }

    public void print() {
        for (Viajes i : viajesList) {
            System.out.println(i.print());
        }
    }

}
