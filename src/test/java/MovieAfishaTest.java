import org.example.MovieAfisha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieAfishaTest {
    @Test
    public void shouldShowAll() {
        MovieAfisha afisha = new MovieAfisha();
        afisha.addNew("One");
        afisha.addNew("Two");
        afisha.addNew("Three");

        String[] expected = {"One", "Two", "Three"};
        String[] actual = afisha.showAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowlast() {
        MovieAfisha afisha = new MovieAfisha();
        afisha.addNew("One");
        afisha.addNew("Two");
        afisha.addNew("Three");

        String[] expected = {"Three", "Two", "One"};
        String[] actual = afisha.showLast();

        Assertions.assertArrayEquals(expected, actual);

    }

   @Test
    public void shouldShowlast10() {
        MovieAfisha afisha = new MovieAfisha();
        afisha.addNew("1");
        afisha.addNew("2");
        afisha.addNew("3");
        afisha.addNew("4");
        afisha.addNew("5");
        afisha.addNew("6");
        afisha.addNew("7");
        afisha.addNew("8");
        afisha.addNew("9");
        afisha.addNew("10");
        afisha.addNew("11");

        String[] expected = {"11","10","9","8","7","6","5","4","3","2"};
        String[] actual = afisha.showLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}



