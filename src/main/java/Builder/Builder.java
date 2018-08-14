package Builder;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import service.Sender;
import service.impl.EmailSender;
import service.impl.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther XJ-PC xj
 * @create 2018-8-813:35
 */
public interface Builder {
    void createHead();
    void createHand();
    void createBody();
    void createWheel();
}
