package cn.edu.gdmec.android.cradview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView mLvMsgList;
    private List<Msg> mDatas = new ArrayList<>();

    private MsgAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatas.addAll(MsgLab.generateMockList());
        mDatas.addAll(MsgLab.generateMockList());

        mLvMsgList=findViewById(R.id.id_lv_msgList);
        mAdapter = new MsgAdapter(this,mDatas);
        mLvMsgList.setAdapter(mAdapter);

    }

}
