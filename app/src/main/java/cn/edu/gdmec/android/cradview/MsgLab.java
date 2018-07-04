package cn.edu.gdmec.android.cradview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jack on 2018/7/4.
 */

public class MsgLab {

    public static List<Msg> generateMockList(){
        List<Msg> msgList = new ArrayList<>();
        Msg msg = new Msg(1,R.drawable.images1,"huang","huang");

        msgList.add(msg);

        msg = new Msg(2,R.drawable.images2,"huang","huang");
        msgList.add(msg);
        msg = new Msg(3,R.drawable.images3,"huang","huang");
        msgList.add(msg);
        msg = new Msg(4,R.drawable.images4,"huang","huang");
        msgList.add(msg);
        msg = new Msg(5,R.drawable.images4,"huang","huang");
        msgList.add(msg);





        return msgList;
    }

}
