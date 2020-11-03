package com.example.mymovielist;

import java.util.ArrayList;
import java.util.List;

public class ActionMovie {
    List<MyMovie> ActionList = new ArrayList<>();

    public List<MyMovie> mobileAction(){
        return ActionList;
    }

    public ActionMovie() {
        addMovie();
    }

    public void addMovie(){
        ActionList.add(Blindside);
        ActionList.add(TheGodfather);
        ActionList.add(TheUmbrellaAcademy);
        ActionList.add(TheHateUGive);
        ActionList.add(BoyzntheHood);
        ActionList.add(VenomLetThereBeCarnage);
        ActionList.add(LustCaution);
        ActionList.add(IsItWrongtoTrytoPickUpGirlsinaDungeon);
        ActionList.add(CallMebyYourName);
        ActionList.add(DomesticnaKanojo);
        ActionList.add(ReAnimator);
        ActionList.add(DadWanted);
        ActionList.add(QueerasFolk);
        ActionList.add(BrotherhoodoftheWolf);
        ActionList.add(TheBoys);
    }

    MyMovie Blindside = new MyMovie("Blindside", "Harvey Keitel plays Penfield Gruber, a once great scientist, reduced to managing a sleazy hotel. Gruber monitors the daily comings and goings of his tenants, mainly for his own interest, ... ",
            1987, "https://m.media-amazon.com/images/M/MV5BMTkxODIzNjM2OF5BMl5BanBnXkFtZTYwODE3Mjg5._V1_UX182_CR0,0,182,268_AL_.jpg",
            4);

    MyMovie TheGodfather = new MyMovie("The Godfather","The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            1972, "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY268_CR3,0,182,268_AL_.jpg",
            9);

    MyMovie TheUmbrellaAcademy = new MyMovie("The Umbrella Academy", "A family of former child heroes, now grown apart, must reunite to continue to protect the world.", 2019,
            "https://m.media-amazon.com/images/M/MV5BNzA5MjkwYzMtNGY2MS00YWRjLThkNTktOTNmMzdlZjE3Y2IxXkEyXkFqcGdeQXVyMjkwMzMxODg@._V1_UY268_CR0,0,182,268_AL_.jpg", 8);

    MyMovie TheHateUGive = new MyMovie("The Hate U Give", "Starr witnesses the fatal shooting of her childhood best friend Khalil at the hands of a police officer. Now, facing pressure from all sides of the community, Starr must find her voice and stand up for what's right.",
            2018, "https://m.media-amazon.com/images/M/MV5BZDVkMWJiMzUtNjQyOS00MGVmLWJhYmMtN2IxYzU4MjY3MDRmXkEyXkFqcGdeQXVyNzA5NjIzODk@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie BoyzntheHood = new MyMovie("Boyz n the Hood", "Follows the lives of three young males living in the Crenshaw ghetto of Los Angeles, dissecting questions of race, relationships, violence, and future prospects.", 1991,
            "https://m.media-amazon.com/images/M/MV5BZmRjNDI5NTgtOTIwMC00MzJhLWI4ZTYtMmU0ZTE3ZmRkZDNhXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie VenomLetThereBeCarnage = new MyMovie("Venom: Let There Be Carnage", "Plot unknown. Sequel to the 2018 film 'Venom'.", 2020,
            "https://m.media-amazon.com/images/M/MV5BZjVmYzVjZWUtODE3NS00ZTExLThhMTUtNzU3ZGE2NGYwOWE4XkEyXkFqcGdeQXVyMTAwODc1OTcy._V1_UY268_CR43,0,182,268_AL_.jpg", 9);

    MyMovie LustCaution = new MyMovie("Lust, Caution", "https://m.media-amazon.com/images/M/MV5BMTI3MDI5ODMyNl5BMl5BanBnXkFtZTcwMTM2MjA1MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 2007,
            "https://m.media-amazon.com/images/M/MV5BMTI3MDI5ODMyNl5BMl5BanBnXkFtZTcwMTM2MjA1MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie IsItWrongtoTrytoPickUpGirlsinaDungeon = new MyMovie("Is It Wrong to Try to Pick Up Girls in a Dungeon? ", "Commonly known as the \"Dungeon,\" the city of Orario possesses a huge labyrinth in the underground. Its strange name attracts excitement, illusions of honor, and hopes of romance with a ...", 2015,
            "https://m.media-amazon.com/images/M/MV5BY2JhZThjMjAtMjA5Yi00ZTIxLTljODctZDgxMzdlMzA2YjllXkEyXkFqcGdeQXVyMzgxODM4NjM@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie CallMebyYourName = new MyMovie("Call Me by Your Name", "In 1980s Italy, romance blossoms between a seventeen-year-old student and the older man hired as his father's research assistant.", 2017,
            "https://m.media-amazon.com/images/M/MV5BNDk3NTEwNjc0MV5BMl5BanBnXkFtZTgwNzYxNTMwMzI@._V1_UX182_CR0,0,182,268_AL_.jpg", 8);

    MyMovie DomesticnaKanojo = new MyMovie("Domestic na Kanojo", "Natsuo Fujii is in love with his teacher, Hina. Attempting to forget his feelings towards her, Natsuo goes to a mixer with his classmates where he meets an odd girl named Rui Tachibana. In", 2019,
            "https://m.media-amazon.com/images/M/MV5BM2RmZmI2NmUtNDhjMi00MGQ4LWIyYTEtZmMxM2E1ZjBkYTU0XkEyXkFqcGdeQXVyMzgxODM4NjM@._V1_UY268_CR0,0,182,268_AL_.jpg", 6);

    MyMovie ReAnimator =new MyMovie("Re-Animator", "After an odd new medical student arrives on campus, a dedicated local and his girlfriend become involved in bizarre experiments centering around the re-animation of dead tissue.", 1985,
            "https://m.media-amazon.com/images/M/MV5BNDRjNjRlNmYtZGVkOS00ODA1LWFmMTEtZmY1MWY5ZGM5OWUxXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie DadWanted = new MyMovie("Dad Wanted", "Blanca's mom stopped letting her ride her BMX bike after her dad died in an accident. So, after reading about a BMX contest happening soon, she tries to enter it without her mom's knowledge. The only problem? A parent needs to sign her in.", 2020,
            "https://m.media-amazon.com/images/M/MV5BMGNhNjM4ZTAtNjI0OS00NzlmLTg5YzEtZDVjODlhNjc0MWZkXkEyXkFqcGdeQXVyNTQzMDYwMjc@._V1_UY268_CR4,0,182,268_AL_.jpg", 6);

    MyMovie QueerasFolk = new MyMovie("Queer as Folk ", "The lives and loves of a group of gay friends living in Pittsburgh, Pennsylvania.", 2000,
            "https://m.media-amazon.com/images/M/MV5BNjgzMjc3MzY5N15BMl5BanBnXkFtZTcwNzM0OTcyMQ@@._V1_UY268_CR4,0,182,268_AL_.jpg", 8);

    MyMovie BrotherhoodoftheWolf = new MyMovie("Brotherhood of the Wolf ", "In 18th-century France, the Chevalier de Fronsac and his Native American frien'd Mani are sent to the Gevaudan province at the king's behest to investigate the killings of hundreds by a mysterious beast.", 2002,
            "https://m.media-amazon.com/images/M/MV5BNTkxMjg5MDYtZDkyMS00NjFlLTk5YTItMWUyOTNkOTg4YmRhXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_UX182_CR0,0,182,268_AL_.jpg", 7);

    MyMovie TheBoys = new MyMovie("The Boys", "A group of vigilantes sets out to take down corrupt superheroes who abuse their superpowers.", 2019,
            "https://m.media-amazon.com/images/M/MV5BNGEyOGJiNWEtMTgwMi00ODU4LTlkMjItZWI4NjFmMzgxZGY2XkEyXkFqcGdeQXVyNjcyNjcyMzQ@._V1_UX182_CR0,0,182,268_AL_.jpg", 9);
}

