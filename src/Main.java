public class Main {
    public static void main(String[] args) {

        // Задача 1.
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2.
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(" ");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3.
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(" ");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println(" ");

        // Задача 4.
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println(" ");

        // Задача 5.
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println(" ");

        // Задача 6.
        var WeightOneBoxer = 78.2;
        var WeightSecondBoxer = 82.7;
        var TotalWeight = WeightOneBoxer + WeightSecondBoxer;
        System.out.println("Общий вес двух бойцов: " + TotalWeight + " кг.");
        var WeightDifference = WeightSecondBoxer - WeightOneBoxer;
        System.out.println("Разница между весами бойцов: " + WeightDifference + " кг.");
    }
}