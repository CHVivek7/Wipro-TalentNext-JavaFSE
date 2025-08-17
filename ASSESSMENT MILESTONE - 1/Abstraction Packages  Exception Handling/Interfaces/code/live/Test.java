package live;

import music.string.Veena;
import music.wind.Saxophone;
import music.Playable;

public class Test {
    public static void main(String[] args) {
        Veena veena = new Veena();
        Saxophone saxophone = new Saxophone();
        
        // a. Call play() on Veena
        veena.play();
        // b. Call play() on Saxophone
        saxophone.play();
        // c. Use Playable reference
        Playable p;
        p = veena;
        p.play();
        p = saxophone;
        p.play();
    }
}
