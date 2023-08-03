public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
       byte a= 100;
        System.out.println("byte = " + a);
       short b= 300;
        System.out.println("short ="+ b);
       int c = 400000;
       System.out.println("int =" + c);
       long d = 888L;
       System.out.println("long = " + d);
       float i = -1.2F;
       System.out.println("float = " + i);
       double f =  1.1;
       System.out.println("double = " + f);




    }
    public static void task2() {
        System.out.println("Задача 2");
    byte a=67;
    short b =-159 ;
    int f = 27897;
    long c = 987678965549L ;
    float d =27.1F;
    double i = 2.786;
    char g = 569;
    System.out.println("byte =" + a);
    System.out.println("short =" + b);
    System.out.println("char =" + g);
    System.out.println("int = " + f);
    System.out.println("long = " + c);
    System.out.println("float =" + d);
    System.out.println("double = "+ i);
    }
    public static void task3() {
        System.out.println("Задача 3");
       byte lyudmilaPavlovna =23;
        byte annaSergeevna=27;
        byte catherineAndreyevna=30;
        short totalPapers = 480;
        int totalStudents = lyudmilaPavlovna + annaSergeevna + catherineAndreyevna;
        int pepersOneStudents = totalPapers / totalStudents;
        System.out.println("На каждого ученика рассчитано " + pepersOneStudents + " Листов бумаги");

    }
    public static void task4() {
        System.out.println("Задача 4");
        byte pm = 16;
        byte za = 2;
        byte vp1 = 20;
        short vp2 = 1440;
        short vp3 = 4320;
        int vp4 = 43200;
       int zaOneMint= pm / za;
        int proizVp1= zaOneMint * vp1;
        System.out.println("За " + vp1 + " минут машина произвела " + proizVp1 +" штук бутылок");
        int proizVp2 = zaOneMint * vp2 ;
        int proizVp3 = zaOneMint * vp3 ;
        int proizVp4 = zaOneMint * vp4 ;
        System.out.println("За " + vp2 + " минут машина произвела " + proizVp2 +" штук бутылок");
        System.out.println("За " + vp3 + " минут машина произвела " + proizVp3 +" штук бутылок");
        System.out.println("За " + vp4 + " минут машина произвела " + proizVp4 +" штук бутылок");}
        public static void task5() {
            System.out.println("Задача 5");
            byte totalСansOfPaint = 120;
            byte white = 2;
            byte brown = 4;
            int oneClass = white + brown;
            int totalСlasses = totalСansOfPaint / oneClass ;
            int totalWhite = totalСlasses * white;
            int totalBrown = totalСlasses * brown;
            System.out.println("В школе где " + totalСlasses + " классов , нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски ");
    }
    public static void task6() {
        System.out.println("Задача 6");
     byte bananas = 5  ;
     short milc = 200 ;
     byte iceCream = 2 ;
     byte rawEggs = 4 ;
     byte milcgr = 105 ;
     byte oneBananas = 80;
     int oneMilc;
     oneMilc= milc  = (short) (milcgr * 2);
     byte oneIceCream =100;
     byte oneRawEggs = 70;
     int weightBananas = bananas * oneBananas;
     int  weightMilc = oneMilc ;
     int weightIceCream = iceCream * oneIceCream;
     int weightRawEggs = rawEggs *oneRawEggs;
     int totalWeight = weightBananas + weightMilc +weightIceCream + weightRawEggs ;
     int kg = 1000;
     float weightKg = totalWeight /(float)kg;
     System.out.println( "Всего " + weightKg + " кг. всего  "+ totalWeight + " грамм" );
     System.out.println(" Я так и непонял как с молоком быть вообще. А точней как сделать правильную формулу?");

    }public static void task7() {
        System.out.println("Задача 7");
    byte sbros = 7;
    short a = 250;
    short b = 500;
    int kg = 1000;
    float akg= a /(float)kg;
    float bkg= b /(float)kg;
    System.out.println(akg);
    System.out.println(bkg);
    float day1 = akg;
    float day2 = akg + day1;
    float day3 = akg + day2;
    float day4 = akg + day3;
    float day5 = akg + day4;
    float day6 = akg + day5;
    float day7 = akg + day6;
    float day8 = akg + day7;
    float day9 = akg + day8;
    float day10 = akg + day9;
    float day11 = akg + day10;
    float day12 = akg + day11;
    float day13 = akg + day12;
    float day14 = akg + day13;
    float day15 = akg + day14;
    float day16 = akg + day15;
    float day17 = akg + day16;
    float day18 = akg + day17;
    float day19 = akg + day18;
    float day20 = akg + day19;
    float day21 = akg + day20;
    float day22 = akg + day21;
    float day23 = akg + day22;
    float day24 = akg + day23;
    float day25 = akg + day24;
    float day26 = akg + day25;
    float day27 = akg + day26;
    float day28 = akg + day27;
    System.out.println("Что бы сбросить " +day28 + " При " + a + " граммах понадобиться 28 дней");
    float day1b = bkg;
    float day2b = bkg + day1b;
    float day3b = bkg + day2b;
    float day4b = bkg + day3b;
    float day5b = bkg + day4b;
    float day6b = bkg + day5b;
    float day7b = bkg + day6b;
    float day8b = bkg + day7b;
    float day9b = bkg + day8b;
    float day10b = bkg + day9b;
    float day11b = bkg + day10b;
    float day12b = bkg + day11b;
    float day13b = bkg + day12b;
    float day14b = bkg + day13b;
    System.out.println("Что бы сбросить " + day14b + " При " + b + " граммах понадобиться 14 дней");
    System.out.println("Меня терзает смтуные сомненья что это действительно именно так надо было сделать");
    }
    public static void task8() {
        System.out.println("Задача 8");
    int masha =67760;
    int denis =83690;
    int kristina = 76230;
    byte year = 12;
    int masha1 = masha / 100;
    int masha2 = masha1 + masha;
    int doYearMasha3 = masha * year;
    int poYearMasha4 = masha2 * year;
    int razYearIncome = poYearMasha4 - doYearMasha3;

    System.out.println("Маша теперь получает "+ masha2 + " рублей.Годовой доход вырос на " + razYearIncome + " рублей.");
    int denis1 = denis /100;
    int denis2= denis1 +denis;
    int doYearDenis3 = denis * year;
    int poYearDenis4 =denis2 * year;
    int razYearIncomeDenis = poYearDenis4 - doYearDenis3;
    System.out.println("Денис теперь получает " + denis2 + " рублей.Годовой доход вырос на " + razYearIncomeDenis+ " тугриков.");
    int kristina1 = kristina /100;
    int kristina2 = kristina1 + kristina;
    int doYearKristina3 = kristina * year;
    int poYearKristina4 = kristina2 * year;
    int razYearIncomeKristina =poYearKristina4 - doYearKristina3;
    System.out.println("Кристина теперь получает " + kristina2 + " рублей.Годовой доход вырос на "+ razYearIncomeKristina+ " кредитов.");

System.out.println("Ну этот же квест не мог быть таким легким ?");
    }




}