public class Pianta {
    private SpeciePianta speciePianta;
    private int eta;
    private boolean adulta, frutti;

    public Pianta(SpeciePianta speciePianta){
        this.speciePianta = speciePianta;
        eta = 0;
        adulta = false;
        frutti = false;
    }

    public int getEta() {
        return eta;
    }
    public boolean isAdulta() {
        return adulta;
    }
    public boolean isFrutti() {
        return frutti;
    }
    public SpeciePianta getSpeciePianta() { return speciePianta; }

    public void cresce(){
        eta++;
        if(!adulta && eta>=speciePianta.getGiorniPerCrescere())
            adulta = true;
        if(!frutti && eta>=speciePianta.getGiorniPerFrutti())
            frutti = true;
    }

    public boolean isMorta(){
        return eta>=speciePianta.getTempoDiVita();
    }
}
