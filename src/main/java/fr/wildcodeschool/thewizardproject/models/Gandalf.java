package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("gandalfId")
public class Gandalf implements WizardInterface {

    Outfit outfit;

    @Override
    public String giveAdvice() {
        return "Differences of habit and language are nothing at all if our aims are identical and our hearts are open.";
    }

    @Override
    public Outfit changeDress(Outfit outfit) {
        return null;
    }

}
