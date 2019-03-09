package com.example.mytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var computer = arrayOf("Rock","Paper","Scissors")
    var choice = ""
    var win = 0
    var loss = 0
    var draw = 0
    var streaks = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rock.setOnClickListener {
            choice = "Rock"
            var op = computer[(0..2).random()]
            if (op == "Scissors") {
                value.setText("You Win!  Opponent Chose: " + op)
                win+=1
                streaks += 1
                won.setText("Won: " + win)
                streak.setText("Win Streak: " + streaks)
            } else if (op == "Paper") {
                value.setText("You Lose!  Opponent Chose: " + op)
                loss +=1
                streaks = 0
                lost.setText("Lost: " + loss)
                streak.setText("Win Streak: " + streaks)
            } else {
                value.setText("DRAW!  Opponent Chose: " + op)
                draw += 1
                streaks = 0
                draws.setText("Drew: " + draw)
                streak.setText("Win Streak: " + streaks)
            }
        }

        paper.setOnClickListener {
            choice = "Paper"
            var op = computer[(0..2).random()]
            if (op == "Scissors") {
                value.setText("You Lose!  Opponent Chose: " + op)
                loss +=1
                streaks = 0
                lost.setText("Lost: " + loss)
                streak.setText("Win Streak: " + streaks)
            } else if (op == "Paper") {
                value.setText("DRAW! Opponent Chose: " + op)
                draw += 1
                streaks = 0
                draws.setText("Drew: " + draw)
                streak.setText("Win Streak: " + streaks)
            } else {
                value.setText("You Win!  Opponent Chose: " + op)
                win +=1
                streaks += 1
                won.setText("Won: " + win)
                streak.setText("Win Streak: " + streaks)
            }
        }

        scissors.setOnClickListener {
            choice = "Scissors"
            var op = computer[(0..2).random()]
            if (op == "Scissors") {
                value.setText("DRAW!  Opponent Chose: " + op)
                draw += 1
                draws.setText("Drew: " + draw)
                streak.setText("Win Streak: " + streaks)
            } else if (op == "Paper") {
                value.setText("You Win!  Opponent Chose: " + op)
                win +=1
                streaks += 1
                won.setText("Won: " + win)
                streak.setText("Win Streak: " + streaks)
            } else {
                value.setText("You Lose  Opponent Chose: " + op)
                loss +=1
                lost.setText("Lost: " + loss)
                streak.setText("Win Streak: " + streaks)
            }
        }
    }
}
