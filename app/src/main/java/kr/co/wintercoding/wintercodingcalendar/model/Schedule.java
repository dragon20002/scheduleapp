package kr.co.wintercoding.wintercodingcalendar.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Schedule {
    @PrimaryKey
    private long id;
    @ColumnInfo
    private int year; //2XXX
    @ColumnInfo
    private int month; //0-11
    @ColumnInfo
    private int week; //1-6
    @ColumnInfo
    private int date; //1-31
    @ColumnInfo
    private String content;

    public Schedule(long id, int year, int month, int date, String content) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.date = date;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}