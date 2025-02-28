import java.util.List;

public class Animale {
    private SpeciAnimali specie;
    private String nome;
    private int age;
    private int daysSinceLastMeal;
    private char sesso;
    private boolean isHungry;
    private boolean hasReproduced;
    private boolean isDead;

    /**
     * Funzione che permette ad un animale di mangiare, se disponibile,
     * un frutto di una pianta per sopravvivere.
     *
     * @param   piante_disponibili Lista delle piante disponibili nell'Ecosistema
     */
    public void mangia(List<Pianta> piante_disponibili) {
        for (Pianta pianta : piante_disponibili) {
            if (isHungry && specie.PIANTE_COMMESTIBILI.contains(pianta.getSpeciePianta()) && pianta.isFrutti()) {
                isHungry = false;
                return;
            }
        }
   }

   public void cresce() {
        age++;
        daysSinceLastMeal++;

        if (age >= specie.LIFESPAN || daysSinceLastMeal >= 1.5*specie.GIORNI_PER_FAME) {
            isDead = true;
        }
   }

   public int riproduci(List<Animale> animali_ecosistema, int globalTimer) {
        for (Animale animale : animali_ecosistema) {
            if (
                    animale != this &&
                    animale.specie == this.specie &&
                    !animale.hasReproduced() && !this.hasReproduced() &&
                    !animale.isHungry() && !this.isHungry()
            ) {
                animale.setHasReproduced(true);
                this.setHasReproduced(true);
                return this.specie.MAX_FIGLI % globalTimer;
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

    /*
    public SpeciAnimali getSpecie() {
        return specie;
    }
    */
}
