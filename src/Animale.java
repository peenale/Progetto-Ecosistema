import java.util.List;

public class Animale {
    private SpecieAnimalie specie;
    private String nome;
    private int age;
    private int daysSinceLastMeal;
    private char sesso;
    private boolean hasReproduced;
    private boolean isDead;

    public Animale(SpecieAnimalie specie, int globalTimer) {
        this.specie = specie;
        this.nome = specie.NOME + globalTimer;
        this.age = 0;
        this.sesso = globalTimer % 2 == 0 ? 'm' : 'f';
        this.daysSinceLastMeal = 0;
        this.hasReproduced = false;
        this.isDead = false;
    }

    public Animale(SpecieAnimalie specie, int globalTimer, String nome) {
        this.specie = specie;
        this.nome = nome;
        this.age = 0;
        this.sesso = globalTimer % 2 == 0 ? 'm' : 'f';
        this.daysSinceLastMeal = 0;
        this.hasReproduced = false;
        this.isDead = false;
    }

    /**
     * Funzione che permette ad un animale di mangiare, se disponibile,
     * un frutto di una pianta per sopravvivere.
     *
     * @param   piante_disponibili Lista delle piante disponibili nell'Ecosistema
     */
    public void mangia(List<Pianta> piante_disponibili) {
        for (Pianta pianta : piante_disponibili) {
            if (isHungry() && specie.PIANTE_COMMESTIBILI.contains(pianta.getSpecie()) && pianta.hasFruits()) {
                daysSinceLastMeal = 0;
                return;
            }
        }
   }

    /**
     * <p>Funzione che incrementa l'età dell'animale.
     * <p>Tiene traccia anche dei giorni passati dall'ultima volta che ha mangiato.
     * <p>Si occupa anche della morte dell'animale per anzianità o per fame.
     */
   public void cresce() {
        age++;
        daysSinceLastMeal++;

        if (age >= specie.LIFESPAN || daysSinceLastMeal >= 1.5*specie.GIORNI_PER_FAME) {
            isDead = true;
        }
   }

    /**
     * <p>Funzione che permette ad un animale di riprodursi, se esiste un altro animale che
     * soddisfa le caratteristiche di riproduzione.
     * <p><b>CARATTERISTICHE DI RIPRODUZIONE:</b>
     * <ul>
     *     <li>L'animale deve essere adulto</li>
     *     <li>L'animale non deve essere affamato</li>
     * </ul>
     *
     * @param animaliEcosistema Lista degli animali presenti nell'ecosistema
     * @param globalTimer        Tempo di vita dell'ecosistema
     * @return numero di figli generati, SE generati (0 in caso contrario)
     */
   public int riproduci(List<Animale> animaliEcosistema, int globalTimer) {
        for (Animale animale : animaliEcosistema) {
            if (
                    animale != this &&
                    animale.specie == this.specie && animale.getSesso() != this.getSesso() &&
                    !animale.hasReproduced() && !this.hasReproduced() &&
                    !animale.isHungry() && !this.isHungry()
            ) {
                animale.setHasReproduced(true);
                this.setHasReproduced(true);
                return (globalTimer % this.specie.MAX_FIGLI) + 1;
            }
        }
       return 0;
   }

    public boolean isAdult() {
        return age > specie.LIFESPAN / 3;
    }

    public boolean hasReproduced() {
        return hasReproduced;
    }

    public boolean isHungry() {
        return daysSinceLastMeal >= specie.GIORNI_PER_FAME;
    }

    public int getAge() {
        return age;
    }

    public String getNome() {
        return nome;
    }

    public int getDaysSinceLastMeal() {
        return daysSinceLastMeal;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setHasReproduced(boolean hr) {
        this.hasReproduced = hr;
    }

    public SpecieAnimalie getSpecie() {
        return specie;
    }

    public char getSesso() {
       return sesso;
    }

    public String log() {
       return String.join("-", specie.NOME, this.nome, String.valueOf(this.sesso), String.valueOf(this.age), String.valueOf(this.isAdult()), String.valueOf(this.daysSinceLastMeal), String.valueOf(this.isHungry()), String.valueOf(this.hasReproduced()), String.valueOf(this.isDead()));
    }
}
