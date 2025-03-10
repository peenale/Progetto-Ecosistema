import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animale> animali_iniziali = List.of(
                new Animale(SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE, 0, 0, 'm', "Gaio Giulio Cesare Ottaviano Augusto"),
                new Animale(SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE, 0, 0, 'f', "Livia Drusilla"),
                new Animale(SpecieAnimalie.ORNITORINCO, 0, 0, 'm', "Perry"),
                new Animale(SpecieAnimalie.ORNITORINCO, 0, 0, 'f', "Reppy"),
                new Animale(SpecieAnimalie.DODO, 0, 0, 'm', "🤡"),
                new Animale(SpecieAnimalie.DODO, 0, 0, 'f', "🍋")
        );
        List<Pianta> piante_iniziali = List.of(
                new Pianta(SpeciePianta.ALLORO),
                new Pianta(SpeciePianta.CANAPA),
                new Pianta(SpeciePianta.ACACIA)
        );

        Ecosistema ecosistema = new Ecosistema(animali_iniziali, piante_iniziali);

        while (!ecosistema.getAnimali().isEmpty()) {
            ecosistema.avanzaGiorno();
        }
    }
}