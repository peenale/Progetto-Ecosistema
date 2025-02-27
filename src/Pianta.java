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
    public void cresce(){
        eta++;
        if(eta>=speciePianta.getGiorniCrescita())
            adulta = true;
        if(eta>=speciePianta.getGiorniCrescita())
            frutti = true;
    }

    public boolean muore(){
        return eta>=speciePianta.getTempoVita();
    }
}
