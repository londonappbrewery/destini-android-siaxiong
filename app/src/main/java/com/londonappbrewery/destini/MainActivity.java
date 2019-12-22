package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button mTop;
    Button mBottom;
    TextView mStoryTextView;
    int myStoryIndex = 0;

    StoryPath[] storyArr = {
            new StoryPath(R.string.T1_Story,R.string.T1_Ans1,R.string.T1_Ans2),
            new StoryPath(R.string.T2_Story, R.string.T2_Ans1,R.string.T2_Ans2),
            new StoryPath(R.string.T3_Story, R.string.T3_Ans1,R.string.T3_Ans2),
            new StoryPath(R.string.T4_End,0,0),
            new StoryPath(R.string.T5_End,0,0),
            new StoryPath(R.string.T6_End,0,0)
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTop = findViewById(R.id.buttonTop);
        mBottom = findViewById(R.id.buttonBottom);
        mStoryTextView = findViewById(R.id.storyTextView);

        mTop.setText(storyArr[myStoryIndex].getStoryAns1());
        mBottom.setText(storyArr[myStoryIndex].getStoryAns2());

        mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateQuestion(true);



            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }   //End onCreate

    private void updateQuestion(Boolean AnsTopBottom){
        if(AnsTopBottom == true){
            if(myStoryIndex == 0){
                myStoryIndex = 2;
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(storyArr[myStoryIndex].getStoryAns1());
                mBottom.setText(storyArr[myStoryIndex].getStoryAns2());
            }
            else if(myStoryIndex == 2){
                myStoryIndex = 5;
                StoryOverAlert();
                /*
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(0);
                mBottom.setText(0);
                 */

            }
            else if(myStoryIndex == 1){
                myStoryIndex = 2;
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(storyArr[myStoryIndex].getStoryAns1());
                mBottom.setText(storyArr[myStoryIndex].getStoryAns2());

            }

        }
        else {
            if(myStoryIndex == 0){
                myStoryIndex = 1;
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(storyArr[myStoryIndex].getStoryAns1());
                mBottom.setText(storyArr[myStoryIndex].getStoryAns2());

            }
            else if(myStoryIndex == 1){
                myStoryIndex = 3;
                StoryOverAlert();
                /*
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(0);
                mBottom.setText(0);
                 */
            }
            else if(myStoryIndex == 3){
                myStoryIndex = 4;
                StoryOverAlert();
                /*
                mStoryTextView.setText(storyArr[myStoryIndex].getStoryID());
                mTop.setText(0);
                mBottom.setText(0);
                */

            }

        }
        

        
    }   //End UpdateQuestion

    public void StoryOverAlert (){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("STORY OVER!");
        alert.setCancelable(false);
        alert.setMessage(storyArr[myStoryIndex].getStoryID());
        alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
    }



}    //End MainAcitvity
