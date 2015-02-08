package ichakid.androidlifecycleactivity;

import android.os.Bundle;

/**
 * Created by User on 2/8/2015.
 */
public class SecondActivity extends TracerActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
