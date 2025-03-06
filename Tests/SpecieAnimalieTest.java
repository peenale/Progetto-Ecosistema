import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SpecieAnimalieTest {
    @Test
    public void lupoTest() {
        assertEquals("Lupo", SpecieAnimalie.LUPO.NOME);
        assertEquals(4, SpecieAnimalie.LUPO.MAX_FIGLI);
        assertEquals(20, SpecieAnimalie.LUPO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.LUPO.PIANTE_COMMESTIBILI);
    }

    @Test
    public void orsoTest() {
        assertEquals("Orso", SpecieAnimalie.ORSO.NOME);
        assertEquals(2, SpecieAnimalie.ORSO.MAX_FIGLI);
        assertEquals(30, SpecieAnimalie.ORSO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.ORSO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void scimmiaTest() {
        assertEquals("Scimmia", SpecieAnimalie.SCIMMIA.NOME);
        assertEquals(2, SpecieAnimalie.SCIMMIA.MAX_FIGLI);
        assertEquals(25, SpecieAnimalie.SCIMMIA.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.SCIMMIA.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void dodoTest() {
        assertEquals("Dodo", SpecieAnimalie.DODO.NOME);
        assertEquals(3, SpecieAnimalie.DODO.MAX_FIGLI);
        assertEquals(15, SpecieAnimalie.DODO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.DODO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void gattoTest() {
        assertEquals("Gatto", SpecieAnimalie.GATTO.NOME);
        assertEquals(5, SpecieAnimalie.GATTO.MAX_FIGLI);
        assertEquals(20, SpecieAnimalie.GATTO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.GATTO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void pinguinoTest() {
        assertEquals("Pinguino", SpecieAnimalie.PINGUINO.NOME);
        assertEquals(2, SpecieAnimalie.PINGUINO.MAX_FIGLI);
        assertEquals(30, SpecieAnimalie.PINGUINO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.PINGUINO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void caneTest() {
        assertEquals("Cane", SpecieAnimalie.CANE.NOME);
        assertEquals(7, SpecieAnimalie.CANE.MAX_FIGLI);
        assertEquals(25, SpecieAnimalie.CANE.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.CANE.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void ornitorincoTest() {
        assertEquals("Ornitorinco", SpecieAnimalie.ORNITORINCO.NOME);
        assertEquals(3, SpecieAnimalie.ORNITORINCO.MAX_FIGLI);
        assertEquals(30, SpecieAnimalie.ORNITORINCO.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.ORNITORINCO.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void lamaTest() {
        assertEquals("Lama", SpecieAnimalie.LAMA.NOME);
        assertEquals(2, SpecieAnimalie.LAMA.MAX_FIGLI);
        assertEquals(40, SpecieAnimalie.LAMA.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.LAMA.PIANTE_COMMESTIBILI);
    }
    
    @Test
    public void pinguinoTatticoNucleareImperatoreTest() {
        assertEquals("Pinguino tattico nucleare imperatore di livello 3", SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.NOME);
        assertEquals(10, SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.MAX_FIGLI);
        assertEquals(100, SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.LIFESPAN);
        assertEquals(List.of(""), SpecieAnimalie.PINGUINO_TATTICO_NUCLEARE_IMPERATORE.PIANTE_COMMESTIBILI);
    }
}
