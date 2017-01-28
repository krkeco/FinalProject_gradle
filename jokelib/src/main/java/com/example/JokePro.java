package com.example;

import java.util.Random;

public class JokePro {

    public static String joke;
    public static Random rand = new Random();

    public static String[] jokeLib = new String[18];{
        jokeLib[0] = "It’s hard to explain puns to kleptomaniacs because they always take things literally.";
        jokeLib[1]= "A farmer in the field with his cows counted 196 of them, but when he rounded them up he had 200.";
        jokeLib[2]="Time flies like an arrow, fruit flies like a banana.";
        jokeLib[3]="Why is 6 afraid of 7? Because 7 is a registered 6 offender.";
        jokeLib[4]="Why is 6 afraid of 7? Because 7 ate 9.";
        jokeLib[5]="What do you get when you cross a joke with a rhetorical question?";
        jokeLib[6]="A mathematician wanders back home at 3 a.m. and proceeds to get an earful from his wife.\n" +
                "\n" +
                "'You’re late!' she yells. 'You said you’d be home by 11:45!'" +
                "\n" +
                "'Actually,' the mathematician replies coolly, 'I said I’d be home by a quarter of 12.'";
        jokeLib[7]="A photon is going through airport security. The TSA agent asks if he has any luggage. The photon says, 'No, I’m traveling light.'";
        jokeLib[8]="A blind man walks into a bar. And a table. And a chair.";
        jokeLib[9]="How many kids with ADHD does it take to change a light bulb?" +
                "\n" + "Let’s go play on our bikes.";
        jokeLib[10]="I wondered why the baseball was getting bigger. Then it hit me.";
        jokeLib[11]="How did the hipster burn his tongue? He drank his coffee before it was cool.";
        jokeLib[12]="Marketing companies should use chromosomes in advertisements because sex cells.";
        jokeLib[13]="What is the difference between ignorance and apathy? I don’t know, and I don’t care.";
        jokeLib[14]="Whiteboards are remarkable";
        jokeLib[15]="Dwarves and gnomes have very little in common";
        jokeLib[16]="I asked my North Korean friend how it was there, he said he couldn't complain.";
        jokeLib[17]="There's no \"I\" in Denial.";


    }

    public static String getJoke(){

        joke = jokeLib[rand.nextInt(18)];


        return joke;
    }

}
