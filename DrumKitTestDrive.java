package HW2Task1;

public class DrumKitTestDrive {
    public static void main(String[] args) {
        DrumKIt d = new DrumKIt();
         if(d.snare==true) {
            d.playSnare();
        }
            d.snare=false;
            d.playTopHat();
        }
}
