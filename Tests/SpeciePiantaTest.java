import org.junit.Test;

import static org.junit.Assert.*;

public class SpeciePiantaTest {
    @Test
    public void meloTest() {
        assertEquals("Melo", SpeciePianta.MELO.NOME);
        assertEquals(5, SpeciePianta.MELO.GIORNI_PER_CRESCERE);
        assertEquals(30, SpeciePianta.MELO.TEMPO_DI_VITA);
        assertEquals(15, SpeciePianta.MELO.GIORNI_PER_FRUTTI);
    }

    @Test
    public void peroTest() {
        assertEquals("Pero", SpeciePianta.PERO.NOME);
        assertEquals(6, SpeciePianta.PERO.GIORNI_PER_CRESCERE);
        assertEquals(28, SpeciePianta.PERO.TEMPO_DI_VITA);
        assertEquals(14, SpeciePianta.PERO.GIORNI_PER_FRUTTI);
    }

    @Test
    public void bananoTest() {
        assertEquals("Banano", SpeciePianta.BANANO.NOME);
        assertEquals(7, SpeciePianta.BANANO.GIORNI_PER_CRESCERE);
        assertEquals(35, SpeciePianta.BANANO.TEMPO_DI_VITA);
        assertEquals(18, SpeciePianta.BANANO.GIORNI_PER_FRUTTI);
    }

    @Test
    public void sequoiaTest() {
        assertEquals("Sequoia", SpeciePianta.SEQUOIA.NOME);
        assertEquals(30, SpeciePianta.SEQUOIA.GIORNI_PER_CRESCERE);
        assertEquals(500, SpeciePianta.SEQUOIA.TEMPO_DI_VITA);
        assertEquals(100, SpeciePianta.SEQUOIA.GIORNI_PER_FRUTTI);
    }

    @Test
    public void pomodoriTest() {
        assertEquals("Pomodori", SpeciePianta.POMODORI.NOME);
        assertEquals(3, SpeciePianta.POMODORI.GIORNI_PER_CRESCERE);
        assertEquals(20, SpeciePianta.POMODORI.TEMPO_DI_VITA);
        assertEquals(10, SpeciePianta.POMODORI.GIORNI_PER_FRUTTI);
    }

    @Test
    public void canapaTest() {
        assertEquals("Canapa", SpeciePianta.CANAPA.NOME);
        assertEquals(4, SpeciePianta.CANAPA.GIORNI_PER_CRESCERE);
        assertEquals(15, SpeciePianta.CANAPA.TEMPO_DI_VITA);
        assertEquals(7, SpeciePianta.CANAPA.GIORNI_PER_FRUTTI);
    }

    @Test
    public void alloroTest() {
        assertEquals("Alloro", SpeciePianta.ALLORO.NOME);
        assertEquals(6, SpeciePianta.ALLORO.GIORNI_PER_CRESCERE);
        assertEquals(40, SpeciePianta.ALLORO.TEMPO_DI_VITA);
        assertEquals(20, SpeciePianta.ALLORO.GIORNI_PER_FRUTTI);
    }

    @Test
    public void betullaTest() {
        assertEquals("Betulla", SpeciePianta.BETULLA.NOME);
        assertEquals(8, SpeciePianta.BETULLA.GIORNI_PER_CRESCERE);
        assertEquals(50, SpeciePianta.BETULLA.TEMPO_DI_VITA);
        assertEquals(25, SpeciePianta.BETULLA.GIORNI_PER_FRUTTI);
    }

    @Test
    public void acaciaTest() {
        assertEquals("Acacia", SpeciePianta.ACACIA.NOME);
        assertEquals(7, SpeciePianta.ACACIA.GIORNI_PER_CRESCERE);
        assertEquals(45, SpeciePianta.ACACIA.TEMPO_DI_VITA);
        assertEquals(22, SpeciePianta.ACACIA.GIORNI_PER_FRUTTI);
    }

    @Test
    public void canneDaZuccheroTest() {
        assertEquals("Canne da zucchero", SpeciePianta.CANNE_DA_ZUCCHERO.NOME);
        assertEquals(5, SpeciePianta.CANNE_DA_ZUCCHERO.GIORNI_PER_CRESCERE);
        assertEquals(25, SpeciePianta.CANNE_DA_ZUCCHERO.TEMPO_DI_VITA);
        assertEquals(12, SpeciePianta.CANNE_DA_ZUCCHERO.GIORNI_PER_FRUTTI);
    }
}
