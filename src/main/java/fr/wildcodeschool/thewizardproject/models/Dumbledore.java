package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Dumbledore implements WizardInterface{

    @Autowired Outfit outfit;

    @Override
    public String giveAdvice() {
        return "Differences of habit and language are nothing at all if our aims are identical and our hearts are open.";
    }

    @Override
    public String changeDress() {
        return outfit.colorOfDress() ;
    }
}
