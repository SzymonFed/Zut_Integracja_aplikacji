/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klient;

import java.util.Arrays;
import java.util.List;
import spell.CharacterClass;
import spell.School;
import spell.Spell;
import spell.SpellManager;
import spell.SpellManagerService;
import spell.Subclass;

/**
 *
 * @author Szymon
 */
public class Klient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Spell spell = new Spell();
        List<String> desc = Arrays.asList("DO the magic thing!!!");
        List<String> higher_lvl = Arrays.asList("DO even more magic thing!!!");
        List<String> components = Arrays.asList("V","S");
        School school = new School();
        school.setName("Evocation");
        school.setUrl("Fajnyurl");
        spell.CharacterClass charClass = new CharacterClass();
        charClass.setName("Warlock");
        charClass.setUrl("url");
        Subclass subclass = new Subclass();
        subclass.setName("Divine");
        subclass.setUrl("kolejnyurl");
        
        
        List<Subclass> subclasses = Arrays.asList(subclass); 
        List<CharacterClass> classes = Arrays.asList(charClass);
        /*spell.setName("asdf");
        spell.setId("666");
        spell.setCastingTime("Instant");
        //spell.setCharacterClasses((Spell.CharacterClasses) classes);
        spell.setComponents((Spell.Components) components);
        spell.setConcentration("no");
        spell.setDesc((Spell.Desc) desc);
        spell.setDuration("Instant");
        spell.setHigherLevel((Spell.HigherLevel) higher_lvl);
        spell.setIndex(666);
        spell.setLevel(9);
        spell.setMaterial("None");
        spell.setPage("213");
        spell.setRange("global");
        spell.setRitual("No");
        spell.setSchool(school);
        spell.setSubclasses((Spell.Subclasses) subclasses);
        spell.setUrl("http://fajneczary.com/fajnyczar");*/
        

        SpellManagerService service = new SpellManagerService();
        SpellManager port = service.getSpellManagerPort();
        
        port.add("asdf",666,"FajnySpell",desc,higher_lvl,"2137JP2","Global",components,"None","no","Instant","no","bonus action",9,school,charClass,subclasses,"http://fajneczary.com/fajnyczar");
       //port.add(spell);
        System.out.println("Dodany czar:");
        List<Spell> spells = port.searchByName("FajnySpell");
        
        for(Spell b:spells)
        {
        System.out.println("Nazwa: "+b.getName()+" Opis: "+b.getDesc().toString()+" poziom: "+b.getLevel());
        }
        System.out.println("Warlock spells:");
        spells = port.searchByClass("Warlock");
        for(Spell b:spells)
        {
           
        System.out.println("Nazwa: "+b.getName()); 
        System.out.println("Opis: "+b.getDesc());
        System.out.println("poziom: "+b.getLevel());
        }
    }
    
}
