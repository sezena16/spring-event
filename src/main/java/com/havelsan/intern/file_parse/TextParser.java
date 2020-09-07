package com.havelsan.intern.file_parse;

import com.havelsan.intern.entity.*;
import com.havelsan.intern.serviceImplementations.EventServiceImpl;
import com.havelsan.intern.serviceImplementations.OrgServiceImpl;
import com.havelsan.intern.serviceImplementations.SpotServiceImpl;
import com.havelsan.intern.serviceImplementations.SystemServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class TextParser {

    private final EventServiceImpl eventServiceImpl;

    private final OrgServiceImpl orgServiceImpl;

    private final SpotServiceImpl spotServiceImpl;

    private final SystemServiceImpl systemServiceImpl;

    public void parser(){

        String filename1="C:/Users/Computer/Desktop/spring-event/datevent0000.dat.txt";

        String filename2="C:/Users/Computer/Desktop/spring-event/datorg0000.dat.txt";

        String filename3="C:/Users/Computer/Desktop/spring-event/datspot0000.dat.txt";

        eventParser(filename1);

        orgParser(filename2);

        spotParser(filename3);

    }

    @Transactional
    public void eventParser(String filename){

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            List<Event> eventList=new ArrayList<Event>();
            List<SYSTEM> systemList=new ArrayList<SYSTEM>();
            while (line != null) {
                Event event=new Event();
                String id=line.substring(0,3);
                event.setEvent_id(id.trim());
                String clock_s=line.substring(3,11);
                event.setClock(Float.parseFloat(clock_s.trim()));
                String seq_no_s=line.substring(11,17);
                if(!seq_no_s.isBlank())
                    event.setSeq_no(Integer.parseInt(seq_no_s.trim()));
                String effect=line.substring(17,20);
                event.setEffect(effect.trim());
                String s_side_s=line.substring(20,22);
                event.setS_side(Integer.parseInt(s_side_s.trim()));
                String s_force_s=line.substring(22,24);
                event.setS_force(Integer.parseInt(s_force_s.trim()));
                String s_tf_s=line.substring(24,26);
                event.setS_tf(Integer.parseInt(s_tf_s.trim()));
                String s_unit_id_s=line.substring(26,32);
                event.setS_unit_id(Integer.parseInt(s_unit_id_s.trim()));
                String s_unit_name=line.substring(32,44);
                event.setS_unit_name(s_unit_name.trim());
                String s_speed=line.substring(44,49);
                event.setS_speed(Integer.parseInt(s_speed.trim()));
                String s_unit_type_id=line.substring(49,52);
                if(!s_unit_type_id.isBlank())
                    event.setS_unit_type_id(Integer.parseInt(s_unit_type_id.trim()));
                String s_unit_type=line.substring(52,64);
                event.setS_unit_type(s_unit_type.trim());
                String s_sys_type_id=line.substring(64,67);
                if(!s_sys_type_id.isBlank())
                    event.setS_sys_type_id(Integer.parseInt(s_sys_type_id.trim()));
                String s_sys_type=line.substring(67,79);
                event.setS_sys_type(s_sys_type.trim());
                String s_elem=line.substring(79,81);
                event.setS_elem(Integer.parseInt(s_elem.trim()));
                String station=line.substring(81,82);
                event.setStation(Integer.parseInt(station.trim()));
                String weapon_name=line.substring(82,94);
                event.setWeap_name(weapon_name.trim());
                String mun_name=line.substring(94,106);
                event.setMun_name(mun_name.trim());
                String t_side_s=line.substring(106,108);
                if(!t_side_s.isBlank())
                    event.setT_side(Integer.parseInt(t_side_s.trim()));
                String t_force_s=line.substring(108,110);
                if(!t_force_s.isBlank())
                    event.setT_force(Integer.parseInt(t_force_s.trim()));
                String t_tf_s=line.substring(110,112);
                if(!t_tf_s.isBlank())
                    event.setT_tf(Integer.parseInt(t_tf_s.trim()));
                String t_unit_id_s=line.substring(112,118);
                if(!t_unit_id_s.isBlank())
                    event.setT_unit_id(Integer.parseInt(t_unit_id_s.trim()));
                String t_unit_name=line.substring(118,130);
                event.setT_unit_name(t_unit_name.trim());
                String t_speed=line.substring(130,135);
                if(!t_speed.isBlank())
                    event.setT_speed(Integer.parseInt(t_speed.trim()));
                String t_unit_type_id=line.substring(135,138);
                if(!t_unit_type_id.isBlank())
                    event.setT_unit_type_id(Integer.parseInt(t_unit_type_id.trim()));
                String t_unit_type=line.substring(138,150);
                event.setT_unit_type(t_unit_type.trim());
                String t_sys_type_id=line.substring(150,153);
                if(!t_sys_type_id.isBlank())
                    event.setT_sys_type_id(Integer.parseInt(t_sys_type_id.trim()));
                String t_sys_type=line.substring(153,165);
                event.setT_sys_type(t_sys_type.trim());
                String t_elem=line.substring(165,167);
                if(!t_elem.isBlank())
                    event.setT_elem(Integer.parseInt(t_elem.trim()));
                String t_defld=line.substring(167,168);
                event.setT_defld(t_defld.trim());
                String x_coord=line.substring(168,176);
                if(!x_coord.isBlank())
                    event.setX_coord(Float.parseFloat(x_coord.trim()));
                String y_coord=line.substring(176,184);
                if(!y_coord.isBlank())
                    event.setY_coord(Float.parseFloat(y_coord.trim()));
                String z_coord=line.substring(184,192);
                if(!z_coord.isBlank())
                    event.setZ_coord(Float.parseFloat(z_coord.trim()));
                String t_view=line.substring(192,198);
                event.setT_view(t_view.trim());
                String range=line.substring(198,205);
                if(!range.isBlank())
                    event.setRange(Float.parseFloat(range.trim()));
                String ph_pk=line.substring(205,210);
                if(!ph_pk.isBlank())
                    event.setPh_pk(Float.parseFloat(ph_pk.trim()));
                String r_n_draw=line.substring(210,215);
                if(!r_n_draw.isBlank())
                    event.setR_n_draw(Float.parseFloat(r_n_draw.trim()));
                String area=line.substring(215,222);
                if(!area.isBlank())
                    event.setArea(Float.parseFloat(area.trim()));
                String real1=line.substring(222,230);
                if(!real1.isBlank())
                    event.setReal_1(Float.parseFloat(real1.trim()));
                String real2=line.substring(230,238);
                if(!real2.isBlank())
                    event.setReal_2(Float.parseFloat(real2.trim()));
                String real3=line.substring(238,246);
                if(!real3.isBlank())
                    event.setReal_3(Float.parseFloat(real3.trim()));
                String int1=line.substring(246,252);
                if(!int1.isBlank())
                    event.setInt_1(Integer.parseInt(int1.trim()));
                String int2=line.substring(252,258);
                if(!int2.isBlank())
                    event.setInt_2(Integer.parseInt(int2.trim()));
                eventList.add(event);
                line = reader.readLine();
            }
            for (Event event : eventList) {
                Optional<SYSTEM> systemOptional = systemServiceImpl.findBySystemIDAndSystemName(
                        event.getS_unit_id(),
                        event.getS_unit_name());
                if (systemOptional.isPresent()) {
                    SYSTEM system = systemOptional.get();
                    if (!systemList.contains(system))
                        systemList.add(system);
                    event.setSystem(system);
                }
            }
            for (SYSTEM system : systemList) {
                List<Event> eventList1 = new ArrayList<Event>(eventServiceImpl.findAllBySystem(system));
                system.setEvents(eventList1);
            }
            reader.close();
            eventServiceImpl.saveAll(eventList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Transactional
    public void orgParser(String filename){

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            List<Org> orgList=new ArrayList<Org>();
            while (line != null) {
                Org org=new Org();
                String side=line.substring(0,2);
                org.setSide(Integer.parseInt(side.trim()));
                String side_name=line.substring(2,14);
                org.setSide_name(side_name.trim());
                String force=line.substring(14,16);
                org.setForce(Integer.parseInt(force.trim()));
                String force_name=line.substring(16,28);
                org.setForce_name(force_name.trim());
                String tf=line.substring(28,30);
                org.setTf(Integer.parseInt(tf.trim()));
                String tf_name=line.substring(30,42);
                org.setTf_name(tf_name.trim());
                String color=line.substring(42,54);
                org.setColor(color.trim());
                String ghost=line.substring(54,55);
                org.setGhost(ghost.trim());
                orgList.add(org);
                line = reader.readLine();
            }
            reader.close();
            orgServiceImpl.saveAll(orgList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Transactional
    public void spotParser(String filename){

        BufferedReader reader;
        List<SYSTEM> systemList=new ArrayList<SYSTEM>();
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            List<Spot> spotList=new ArrayList<Spot>();
            while (line != null) {
                Spot spot=new Spot();
                String clock=line.split(",")[0];
                spot.setClock(Integer.parseInt(clock));
                String side=line.split(",")[1];
                spot.setSide(Integer.parseInt(side));
                String force=line.split(",")[2];
                spot.setForce(Integer.parseInt(force));
                String unit_id=line.split(",")[3];
                spot.setUnit_id(Integer.parseInt(unit_id));
                String unit_name=line.split(",")[4];
                spot.setUnit_name(unit_name);
                String unit_type=line.split(",")[5];
                spot.setUnit_type(unit_type);
                String plat_class=line.split(",")[6];
                spot.setPlat_class(plat_class);
                String alive=line.split(",")[7];
                spot.setAlive(Integer.parseInt(alive));
                String losses=line.split(",")[8];
                spot.setLosses(Integer.parseInt(losses));
                String carrier=line.split(",")[9];
                spot.setCarrier(Integer.parseInt(carrier));
                String x_coord=line.split(",")[10];
                spot.setX_coord(Float.parseFloat(x_coord));
                String y_coord=line.split(",")[11];
                spot.setY_coord(Float.parseFloat(y_coord));
                String z_coord=line.split(",")[12];
                spot.setZ_coord(Float.parseFloat(z_coord));
                String latitude=line.split(",")[13];
                spot.setLatitude(latitude);
                String longitude=line.split(",")[14];
                spot.setLongitude(longitude);
                String avg_rad=line.split(",")[15];
                spot.setAvg_rad(Float.parseFloat(avg_rad));
                String level=line.split(",")[16];
                spot.setLevel(level);
                String speed=line.split(",")[17];
                spot.setSpeed(Integer.parseInt(speed));
                String direction=line.split(",")[18];
                spot.setDirection(Integer.parseInt(direction));
                String ammo=line.split(",")[19];
                spot.setAmmo(ammo);
                String gallon=line.split(",")[20];
                if(!gallon.isBlank())
                    spot.setGallon(Integer.parseInt(gallon));
                String sup_fuel=line.split(",")[21];
                if(!sup_fuel.isBlank())
                    spot.setSup_fuel(Float.parseFloat(sup_fuel));
                String sup_ammo=line.split(",")[22];
                if(!sup_ammo.isBlank())
                    spot.setSup_ammo(Float.parseFloat(sup_ammo));
                String symbol=line.split(",")[23];
                spot.setSymbol(symbol);
                spotList.add(spot);
                line = reader.readLine();
            }
            for (Spot spot : spotList) {
                Optional<SYSTEM> systemOptional = systemServiceImpl.findBySystemIDAndSystemName(
                        spot.getUnit_id(),
                        spot.getUnit_name());
                if (systemOptional.isPresent()) {
                    SYSTEM system = systemOptional.get();
                    if (!systemList.contains(system))
                        systemList.add(system);
                    spot.setSpotSystem(system);
                }
            }
            for (SYSTEM system : systemList) {
                List<Spot> spots = new ArrayList<Spot>(spotServiceImpl.findAllBySpotSystem(system));
                system.setSpots(spots);
            }
            reader.close();
            spotServiceImpl.saveAll(spotList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
