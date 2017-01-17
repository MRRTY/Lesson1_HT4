
public class Main {
    public static void main(String args[]){
        Network life = new Network();
        Phone p1 = new Phone("0972122789","Samsung","RED",213,life);
        life.registration(p1.getNumber());
        p1.info();
        p1.call("01232123");
        Phone p2 = new Phone("0972122780","Samsung","BLUE",211,life);
        p2.info();
        p1.call(p2.getNumber());
        life.registration(p2.getNumber());
        p2.call(p1.getNumber());
    }
}
