package com.example.basicquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView question, questionNum;
    private Button answer1,answer2,answer3,answer4;
    private ArrayList<QuizModal> quizModalArrayList;
    int currentScore = 0, questionAttempted = 1, currentPos;
    private ImageView shareBtn;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the views
        question = findViewById(R.id.question);
        questionNum = findViewById(R.id.questionNum);
        answer1 = findViewById(R.id.answer1Btn);
        answer2 = findViewById(R.id.answer2Btn);
        answer3 = findViewById(R.id.answer3Btn);
        answer4 = findViewById(R.id.answer4Btn);
        shareBtn = findViewById(R.id.shareQuestion);
        random = new Random();
        getQuestion(quizModalArrayList);
        currentPos = random.nextInt(quizModalArrayList.size());
        sendDataToUi(currentPos);

          answer1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(quizModalArrayList.get(currentPos).getCorrectAnswer().trim().toLowerCase().equals(answer1.getText().toString().trim().toLowerCase())){
                        currentScore++;
                  }
                  questionAttempted++;
                  currentPos = random.nextInt(quizModalArrayList.size());
                  sendDataToUi(currentPos);

              }
          });

          answer2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(quizModalArrayList.get(currentPos).getCorrectAnswer().trim().toLowerCase().equals(answer2.getText().toString().trim().toLowerCase())){
                      currentScore++;
                  }
                  questionAttempted++;
                  currentPos = random.nextInt(quizModalArrayList.size());
                  sendDataToUi(currentPos);

              }
          });

          answer3.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(quizModalArrayList.get(currentPos).getCorrectAnswer().trim().toLowerCase().equals(answer3.getText().toString().trim().toLowerCase())){
                      currentScore++;
                  }
                  questionAttempted++;
                  currentPos = random.nextInt(quizModalArrayList.size());
                  sendDataToUi(currentPos);
              }
          });

          answer4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  if(quizModalArrayList.get(currentPos).getCorrectAnswer().trim().toLowerCase().equals(answer4.getText().toString().trim().toLowerCase())){
                      currentScore++;
                  }
                  questionAttempted++;
                  currentPos = random.nextInt(quizModalArrayList.size());
                  sendDataToUi(currentPos);
              }
          });



    }


    //ArrayList to hold the questions
    private void getQuestion(ArrayList<QuizModal> quizModals){

        quizModals.add(new QuizModal("When was the Namibia University of Science and Technology(NUST) established?","16 Nov 2015","04 Jan 2000","Somewhere in 1980","I dont know","Somewhere in 1980"));

        quizModals.add(new QuizModal("Who was the first chancellor of the Namibia University of Science and Technology?","I dont know","Mr. T Ndhlovu","Mr T Tjiviuka","Mr S Muchenyika","Mr T Tjiviuka"));

        quizModals.add(new QuizModal("Who created the backend guru youtube channel?","Phoenix","The BackEndGuru","Sultan Tin","Mr T Ndhlovu","Mr T Ndhlovu"));

        quizModals.add(new QuizModal("Why was The-back-end-guru youtube channel created?","To help students with their assignments","To help people gain specialized tech knowledge","I dont know","I dont know","To help people gain specialized tech knowledge"));

    }

    //Send Data to our views
    private void sendDataToUi(int currentPos){
        questionNum.setText("Question : "+questionAttempted+"/4");

        question.setText(quizModalArrayList.get(currentPos).getQuestion());
        answer1.setText(quizModalArrayList.get(currentPos).getAnswer1());
        answer2.setText(quizModalArrayList.get(currentPos).getAnswer2());
        answer3.setText(quizModalArrayList.get(currentPos).getAnswer3());
        answer4.setText(quizModalArrayList.get(currentPos).getAnswer4());



    }





}