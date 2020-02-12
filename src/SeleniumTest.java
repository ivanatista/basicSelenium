import tests.Amazon;

public class SeleniumTest {
    public static void main(String[] args) {
        Amazon runTest = new Amazon("https://www.amazon.com/");
        runTest.kindleSearch();
    }
}
