package com.hbx.thread;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by 10180885 on 16-3-5.
 */
public class BlockingQueueWheel {
    private List queue = new LinkedList();
    private int queueSize = 10;

    public BlockingQueueWheel(int queueLength) {
        this.queueSize = queueLength;
    }

    public synchronized void put(Object item){
        while (this.queue.size() == this.queueSize){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        queue.add(item);
    }

    public synchronized Object take(){
        while(this.queue.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notifyAll();
        return queue.remove(0);
    }

    public int size() {
        return queue.size();
    }
}
