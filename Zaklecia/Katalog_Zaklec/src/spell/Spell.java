/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Szymon
 */
@XmlType(name="Spell")

public class Spell implements Serializable
    {
        private String _id;
        private int index;
        private String name;
        private List<String> desc;
        private List<String> higher_level;
        private String page;
        private String range;
        private List<String> components;
        private String material;
        private String ritual;
        private String duration;
        private String concentration;
        private String casting_time;
        private int level;
        private School school;
        private List<CharacterClass> classes;
        private List<Subclass> subclasses;
        private String url;

    public Spell() {super();}
        
    public Spell(String _id, int index, String name, List<String> desc, List<String> higher_level, String page, String range, List<String> components, String material, String ritual, String duration, String concentration, String casting_time, int level, School school, List<CharacterClass> classes, List<Subclass> subclasses, String url) {
        super();
        this._id = _id;
        this.index = index;
        this.name = name;
        this.desc = desc;
        this.higher_level = higher_level;
        this.page = page;
        this.range = range;
        this.components = components;
        this.material = material;
        this.ritual = ritual;
        this.duration = duration;
        this.concentration = concentration;
        this.casting_time = casting_time;
        this.level = level;
        this.school = school;
        this.classes = classes;
        this.subclasses = subclasses;
        this.url = url;
    }
        
        
    
    @Override
    public String toString()
    {
        String temp = new String();
        for(CharacterClass cc:classes)
        {
            temp+=cc.getName()+" ";
        }
        String result = "Name: " + this.name+" level: " + this.level+ " Classes: "+ temp +"\n";
        return result;
    }
    
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@XmlElementWrapper(name="desc")
    @XmlElement(name="string")
    public List<String> getDesc() {
        return desc;
    }

    public void setDesc(List<String> desc) {
        this.desc = desc;
    }
@XmlElementWrapper(name="higher_level")
    @XmlElement(name="string")
    public List<String> getHigher_level() {
        if (higher_level==null)
                {
                    higher_level = new ArrayList<String>();
                }
        return higher_level;
    }

    public void setHigher_level(List<String> higher_level) {
        this.higher_level = higher_level;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
@XmlElementWrapper(name="components")
    @XmlElement(name="string")
    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public String getMaterial() {
        if (material==null)
                {
                    material = "";
                }
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRitual() {
        return ritual;
    }

    public void setRitual(String ritual) {
        this.ritual = ritual;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getCasting_time() {
        return casting_time;
    }

    public void setCasting_time(String casting_time) {
        this.casting_time = casting_time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
@XmlElementWrapper(name="characterClasses")
    @XmlElement(name="CharacterClass")
    public List<CharacterClass> getCharacterClasses() {
        return classes;
    }

    public void setCharacterClasses(List<CharacterClass> classes) {
        this.classes = classes;
    }
@XmlElementWrapper(name="subclasses")
    @XmlElement(name="Subclass")
    public List<Subclass> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<Subclass> subclasses) {
        this.subclasses = subclasses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
        
    }