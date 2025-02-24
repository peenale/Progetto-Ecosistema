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
    LUPO("Lupo", 4, 20, List.of("")),
    ORSO("Orso", 2, 30, List.of("")),
    SCIMMIA("Scimmia", 2, 25, List.of("")),
    DODO("Dodo", 3, 15, List.of("")),
    GATTO("Gatto", 5, 20, List.of("")),
    PINGUINO("Pinguino", 2, 30, List.of("")),
    CANE("Cane", 7, 25, List.of("")),
    ORNITORINCO("Ornitorinco", 3, 30, List.of("")),
    LAMA("Lama", 2, 40, List.of("")),
    PINGUINO_TATTICO_NUCLEARE_IMPERATORE("Pinguino tattico nucleare imperatore di livello 3", 10, 100, List.of(""));

    public final String NOME;
    public final int MAX_FIGLI;
    public final int LIFESPAN;
    public final List<String> PIANTE_COMMESTIBILI;
    SpeciAnimali(String nome, int max_figli, int lifespan, List<String> piante_commestibili) {
        this.NOME = nome;
        this.MAX_FIGLI = max_figli;
        this.LIFESPAN = lifespan;
        this.PIANTE_COMMESTIBILI = piante_commestibili;
    }
}
