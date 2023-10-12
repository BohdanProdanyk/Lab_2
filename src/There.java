public class There {
    int number1;
    int number2;
    int number3;
    int number4;
    public There(int number1, int number2, int number3, int number4) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }
    public  There(int i){
        number1 = number2 = number3 = number4 = i;
    }
    public  There(int i,int number4){
        number1 = number2 = number3 = i;
        this.number4 = number4;
    }
    public There(){
    }
    int x3(){
        int numeric1;
        numeric1 = number1 + number3 + number4;
        return numeric1;
    }
    double x3(double number1, double number3, double number4){
        double numeric1 = number1 + number3 + number4;
        return numeric1;
    }
    void y3(){
        int numeric2 = (number1 - number4) * 2 ;
        System.out.println(numeric2);
    }
    void y3(int n){
        int numeric2 = (number1 - number4) * n;
        System.out.println(numeric2);
    }
    int metod(int xx,int yy){
        int cc = xx / yy;
        return cc;
    }
}
