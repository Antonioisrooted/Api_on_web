package models;

import junit.framework.TestCase;
import org.junit.Test;

public class AnimalsTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
    }
    @Test
    public void testInstantiateCorrectly() throws Exception {
        Animals testAnimal=createAnimals();
        assertTrue(testAnimal instanceof Animals);
    }
    @Test
    public void getType_returnsType() throws Exception {
        Animals testAnimal=createAnimals();
        assertEquals("Chicken",testAnimal.getType());
    }
    @Test
    public void getBreed_returnsBreed() throws Exception {
        Animals testAnimal=createAnimals();
        assertEquals("Layers",testAnimal.getBreed());
    }
    @Test
    public void getImage_returnsImage() throws Exception {
        Animals testAnimal=createAnimals();
        assertEquals("https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",testAnimal.getImage());
    }
    @Test
    public void getDescription_returnsDescription() throws Exception {
        Animals testAnimal = createAnimals();
        assertEquals("Layers are a breed of chicken that lay eggs", testAnimal.getDescription());
    }

    public Animals createAnimals(){
        return new Animals("Chicken","Layers","https://images.unsplash.com/photo-1548550023-2bdb3c5beed7?ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60","Layers are a breed of chicken that lay eggs");
    }
}