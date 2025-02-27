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

    private final String nome;
    private final int giorniPerCrescere;
    private final int tempoDiVita;
    private final int giorniPerFrutti;

    SpeciePianta(String nome, int giorniPerCrescere, int tempoDiVita, int giorniPerFrutti) {
        this.nome = nome;
        this.giorniPerCrescere = giorniPerCrescere;
        this.tempoDiVita = tempoDiVita;
        this.giorniPerFrutti = giorniPerFrutti;
    }

    public String getNome() { return nome; }
    public int getGiorniPerCrescere() { return giorniPerCrescere; }
    public int getTempoDiVita() { return tempoDiVita; }
    public int getGiorniPerFrutti() { return giorniPerFrutti; }
}
