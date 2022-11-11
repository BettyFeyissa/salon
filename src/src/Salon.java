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
}
