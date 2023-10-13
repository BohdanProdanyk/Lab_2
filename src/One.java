public class One {
    String car;
    int number;
    double speed;
    double distance;
    public One(String car, int number, double speed, double distance) {
        this.car = car;
        this.number = number;
        this.speed = speed;
        this.distance = distance;
    }
    double x(){
        double time;
        time = distance / speed;
        return time;
    }
    int x(int distance, int speed){
        int timeRound = distance / speed;
        return timeRound;
    }
    void y(){
        int went = number - 3;
        System.out.println(went);
    }
    void y(int n){
        int went = number - n;
        System.out.println(went);
    }
    int metod(int xx,int yy){
        int cc = xx + yy;
        return cc;
    }
    public void process(One car1){
        System.out.println(car1.car);
        System.out.println(car1.speed);

    }

}
