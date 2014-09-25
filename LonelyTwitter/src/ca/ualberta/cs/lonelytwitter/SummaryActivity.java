package ca.ualberta.cs.lonelytwitter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SummaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_summary);
		
		Summary summary = new Summary();
		
		TextView number = (TextView) findViewById( R.id.numberOfTweetsText );
		number.setText("Number of Tweets: "+summary.getAvgNumTweets());
		

		TextView length = (TextView) findViewById( R.id.lengthOfTweetsText );
		length.setText("Length of Tweets: "+summary.getAvgLenTweets());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.summary, menu);
		return true;
	}

}
