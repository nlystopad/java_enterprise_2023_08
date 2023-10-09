package com.hillel.multi.service.listener;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HealthStatusListener {

    @EventListener
    public void onLivenessEvent(AvailabilityChangeEvent<LivenessState> event) {
        switch (event.getState()) {
            case CORRECT -> System.out.println("Application is running");
            case BROKEN -> System.out.println("Something went wrong");
            default -> System.out.println("Some default liveness state");
        }
    }

    @EventListener
    public void onReadinessEvent(AvailabilityChangeEvent<ReadinessState> event) {
        try {
            System.out.println("ReadinessStateEvent object hashcode = " + event.getResolvableType().hashCode());
        } catch (NullPointerException exception) {
            System.out.println("ReadinessStateEvent object is null");
        }
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC -> System.out.println("Everything is fine, application accepts traffic");
            case REFUSING_TRAFFIC ->
                    System.out.println("Wops! Something went wrong and application cannot accept any traffic");
            default -> System.out.println("Some default readiness state");
        }
    }
}
