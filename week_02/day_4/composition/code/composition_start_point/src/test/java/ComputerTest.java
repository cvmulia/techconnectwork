import Behaviour.IOutput;
import device_management.Computer;
import device_management.Monitor;
import device_management.Printer;
import device_management.Speaker;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        computer = new Computer(8, 512, monitor);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

//    @Test
//    public void hasDevice() {
//        assertEquals(22, computer.getMonitor().getScreenSize());
//        assertEquals(786432, computer.getMonitor().getPixels());
//    }
    @Test
    public void hasOutputDevice(){
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter(){
        Printer printer = new Printer("Epson","Style",200,4);
            computer = new Computer (8,512,printer);
            assertEquals("printing: hi", computer.outputData("hi"));

    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(50);
        computer = new Computer (8,512, speaker);
        assertEquals("playing: BEEP!", computer.outputData("BEEP!"));
    }

    @Test
    public void canSetOutputDevice(){
        Printer printer =new Printer ("Epson","Stylus",200,4);
        computer.setOutputDevice(printer);
        assertEquals("printing: hi",computer.outputData("hi"));
    }

}
