/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Szymon
 */
@XmlType(name = "school")
public class School {
        private String name;
        private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
        
}
