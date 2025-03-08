import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class AnimaleTest {
    @Test
    public void TestCresceSenzaMorte(){
        Animale animal = new Animale(SpecieAnimalie.LAMA, 0);
        animal.cresce();
        assertEquals(1, animal.getAge());
        assertEquals(1, animal.getDaysSinceLastMeal());
        assertFalse(animal.isDead());
    }
    @Test
    public void TestCresceMorte(){
        Animale animal = new Animale(SpecieAnimalie.LAMA, 0);
        for (int i=0; i<SpecieAnimalie.LAMA.LIFESPAN; i++)
            animal.cresce();
        assertTrue(animal.isDead());
    }

    @Test
    public void TestMangia(){
        Animale animal = new Animale(SpecieAnimalie.LAMA, 0);
        Pianta pero = new Pianta(SpeciePianta.PERO);
        for (int i=0; i<SpeciePianta.PERO.GIORNI_PER_FRUTTI; i++)
            pero.cresce();
        for (int i=0; i<11; i++)
            animal.cresce();
        animal.mangia(List.of(pero));
        assertEquals(0, animal.getDaysSinceLastMeal());
    }

    @Test
    public void TestRiproduci(){
        Animale animal1 = new Animale(SpecieAnimalie.DODO,10, 0,'f',"cipolla");
        Animale animal2 = new Animale(SpecieAnimalie.DODO,10, 0,'m',"sale");
        assertEquals(1,animal1.riproduci(List.of(animal2, animal1), 0));
        assertEquals(0,animal1.riproduci(List.of(animal2, animal1), 1));
        Animale animal3 = new Animale(SpecieAnimalie.DODO,10, 0,'f',"cipolla");
        Animale animal4 = new Animale(SpecieAnimalie.DODO,10, 0,'m',"sale");
        assertEquals(2,animal3.riproduci(List.of(animal3, animal4), 1));
        Animale animal5 = new Animale(SpecieAnimalie.DODO,10, 0,'f',"cipolla");
        Animale animal6 = new Animale(SpecieAnimalie.DODO,10, 0,'m',"sale");
        assertEquals(3,animal5.riproduci(List.of(animal5, animal6), 2));

    }

    @Test
    public void TestisAdult(){
        Animale animal = new Animale(SpecieAnimalie.ORNITORINCO, 0, "Perry");
        Pianta acacia = new Pianta(SpeciePianta.ACACIA);
        for (int i=0; i<SpeciePianta.ACACIA.GIORNI_PER_FRUTTI; i++)
            acacia.cresce();
        assertFalse(animal.isAdult());
        while (!animal.isAdult()) {
            animal.cresce();
            animal.mangia(List.of(acacia));
        }
        assertTrue(animal.isAdult());
    }
}
