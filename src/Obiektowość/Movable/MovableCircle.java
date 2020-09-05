package Obiektowość.Movable;

public class MovableCircle implements Movable {
    MovablePoint srodekKola =new MovablePoint();
    private int promien;
    @Override
    public void moveUp(){
        srodekKola.y+=srodekKola.ySpeed;
    };
    @Override
    public void moveDown(){
        srodekKola.y-=srodekKola.ySpeed;
    };
    @Override
    public void moveLeft(){
        srodekKola.x-=srodekKola.xSpeed;

    };
    @Override
    public void moveRigth(){
        srodekKola.x+=srodekKola.xSpeed;

    };
}
