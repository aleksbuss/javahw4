public class Human {
    int c = 200;
    double d = 12;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
    }
    public void printC(){
        System.out.println(c);
    }
    public void printCD(){
        System.out.println(c + " " + d);
    }
    public double multi() {
//
        return c * d;
    }


}
