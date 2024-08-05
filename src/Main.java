public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Griffindor[] griffindors = {
                new Griffindor("Garry Potter", 56, 73, 74, 79),
                new Griffindor("Germiona Granger", 87, 78, 59, 91),
                new Griffindor("Ron Wisley", 43, 54, 70, 83)};
        Slyserin[] slyserins = {
                new Slyserin("Drako Malfoy", 72, 74, 80, 81, 57),
                new Slyserin("Graham Montegu", 36, 60, 59, 48, 23),
                new Slyserin("Gregory Goil", 27, 91, 41, 33, 44)};

        for (Hogvards stud: griffindors) { System.out.println(stud); }
        for (Hogvards stud: slyserins) { System.out.println(stud); }

        griffindors[0].compareAllStudents(slyserins[0]);
        griffindors[0].compareStudents(griffindors[2]);

        Hogvards[] hogvardStudenst = new Hogvards[] {griffindors[0], slyserins[0], griffindors[1], slyserins[2]};
        for(Hogvards stud: hogvardStudenst) {
            //System.out.println(stud.says(stud));
            stud.says(stud);
        }
        //Griffindor.compareStudents(0, 1);
    }

}