public class Ninja {
    private Integer NinjaThingsDone;

    public int getNinjaThingsDone() {
        return NinjaThingsDone;
    }

    public void doNinjaThings() {
        System.out.println("Hya, I am a ninja");
        NinjaThingsDone++;
    }

    public void greet() {
        System.out.println("I am a ninja who has done " + NinjaThingsDone.toString() + " Ninja Things");
    }
}
