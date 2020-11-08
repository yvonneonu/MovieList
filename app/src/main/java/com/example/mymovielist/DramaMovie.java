package com.example.mymovielist;

import java.util.ArrayList;
import java.util.List;

public class DramaMovie {
    List<MyMovie> DramaList = new ArrayList<>();

    public  List<MyMovie> funnyMovie(){
        return DramaList;
    }
    public  DramaMovie() {
        addMovie();

    }
    public void addMovie(){
        DramaList.add(TheQueensGambit);
        DramaList.add(Barbarians);
        DramaList.add(TheHauntingofBlyManor);
        DramaList.add(TheUndoing);
        DramaList.add(Rebecca);


    }

    MyMovie TheQueensGambit = new MyMovie("The Queen's Gambit", "Orphaned at 9, prodigious introvert Beth Harmon discovers and masters the game of chess in 1960s USA. But, child stardom comes at a price.",
            2020, "https://m.media-amazon.com/images/M/MV5BM2EwMmRhMmUtMzBmMS00ZDQ3LTg4OGEtNjlkODk3ZTMxMmJlXkEyXkFqcGdeQXVyMjM5ODk1NDU@._V1_UX67_CR0,0,67,98_AL_.jpg", 9);

    MyMovie Barbarians = new MyMovie("Barbarians", "T he famous battle of the Teutoburg Forest, in which Germanic warriors halted the northward advance of the Roman Empire in AD 9, is the focus of The Barbarians.", 2020,
            "https://m.media-amazon.com/images/M/MV5BNzdjNWU4MTktYTJmYi00YWZhLTllYWUtZGY2YzE3MWYxMmY4XkEyXkFqcGdeQXVyNjEwNTM2Mzc@._V1_UX67_CR0,0,67,98_AL_.jpg", 7);

    MyMovie TheHauntingofBlyManor = new MyMovie("The Haunting of Bly Manor", "After an au pair’s tragic death, Henry hires a young American nanny to care for his orphaned niece and nephew who reside at Bly Manor with the chef Owen, groundskeeper Jamie and housekeeper, Mrs. Grose", 2020,
            "https://m.media-amazon.com/images/M/MV5BZGJkMDRiOWUtZTMzZC00YzYzLWI1NDAtODc4ZGFiN2Q2MmJlXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UY98_CR5,0,67,98_AL_.jpg", 7);

    MyMovie TheUndoing = new MyMovie("The Undoing", "Life for a successful therapist in New York begins to unravel on the eve of publishing her first book.", 2020,
            "https://m.media-amazon.com/images/M/MV5BNzY5YTcxMWYtYjFkZi00ZmI3LThmYjgtMzY0YjQzZWFkNzQ4XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX67_CR0,0,67,98_AL_.jpg", 7);

    MyMovie Rebecca = new MyMovie("Rebecca", "Set in 1980's and 90's Bombay, it follows the life of Harshad Mehta, a stockbroker who took the stock market to dizzying heights and his catastrophic downfall.", 2020,
            "https://m.media-amazon.com/images/M/MV5BNjgxZTMxNmQtZGFkZS00NDUyLTllMzYtOTE0ZjdlMjM1ZWU0XkEyXkFqcGdeQXVyMTAyMTE1MDA1._V1_UX67_CR0,0,67,98_AL_.jpg", 9);


}
