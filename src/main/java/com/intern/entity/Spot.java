package com.intern.entity;

import com.intern.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name = "idgen", sequenceName = "SPOT_SEQ")
public class Spot extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SYSTEM_ID")
    private SYSTEM spotSystem;

    @Column(name = "CLOCK")
    private int clock;

    @Column(name = "SIDE")
    private int side;

    @Column(name = "FORCE")
    private int force;

    @Column(name = "TF")
    private int tf;

    @Column(name = "UNIT_ID")
    private int unit_id;

    @Column(name = "UNIT_NAME")
    private String unit_name;

    @Column(name = "UNIT_TYPE_ID")
    private String unit_type_id;

    @Column(name = "UNIT_TYPE")
    private String unit_type;

    @Column(name = "PLAT_CLASS")
    private String plat_class;

    @Column(name = "ALIVE")
    private int alive;

    @Column(name = "LOSSES")
    private int losses;

    @Column(name = "CARRIER")
    private int carrier;

    @Column(name = "X_COORD")
    private float x_coord;

    @Column(name = "Y_COORD")
    private float y_coord;

    @Column(name = "Z_COORD")
    private float z_coord;

    @Column(name = "LATITUDE")
    private String latitude;

    @Column(name = "LONGITUDE")
    private String longitude;

    @Column(name = "AVG_RAD")
    private float avg_rad;

    @Column(name = "LEVEL")
    private String level;

    @Column(name = "SPEED")
    private int speed;

    @Column(name = "DIRECTION")
    private int direction;

    @Column(name = "AMMO")
    private String ammo;

    @Column(name = "GALLON")
    private int gallon;

    @Column(name = "SUP_FUEL")
    private float sup_fuel;

    @Column(name = "SUP_AMMO")
    private float sup_ammo;

    @Column(name = "SYMBOL")
    private String symbol;

}
