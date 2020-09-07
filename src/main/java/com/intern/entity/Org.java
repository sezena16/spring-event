package com.intern.entity;

import com.intern.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;

@Entity
@Data
@SequenceGenerator(name = "idgen", sequenceName = "ORG_SEQ")
public class Org extends BaseEntity {

    @Column(name = "SIDE")
    private int side;

    @Column(name = "SIDE_NAME")
    private String side_name;

    @Column(name = "FORCE")
    private int force;

    @Column(name = "FORCE_NAME")
    private String force_name;

    @Column(name = "TF")
    private int tf;

    @Column(name = "TF_NAME")
    private String tf_name;

    @Column(name = "LOG_W_S")
    private int log_w_s;

    @Column(name = "PHY_W_S")
    private int phy_w_s;

    @Column(name = "COLOR")
    private String Color;

    @Column(name = "GHOST")
    private String ghost;

}
