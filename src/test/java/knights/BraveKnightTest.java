package knights;

import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 * Created by vjpudelski on 3/9/16.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
