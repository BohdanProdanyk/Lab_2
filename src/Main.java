public class Main {
    public static void main(String[] args) {
        System.out.println("Клас One");
        One one = new One("Porshe",24,150, 2100);
        //Перевизначиння методів один double другий int
        //Час за який машина проїде дистанцію
        System.out.println(one.x());
        System.out.println(one.x());
        //Довільна логіка
        one.y();
        one.y(8);
        //перевантаження
        System.out.println(one.metod(5,5));

        System.out.println("Клас Two");
        Two two = new Two();
        //Рекурсія
        two.recursiveMethod(4);

        //превантаження
        System.out.println(two.metod(2,2));


        System.out.println("Клас There");
        There th1 = new There(15,26,17,30);
        There th2 = new There(11);
        There th4 = new There();

        System.out.println(th1.x3());
        System.out.println(th2.x3());

        th1.y3();
        th2.y3();
        //Перевантаження
        System.out.println(th1.metod(10,5));
    }
}
