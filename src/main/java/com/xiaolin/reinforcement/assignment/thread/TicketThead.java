package com.xiaolin.reinforcement.assignment.thread;

/**
 * @author lzh
 * @description: 买票线程
 * @date 2025/11/6 15:49
 */
public class TicketThead extends Thread{

    @Override
    public void run() {

        while(true){

            synchronized (Ticket.lock){
                if ( Ticket.num == 0){
                    break;
                }else {

                    Ticket.num--;
                    System.out.println(getName() + "卖了一张票 还剩" + Ticket.num + "张票");

                    //try {
                    //    sleep(30);
                    //} catch (InterruptedException e) {
                    //    throw new RuntimeException(e);
                    //}
                }
            }

        }
    }
}
