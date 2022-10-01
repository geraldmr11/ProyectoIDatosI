package reproductor;

import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

public class Zplayer implements BasicPlayerListener {

    BasicPlayer player = new BasicPlayer();
    BasicController control = (BasicController) player;
    Reproductor mp;

    public Zplayer(Reproductor music) {
        player.addBasicPlayerListener(this);
        mp = music;
    }

    @Override
    public void opened(Object o, Map properties) {  
    }

    @Override
    public void progress(int i, long l, byte[] bytes, Map properties) {
            
    }

    @Override
    public void stateUpdated(BasicPlayerEvent event) {
        if (player.getStatus() == BasicPlayer.STOPPED && mp.detenido == false);
    }

    @Override
    public void setController(BasicController controller) {    
    }
}



