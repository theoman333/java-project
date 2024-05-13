package demo.db;

import java.util.List;

/**
 *
 * @author yael0
 */
public class DB {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<Show> shows = Runner.getShowsByArtist("Dylan");
        for (Show show : shows) {
            System.out.println("Show ID: " + show.getShowId());
            System.out.println("Show Time: " + show.getShowTime());
            System.out.println("Show Location: " + show.getShowLocation());
            System.out.println("Available Seats: " + show.getAvaliableSeats());
            System.out.println("Artist Name: " + show.getArtName().getArtistName());
            System.out.println("------------------------------");
        }
    }
}
