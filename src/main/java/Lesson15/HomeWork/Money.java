package Lesson15.HomeWork;
public class Money {
    private long UAH;
    private byte kopijka;

    public Money() {
    }
    public Money(long UAH, byte kopijka) {
        kopijka = (byte) Math.absExact(kopijka);
        UAH = Math.abs(UAH);
        if (kopijka >= 100){
            UAH++;
            kopijka -= 100;
        }
        this.UAH = Math.abs(UAH);
        this.kopijka = kopijka;
    }

    public void show(){
        System.out.println(UAH + "," + kopijka);
    }

    public void add(long UAH, byte kopijka){
        int temp = this.kopijka;
        this.UAH += UAH;
        temp += kopijka;
        if (temp > 100){
            this.UAH += 1;
            temp -=100;
            this.kopijka = (byte) temp;
        }
    }

    public void substract (long UAH, byte kopijka){
        int temp = this.kopijka;
        this.UAH -= UAH;
        temp -= kopijka;
        if (temp < 100){
            this.UAH -= 1;
            temp += 100;
            this.kopijka = (byte) temp;
        }
    }
}

