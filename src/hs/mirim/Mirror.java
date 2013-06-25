package hs.mirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Mirror extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mirror);
		
		ImageButton ImgbtnMike = (ImageButton)findViewById(R.id.ImgbtnMike);
		ImageButton ImgbtnBack= (ImageButton)findViewById(R.id.ImgbtnBack);
		
		ImgbtnMike.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				
				ImageView ImgMirror = (ImageView)findViewById(R.id.imgMirror);
				ImgMirror.setImageResource(R.drawable.mirorr1);
				
			}
		});
		
		ImgbtnBack.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Intent intent = new Intent(Mirror.this, Confidence_ProjectActivity.class);
				startActivity(intent);
			}
		});
	}

}
