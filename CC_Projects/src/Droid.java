/*
Another CC project, the first one that was not as simple as the previous ones, but not difficult either. Here it was mainly about the handling of classes and methods for object-oriented programming.
 */

public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);

        codey.performTask("driving");
        codey.performTask("skating");

        System.out.println(codey.BatteryReport());

        Droid peter = new Droid("Peter");
        peter.performTask("fighting");

        System.out.println(peter.energyTransfer(peter, codey, 85));
    }

    //Optional - techniques used not yet part of the course.
    public boolean energyTransfer(Droid sender, Droid receiver, int amount) {
        if (amount >= sender.batteryLevel) {
            System.out.println("Not enough Battery to transfer energy!");
            return false;
        } else {
            sender.setBatteryLevel(batteryLevel -= amount);
            receiver.setBatteryLevel(batteryLevel += amount);
            return true;
        }
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    //Normal part of the course, solved according to the idea of the course.
    public int BatteryReport() {
        return batteryLevel;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel -= 10;
    }

    public String toString() {
        return ("Hello, I’m the droid: " + name);
    }

}
