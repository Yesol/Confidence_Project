package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Confidence_ProjectActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnStart = (Button)findViewById(R.id.btnStart);
        Button btnHow = (Button)findViewById(R.id.btnHow);
        
        btnStart.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(Confidence_ProjectActivity.this, Mirror.class);
				startActivity(intent);
			}
		});
        
        btnHow.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				
			}
		});
    }
}