package day11.mission01;

public class Membership {
    protected String customerName;
    protected String rank;
    protected int payment;
    protected double discountRatio;
    protected int finalPrice;
    protected int point;
    protected double pointRatio;
    protected int hour;
    protected int parkingFeePerHour;
    protected int parkingFee;

    protected Membership(String name, String rank, int payment, int hour) {
        this.customerName = name;
        this.rank = rank;
        this.payment = payment;
        this.hour = hour;
    }

    public void showInfo() {
        finalPrice = payment - (int) (payment * discountRatio);
        point = (int) (payment * pointRatio);
        parkingFee = (int) (hour * parkingFeePerHour);

        String result = String.format("[고객명] %s\n[멤버십] %s\n[지불 금액] %d원\n[적립 포인트] %d점\n[주차 요금] %d원"
                , customerName, rank, finalPrice, point, parkingFee);

        System.out.printf("=============================[%s]님께=============================\n", customerName);
        System.out.println(result);
    }
}

class Red extends Membership {

    public Red(String name, String rank, int payment, int hour) {
        super(name, rank, payment, hour);
        super.discountRatio = 0;
        super.parkingFeePerHour = 3000;
        super.pointRatio = 0.01;
    }
}

class Platinum extends Membership {
    public Platinum(String name, String rank, int payment, int hour) {
        super(name, rank, payment, hour);
        super.discountRatio = 0.05;
        super.parkingFeePerHour = 1000;
        super.pointRatio = 0.05;
    }
}

class Diamond extends Membership {
    private boolean consultant;
    public Diamond(String name, String rank, int payment, int hour) {
        super(name, rank, payment, hour);
        super.discountRatio = 0.1;
        super.parkingFeePerHour = 0;
        super.pointRatio = 0.1;
        this.consultant = true;
    }

    @Override
    public void showInfo() {
        finalPrice = payment - (int) (payment * discountRatio);
        point = (int) (payment * pointRatio);
        parkingFee = (int) (hour * parkingFeePerHour);
        String mark = (consultant) ? "O" : "X";

        String result = String.format("[고객명] %s\n[멤버십] %s\n[전문 상담원 배정] %s\n[지불 금액] %d원\n[적립 포인트] %d점\n[주차 요금] %d원"
                , customerName, rank, mark, finalPrice, point, parkingFee);

        System.out.printf("=============================[%s]님께=============================\n", customerName);
        System.out.println(result);
    }
}