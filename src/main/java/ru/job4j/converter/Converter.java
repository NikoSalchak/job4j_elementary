package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are " + euro + " euros." + " Test result: " + passed);
        float expected2 = 2.3333333f;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are " + dollar + " dollars" + " Test result: " + passed2);
    }
}
