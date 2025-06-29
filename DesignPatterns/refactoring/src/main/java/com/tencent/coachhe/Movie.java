<<<<<<< HEAD
package com.tencent.coachhe;

import lombok.Getter;
import lombok.Setter;

/**
 * 简单的纯数据类。
 *
 * @author coachhe
 * @project refactoring
 * @date 2025/5/2 21:59
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public String getTitle() {
        return _title;
    }



}
=======
package com.tencent.coachhe;

/**
 * @author coachhe
 * @project refactoring
 * @date 2025/5/3 12:32
 * @description
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }
}
>>>>>>> 2cc89cdfc86c981699b0188615696d4618db93da
