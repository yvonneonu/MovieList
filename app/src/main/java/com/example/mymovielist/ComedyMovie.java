package com.example.mymovielist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ComedyMovie {
    List<MyMovie> ComedyList = new ArrayList<>();

    public List<MyMovie> RadioAction(){
        return ComedyList;
    }

    public ComedyMovie(){
        addMovie();
    }
    public void  addMovie(){
        ComedyList.add(TheBoys);
        ComedyList.add(HubieHalloween);
        ComedyList.add(BoratSubsequentMoviefilm);
        ComedyList.add(SchittsCreek);
        ComedyList.add(LoveandMonsters);
        ComedyList.add(EmilyinParis);
        ComedyList.add(TheWitches);
        ComedyList.add(HocusPocus);
        ComedyList.add(BoratCulturalLearningsofAmericaforMakeBenefitGloriousNationofKazakhstan);
        ComedyList.add(OvertheMoon);
        ComedyList.add(TheOffice);
        ComedyList.add(ThisIsUs);
        ComedyList.add(CobraKai);
        ComedyList.add(OntheRocks);
        ComedyList.add(TheAddamsFamily);

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

    MyMovie BoratCulturalLearningsofAmericaforMakeBenefitGloriousNationofKazakhstan = new MyMovie("Borat: Cultural Learnings of America for Make Benefit Glorious Nation of Kazakhstan", "Kazakh TV talking head Borat is dispatched to the United States to report on the greatest country in the world. With a documentary crew in tow, Borat becomes more interested in locating and marrying", 2006,
            "https://m.media-amazon.com/images/M/MV5BMTk0MTQ3NDQ4Ml5BMl5BanBnXkFtZTcwOTQ3OTQzMw@@._V1_UX67_CR0,0,67,98_AL_.jpg", 7);

    MyMovie OvertheMoon = new MyMovie("Over the Moon", "In this animated musical, a girl builds a rocket ship and blasts off, hoping to meet a mythical moon goddess.", 2020,
            "https://m.media-amazon.com/images/M/MV5BNTI0ZjVhM2ItMmFkOS00ZmFiLTg4NGQtODJjNTZmMDYxMWMyXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 6);

    MyMovie TheOffice = new MyMovie("The Office", "A mockumentary on a group of typical office workers, where the workday consists of ego clashes, inappropriate behavior, and tedium", 2005,
            "https://m.media-amazon.com/images/M/MV5BMDNkOTE4NDQtMTNmYi00MWE0LWE4ZTktYTc0NzhhNWIzNzJiXkEyXkFqcGdeQXVyMzQ2MDI5NjU@._V1_UX67_CR0,0,67,98_AL_.jpg", 9);

    MyMovie ThisIsUs = new MyMovie(" This Is Us", "A heartwarming and emotional story about a unique set of triplets, their struggles and their wonderful parents.", 2016,
            "https://m.media-amazon.com/images/M/MV5BYjNlOWY2OWEtMGQyOC00YWQ4LWJkMjUtYzU4NGEzNjM2MWY0XkEyXkFqcGdeQXVyODUxOTU0OTg@._V1_UX67_CR0,0,67,98_AL_.jpg", 8);

    MyMovie  CobraKai = new MyMovie(" Cobra Kai", "Decades after their 1984 All Valley Karate Tournament bout, a middle-aged Daniel LaRusso and Johnny Lawrence find themselves martial-arts rivals again.", 2018,
            "https://m.media-amazon.com/images/M/MV5BYTI3NjcxNjctNzZhZS00NjQwLTg4NDEtMmQzOGJiYTUwNWFjXkEyXkFqcGdeQXVyOTA5NzQ0MDQ@._V1_UY98_CR1,0,67,98_AL_.jpg", 8);

    MyMovie OntheRocks = new MyMovie("On the Rocks", "A young mother reconnects with her larger-than-life playboy father on an adventure through New York.", 2020,
            "https://m.media-amazon.com/images/M/MV5BZTEwY2M0NzAtYjBiMi00Yzg3LWE0ZGYtYTYwODEzMWU0MDFhXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX67_CR0,0,67,98_AL_.jpg", 6);

    MyMovie TheAddamsFamily = new MyMovie("The Addams Family", "Con artists plan to fleece an eccentric family using an accomplice who claims to be their long-lost uncle.", 1991,
            "https://m.media-amazon.com/images/M/MV5BODc1NmY0MDUtNjUzNS00ODdhLWJlN2ItMTgwZjczZjI0MDkyXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_UY98_CR4,0,67,98_AL_.jpg", 7);

}
