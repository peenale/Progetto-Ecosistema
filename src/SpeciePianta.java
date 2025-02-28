public enum SpeciePianta {
    MELO("Melo", 5, 30, 15),
    PERO("Pero", 6, 28, 14),
    BANANO("Banano", 7, 35, 18),
    SEQUOIA("Sequoia", 30, 500, 100),
    POMODORI("Pomodori", 3, 20, 10),
    CANAPA("Canapa", 4, 15, 7),
    ALLORO("Alloro", 6, 40, 20),
    BETULLA("Betulla", 8, 50, 25),
    ACACIA("Acacia", 7, 45, 22),
    CANNE_DA_ZUCCHERO("Canne da zucchero", 5, 25, 12);

    public final String NOME;
    public final int GIORNI_PER_CRESCERE;
    public final int TEMPO_DI_VITA;
    public final int GIORNI_PER_FRUTTI;

    SpeciePianta(String nome, int giorniPerCrescere, int tempoDiVita, int giorniPerFrutti) {
        this.NOME = nome;
        this.GIORNI_PER_CRESCERE = giorniPerCrescere;
        this.TEMPO_DI_VITA = tempoDiVita;
        this.GIORNI_PER_FRUTTI = giorniPerFrutti;
    }

}
