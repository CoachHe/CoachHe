<<<<<<< HEAD
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
=======
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
>>>>>>> 2cc89cdfc86c981699b0188615696d4618db93da
