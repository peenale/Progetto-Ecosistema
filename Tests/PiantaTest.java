import org.junit.Test;
import static org.junit.Assert.*;

public class PiantaTest {

    @Test
    public void piantaTest(){
        Pianta pianta = new Pianta(SpeciePianta.BANANO, 10, true, true);
        assertEquals("La pianta dovrebbe avere età 0", 0, pianta.getEta());
        assertFalse("La pianta non dovrebbe essere adulta", pianta.isAdulta());
        assertFalse("La pianta non dovrebbe poter dare frutti", pianta.isFrutti());
    }

    @Test
    public void crescitaTest(){
        Pianta pianta = new Pianta(SpeciePianta.MELO, 0, false, false);
        pianta.cresce();
        assertEquals("L'età dovrebbe essere 1",1, pianta.getEta());
        assertFalse("La pianta dovrebbe essere ancora un seme", pianta.isAdulta());
        assertFalse("La pianta non dovrebbe ancora poter dare frutti", pianta.isFrutti());
        for(int i=0; i<16; i++)
            pianta.cresce();
        assertTrue("La pianta dovrebbe essere adulta", pianta.isAdulta());
        assertTrue("La pianta dovrebbe poter dare frutti", pianta.isFrutti());
    }

    @Test
    public void morteTest(){
        Pianta pianta = new Pianta(SpeciePianta.CANAPA, 0, false, false);
        for(int i=0; i<14; i++)
            pianta.cresce();
        assertFalse("La pianta non dovrebbe essere ancora morta", pianta.isMorta());
        pianta.cresce();
        assertTrue("La pianta dovrebbe essere morta", pianta.isMorta());
    }
}
