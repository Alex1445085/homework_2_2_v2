public class Griffindor extends Hogvards{

    private int brave;
    private int honor;

    public Griffindor(String name, int magicPower, int transGression, int brave, int honor) {
        super(name, magicPower, transGression);
        this.brave = brave;
        this.honor = honor;
    }

    public int getBrave() { return this.getBrave(); }
    public int getHonor() { return this.getHonor(); }
    public void compareStudents(Griffindor student) {
        if (this.brave + this.honor > student.brave + student.honor) {
            System.out.println("Student " + this.getName() + " the best then " + student.getName());
        } else if(this.brave + this.honor < student.brave + student.honor) {
            System.out.println("Student " + student.getName() + " the best then " + this.getName());
        } else {
            System.out.println("Students " + this.getName() + " & " + student.getName() + " the same");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", brave " + brave + ", honor " + honor;
    }
    @Override
    public void says(Hogvards obj) {
        System.out.println(obj.getName() + ": I am a Griffindorian!");
    }
}
