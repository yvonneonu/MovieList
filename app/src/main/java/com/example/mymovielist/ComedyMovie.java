package com.example.mymovielist;

import java.util.ArrayList;
import java.util.List;

public class ComedyMovie {
    List<MyMovie> ComdeyList = new ArrayList<>();

    public List<MyMovie> RadioAction(){
        return ComdeyList;
    }

    public ComedyMovie(){
        addMovie();
    }
    public void  addMovie(){
        ComdeyList.add(TheBoys);
        ComdeyList.add(HubieHalloween);
        ComdeyList.add(BoratSubsequentMoviefilm);
        ComdeyList.add(SchittsCreek);
        ComdeyList.add(LoveandMonsters);
        ComdeyList.add(EmilyinParis);
        ComdeyList.add(TheWitches);
        ComdeyList.add(HocusPocus);

    }
    MyMovie TheBoys = new MyMovie("The Boys", "A group of vigilantes sets out to take down corrupt superheroes who abuse their superpowers.", 2019,
                                                   "https://m.media-amazon.com/images/M/MV5BNGEyOGJiNWEtMTgwMi00ODU4LTlkMjItZWI4NjFmMzgxZGY2XkEyXkFqcGdeQXVyNjcyNjcyMzQ@._V1_UX182_CR0,0,182,268_AL_.jpg", 9);
    MyMovie HubieHalloween = new MyMovie("Hubie Halloween", "Despite his devotion to his hometown of Salem (and its Halloween celebration), Hubie Dubois is a figure of mockery for kids and adults alike. But this year, something is going bump in the night, and it's up to Hubie to save Halloween.", 2020,
            "https://m.media-amazon.com/images/M/MV5BMTE0N2EyMzgtMWJhZS00ZWNmLThjZmQtMjcxYTk1NTJiMGVkXkEyXkFqcGdeQXVyNjY1MTg4Mzc@._V1_UY268_CR16,0,182,268_AL_.jpg", 6);

    MyMovie BoratSubsequentMoviefilm = new MyMovie("Borat Subsequent Moviefilm", "Follow-up film to the 2006 comedy centering on the real-life adventures of a fictional Kazakh television journalist named Borat.", 2020,
            "https://m.media-amazon.com/images/M/MV5BZmY2ZmM5YTktZThiOC00YjEzLTg4YTctMDAxYWEyZmEyZDlhXkEyXkFqcGdeQXVyMjkwOTAyMDU@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie SchittsCreek = new MyMovie("Schitt's Creek ", "When rich video-store magnate Johnny Rose and his family suddenly find themselves broke, they are forced to leave their pampered lives to regroup in Schitt's Creek.", 2015,
            "https://m.media-amazon.com/images/M/MV5BNWQ1ZmM3MTQtNTVhZC00MWVlLWI5ZjgtYmZiYWQxZjUzZWM0XkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_UX182_CR0,0,182,268_AL_.jpg", 8);

    MyMovie LoveandMonsters = new MyMovie("Love and Monsters", "In a monster-infested world, Joel learns his girlfriend is just 80 miles away. To make the dangerous journey, Joel discovers his inner hero to be with the girl of his dreams.",
            2020, "https://m.media-amazon.com/images/M/MV5BYWVkMWEyMDUtZTVmOC00MTYxLWE1ZTUtNjk4M2IzMjY2OTIxXkEyXkFqcGdeQXVyMDk5Mzc5MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie EmilyinParis = new MyMovie("Emily in Paris ", "A young American woman from the Midwest is hired by a marketing firm in Paris to provide them with an American perspective on things.", 2020,
            "https://m.media-amazon.com/images/M/MV5BYTFjZjQzZDgtOWEyNy00YmY1LTgyYjQtMTBlODUxZTBiZWRkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie TheWitches = new MyMovie("The Witches", "A young boy and his grandmother have a run-in with a coven of witches and their leader.", 2020,
            "https://m.media-amazon.com/images/M/MV5BNjRkYjlhMjEtYzIwOC00ZWYzLTgyMmQtYjI5M2UzNDJkNTU2XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 5);

    MyMovie HocusPocus = new MyMovie("Hocus Pocus", "A curious youngster moves to Salem, where he struggles to fit in before awakening a trio of diabolical witches that were executed in the 17th century.", 1993,
            "https://m.media-amazon.com/images/M/MV5BMWUxNWI0YTYtY2RiZS00ZjNmLTg4ZGUtNDI0Mzk4NmQ5NWE5XkEyXkFqcGdeQXVyNjk1Njg5NTA@._V1_UX67_CR0,0,67,98_AL_.jpg", 7);

}
