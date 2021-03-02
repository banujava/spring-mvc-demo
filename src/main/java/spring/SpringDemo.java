package spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by bhanu on 4/25/2019.
 */
public class SpringDemo {
    private final static Logger log  = LoggerFactory.getLogger(SpringDemo.class);

    public static void main(String[] args) {
        System.out.println("hello");
        log.info("hello info");
        log.info("hello debug");
    }
}
