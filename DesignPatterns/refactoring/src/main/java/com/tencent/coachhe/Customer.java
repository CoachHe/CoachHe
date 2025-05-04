package com.tencent.coachhe;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author coachhe
 * @project refactoring
 * @date 2025/5/3 12:34
 * @description
 */
public class Customer {
    // 私有成员变量，用于存储客户的名字
    private String _name;
    // 私有成员变量，使用Vector来存储客户的租赁记录，这里假设Rental是一个自定义的租赁相关类
    private Vector<Rental> _rentals = new Vector<>();

    // 构造函数，用于初始化客户的名字
    public Customer(String name) {
        _name = name;
    }

    // 方法用于向客户的租赁记录中添加一项租赁
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    // 方法用于获取客户的名字
    public String getName() {
        return _name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two - day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE &&
                    each.getDaysRented() > 1) frequentRenterPoints++;

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }
}
