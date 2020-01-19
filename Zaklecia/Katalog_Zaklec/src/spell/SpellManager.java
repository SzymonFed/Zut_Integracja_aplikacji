/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import spell.Spell;

/**
 *
 * @author Szymon
 */@WebService
public class SpellManager {
    private List<Spell> spells;
    
    public SpellManager(List<Spell> spells)
    {
        this.spells = spells;
    }
    @WebMethod
    public @WebResult (name = "spell")List<Spell> searchByLevel(@WebParam(name = "level")int level)
    {
        List<Spell> result = new ArrayList<>();
        for(Spell b:spells)
        {
            if(b.getLevel() ==level) result.add(b);
        }
        return result;
    }
    @WebMethod
    public @WebResult (name = "spell")List<Spell> searchByName(@WebParam(name = "name")String name)
    {
        List<Spell> result = new ArrayList<>();
        for(Spell b:spells)
        {
            if(b.getName().contains(name))
            {
                result.add(b);
            }
        }
        return result;
    }
    @WebMethod
    public @WebResult (name = "spell")List<Spell> searchByClass(@WebParam(name = "className")String className)
    {
        List<Spell> result = new ArrayList<>();
        for(Spell b:spells)
        {
            List<CharacterClass> classes = b.getCharacterClasses();
                for(CharacterClass characterClass:classes)
                {   
                    if(characterClass.getName().contains(className)){
                        result.add(b);
                        break;
                    }
                }
        }
        return result;
    }
    @WebMethod
    public @WebResult (name = "spell")List<Spell> searchBySchool(@WebParam(name = "school")String school)
    {
        List<Spell> result = new ArrayList<>();
        for(Spell b:spells)
        {
            String schoolName = b.getName();
            if(schoolName.contains(school))
            {
                result.add(b);
            }
             
        }
        return result;
    }
    @WebMethod
    public @WebResult(name="spell") void add2(Spell spell)
    {
        if(spell == null)
            throw new NullPointerException();
        else 
            this.spells.add(spell);
    }
    
    @WebMethod
     public @WebResult (name = "spell") void add(String _id, int index, String name, List<String> desc, List<String> higher_level, String page, String range, List<String> components, String material, String ritual, String duration, String concentration, String casting_time, int level, School school, CharacterClass classes, List<Subclass> subclasses, String url) throws NullPointerException
    {
        Spell spell = new Spell();
        spell.setId(_id);
        spell.setIndex(index);
        spell.setName(name);
        spell.setDesc(desc);
        spell.setHigher_level(higher_level);
        spell.setPage(page);
        spell.setRange(range);
        spell.setComponents(components);
        spell.setMaterial(material);
        spell.setRitual(ritual);
        spell.setDuration(duration);
        spell.setConcentration(concentration);
        spell.setCasting_time(casting_time);
        spell.setLevel(level);
        spell.setSchool(school);
        List<CharacterClass> tmp = new ArrayList<>();
        tmp.add(classes);
        spell.setCharacterClasses(tmp);
        spell.setSubclasses(subclasses);
        spell.setUrl(url);
        
        if(name.equals(""))
            throw new NullPointerException();
        else 
            this.spells.add(spell);
    }
}
