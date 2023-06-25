public class Main {
    public Main() {
    }

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
        double dog = 8.0;
        System.out.println(dog);
        double cat = 3.6;
        System.out.println(cat);
        int paper = 763789;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;
        dog -= 3.5;
        System.out.println(dog);
        --cat;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;
        dog += 4.0;
        System.out.println(dog);
        cat += 4.0;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        double frog = 3.5;
        System.out.println(frog);
        frog *= 10.0;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4.0;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        double OneBoxer = 78.2;
        System.out.println("Вес первого боксера" + OneBoxer + "кг!");
        double TwoBoxer = 82.7;
        System.out.println("Вес второго боксера" + TwoBoxer + "кг!");
        double TotalWeight = OneBoxer + TwoBoxer;
        System.out.println("Общий вес 2 боксеров" + TotalWeight + "кг!");
        double WeightDifference = TwoBoxer - OneBoxer;
        System.out.println("Разница в весе между 2 боксерами" + WeightDifference + "кг!");
    }

    public static void task7() {
        System.out.println("Задача 7");
        double OneBoxer = 78.2;
        System.out.println("Вес первого боксера" + OneBoxer + "кг!");
        double TwoBoxer = 82.7;
        System.out.println("Вес второго боксера" + TwoBoxer + "кг!");
        double WeightDifferenceOneWay = TwoBoxer - OneBoxer;
        System.out.println("Разница в весе между 2 боксерами" + WeightDifferenceOneWay + "кг!");
        double WeightDifferenceTwoWay = TwoBoxer % OneBoxer;
        System.out.println("Разница в весе между 2 боксерами другим способом" + WeightDifferenceTwoWay + "кг!");
    }

    public static void task8() {
        System.out.println("Задача 8");
        int TotalTime = 640;
        System.out.println("ОБщее время" + TotalTime + "часов");
        int WorkingHoursPerEmployee = 8;
        System.out.println("Рабочее время 1 работника" + WorkingHoursPerEmployee + "часов");
        int TotalEmployees = TotalTime / WorkingHoursPerEmployee;
        System.out.println("Всего работников в компании" + TotalEmployees + "- человек");
        int StaffIncrease = 96;
        System.out.println("Увеличется штат" + StaffIncrease);
        int BecameEmployess = TotalEmployees + StaffIncrease;
        System.out.println("Увеличение штата всего" + BecameEmployess);
        int NewWorkingHoursPerEmployee = TotalTime / BecameEmployess;
        System.out.println("Если в компании работает" + BecameEmployess + "человек, то всего" + NewWorkingHoursPerEmployee + "часов работы может быть поделено между сотрудниками");
    }
}