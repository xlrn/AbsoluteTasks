package test;

import com.company.Device;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Nelson on 2016-07-10.
 */
public class DeviceTest {

    Device Device1 = new Device("CC-LVD1150", "LENOVO", "17023JU");
    Device Device2 = new Device("ONMIS-L3-G2630", "LENOVO", "195143U");
    Device Device3 = new Device("", "", "");
    List<Device> Devices = new LinkedList<Device>();
    List<Device> Lenovo = new LinkedList<Device>();
    List<Device> CC = new LinkedList<Device>();

    @org.junit.Before
    public void setUp() throws Exception {
        Devices.add(Device1);
        Devices.add(Device2);
        Devices.add(Device3);
        Lenovo.add(Device1);
        Lenovo.add(Device2);
        CC.add(Device1);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        Devices.clear();
        Lenovo.clear();
        CC.clear();
    }

    @Test
    public void testMakeFilter() {
        assertEquals(Lenovo, Device.MakeFilter(Devices));
    }

    @Test
    public void testCCFilter() {
        assertEquals(CC, Device.MakeFilter(Devices));
    }

}

