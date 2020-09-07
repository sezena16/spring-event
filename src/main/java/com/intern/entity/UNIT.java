package com.intern.entity;

import com.intern.common.BaseEntity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@SequenceGenerator(name = "idgen", sequenceName = "UNIT_SEQ")
@XmlRootElement(name = "UNIT")
public class UNIT extends BaseEntity {

    @Column(name = "SIDE")
    private String which_side;

    public String getWhich_side() {
        return which_side;
    }

    public void setWhich_side(String which_side) {
        this.which_side = which_side;
    }

    public UNIT() {
        super();
    }

    public UNIT(int unit_id, String unit_name, String UIC, String service, String echelon, String oth_gold_symbol, String oth_gold_org_type, int dsUnitId, int declutter, int unit_symbol, int aggregate, int aggregate_id, String aggregate_class_symbol, String aggregate_symbol, String aggregate_formation, String aggregate_formup_radius, String aggregate_formation_spacing, String aggregate_mount_radius, String aggregate_partial_deflade_fraction, String aggregate_full_deflade_fraction, String aggregate_mobility_type, String force_assignment, int mountedOnID, int mountedAsCrew, String which_side) {
        this.unitID = unit_id;
        this.unitName = unit_name;
        this.UIC = UIC;
        this.service = service;
        this.echelon = echelon;
        this.oth_gold_symbol = oth_gold_symbol;
        this.oth_gold_org_type = oth_gold_org_type;
        this.dsUnitId = dsUnitId;
        this.declutter = declutter;
        this.unit_symbol = unit_symbol;
        this.aggregate = aggregate;
        this.aggregate_id = aggregate_id;
        this.aggregate_class_symbol = aggregate_class_symbol;
        this.aggregate_symbol = aggregate_symbol;
        this.aggregate_formation = aggregate_formation;
        this.aggregate_formup_radius = aggregate_formup_radius;
        this.aggregate_formation_spacing = aggregate_formation_spacing;
        this.aggregate_mount_radius = aggregate_mount_radius;
        this.aggregate_partial_deflade_fraction = aggregate_partial_deflade_fraction;
        this.aggregate_full_deflade_fraction = aggregate_full_deflade_fraction;
        this.aggregate_mobility_type = aggregate_mobility_type;
        this.force_assignment = force_assignment;
        this.mountedOnID = mountedOnID;
        this.mountedAsCrew = mountedAsCrew;
        this.which_side=which_side;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "UNIT_SYSTEMS",
            joinColumns = @JoinColumn(name = "UNIT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SYSTEM_ID"))
    private List<SYSTEM> systems;

    @Column(name = "UNIT_ID")
    private int unitID;

    @Column(name = "UNIT_NAME")
    private String unitName;

    @Column(name = "UIC")
    private String UIC;

    @Column(name = "SERVICE")
    private String service;

    @Column(name = "ECHELON")
    private String echelon;

    @Column(name = "OTH_GOLD_SYM")
    private String oth_gold_symbol;

    @Column(name = "OTH_GOLD_ORG_TYPE")
    private String oth_gold_org_type;

    @Column(name = "DS_UNIT_ID")
    private int dsUnitId;

    @Column(name = "CAN_DECLUTTER")
    private int declutter;

    @Column(name = "UNIT_SYMBOL")
    private int unit_symbol;

    @Column(name = "CAN_AGGREGATE")
    private int aggregate;

    @Column(name = "AGG_ID")
    private int aggregate_id;

    @Column(name = "AGG_CLASS_SYMBOL")
    private String aggregate_class_symbol;

    @Column(name = "AGG_SYMBOL")
    private String aggregate_symbol;

    @Column(name = "AGG_FORMATION")
    private String aggregate_formation;

    @Column(name = "AGG_FORMUP_RADIUS")
    private String aggregate_formup_radius;

    @Column(name = "AGG_FORMATION_SPACING")
    private String aggregate_formation_spacing;

    @Column(name = "AGG_MOUNT_RADIUS")
    private String aggregate_mount_radius;

    @Column(name = "AGG_PARTIAL_DEFLADE_FRACTION")
    private String aggregate_partial_deflade_fraction;

    @Column(name = "AGG_FULL_DEFLADE_FRACTION")
    private String aggregate_full_deflade_fraction;

    @Column(name = "AGG_MOBILITY_TYPE")
    private String aggregate_mobility_type;

    @Column(name = "FORCE_ASSIGNMENT")
    private String force_assignment;

    @Column(name = "MOUNTED_ON_ID")
    private int mountedOnID;

    @Column(name = "MOUNTED_AS_CREW")
    private int mountedAsCrew;

    public int getUnitID() {
        return unitID;
    }

    @XmlElement(name = "JCATS_ID")
    public void setUnitID(int unit_id) {
        this.unitID = unit_id;
    }

    public List<SYSTEM> getSystems() {
        return systems;
    }

    public void setSystems(List<SYSTEM> systems) {
        this.systems = systems;
    }

    public String getUnitName() {
        return unitName;
    }

    @XmlElement(name = "NAME")
    public void setUnitName(String unit_name) {
        this.unitName = unit_name;
    }

    public String getUIC() {
        return UIC;
    }

    @XmlElement(name = "UIC")
    public void setUIC(String UIC) {
        this.UIC = UIC;
    }

    public String getService() {
        return service;
    }

    @XmlElement(name = "SERVICE")
    public void setService(String service) {
        this.service = service;
    }

    public String getEchelon() {
        return echelon;
    }

    @XmlElement(name = "ECHELON")
    public void setEchelon(String echelon) {
        this.echelon = echelon;
    }

    public String getOth_gold_symbol() {
        return oth_gold_symbol;
    }

    @XmlElement(name = "OTH-GOLD_SYMBOL")
    public void setOth_gold_symbol(String oth_gold_symbol) {
        this.oth_gold_symbol = oth_gold_symbol;
    }

    public String getOth_gold_org_type() {
        return oth_gold_org_type;
    }

    @XmlElement(name = "OTH-GOLD_ORG_TYPE")
    public void setOth_gold_org_type(String oth_gold_org_type) {
        this.oth_gold_org_type = oth_gold_org_type;
    }

    public int getDsUnitId() {
        return dsUnitId;
    }

    @XmlElement(name = "JCATS_DsUnitID")
    public void setDsUnitId(int dsUnitId) {
        this.dsUnitId = dsUnitId;
    }

    public int getDeclutter() {
        return declutter;
    }

    @XmlElement(name = "JCATS_CanDeclutter")
    public void setDeclutter(int declutter) {
        this.declutter = declutter;
    }

    public int getUnit_symbol() {
        return unit_symbol;
    }

    @XmlElement(name = "JCATS_UnitSymbol")
    public void setUnit_symbol(int unit_symbol) {
        this.unit_symbol = unit_symbol;
    }

    public int getAggregate() {
        return aggregate;
    }

    @XmlElement(name = "JCATS_CanAggregate")
    public void setAggregate(int aggregate) {
        this.aggregate = aggregate;
    }

    public int getAggregate_id() {
        return aggregate_id;
    }

    @XmlElement(name = "JCATS_AggID", required = false)
    public void setAggregate_id(int aggregate_id) {
        this.aggregate_id = aggregate_id;
    }

    public String getAggregate_class_symbol() {
        return aggregate_class_symbol;
    }

    @XmlElement(name = "JCATS_AggClassSymbol", required = false)
    public void setAggregate_class_symbol(String aggregate_class_symbol) {
        this.aggregate_class_symbol = aggregate_class_symbol;
    }

    public String getAggregate_symbol() {
        return aggregate_symbol;
    }

    @XmlElement(name = "JCATS_AggSymbol", required = false)
    public void setAggregate_symbol(String aggregate_symbol) {
        this.aggregate_symbol = aggregate_symbol;
    }

    public String getAggregate_formation() {
        return aggregate_formation;
    }

    @XmlElement(name = "JCATS_AggFormation", required = false)
    public void setAggregate_formation(String aggregate_formation) {
        this.aggregate_formation = aggregate_formation;
    }

    public String getAggregate_formup_radius() {
        return aggregate_formup_radius;
    }

    @XmlElement(name = "JCATS_AggFormupRadius", required = false)
    public void setAggregate_formup_radius(String aggregate_formup_radius) {
        this.aggregate_formup_radius = aggregate_formup_radius;
    }

    public String getAggregate_formation_spacing() {
        return aggregate_formation_spacing;
    }

    @XmlElement(name = "JCATS_AggFormationSpacing", required = false)
    public void setAggregate_formation_spacing(String aggregate_formation_spacing) {
        this.aggregate_formation_spacing = aggregate_formation_spacing;
    }

    public String getAggregate_mount_radius() {
        return aggregate_mount_radius;
    }

    @XmlElement(name = "JCATS_AggMountRadius", required = false)
    public void setAggregate_mount_radius(String aggregate_mount_radius) {
        this.aggregate_mount_radius = aggregate_mount_radius;
    }

    public String getAggregate_partial_deflade_fraction() {
        return aggregate_partial_deflade_fraction;
    }

    @XmlElement(name = "JCATS_AggPartialDefladeFraction", required = false)
    public void setAggregate_partial_deflade_fraction(String aggregate_partial_deflade_fraction) {
        this.aggregate_partial_deflade_fraction = aggregate_partial_deflade_fraction;
    }

    public String getAggregate_full_deflade_fraction() {
        return aggregate_full_deflade_fraction;
    }

    @XmlElement(name = "JCATS_AggFullDefladeFraction", required = false)
    public void setAggregate_full_deflade_fraction(String aggregate_full_deflade_fraction) {
        this.aggregate_full_deflade_fraction = aggregate_full_deflade_fraction;
    }

    public String getAggregate_mobility_type() {
        return aggregate_mobility_type;
    }

    @XmlElement(name = "JCATS_AggMobilityType", required = false)
    public void setAggregate_mobility_type(String aggregate_mobility_type) {
        this.aggregate_mobility_type = aggregate_mobility_type;
    }

    public String getForce_assignment() {
        return force_assignment;
    }

    @XmlElement(name = "JCATS_ForceAssignment", nillable = true)
    public void setForce_assignment(String force_assignment) {
        this.force_assignment = force_assignment;
    }

    public int getMountedOnID() {
        return mountedOnID;
    }

    @XmlElement(name = "JCATS_MountedOnID")
    public void setMountedOnID(int mountedOnID) {
        this.mountedOnID = mountedOnID;
    }

    public int getMountedAsCrew() {
        return mountedAsCrew;
    }

    @XmlElement(name = "JCATS_MountedAsCrew")
    public void setMountedAsCrew(int mountedAsCrew) {
        this.mountedAsCrew = mountedAsCrew;
    }
}
