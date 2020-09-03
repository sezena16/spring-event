package com.havelsan.intern.entity;

import com.havelsan.intern.common.BaseEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Set;

@Entity
@SequenceGenerator(name = "idgen", sequenceName = "SYSTEM_SEQ")
@XmlRootElement(name = "SYSTEM")
public class SYSTEM extends BaseEntity {

    public SYSTEM() {
        super();
    }

    public SYSTEM(int systemID, String systemName, String urn, String system_char_name, int toeSuperID, int fuelFraction, int ammoFraction) {
        super();
        this.systemID = systemID;
        this.systemName = systemName;
        this.urn = urn;
        this.system_char_name = system_char_name;
        this.toeSuperID = toeSuperID;
        this.fuelFraction = fuelFraction;
        this.ammoFraction = ammoFraction;
    }

    @ManyToMany(mappedBy = "systems",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<UNIT> units;

    @OneToMany(mappedBy = "system",cascade = CascadeType.ALL)
    private List<Event> events;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    @OneToMany(mappedBy = "spotSystem",cascade = CascadeType.ALL)
    private List<Spot> spots;

    public List<Spot> getSpots() {
        return spots;
    }

    public void setSpots(List<Spot> spots) {
        this.spots = spots;
    }

    @Column(name = "SYSTEM_ID")
    private int systemID;

    @Column(name = "SYSTEM_NAME")
    private String systemName;

    @Column(name = "URN")
    private String urn;

    @Column(name = "SYSTEM_CHAR_NAME")
    private String system_char_name;

    @Column(name = "TOE_SUPER_ID")
    private int toeSuperID;

    @Column(name = "FUEL_FRACTION")
    private int fuelFraction;

    @Column(name = "AMMO_FRACTION")
    private int ammoFraction;

    public List<UNIT> getUnits() {
        return units;
    }

    public void setUnits(List<UNIT> units) {
        this.units = units;
    }

    public int getSystemID() {
        return systemID;
    }

    @XmlElement(name = "JCATS_ID")
    public void setSystemID(int system_id) {
        this.systemID = system_id;
    }

    public String getSystemName() {
        return systemName;
    }

    @XmlElement(name = "NAME")
    public void setSystemName(String system_name) {
        this.systemName = system_name;
    }

    public String getUrn() {
        return urn;
    }

    @XmlElement(name = "URN")
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getSystem_char_name() {
        return system_char_name;
    }

    @XmlElement(name = "JCATS_SystemCharName")
    public void setSystem_char_name(String system_char_name) {
        this.system_char_name = system_char_name;
    }

    public int getToeSuperID() {
        return toeSuperID;
    }

    @XmlElement(name = "JCATS_ToeSuperID")
    public void setToeSuperID(int toeSuperID) {
        this.toeSuperID = toeSuperID;
    }

    public int getFuelFraction() {
        return fuelFraction;
    }

    @XmlElement(name = "JCATS_FuelFraction")
    public void setFuelFraction(int fuelFraction) {
        this.fuelFraction = fuelFraction;
    }

    public int getAmmoFraction() {
        return ammoFraction;
    }

    @XmlElement(name = "JCATS_AmmoFraction")
    public void setAmmoFraction(int ammoFraction) {
        this.ammoFraction = ammoFraction;
    }
}
