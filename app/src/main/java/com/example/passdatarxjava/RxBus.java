package com.example.passdatarxjava;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

public final class RxBus {

    private static final BehaviorSubject<Object> behaviorSubject = BehaviorSubject.create();

    public static BehaviorSubject<Object> getSubject()
    {
        return behaviorSubject;
    }
}
