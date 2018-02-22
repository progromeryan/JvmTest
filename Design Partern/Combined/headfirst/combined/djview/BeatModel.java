package headfirst.combined.djview;

import javax.sound.midi.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/10/27.
 */
public class BeatModel implements BeatModelInterface,MetaEventListener {
    Sequence sequencer;
    ArrayList beatObservers = new ArrayList();
    ArrayList bpmObservers = new ArrayList();
    int bpm = 90;

    Sequence sequence;
    Track track;

    @Override
    public void initialize() {
        setUpMidi();

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return 0;
    }

    @Override
    public void registerObserver(BeatObserver o) {

    }

    @Override
    public void removeObserver(BeatObserver o) {

    }

    @Override
    public void registerObserver(BPMObserver o) {
       beatObservers.add(o);
    }

    @Override
    public void removeObserver(BPMObserver o) {

    }

    @Override
    public void meta(MetaMessage meta) {

    }

    public void setUpMidi()
    {
        try {
//            sequencer  = MidiSystem.getSequence();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
