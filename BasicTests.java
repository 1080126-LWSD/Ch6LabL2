import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.*;

// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files
// don't touch this, and also the "test" input files

public class BasicTests {
    @Test
    public void test1() throws FileNotFoundException {
        assertEquals(10, Chapter6Lab.binaryConvert("test1"));
    }

    @Test
    public void test2() throws FileNotFoundException {
        assertEquals(0, Chapter6Lab.binaryConvert("test2"));
    }

    @Test
    public void test3() throws FileNotFoundException {
        assertEquals(162, Chapter6Lab.binaryConvert("test3"));
    }

    @Test
    public void test4() throws FileNotFoundException {
        assertEquals(1, Chapter6Lab.binaryConvert("test4"));
    }

    @Test
    public void test5() throws FileNotFoundException {
        assertEquals(254, Chapter6Lab.binaryConvert("test5"));
    }

    @Test
    public void test6() throws FileNotFoundException {
        assertEquals(42, Chapter6Lab.binaryConvert("test6"));
    }

    @Test
    public void test7() throws FileNotFoundException {
        assertEquals(52, Chapter6Lab.addBinary("test6", "test1"));
    }

    @Test
    public void test8() throws FileNotFoundException {
        assertEquals(254, Chapter6Lab.addBinary("test2", "test5"));
    }

    @Test
    public void test9() throws FileNotFoundException {
        assertEquals(true, Chapter6Lab.isBinary("test6"));
    }

    @Test
    public void test10() throws FileNotFoundException {
        assertEquals(false, Chapter6Lab.isBinary("test7"));
    }

    @Test
    public void test11() throws FileNotFoundException {
        assertEquals(false, Chapter6Lab.isBinary("test8"));
    }

    @Test
    public void test12() throws FileNotFoundException {
        assertEquals(false, Chapter6Lab.isBinary("test9"));
    }

    @Test
    public void test13() throws FileNotFoundException {
        assertEquals(false, Chapter6Lab.isBinary("test10"));
    }
}