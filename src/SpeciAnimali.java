import java.util.List;

/*
Melo
Pero
Banano
Sequoia
Pomodori
Canapa
Alloro
Betulla
Acacia
Canne da zucchero

Scimmie
Lupi
Dodo
Orso
Gatti
Pinguini
Cani
Ornitorinco (si chiama Perry)
Pinguini Tattici Nucleari Imperatori (livello 3) (si chiama Gaio Giulio Cesare Ottaviano Augusto)
Lama
* */

public enum SpeciAnimali {
    LUPO("Lupo", 4, 20, 5, List.of(SpeciePianta.MELO)),
    ORSO("Orso", 2, 30, 14, List.of(SpeciePianta.BETULLA)),
    SCIMMIA("Scimmia", 2, 25, 5, List.of(SpeciePianta.BANANO)),
    DODO("Dodo", 3, 15, 5, List.of(SpeciePianta.CANAPA)),
    GATTO("Gatto", 5, 20, 7, List.of(SpeciePianta.CANNE_DA_ZUCCHERO)),
    PINGUINO("Pinguino", 2, 30, 10, List.of(SpeciePianta.SEQUOIA)),
    CANE("Cane", 7, 25, 5, List.of(SpeciePianta.POMODORI)),
    ORNITORINCO("Ornitorinco", 3, 30, 6, List.of(SpeciePianta.ACACIA)),
    LAMA("Lama", 2, 40, 10, List.of(SpeciePianta.PERO)),
    PINGUINO_TATTICO_NUCLEARE_IMPERATORE("Pinguino tattico nucleare imperatore di livello 3", 10, 100, 4, List.of(SpeciePianta.ALLORO));

    public final String NOME;
    public final int MAX_FIGLI;
    public final int LIFESPAN;
    public final int GIORNI_PER_FAME;
    public final List<SpeciePianta> PIANTE_COMMESTIBILI;
    SpeciAnimali(String nome, int max_figli, int lifespan, int giorni_per_fame, List<SpeciePianta> piante_commestibili) {
        this.NOME = nome;
        this.MAX_FIGLI = max_figli;
        this.LIFESPAN = lifespan;
        this.GIORNI_PER_FAME = giorni_per_fame;
        this.PIANTE_COMMESTIBILI = piante_commestibili;
    }
}
