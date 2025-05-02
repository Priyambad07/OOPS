
interface Remote {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}

class Television implements Remote {
    public void powerOn() {
        System.out.println("TV is now on");
    }

    public void powerOff() {
        System.out.println("TV is off");
    }
    public void changeChannel(int channel) {
        System.out.println("Channel changed to " + channel);
    }
}

public class Experiment_7_4 {
    public static void main(String[] args) {
        Television tv = new Television();
        Remote remote = tv;

        remote.powerOn();
        remote.changeChannel(5);
        remote.changeChannel(10);
        remote.powerOff();
    }

    
}
