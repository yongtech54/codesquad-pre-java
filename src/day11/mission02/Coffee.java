package day11.mission02;

public class Coffee {
    protected String name;
    Coffee(String name) {
        this.name = name;
    }

    protected void brewing() {
        System.out.print(name);
    }
}

class EtiopiaAmericano extends Coffee{
    EtiopiaAmericano() {
        super("EtiopiaAmericano");
    }
}

class KenyaAmericano extends Coffee {
    KenyaAmericano() {
        super("KenyaAmericano");
    }
}

class BrazilAmericano extends Coffee {
    BrazilAmericano() {
        super("BrazilAmericano");
    }
}

class HawaiiAmericano extends Coffee {
    HawaiiAmericano() {
        super("HawaiiAmericano");
    }
}

class Latte extends Coffee {
    Latte(Coffee coffee) {
        super(coffee.name);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}

class Mocha extends Coffee {
    private Coffee coffee;

    Mocha(Coffee coffee) {
        super(coffee.name);
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(" Adding Mocha Syrup");
    }
}

class WhippedCream extends Coffee {
    private Coffee mocha;
    WhippedCream(Coffee mocha) {
        super(mocha.name);
        this.mocha = mocha;
    }

    @Override
    public void brewing() {
        mocha.brewing();
        System.out.print(" Adding Whipped Cream");
    }
}