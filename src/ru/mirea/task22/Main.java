package ru.mirea.task22;

interface Chair {
    public void SetMaterial();
}

interface ChairFactory { public Chair createChair(); }

class V_Chair_F { public V_Chair createChair() { return new V_Chair(); } }

class V_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "wood"; }
}

class Mul_Chair_F { public Mul_Chair createChair() { return new Mul_Chair(); } }

class Mul_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "aluminium"; }
}

class Mag_Chair_F { public Mag_Chair createChair() { return new Mag_Chair(); } }

class Mag_Chair implements Chair {
    private String material;

    @Override
    public void SetMaterial() { this.material = "diamond"; }
}

class Client {
    private boolean sit_ = false;
    private Chair chair;

    public void sit(Chair chair) {
        if (sit_) System.out.println("I'm sitting on the another chair!");
        else {
            System.out.println("I've sat down on the chair!");
            this.chair = chair;
            sit_ = true;
        }
    }

    public void stand()  {
        if (!sit_) System.out.println("I've already stood up!");
        else {
            System.out.println("I've stood up from the chair!");
            this.sit_ = false;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        V_Chair_F chair_1 = new V_Chair_F();
        Mag_Chair_F chair_2 = new Mag_Chair_F();
        Mul_Chair_F chair_3 = new Mul_Chair_F();

        Client cl = new Client();

        Chair chair1 = chair_1.createChair();
        Chair chair2 = chair_2.createChair();
        Chair chair3 = chair_3.createChair();

        cl.sit(chair1);
        cl.sit(chair2);
        cl.stand();
        cl.sit(chair2);
        cl.stand();
        cl.stand();
    }
}