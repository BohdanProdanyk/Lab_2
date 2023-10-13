public class Two {
    public void recursiveMethod(int n) {
         if (n <= 0) {
             System.out.println("Рекурсія завершена");
         }else{
             System.out.println("Рекурсивний метод n = " + n);
             recursiveMethod(n - 1);
         }
        }
    int metod(int xx,int yy){
        int cc = xx * yy;
        return cc;
    }
    public void process(One color){
        
    }
}

