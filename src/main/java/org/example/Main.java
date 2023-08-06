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
     short milc1 = 100;
     byte iceCream = 2 ;
     byte rawEggs = 4 ;
     byte milcgr = 105 ;
     byte oneBananas = 80;
     int milc2 = milc / milc1;
     byte oneIceCream =100;
     byte oneRawEggs = 70;
     int weightBananas = bananas * oneBananas;
     int weightMilc = milcgr * milc2 ;
     int weightIceCream = iceCream * oneIceCream;
     int weightRawEggs = rawEggs *oneRawEggs;
     int totalWeight = weightBananas + weightMilc +weightIceCream + weightRawEggs ;
     int kg = 1000;
     float weightKg = totalWeight /(float)kg;
     System.out.println( "Всего " + weightKg + " кг. всего  "+ totalWeight + " грамм" );

    }public static void task7() {
        System.out.println("Задача 7");
    byte sbros = 7;
    short a = 250;
    short b = 500;
    int kg = 1000;
    float akg= a /(float)kg;
    float bkg= b /(float)kg;
    float a1= sbros / akg;
    float b1 = sbros / bkg;

    System.out.println("Если спроцмен будет терять по " + a + " грамм в день. Ему понадобиться " + a1 + " дней. Что бы сбросить "+ sbros + "кг");
    System.out.println("Если спроцмен будет терять по " + b + " грамм в день. Ему понадобиться " + b1 + " дней. Что бы сбросить "+ sbros + "кг");

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

System.out.println("Спасибо за ответ. Просто делал домашку после почти 14 часов работы тупил страшно. Проснулся посмотрел что наделал сразу пределал но тк на работу было уже надо скидываю сейчас.");
    }




}