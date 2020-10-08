package com.company;

import java.io.Serializable;
import java.util.ArrayList;

//Create generic class(sablonii class)
public class Laboratory <T> {


    //Cream  generic datele
    public T corpus;
    public T nr_aud;
    public T locuri;


    //Cream constructor
    public Laboratory(T corpus, T nr_aud, T locuri) {
        this.corpus = corpus;
        this.nr_aud = nr_aud;
        this.locuri = locuri;
    }

    @Override
    public String toString() {
        return "Laboratory{" +
                "corpus=" + corpus +
                ", nr_aud=" + nr_aud +
                ", locuri=" + locuri +
                '}';
    }

    public static void main(String[] args) {


        //cream lista (cu operatia add)
        ArrayList<Laboratory> labaratory = new ArrayList<Laboratory>();
        labaratory.add(new Laboratory(1, "444", 77));
        labaratory.add(new Laboratory("2", 488, 7));
        labaratory.add(new Laboratory(3, "499", "18"));
        labaratory.add(new Laboratory("4", 255, "16"));
        labaratory.add(new Laboratory("1", "300", 12));

        // afiseaza elementele
    for(Laboratory lab:labaratory)
        System.out.println(lab);

        }

    }



