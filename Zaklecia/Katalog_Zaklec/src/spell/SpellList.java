/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Szymon
 */

@XmlRootElement(name = "Spells")

public class SpellList {
    @XmlElement(name = "Spell")
    private List<Spell> spells;

    
    public List<Spell> getSpells(){
        return spells;
    }
    public void SetSpells (List<Spell> spells)
    {
        this.spells = spells;
    }
}

