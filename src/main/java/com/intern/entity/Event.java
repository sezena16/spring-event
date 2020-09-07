package com.intern.entity;

import com.intern.common.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@SequenceGenerator(name = "idgen", sequenceName = "EVENT_SEQ")
public class Event extends BaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SYSTEM_ID")
    private SYSTEM system;

    @Column(name = "EVENT_ID")
    private String event_id;

    @Column(name = "CLOCK")
    private float clock;

    @Column(name = "SEQ_NO")
    private int seq_no;

    @Column(name = "EFFECT")
    private String effect;

    @Column(name = "S_SIDE")
    private int s_side;

    @Column(name = "S_FORCE")
    private int s_force;

    @Column(name = "S_TF")
    private int s_tf;

    @Column(name = "S_UNIT_ID")
    private int s_unit_id;

    @Column(name = "S_UNIT_NAME")
    private String s_unit_name;

    @Column(name = "S_SPEED")
    private int s_speed;

    @Column(name = "S_UNIT_TYPE_ID")
    private int s_unit_type_id;

    @Column(name = "S_UNIT_TYPE")
    private String s_unit_type;

    @Column(name = "S_SYS_TYPE_ID")
    private int s_sys_type_id;

    @Column(name = "S_SYS_TYPE")
    private String s_sys_type;

    @Column(name = "S_ELEM")
    private int s_elem;

    @Column(name = "STATION")
    private int station;

    @Column(name = "WEAP_NAME")
    private String weap_name;

    @Column(name = "MUN_NAME")
    private String mun_name;

    @Column(name = "T_SIDE")
    private int t_side;

    @Column(name = "T_FORCE")
    private int t_force;

    @Column(name = "T_TF")
    private int t_tf;

    @Column(name = "T_UNIT_ID")
    private int t_unit_id;

    @Column(name = "T_UNIT_NAME")
    private String t_unit_name;

    @Column(name = "T_SPEED")
    private int t_speed;

    @Column(name = "T_UNIT_TYPE_ID")
    private int t_unit_type_id;

    @Column(name = "T_UNIT_TYPE")
    private String t_unit_type;

    @Column(name = "T_SYS_TYPE_ID")
    private int t_sys_type_id;

    @Column(name = "T_SYS_TYPE")
    private String t_sys_type;

    @Column(name = "T_ELEM")
    private int t_elem;

    @Column(name = "T_DEFLD")
    private String t_defld;

    @Column(name = "X_COORD")
    private float x_coord;

    @Column(name = "Y_COORD")
    private float y_coord;

    @Column(name = "Z_COORD")
    private float z_coord;

    @Column(name = "T_VIEW")
    private String t_view;

    @Column(name = "RANGE")
    private float range;

    @Column(name = "PH_PK")
    private float ph_pk;

    @Column(name = "R_N_DRAW")
    private float r_n_draw;

    @Column(name = "AREA")
    private float area;

    @Column(name = "REAL_1")
    private float real_1;

    @Column(name = "REAL_2")
    private float real_2;

    @Column(name = "REAL_3")
    private float real_3;

    @Column(name = "INT_1")
    private int int_1;

    @Column(name = "INT_2")
    private int int_2;
}
