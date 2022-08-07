public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1

        byte lesson = 8;
        short course = 9;
        int profession = 11;
        long year = 365L;
        float f = 45.78f;
        double d = 68.42;
        char c =  33;
        boolean a = true;
        boolean b = false;

        //Задача 2

        double Boxer1 = 78.2;
        double Boxer2 = 82.7;
        double WeightOfAllBoxers = Boxer1 + Boxer2;
        double weightOfDifferent = Boxer1 - Boxer2;
        System.out.println("Общий вес боксера " + WeightOfAllBoxers);
        System.out.println("Разница в весе боксеров" + weightOfDifferent);

                //Задача 3

        int banana= 5;
        int bananaWeight = 80;
        int milk = 200 / 100;
        int milkWeight = 105;
        int iceCream = 2;
        int iceCreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        int total = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        int gramsInKg= 1000;
        double totalKgs = total / (gramsInKg * 1.0);
        System.out.println(totalKgs);

               //Задача 4

        int weight = 7;
        int GramsInKg = 1000;
        int weightInGrams = weight * gramsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / maxGramsPerDay;
        int maxDays = weightInGrams / minGramsPerDay;

        double avgDays = (minDays + maxDays) / (2 * 1.0);

        System.out.println("min: " + minDays);
        System.out.println("max: " + maxDays);
        System.out.println("avg: " + avgDays);

             //Задача 5

        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * multiplier));

        int mashaDeference = (mashaNewSalary - mashaSalary) * 12;
        int denisDeference = (denisNewSalary - denisSalary) *12;
        int kristinaDeference = (kristinaNewSalary - kristinaSalary) *12;

        System.out.println ("Маша теперь получает "+ mashaNewSalary + "рублей. Годовой доход вырос на" + mashaDeference + "рублей.");
        System.out.println ("Денис теперь получает "+ denisNewSalary + "рублей. Годовой доход вырос на" + denisDeference + "рублей.");
        System.out.println ("Кристина теперь получает "+ kristinaNewSalary + "рублей. Годовой доход вырос на" + kristinaDeference + "рублей.");














    }
}