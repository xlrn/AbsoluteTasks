package com.company;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nelson on 2016-07-10.
 */
public class Device {
    public String Name;
    public String Make;
    public String Model;

    public Device(String nme, String mk, String mod) {
        Name = nme;
        Make = mk;
        Model = mod;
    }

    public String getName() {
        return this.Name;
    }

    public String getMake() {
        return this.Make;
    }

    public static List<Device> CCfilter(List<Device> e) {
        for (Device d: e) {
            if (!(d.getName().contains("CC"))) {
                e.remove(d);
            }
        }
        return e;
    }

    public static List<Device> MakeFilter(List<Device> e) {
        for (Device d: e) {
            if (!(d.getMake() == "LENOVO")) {
                e.remove(d);
            }
        }
        return e;
    }
}
