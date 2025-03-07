import java.util.List;
import java.util.ArrayList;


interface Drawable{
    void draw();
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("i'm from Circle");
        
    }
}

class Square implements Drawable{
    public void draw(){
        System.out.println("i'm from Square");
        
    }
}

class Triangle implements Drawable{
    public void draw(){
        System.out.println("i'm from Triangle");
        
    }
}



public class LaunchDrawable {
    public static void main(String[] args){
        List <Drawable> list = new ArrayList<>();
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();
        list.add(c);
        list.add(s);
        list.add(t);

        for (Drawable d:list){
            d.draw();
        }


    }
}
