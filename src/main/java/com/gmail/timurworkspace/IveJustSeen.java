package com.gmail.timurworkspace;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 04.05.2018.
 */
@Component
public class IveJustSeen implements CompactDisc{
    private String title = "I’ve Just Seen a Face";
    private String artist = "The Beatles";

    public String play() {
        return "Playing "+artist+" - "+title;
    }
}
