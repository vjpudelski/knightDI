package knights;

/**
 * Created by vjpudelski on 3/9/16.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight(){
        this.quest = new RescueDamselQuest();
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
