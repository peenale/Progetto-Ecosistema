import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SpeciAnimaliTest {
    @Test
    public void lupoTest() {
        assertEquals("Lupo", SpeciAnimali.LUPO.NOME);
        assertEquals(4, SpeciAnimali.LUPO.MAX_FIGLI);
        assertEquals(20, SpeciAnimali.LUPO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.LUPO.PIANTE_COMMESTIBILI);
    }

    @Test
    public void orsoTest() {
        assertEquals("Orso", SpeciAnimali.ORSO.NOME);
        assertEquals(2, SpeciAnimali.ORSO.MAX_FIGLI);
        assertEquals(30, SpeciAnimali.ORSO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.ORSO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void scimmiaTest() {
        assertEquals("Scimmia", SpeciAnimali.SCIMMIA.NOME);
        assertEquals(2, SpeciAnimali.SCIMMIA.MAX_FIGLI);
        assertEquals(25, SpeciAnimali.SCIMMIA.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.SCIMMIA.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void dodoTest() {
        assertEquals("Dodo", SpeciAnimali.DODO.NOME);
        assertEquals(3, SpeciAnimali.DODO.MAX_FIGLI);
        assertEquals(15, SpeciAnimali.DODO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.DODO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void gattoTest() {
        assertEquals("Gatto", SpeciAnimali.GATTO.NOME);
        assertEquals(5, SpeciAnimali.GATTO.MAX_FIGLI);
        assertEquals(20, SpeciAnimali.GATTO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.GATTO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void pinguinoTest() {
        assertEquals("Pinguino", SpeciAnimali.PINGUINO.NOME);
        assertEquals(2, SpeciAnimali.PINGUINO.MAX_FIGLI);
        assertEquals(30, SpeciAnimali.PINGUINO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.PINGUINO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void caneTest() {
        assertEquals("Cane", SpeciAnimali.CANE.NOME);
        assertEquals(7, SpeciAnimali.CANE.MAX_FIGLI);
        assertEquals(25, SpeciAnimali.CANE.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.CANE.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void ornitorincoTest() {
        assertEquals("Ornitorinco", SpeciAnimali.ORNITORINCO.NOME);
        assertEquals(3, SpeciAnimali.ORNITORINCO.MAX_FIGLI);
        assertEquals(30, SpeciAnimali.ORNITORINCO.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.ORNITORINCO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void lamaTest() {
        assertEquals("Lama", SpeciAnimali.LAMA.NOME);
        assertEquals(2, SpeciAnimali.LAMA.MAX_FIGLI);
        assertEquals(40, SpeciAnimali.LAMA.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.LAMA.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void pinguinoTatticoNucleareImperatoreTest() {
        assertEquals("Pinguino tattico nucleare imperatore di livello 3", SpeciAnimali.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.NOME);
        assertEquals(10, SpeciAnimali.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.MAX_FIGLI);
        assertEquals(100, SpeciAnimali.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.LIFESPAN);
        assertEquals(List.of(""), SpeciAnimali.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.PIANTE_COMMESTIBILI);
    }
}
