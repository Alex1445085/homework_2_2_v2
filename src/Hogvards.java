public abstract class Hogvards {

    private String name;
    private int magicPower;
    private int transGression;

    public Hogvards(String name, int magicPower, int transGression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transGression = transGression;
    }
    public String getName() {return this.name;}
    public int getMagicPower() {return this.magicPower;}
    public int getTransGression() {return this.transGression;}

    @Override
    public String toString() { return "Name " + name + ", power " + magicPower + ", transGression " + transGression; }
    public void says(Hogvards obj) { System.out.println(obj.name + ": I am a Hogvard student!"); };

    public void compareAllStudents(Hogvards student) {
        if ((this.getMagicPower() + this.getTransGression()) > (student.getMagicPower() + student.getTransGression())) {
            System.out.println("Student " + this.getName() + " has more power then " + student.getName());
        } else if (this.getMagicPower() + this.getTransGression() < student.getMagicPower() + student.getTransGression()) {
            System.out.println("Student " + student.getName() + " has more power then " + this.getName());
        } else {
            System.out.println("Students " + this.getName() + " & " + student.getName() + " - the same");
        }
    }
}
