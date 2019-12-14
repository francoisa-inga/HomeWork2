package ExerciseA;

public class TapeDeckDrive {
    public static void main(String[] args) {
        //Constructor should be added, creating sample of TapeDeck
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord==true){
            t.recordTape();
        }
    }
}
