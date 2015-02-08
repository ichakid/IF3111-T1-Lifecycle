package ichakid.androidintentexplicit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import ichakid.androidintentexplicit.R;

/**
 * Created by User on 2/8/2015.
 */
public class ResultActivity extends Activity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_result);
        Bundle extras = super.getIntent().getExtras();
        String str = extras.getString("value1");
        TextView text = (TextView) findViewById(R.id.displayintentextra);
        text.setText(str);
    }
}
