package com.emmanuelmir.filmesapp.eventbus;

import org.greenrobot.eventbus.EventBus;

public class BusGlobal {

    private static EventBus thisBus;
    public static EventBus getBus() {
        if (thisBus == null)
            thisBus = EventBus.getDefault();
        return thisBus;
    }


}
