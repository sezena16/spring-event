package com.intern.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "ForceOrg")
public class ForceOrg {
    private List<UNIT> unit;
    private List<SYSTEM> system;

    public List<UNIT> getUnit() {
        return unit;
    }

    @XmlElement(name = "UNIT")
    public void setUnit(List<UNIT> unit) {
        this.unit = unit;
    }

    public List<SYSTEM> getSystem() {
        return system;
    }

    @XmlElement(name = "SYSTEM")
    public void setSystem(List<SYSTEM> system) {
        this.system = system;
    }

    public ForceOrg() {
        super();
    }

    public ForceOrg(List<UNIT> unit, List<SYSTEM> system) {
        this.unit = unit;
        this.system = system;
    }
}
