public class Pianta {
    private SpeciePianta speciePianta;
    private int eta;
    private boolean adulta, frutti;

    public Pianta(SpeciePianta speciePianta, int eta, boolean adulta, boolean frutti){
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
    public SpeciePianta getSpeciePianta(){
        return speciePianta;
    }

    public void cresce(){
        eta++;
        if(eta>=speciePianta.getGiorniPerCrescere())
            adulta = true;
        if(eta>=speciePianta.getGiorniPerFrutti())
            frutti = true;
    }

    public boolean isMorta(){
        return eta>=speciePianta.getTempoDiVita();
    }
}
