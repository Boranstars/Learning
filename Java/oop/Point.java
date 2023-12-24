package oop;
/**
 * 创建点对象
 */
public class Point {
    protected double posX;
    protected double posY;
    public Point(double posX ,double posY){
        this.posX = posX;
        this.posY = posY;
    }
    
   

    /**
     * 点对象方法1：计算两点间距离
     * @param p1
     * @param p2
     * @return
     */
    public double getPointsDistance(Point p1,Point p2) {
        return Math.sqrt(Math.pow(Math.abs(p1.posX - p2.posX), 2) + Math.pow(Math.abs(p1.posY - p2.posY), 2));
    }
    /**
     * 点对象方法2：计算该点到另一点间距离
     * @param p
     * @return
     */
    public double getDistance(Point p) {
        return Math.sqrt(Math.pow(Math.abs(this.posX - p.posX), 2) + Math.pow(Math.abs(this.posY - p.posY), 2));
    }

    public void setPos(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    
    
    /**
     * 主程序
     * @param args
     */
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double distance1 = p1.getPointsDistance(p1,p2);
        System.out.println(distance1);
        double distance2 = p1.getDistance(p2);
        System.out.println(distance2);
        SpecialPoint p3 = new SpecialPoint(1, 2, null);
        p3.sayMessage();
    }
}
/**
 * SpecialPoint
 */
class SpecialPoint extends Point{
    private String message;
    public SpecialPoint(double posX, double posY ,String message) {
        super(posX, posY);
        this.message = message;
    }

    public void sayMessage() {
        System.out.printf("this is my coordinates (%.2f , %.2f) \nAnd this is my message:\n%s",this.posX, this.posY, this.message);
    }

    

    

    
}
