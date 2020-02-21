package com.training.knoldus;
/* Builder design pattern is an alternative way to construct complex objects and
   should be used only when we want to build different types of immutable objects
   using same object building process.*/

// Why not try Lombok? Generates getters/setters/constructors/builder for your classes at runtime
public class Main {

    public static void main(String[] args) {
	// write your code here
        Song song1 = new Song.SongBuilder("Cigarettes After Sex", "Sweet")
                .albumName("Cigarettes After Sex")
                .trackNumber(1)
                .build();

        System.out.println(song1);

        Song song2 = new Song.SongBuilder("Grapetooth", "Red Wine")
                .build();

        System.out.println(song2);

        Song song3 = new Song.SongBuilder("together PANGEA", "Is It Real?")
               .releaseYear(2017)
                .trackNumber(6)
                .build();

        System.out.println(song3);
    }

}

//Notes On Build Pattern:
/*
* Increased lines of code by double the amount
* Provides very readable code--Less parameters going to constructor
* Removes the need to pass null for optional params
* Objects are created in a complete state with no user of setters
* Helps create immutable objects without much complex logic in building process
* */
