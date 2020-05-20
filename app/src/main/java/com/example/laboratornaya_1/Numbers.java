package com.example.laboratornaya_1;

public class Numbers {
    int kh = 34;
    static String[][] hex = {
            {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
            {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"},
    };

    static String[] str11 = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать", "двадцать"};

    static String[] str10 = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};

    static String[] str100 = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
    static String[] str1000 = {"тысяча", "тысячи", "тысяч"};
    static String[] str1000000 = {"миллион"};


    public static String units(int a1) {
        //if (length == 1 & a != 0) {

        String result1 = hex[0][a1];


        return result1;
    }
    public static String units2(int a1) {
        //if (length == 1 & a != 0) {

        String result1 = hex[1][a1];


        return result1;
    }

    public static String dozens(int a10) {
        //if (length == 2 & a != 0) {
        int dozens = a10 / 10;
        int units = a10 % 10;
        String result10 = null;
        if (dozens == 1)
            result10 = str11[units];
        if (dozens == 0)
            result10 = units(units);
        if(dozens!=1&dozens!=0)
            result10 = str10[dozens] + " " + units(units);


        return result10;
    }
    public static String dozens2(int a10) {
        //if (length == 2 & a != 0) {
        int dozens = a10 / 10;
        int units = a10 % 10;
        String result10 = null;
        if (dozens == 1)
            result10 = str11[units];
        if (dozens == 0)
            result10 = units(units);
        else
            result10 = str10[dozens] + " " + units2(units);


        return result10;
    }

    public static String hundreds(int a100) {
        // if (length == 3 & a != 0) {
        int n = a100;

        int hundreds = n / 100;
        int dozen = n % 100;
        int unit = n % 10;

        String result100;
        if (hundreds>=1)
            result100 = str100[hundreds] + " " + dozens(dozen);
        else
            result100 = str100[hundreds] + "" + dozens(dozen);

        return result100;
    }
    public static String hundreds2(int a100) {
        // if (length == 3 & a != 0) {
        int n = a100;

        int hundreds = n / 100;
        int dozen = n % 100;
        int unit = n % 10;

        String result100;

        result100 = str100[hundreds] + " " + dozens2(dozen);

        return result100;
    }


    public static String thousands(int a1000) {

        //if (length==4&a!=0) {
        int n = a1000;
        int thousands = n / 1000;
        int hundreds = n% 1000;
        int dozen = n % 100;
        int unit = n% 10;


        String result1000 = null;

        if (a1000==1000000)
            result1000="один миллион";
        else{
            if (thousands >= 10 & thousands <= 20)
                result1000 = dozens(thousands) + " " + str1000[2] + " " + hundreds(hundreds);
            if(thousands < 10&thousands % 10 == 1)
                result1000 = hex[1][thousands] + " " + str1000[0] + " " + hundreds(hundreds);
            if ((thousands % 10 == 2 | thousands % 10 == 3 | thousands % 10 == 4) & (thousands < 10))
                result1000 = hex[1][thousands] + " " + str1000[1] + " " + hundreds(hundreds);
            if ((thousands % 10 == 0 | thousands % 10 == 5 | thousands % 10 == 6 | thousands % 10 == 7 | thousands % 10 == 8 | thousands % 10 == 9) & (thousands <10))
                result1000 = hex[1][thousands] + " " + str1000[2] + " " + hundreds(hundreds);



            if (thousands % 10 == 1 & (thousands > 20))
                result1000 = hundreds2(thousands) + " " + str1000[0] + " " + hundreds(hundreds);
            if ((thousands % 10 == 2 | thousands % 10 == 3 | thousands % 10 == 4) & (thousands > 20))
                result1000 = hundreds2(thousands) + " " + str1000[1] + " " + hundreds(hundreds);
            if (thousands == 0)
                result1000 = hundreds(hundreds);
            if ((thousands % 10 == 0 | thousands % 10 == 5 | thousands % 10 == 6 | thousands % 10 == 7 | thousands % 10 == 8 | thousands % 10 == 9) & (thousands > 20))
                result1000 = hundreds2(thousands) + " " + str1000[2] + " " + hundreds(hundreds);}

        return result1000;
    }



}
