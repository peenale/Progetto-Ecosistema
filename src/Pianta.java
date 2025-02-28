public class Pianta {
    private SpeciePianta speciePianta;
    private int age;
    private boolean fruits;

    public Pianta(SpeciePianta speciePianta){
        this.speciePianta = speciePianta;
        age = 0;
        fruits = false;
    }

    public int getAge() {
        return age;
    }
    public boolean isAdult() {
        return age >= speciePianta.GIORNI_PER_CRESCERE;
    }
    public boolean hasFruits() {
        return fruits;
    }
    public SpeciePianta getSpeciePianta() { return speciePianta; }

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
        return age >=speciePianta.TEMPO_DI_VITA;
    }
}
