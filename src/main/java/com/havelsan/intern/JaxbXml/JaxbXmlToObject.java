package com.havelsan.intern.JaxbXml;

import com.havelsan.intern.entity.*;
import com.havelsan.intern.file_parse.TextParser;
import com.havelsan.intern.repository.SystemRepository;
import com.havelsan.intern.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class JaxbXmlToObject {

    private final TextParser textParser;

    private final UnitRepository unitRepository;

    private final SystemRepository systemRepository;

    public void xmlToObject(){

        String filename1="C:/Users/Computer/Desktop/intern/algers_goodguys.xml";

        String filename2="C:/Users/Computer/Desktop/intern/algers_badguys.xml";

        XmlToObject(filename1);

        XmlToObject(filename2);

        textParser.parser();

    }
    @Transactional
    public void XmlToObject(String filename){
        File xmlFile = new File(filename);

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(ForceOrg.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            ForceOrg forces = (ForceOrg) jaxbUnmarshaller.unmarshal(xmlFile);

            int j=0;

            for(int i=0;i<forces.getUnit().size();i++){
                List<SYSTEM> systems=new ArrayList<SYSTEM>();
                while(j<forces.getSystem().size()){
                    List<UNIT> units=new ArrayList<UNIT>();
                    units.add(forces.getUnit().get(i));
                    if(forces.getUnit().get(i).getUnitID()==forces.getSystem().get(j).getToeSuperID()){
                        systems.add(forces.getSystem().get(j));
                        forces.getSystem().get(j).setUnits(units);
                        j++;
                    }
                    else
                        break;
                }
                forces.getUnit().get(i).setSystems(systems);
                if(filename.equals("C:/Users/Computer/Desktop/intern/algers_goodguys.xml"))
                    forces.getUnit().get(i).setWhich_side("GoodGuys");
                else
                    forces.getUnit().get(i).setWhich_side("BadGuys");
            }

            unitRepository.saveAll(forces.getUnit());

            systemRepository.saveAll(forces.getSystem());
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
