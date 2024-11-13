package org.example.singletonpattern;

public class Main {

        //for testing purpose implement Main with Runnable
//    @Override
//    public void run() {
//        DataBaseConnectionManager obj = DataBaseConnectionManager.getInstance();
//        System.out.println("Thread running for "+obj.hashCode());
//    }

    public static void main(String[] args) {

        DataBaseConnectionManager obj1 = DataBaseConnectionManager.getInstance();
        DataBaseConnectionManager obj2 = DataBaseConnectionManager.getInstance();
        System.out.println(obj2); System.out.println(obj1);
        obj2.connectDB();
        obj2.disconnectDB();

        //For testing
//        Thread t1 = new Thread(new Main());
//        Thread t2 = new Thread(new Main());
//
//        t1.start();
//        t2.start();
//
//        try{
//            t1.join();
//            t2.join();
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
}
