public class Slyserin extends Hogvards {

    private int vlast;
    private int ambition;
    private int determination;

    public Slyserin(String name, int magicPower, int transGression, int vlast, int ambition, int determination) {
        super(name, magicPower, transGression);
        this.vlast = vlast;
        this.ambition = ambition;
        this.determination = determination;
    }

    public int getVlast() { return vlast; }
    public int getAmbition() { return ambition; }
    public int getDetermination() { return this.determination; }

    @Override
    public String toString() {
        return super.toString() + ", vlast " + vlast + ", ambition " + ambition + ", determination " + determination;
    }
    @Override
    public void says(Hogvards obj) {
        System.out.println(obj.getName() + ": I am a Slyserinian");
    }
}
