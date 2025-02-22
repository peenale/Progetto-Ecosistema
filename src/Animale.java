public abstract class Animale {
    protected final String nome;
    protected int age;
    protected final int LIFE_SPAN;

    public Animale(int LIFE_SPAN, String nome) {
        this.LIFE_SPAN = LIFE_SPAN;
        this.nome = nome;
    }

    public abstract void reproduce();
    public abstract void eat();
}
