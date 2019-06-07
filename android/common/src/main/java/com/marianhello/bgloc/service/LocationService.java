package com.marianhello.bgloc.service;

import com.marianhello.bgloc.Config;
import com.marianhello.bgloc.data.BackgroundLocation;

public interface LocationService {
    void start();
    void stop();
    void startForeground();
    void stopForeground();
    void configure(Config config);
    void updateLocationFromBroadcast(BackgroundLocation location);
    void registerHeadlessTask(String jsFunction);
    void startHeadlessTask();
    void executeProviderCommand(int command, int arg);
}
