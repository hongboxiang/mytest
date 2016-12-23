package com.hbx.thread.producerConsumer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/** 
* StorageUseSynchronized Tester.
* 
* @author hongboxiang
* @since <pre>二月 27, 2016</pre> 
* @version 1.0 
*/ 
public class StorageTest {

    @Before
    public void before() throws Exception { 
    } 
    
    @After
    public void after() throws Exception { 
    }

    @Test
    public void 生产者生产1个(){
        StorageUseSynchronized storage = new StorageUseSynchronized(5);
        Producer producer = new Producer(storage);
        producer.produce(1);
        assertThat(storage.count(), is(1));
    }

    @Test
    public void 消费者消费1个(){
        StorageUseSynchronized storage = new StorageUseSynchronized(5);
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);
        producer.produce(2);
        consumer.consume(1);
        assertThat(storage.count(), is(1));
    }
    
        
    } 
