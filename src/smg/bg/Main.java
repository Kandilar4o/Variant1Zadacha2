package smg.bg;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Svetlio");
        Bird bird = new Bird(45.56);

        AnimalHouse<Bird> birdHouse = new AnimalHouse<>(bird);
        AnimalHouse<Tiger> tigerHouse = new AnimalHouse<>(tiger);





    }
}
