/*
 * MIT License
 *
 * Copyright (c) 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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
