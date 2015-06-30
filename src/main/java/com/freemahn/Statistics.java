package com.freemahn;

/**
 * Created by freeemahn on 30.06.15.
 */
public class Statistics {
    static int getCount = 0;
    static int addCount = 0;
    static long creationTime = System.currentTimeMillis();

    public int getAddCount() {
        return addCount;
    }

    public void setAddCount(int addCount) {
        Statistics.addCount = addCount;
    }

    public int getGetCount() {
        return getCount;
    }

    public void setGetCount(int getCount) {
        Statistics.getCount = getCount;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public static void zeroStats() {
        getCount = 0;
        addCount = 0;
    }


}
