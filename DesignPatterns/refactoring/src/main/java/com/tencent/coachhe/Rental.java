package com.tencent.coachhe;


import lombok.Getter;

/**
 * 表示某个顾客租了一部影片
 *
 * @author coachhe
 * @project refactoring
 * @date 2025/5/2 22:01
 */
public class Rental {
    @Getter
    private Movie movie;
    private int _dayRented;

    public Rental(Movie movie, int _dayRented) {
        this.movie = movie;
        this._dayRented = _dayRented;
    }

    public int getDaysRented() {
        return _dayRented;
    }


}
