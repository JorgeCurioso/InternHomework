package com.example.glr.internhomework;

import android.util.Log;
import android.webkit.ConsoleMessage;

import java.util.Random;

public class Intern {
    // Fields (member variables) - properties about the object
    public String name;
    public boolean brainIsMelting;

    // Methods - Action the object can take
    public String sayHi() {
        String message = String.format("%s says hello!", name);
        return message;
    }

    public String eatLunch() {
        String message = String.format("%s goes chomp chomp", name);
        brainIsMelting = false;
        return message;
    }

    public String checkIn()    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(4);
        switch (randomNumber)   {
            case 0:
                return String.format("%s is hacking away, beep boop beep", name);
            case 1:
                return String.format("%s is lost in the abyss of Android", name);
            case 2:
                return String.format("%s can finally see the matrix!", name);
            default:
                return String.format("%s is crying in the stairwell", name);
        }
    }


}
