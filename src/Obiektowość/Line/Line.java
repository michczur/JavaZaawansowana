package Obiektowość.Line;

public class Line {
    private Punkt punktPoczatkowy;
    private Punkt punktKoncowy;


    public Line(Punkt punktPoczatkowy, Punkt punktKoncowy) {
        this.punktPoczatkowy = punktPoczatkowy;
        this.punktKoncowy = punktKoncowy;
    }

    public Line(float x1, float y1, float x2, float y2) {
        this.punktPoczatkowy = new Punkt(x1, y1);
        this.punktKoncowy = new Punkt(x2, y2);
    }

    public Punkt getPunktPoczatkowy() {
        return punktPoczatkowy;
    }

    public void setPunktPoczatkowy(Punkt punktPoczatkowy) {
        this.punktPoczatkowy = punktPoczatkowy;
    }

    public Punkt getPunktKoncowy() {
        return punktKoncowy;
    }

    public void setPunktKoncowy(Punkt punktKoncowy) {
        this.punktKoncowy = punktKoncowy;
    }

    public float jakDluga(Punkt punktPoczatkowy, Punkt punktKoncowy) {
        float roznicaX = punktKoncowy.getX() - punktPoczatkowy.getX();
        float roznicaY = punktKoncowy.getY() - punktPoczatkowy.getY();
        if (roznicaX < roznicaY) {
            return roznicaY;
        } else {
            return roznicaX;
        }
    }
    public Punkt srodek(float jakDluga){
        Punkt wynik = new Punkt();
        wynik.setX(punktPoczatkowy.getX()+(jakDluga/2));
        wynik.setY(punktPoczatkowy.getY()+(jakDluga/2));
        return wynik;
    }

}
