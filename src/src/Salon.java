public abstract class Salon {
   public String name;
   public String description;
   public   String appointment;
   public double price;

   //create constructor
    public Salon(String name, String description, String appointment, double price) {
        this.name = name;
        this.description = description;
        this.appointment = appointment;
        this.price = price;
    }

    //using toString to print

    @Override
    public String toString() {
        return "Salon{" +
                "full name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", appointment='" + appointment + '\'' +
                ", price=" + price +
                '}';
    }
}

