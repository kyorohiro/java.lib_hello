/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
    	Library classUnderTest = new Library();
        System.out.println(new App().getGreeting() + classUnderTest.someLibraryMethod());
    }
}
