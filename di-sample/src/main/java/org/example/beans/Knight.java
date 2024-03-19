package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    @Autowired /*@Qualifier("dragon")*/
    private Quest dragon;

  /*  public void setQuest(Quest quest) {
        this.quest = quest;
    }*/

    public String goQuest(){
        return dragon.goQuest();
    }
}
