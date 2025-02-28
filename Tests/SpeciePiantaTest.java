import org.junit.Test;

import static org.junit.Assert.*;

public class SpeciePiantaTest {
    @Test
    public void meloTest() {
        assertEquals("Melo", SpeciePianta.MELO.getNome());
        assertEquals(5, SpeciePianta.MELO.getGiorniPerCrescere());
        assertEquals(30, SpeciePianta.MELO.getTempoDiVita());
        assertEquals(15, SpeciePianta.MELO.getGiorniPerFrutti());
    }

    @Test
    public void peroTest() {
        assertEquals("Pero", SpeciePianta.PERO.getNome());
        assertEquals(6, SpeciePianta.PERO.getGiorniPerCrescere());
        assertEquals(28, SpeciePianta.PERO.getTempoDiVita());
        assertEquals(14, SpeciePianta.PERO.getGiorniPerFrutti());
    }

    @Test
    public void bananoTest() {
        assertEquals("Banano", SpeciePianta.BANANO.getNome());
        assertEquals(7, SpeciePianta.BANANO.getGiorniPerCrescere());
        assertEquals(35, SpeciePianta.BANANO.getTempoDiVita());
        assertEquals(18, SpeciePianta.BANANO.getGiorniPerFrutti());
    }

    @Test
    public void sequoiaTest() {
        assertEquals("Sequoia", SpeciePianta.SEQUOIA.getNome());
        assertEquals(30, SpeciePianta.SEQUOIA.getGiorniPerCrescere());
        assertEquals(500, SpeciePianta.SEQUOIA.getTempoDiVita());
        assertEquals(100, SpeciePianta.SEQUOIA.getGiorniPerFrutti());
    }

    @Test
    public void pomodoriTest() {
        assertEquals("Pomodori", SpeciePianta.POMODORI.getNome());
        assertEquals(3, SpeciePianta.POMODORI.getGiorniPerCrescere());
        assertEquals(20, SpeciePianta.POMODORI.getTempoDiVita());
        assertEquals(10, SpeciePianta.POMODORI.getGiorniPerFrutti());
    }

    @Test
    public void canapaTest() {
        assertEquals("Canapa", SpeciePianta.CANAPA.getNome());
        assertEquals(4, SpeciePianta.CANAPA.getGiorniPerCrescere());
        assertEquals(15, SpeciePianta.CANAPA.getTempoDiVita());
        assertEquals(7, SpeciePianta.CANAPA.getGiorniPerFrutti());
    }

    @Test
    public void alloroTest() {
        assertEquals("Alloro", SpeciePianta.ALLORO.getNome());
        assertEquals(6, SpeciePianta.ALLORO.getGiorniPerCrescere());
        assertEquals(40, SpeciePianta.ALLORO.getTempoDiVita());
        assertEquals(20, SpeciePianta.ALLORO.getGiorniPerFrutti());
    }

    @Test
    public void betullaTest() {
        assertEquals("Betulla", SpeciePianta.BETULLA.getNome());
        assertEquals(8, SpeciePianta.BETULLA.getGiorniPerCrescere());
        assertEquals(50, SpeciePianta.BETULLA.getTempoDiVita());
        assertEquals(25, SpeciePianta.BETULLA.getGiorniPerFrutti());
    }

    @Test
    public void acaciaTest() {
        assertEquals("Acacia", SpeciePianta.ACACIA.getNome());
        assertEquals(7, SpeciePianta.ACACIA.getGiorniPerCrescere());
        assertEquals(45, SpeciePianta.ACACIA.getTempoDiVita());
        assertEquals(22, SpeciePianta.ACACIA.getGiorniPerFrutti());
    }

    @Test
    public void canneDaZuccheroTest() {
        assertEquals("Canne da zucchero", SpeciePianta.CANNE_DA_ZUCCHERO.getNome());
        assertEquals(5, SpeciePianta.CANNE_DA_ZUCCHERO.getGiorniPerCrescere());
        assertEquals(25, SpeciePianta.CANNE_DA_ZUCCHERO.getTempoDiVita());
        assertEquals(12, SpeciePianta.CANNE_DA_ZUCCHERO.getGiorniPerFrutti());
    }
}
