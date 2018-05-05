package com.gmail.timurworkspace;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 04.05.2018.
 */

@Component
public class ISawHer implements CompactDisc{

    private String title = "I Saw Her Standing There";
    private String artist = "The Beatles";

    public String play() {
        return "Playing "+artist+" - "+title;
    }
}
