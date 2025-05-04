package com.karan.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // This annotation tells Spring to create a bean of this class
public class Human {

    @Autowired   // This will inject the Gorillas bean into this class
    Gorillas gorillas;

    public void canWin() {
        gorillas.compile();
    }
}
