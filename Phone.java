
public class Phone {
    private String number;
    private String model;
    private String color;
    private double weight;
    private Network network;

    public Phone() {
    }



    public Phone(String number, String model, String color, double weight, Network network) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.network = network;

    }
    public void call(String number){
        if(network.checkNumber(number)){
            System.out.println("Hello!");
        }else {
            System.out.println("Call wasn't success :(");
        }
    }

    public void info(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", network=" + network +
                '}';
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
