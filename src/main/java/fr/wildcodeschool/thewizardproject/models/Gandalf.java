package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

    @Autowired Outfit outfit;

    @Override
    public String giveAdvice() {
        return "All we have to decide is what to do with the time that is given us.";
    }

    @Override
    public String changeDress() {
        return outfit.colorOfDress();
    }

}
