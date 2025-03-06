import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

import java.util.ArrayList;

public class EcosistemaTest extends TestCase {
    @Test
    public void testEcosistemaInitialization() {
        List<Animale> animali = new ArrayList<>();
        List<Pianta> piante = new ArrayList<>();
        piante.add(new Pianta(SpeciePianta.MELO));
        Ecosistema ecosistema = new Ecosistema(animali, piante);

        assertEquals(0, ecosistema.getGlobalTimer());
        assertTrue(ecosistema.getAnimali().isEmpty());
        assertEquals(1, ecosistema.getPiante().size());
    }

    @Test
    public void testAggiungiAnimali() {
        List<Animale> animali = new ArrayList<>();
        List<Pianta> piante = new ArrayList<>();
        Ecosistema ecosistema = new Ecosistema(animali, piante);

        ecosistema.aggiungiAnimali(3, SpecieAnimalie.LUPO);
        assertEquals(3, ecosistema.getAnimali().size());
    }

    @Test
    public void testAvanzaGiorno() {
        List<Animale> animali = new ArrayList<>();
        List<Pianta> piante = new ArrayList<>();
        piante.add(new Pianta(SpeciePianta.MELO));
        Ecosistema ecosistema = new Ecosistema(animali, piante);

        ecosistema.aggiungiAnimali(1, SpecieAnimalie.LUPO);
        ecosistema.avanzaGiorno();

        assertEquals(1, ecosistema.getGlobalTimer());
        assertEquals(1, ecosistema.getPiante().get(0).getAge());
        assertEquals(1, ecosistema.getAnimali().get(0).getAge());
    }

    @Test
    public void testAnimaleMortePerFame() {
        List<Animale> animali = new ArrayList<>();
        List<Pianta> piante = new ArrayList<>();
        Ecosistema ecosistema = new Ecosistema(animali, piante);

        ecosistema.aggiungiAnimali(1, SpecieAnimalie.LUPO);

        for (int i = 0; i < SpecieAnimalie.LUPO.GIORNI_PER_FAME * 2; i++) {
            Iterator<Animale> iterator = ecosistema.getAnimali().iterator();
            while (iterator.hasNext()) {
                Animale animale = iterator.next();
                if (animale.isDead()) {
                    iterator.remove();
                }
            }
            ecosistema.avanzaGiorno();
        }

        assertTrue(ecosistema.getAnimali().isEmpty());
    }
}