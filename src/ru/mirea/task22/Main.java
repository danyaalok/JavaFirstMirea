package ru.mirea.task22;

enum ChairType { Vic, Mag, Mul }

class ChairFactory {
    public Chair CreateChair(ChairType type) {
        Chair chair = null;

        switch (type) {
            case Vic:
                chair = new V_Chair();
                break;

            case Mag:
                chair = new Mag_Chair();
                break;

            case Mul:
                chair = new Mul_Chair();
                break;
        }

        return chair;
    }
}

interface Chair {
    public void SetMaterial();
    public void SetName();
    public String getName();
}

class V_Chair implements Chair {
    private String material, name;
    public V_Chair() { this.SetMaterial(); this.SetName(); }

    public void SetMaterial() { this.material = "wood"; }

    @Override
    public void SetName() { this.name = "Victorian"; }

    @Override
    public String getName() { return name; }
}

class Mag_Chair implements Chair {
    private String material, name;
    public Mag_Chair() { this.SetMaterial(); this.SetName(); }

    public void SetMaterial() { this.material = "diamond"; }

    @Override
    public void SetName() { this.name = "Magic"; }

    @Override
    public String getName() { return name; }
}

class Mul_Chair implements Chair {
    private String material, name;
    public Mul_Chair() { this.SetMaterial(); this.SetName(); }

    public void SetMaterial() { this.material = "aluminium"; }

    @Override
    public void SetName() { this.name = "Multifunctional"; }

    @Override
    public String getName() { return name; }
}

class Client {
    private boolean sit = false;
    private Chair chair;

    void Sit(Chair chair) {
        if (sit) System.out.println("I'm sitting on the another chair!");
        else {
            System.out.println("I've sat down on " + chair.getName() + " chair!");
            this.chair = chair;
            sit = true;
        }
    }

    public void stand()  {
        if (!sit) System.out.println("I've already stood up!");
        else {
            System.out.println("I've stood up from " + chair.getName() + " chair!");
            this.sit = false;
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Chair chair1 = new V_Chair();
        Chair chair2 = new Mul_Chair();
        Chair chair3 = new Mag_Chair();

        Client cl = new Client();

        cl.Sit(chair1);
        cl.Sit(chair2);
        cl.stand();
        cl.Sit(chair2);
        cl.stand();
        cl.stand();
    }
}