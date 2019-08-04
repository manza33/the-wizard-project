package fr.wildcodeschool.thewizardproject.models;


import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface{
    @Override
    public String giveAdvice() {
        return null;
    }

    @Override
    public Outfit changeDress() {
        return null;
    }
}
