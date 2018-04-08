package org.greenrobot.eventbus;

/**
 * on post event filter the subscriber
 * Created by ChenRui on 2017/5/8 0008 18:05.
 */
public interface IPostFilter {

    boolean filter(Object subscriber);
}
