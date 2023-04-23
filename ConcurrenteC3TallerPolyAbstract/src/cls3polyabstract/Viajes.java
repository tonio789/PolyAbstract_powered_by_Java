package cls3polyabstract;

//Creo las variables 
public abstract class Viajes {

    private String ClientName;
    private int Phone;
    private String Email;
    private String Destination;
    private double Passengers;
    private boolean CashORCard;
    private double UnitCost;

// abstract
    public abstract void addValues();

    public Viajes() {
        addValues();
    }

    //Constructor
    public Viajes(final String ClientName, final int Phone, final String Email, final String Destination, final double Passengers, final boolean CashORCard, final double UnitCost) {
        this.ClientName = ClientName;
        this.Phone = Phone;
        this.Email = Email;
        this.Destination = Destination;
        this.Passengers = Passengers;
        this.CashORCard = CashORCard;
        this.UnitCost = UnitCost;

    }

    // Print Viajes
    public String print() {
        return "Nombre del pasajero " + ClientName + " Telefono " + Phone + " Correo " + Email + " Destino: " + Destination + " Numero de personas que viajan " + Passengers + " Tarjeta o Efectivo " + CashORCard + " Costo Unitario $" + UnitCost;
    }

    // Get y Setts
    public String getClientName() {
        return ClientName;
    }

    public int getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getDestination() {
        return Destination;
    }

    public double getPassengers() {
        return Passengers;
    }

    public boolean isCashORCard() {
        return CashORCard;
    }

    public double getUnitCost() {
        return UnitCost;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public void setPassengers(double Passengers) {
        this.Passengers = Passengers;
    }

    public void setCashORCard(boolean CashORCard) {
        this.CashORCard = CashORCard;
    }

    public void setUnitCost(double UnitCost) {
        this.UnitCost = UnitCost;
    }

}
