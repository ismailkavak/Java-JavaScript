public class Main {

    public static void main(String[] args) {
        Fighter muhammed = new Fighter("Mohad", 10, 120, 100,99);
        Fighter poyraz = new Fighter("Poyraz", 8, 110, 80,50);


        Match match = new Match(muhammed, poyraz, 60, 150);
        match.run();
    }
}
