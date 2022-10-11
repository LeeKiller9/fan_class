public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(1,true,10.0,"yellow");
        System.out.println(fan1);
        fan1.setSpeed("FAST");
        System.out.println(fan1);
        if (!fan1.isOn()) {
            fan1.setOnOff();
        }
        fan1.setSpeed("FAST");
        System.out.println(fan1);
        Fan fan2 = new Fan();
        System.out.println(fan2);
    }
}