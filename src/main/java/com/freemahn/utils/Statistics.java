package com.freemahn.utils;

/**
 * Created by Freemahn on 30.06.15.
 */

/**
 * This class stores requests count and its creating time.
 * Almost a bean
 */

public class Statistics {
    /**
     * Count of getAmount() requests
     */
    public static int getCount = 0;
    /**
     * Count of addAmount() requests
     */
    public static int addCount = 0;

    public static long creationTime = System.currentTimeMillis();

    /**
     * This method is called in ZeroStatsServlet
     */
    public static void zeroStats() {
        getCount = 0;
        addCount = 0;
    }

    /**
     * These methods are called in stats.jsp
     */
    public int getAddCount() {
        return addCount;
    }

    public int getGetCount() {
        return getCount;
    }

    public long getCreationTime() {
        return creationTime;
    }


}
