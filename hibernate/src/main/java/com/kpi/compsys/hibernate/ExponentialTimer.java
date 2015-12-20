package com.kpi.compsys.hibernate;

import com.kpi.compsys.dao.exceptions.DatabaseNotResponseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Created by Vova on 12/20/2015.
 */

public class ExponentialTimer {
    private static final Logger logger = LogManager.getLogger(ExponentialTimer.class);
    private final double r = 0.7;
    private final long x0 = 300;

    private long delay = 0;
    private int t = 1;
    private final long MAX_TIME_DELAY = Long.MAX_VALUE;
    private long lastTimeRequest = 0;
    private final int MAX_COUNT_REQUEST = 20;

    public void calcNextTime() {
        if (t >= MAX_COUNT_REQUEST) {
            delay = MAX_TIME_DELAY;
            logger.error("Too many request. >20. Need restart server.");
        } else {
            lastTimeRequest = System.currentTimeMillis();
            delay = x0 * (long) Math.pow(1 + r, t);
            logger.info("Time delay = "+delay+", request number = "+ t);
            t++;
        }

    }

    public void checkTimeBarrier() throws DatabaseNotResponseException{
        logger.info((System.currentTimeMillis() - lastTimeRequest)+":"+delay);
        if (System.currentTimeMillis() - lastTimeRequest > delay) {
            logger.info("Try connect to database..");
        } else {
          //  calcNextTime();
            throw new DatabaseNotResponseException("Database connection is lost.");

        }
    }

    public void throwDatabaseNotResponceException(){
        throw new DatabaseNotResponseException("Database connection is lost.");
    }

    public void reset(){
        t = 1;
        lastTimeRequest = 0;
        delay=0;
    }

    public void start(){
        lastTimeRequest = System.currentTimeMillis();
        calcNextTime();
    }

}
