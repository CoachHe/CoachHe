package com.tencent.coachhe;

/**
 * @author coachhe
 * @project refactoring
 * @date 2025/5/3 12:34
 * @description
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}
