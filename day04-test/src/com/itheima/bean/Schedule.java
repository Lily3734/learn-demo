package com.itheima.bean;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate today;

    private boolean morning;
    private LocalTime mstart;
    private LocalTime mend;
    private int mTotalNumber;
    private int mAppoinNumber;

    private boolean afternoon;
    private LocalTime astart;
    private LocalTime aend;
    private int aTotalNumber;
    private int aAppoinNumber;

    public Schedule() {
    }

    public Schedule(LocalDate today, boolean morning, LocalTime mstart, LocalTime mend, int mTotalNumber, int mAppoinNumber, boolean afternoon, LocalTime astart, LocalTime aend, int aTotalNumber, int aAppoinNumber) {
        this.today = today;
        this.morning = morning;
        this.mstart = mstart;
        this.mend = mend;
        this.mTotalNumber = mTotalNumber;
        this.mAppoinNumber = mAppoinNumber;
        this.afternoon = afternoon;
        this.astart = astart;
        this.aend = aend;
        this.aTotalNumber = aTotalNumber;
        this.aAppoinNumber = aAppoinNumber;
    }

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean getMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalTime getMstart() {
        return mstart;
    }

    public void setMstart(LocalTime mstart) {
        this.mstart = mstart;
    }

    public LocalTime getMend() {
        return mend;
    }

    public void setMend(LocalTime mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppoinNumber() {
        return mAppoinNumber;
    }

    public void setmAppoinNumber(int mAppoinNumber) {
        this.mAppoinNumber = mAppoinNumber;
    }

    public boolean getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppoinNumber() {
        return aAppoinNumber;
    }

    public void setaAppoinNumber(int aAppoinNumber) {
        this.aAppoinNumber = aAppoinNumber;
    }

}
