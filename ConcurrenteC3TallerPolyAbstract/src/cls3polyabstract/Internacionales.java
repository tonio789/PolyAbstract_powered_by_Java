package cls3polyabstract;

// Hago la class para internacionales
public class Internacionales extends Viajes {

    private String Hotel;
    private String Airline;
    private double Tax;
    private double Days;

    public Internacionales(final String ClientName, final int Phone, final String Email, final String Destination, final double Passengers, final boolean CashORCard, final String Hotel, final String Airline, final double Days, final double UnitCost, final double Tax) {
        super(ClientName, Phone, Email, Destination, Passengers, CashORCard, UnitCost);
        this.Hotel = Hotel;
        this.Airline = Airline;
        this.Tax = Tax;
        this.Days = Days;

    }

    @Override
    public String print() {
        return super.print() + " Hotel " + Hotel + " Aerolinea " + Airline + " Cantidad de dias" + Days + ", Impuestos " + Tax + ", Precio Final $" + (super.getUnitCost() * super.getPassengers() * Days * (1 + Tax));
    }

    @Override
    public void addValues() {
    }
}
