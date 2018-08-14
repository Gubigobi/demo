package Builder;

/**
 * 乐高机器人
 *
 * @auther XJ-PC xj
 * @create 2018-8-1014:21
 */
public class LegoRobot {
    private String head;
    private String hand;
    private String body;
    private String wheel;

    public LegoRobot(){

    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "LegoRobot{" +
                "head='" + head + '\'' +
                ", hand='" + hand + '\'' +
                ", body='" + body + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
