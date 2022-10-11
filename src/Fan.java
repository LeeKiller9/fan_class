public class Fan {
    //    2 hằng được đặt tên là SLOW, MEDIUM, và FAST với giá trị 1, 2, và 3 để biểu thị tốc độ quạt.
//    Trường speed có kiểu số nguyên (private int) để xác định tốc độ quạt, mặc định là SLOW
//    Trường on có kiểu private boolean để xác định quạt đang bật hay tắt, mặc định là false (tắt).
//    Trường radius có kiểu private double để xác định bán kính quạt, giá trị mặc định là 5
//    Trường color có kiểu dữ liệu private String để xác định màu quạt, mặc định là blue
//    Các getter và setter cho các thuộc tính
//    Phương thức khởi tạo không tham số tạo đối tượng fan mặc định
//    Phuơng thức toString() trả về chuỗi chứa thông tin của quạt. Nếu quạt đang ở trạng thái on,
//    phương thức trả về speed, color, và radius với chuỗi “fan is on”.
//    Nếu quạt không ở trạng thái on, phương thức trả về color, radius với chuỗi “fan is off”.
//    Vẽ sơ đồ UML cho lớp và cài đặt lớp
//    Viết chương trìnhHiển thị các đối tượng bằng cách gọi phương thức toString
//    Tạo 2 đối tượng Fan
//    Đối tượng Fan 1: Gán giá trị lớn nhất cho speed, radius là 10, color là yellow và quạt ở trạng thái bật.
//    Đối tượng Fan 2: Gán giá trị trung bình cho speed, radius là 5, color là blue và quạt ở trạng thái tắt
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        if (this.on) {
            switch (speed) {
                case "SLOW":
                    this.speed = 1;
                    break;
                case "MEDIUM":
                    this.speed = 2;
                    break;
                case "FAST":
                    this.speed = 3;
                    break;
            }
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOnOff() {
        this.on = !this.on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return ("Fan is on, speed " + this.getSpeed() + ", radius " + this.getRadius() + ", color '" + this.getColor() + "'.");
        } else {
            return ("Fan is off, speed " + this.getSpeed() + ", radius " + this.getRadius() + ", color '" + this.getColor() + "'.");
        }
    }
}
