/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katalog_zaklec;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.Endpoint;
import spell.*;

/**
 *
 * @author Szymon
 */
public class Katalog_Zaklec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try
        {
            //wczytaj przykladowa liste zaklec z xmla
            JAXBContext context = JAXBContext.newInstance(SpellList.class);
            Unmarshaller um = context.createUnmarshaller();
            
            FileReader fr = new FileReader("D:\\Integracja Aplikacji\\Zaklecia\\Katalog_Zaklec\\src\\xml\\spellz.xml");
            SpellList spells =(SpellList) um.unmarshal(fr);
            
            fr.close();
            SpellManager sm = new SpellManager(spells.getSpells());
            //lista zaklec z 'Acid" w nazwie
            List<Spell> ss = sm.searchByName("Acid");
            //lista zaklec dostępnych dla klasy warlock
            List<Spell> sc = sm.searchByClass("Warlock");
            System.out.println(ss);
            System.out.println(sc);
            //zapisz zaklecia Warlocka do xmla         
            Marshaller marsh = context.createMarshaller();
            OutputStream os = new FileOutputStream("D:\\Integracja Aplikacji\\Zaklecia\\Katalog_Zaklec\\src\\xml\\result.xml");
            SpellList newList = new SpellList();
            newList.SetSpells(sc);
            marsh.marshal(newList,os );
            
            String url ="http://localhost:666/spells";
            Endpoint.publish(url,sm);
            
            
        }
        catch(JAXBException e)
        {e.printStackTrace();
            }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
