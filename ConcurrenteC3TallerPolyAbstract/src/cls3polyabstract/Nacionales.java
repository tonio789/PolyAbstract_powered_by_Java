package cls3polyabstract;

// Hago la class para nacionales
public final class Nacionales extends Viajes {

    private double Transportation = 0;

    public Nacionales(final String ClientName, final int Phone, final String Email, final String Destination, final double Passengers, final boolean CashORCard, final double UnitCost) {
        super(ClientName, Phone, Email, Destination, Passengers, CashORCard, UnitCost);
    }

    @Override
    public String print() {
        return super.print() + " Transporte GRATIS Voleto de un dia, Impuestos 13%, Precio Final $" + (super.getUnitCost() * super.getPassengers() * 1.13);
    }

    @Override
    public void addValues() {
    }

}
