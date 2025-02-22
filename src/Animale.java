public class Animale {
    private SpeciAnimali specie;
    private String nome;
    private int age;
    private char sesso;
    private boolean isHungry;
    private boolean hasReproduced;
    private boolean isAdult;

    /**
     * Funzione che permette ad un animale di mangiare, se disponibile,
     * un frutto di una pianta per sopravvivere.
     *
     * @param   piante_disponibili Lista delle piante disponibili nell'Ecosistema
     */
    public void mangia(List<Pianta> piante_disponibili) {
        //TODO implementare il metodo dopo la creazione della classe Pianta
            //FIXME aggiungere le classi mancanti
            // - Pianta
            // - SpeciPiante

        /*
        per ogni pianta tra le piante_commestibili:
            se ha fame E se è presente nelle piante_disponibili E se la pianta ha frutti
                diminuisci il numero di frutti della pianta
            fse
        fciclo
         */
    }

    public boolean isAdult() {
        return isAdult;
    }

    public boolean hasReproduced() {
        return hasReproduced;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public int getAge() {
        return age;
    }

    public String getNome() {
        return nome;
    }

    /*
    public SpeciAnimali getSpecie() {
        return specie;
    }
    */
}
