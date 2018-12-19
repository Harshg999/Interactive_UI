package edmt.dev.androidgridlayout;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        TextView mTextView1 = (TextView) findViewById(R.id.cardview1);
        TextView mTextView2 = (TextView) findViewById(R.id.cardview2);
        TextView mTextView3= (TextView) findViewById(R.id.cardview3);
        TextView mTextView4 = (TextView) findViewById(R.id.cardview4);
        TextView mTextView5 = (TextView) findViewById(R.id.cardview5);
        TextView mTextView6 = (TextView) findViewById(R.id.cardview6);
        TextView mTextView7 = (TextView) findViewById(R.id.cardview7);
        TextView mTextView8 = (TextView) findViewById(R.id.cardview8);
        TextView mTextView9 = (TextView) findViewById(R.id.cardview9);



        mTextView1.setText("Event 1");
        mTextView2.setText("Event 2");
        mTextView3.setText("Event 3");
        mTextView4.setText("Event 4");
        mTextView5.setText("Event 5");
        mTextView6.setText("Event 6");
        mTextView7.setText("Event 7");
        mTextView8.setText("Event 8");
        mTextView9.setText("Event 9");

        //Set Event
        setSingleEvent(mainGrid);
    }



    private void setSingleEvent(GridLayout mainGrid) {
         final String s[]=new String[9];
        s[0]="https://i.imgur.com/GFtwsEs.png";
        s[1]="https://i.imgur.com/w4WcoU2.png";
        s[2]="https://i.imgur.com/hu3XwNF.jpg";
        s[3]="https://i.imgur.com/KF3SaJu.jpg";
        s[4]="https://i.imgur.com/qRBPjQs.jpg";
        s[5]="https://i.imgur.com/PBzvumx.jpg";
        s[6]="https://i.imgur.com/7Nb3mKU.jpg";
        s[7]="https://i.imgur.com/IBLKZ1e.jpg";
        s[8]="https://i.imgur.com/l6EYwyk.jpg";

        final String desc[]=new String[9];
        desc[0]="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.";
        desc[1]="Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old.";
        desc[2]="Etiam euismod aliquam dapibus. Nullam id ante at tortor semper placerat a et lectus. Donec in enim a eros lacinia finibus molestie euismod eros. Sed vehicula ultricies hendrerit. Morbi sit amet porttitor velit, maximus tincidunt nisl. Aenean posuere eleifend ante, sed vestibulum ligula ultrices nec.";
        desc[3]="There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don\\'t look even slightly believable.";
        desc[4]="If you are going to use a passage of Lorem Ipsum, you need to be sure there isn\\'t anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. ";
        desc[5]="Nam finibus justo id nibh ornare luctus. Suspendisse euismod ex enim, at accumsan orci eleifend eleifend. Phasellus eget volutpat odio. Etiam eleifend pellentesque laoreet. Aenean sed massa ut nisi iaculis interdum. Maecenas sollicitudin ipsum sit amet porttitor pulvinar. Aliquam pretium neque hendrerit cursus hendrerit.";
        desc[6]="Sed feugiat tempor diam ac finibus. Mauris efficitur lectus vitae neque accumsan, nec rhoncus risus efficitur. Donec viverra ligula diam, quis venenatis enim aliquet bibendum. Aenean hendrerit varius eleifend. In magna nisl, consequat vel magna vitae, fringilla suscipit ante.";
        desc[7]="Etiam magna erat, maximus volutpat erat vitae, pharetra pharetra elit. Phasellus porttitor imperdiet eros, nec condimentum tortor luctus eget. Pellentesque luctus dictum rhoncus. Mauris ex libero, maximus ut scelerisque euismod, tincidunt sed leo. Fusce sed euismod velit. Nam ac cursus nisi. Proin posuere nunc orci, non interdum odio eleifend a. Duis in laoreet mauris. Quisque faucibus aliquet turpis sit amet condimentum. In nec nisi posuere, tincidunt massa eu, viverra quam.";
        desc[8]="Mauris justo ipsum, ullamcorper sit amet sagittis a, venenatis nec ligula. Ut ipsum dui, porttitor a convallis a, interdum at mi. Curabitur ornare viverra sapien sed dictum. Sed vehicula efficitur risus, semper placerat nibh iaculis eu. Donec et vehicula dui, quis ornare risus. Vivamus cursus gravida porta.";



        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this,ActivityOne.class);
                    intent.putExtra("info",s[finalI]);
                    intent.putExtra("desc",desc[finalI]);
                    startActivity(intent);

                }
            });
        }
    }
}
