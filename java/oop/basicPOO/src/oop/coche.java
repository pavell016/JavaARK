package oop;

public class coche {
    private double vel = 0;
    public void acelerar(double increment){
        this.vel += increment;
    }
    public void frenar(double decrement){
        this.vel -= decrement;
    }
    public double geetVelocidad(){
        return this.vel;
    }
}
