package knights;

import java.io.PrintStream;

/**
 * Created by vjpudelski on 3/9/16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream){
        this.stream = stream;
    }

    public void embark(){
        stream.println("Embarking on a quest to slay the dragon!");
    }
}
