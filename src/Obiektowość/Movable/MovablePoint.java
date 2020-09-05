package Obiektowość.Movable;

public class MovablePoint implements Movable{
    int x,y,xSpeed,ySpeed;
    @Override
    public void moveUp(){
       y=y+ySpeed;
    }
    @Override
    public void moveDown(){
        y=y-ySpeed;
    }
    @Override
    public void moveLeft(){
        x=x-xSpeed;
    }
    @Override
    public void moveRigth(){
        x=x+xSpeed;
    }

}
