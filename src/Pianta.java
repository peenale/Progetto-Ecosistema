public class Pianta {
    private SpeciePianta specie;
    private int age;
    private boolean fruits;

    public Pianta(SpeciePianta speciePianta){
        this.specie = speciePianta;
        age = 0;
        fruits = false;
    }

    public int getAge() {
        return age;
    }
    public boolean isAdult() {
        return age >= specie.GIORNI_PER_CRESCERE;
    }
    public boolean hasFruits() {
        return fruits;
    }

    public SpeciePianta getSpecie() { return specie; }

    /**
     * <p>Aumenta l'età della pianta.
     * <p>Si occupa anche di far crescere i frutti dell'albero.
     */
    public void cresce(){
        age++;
        if(!hasFruits() && isAdult())
            fruits = true;
    }

    public boolean isDead(){
        return age >= specie.TEMPO_DI_VITA;
    }

    public String log() {
        return String.join("-", specie.NOME, String.valueOf(this.age), String.valueOf(this.isAdult()), String.valueOf(this.hasFruits()), String.valueOf(this.isDead()));
    }
}
