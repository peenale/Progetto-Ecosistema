import java.util.Iterator;
import java.util.List;

public class Ecosistema {
    private int globalTimer;
    private List<Animale> animali;
    private List<Pianta> piante;

    public Ecosistema(List<Animale> animali, List<Pianta> piante) {
        this.animali = animali;
        this.piante = piante;
        globalTimer = 0;
    }

    public void aggiungiAnimali(int n, SpecieAnimalie specie) {
        for (int i = 0; i < n; i++) {
            animali.add(new Animale(specie, globalTimer));
        }
    }

    public void avanzaGiorno() {
        globalTimer++;

        System.out.println("GIORNO " + globalTimer);

        for (Pianta pianta : piante) {
            pianta.cresce();

            System.out.println(pianta.log());
        }

        Iterator<Animale> iterator = animali.iterator();
        while (iterator.hasNext()) {
            Animale animale = iterator.next();
            animale.cresce();

            if (animale.isDead()) {
                iterator.remove();
            } else {
                animale.mangia(piante);
                animale.riproduci(animali, globalTimer);
            }

            System.out.println(animale.log());
        }

        System.out.println();
    }

    public int getGlobalTimer() {
        return globalTimer;
    }

    public List<Animale> getAnimali() {
        return animali;
    }

    public List<Pianta> getPiante() {
        return piante;
    }
}
