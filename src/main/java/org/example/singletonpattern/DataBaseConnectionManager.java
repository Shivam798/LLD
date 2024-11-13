package org.example.singletonpattern;

public class DataBaseConnectionManager {

    private static DataBaseConnectionManager instance;

    private DataBaseConnectionManager (){
    }

    public static DataBaseConnectionManager getInstance(){

        synchronized (DataBaseConnectionManager.class){
            if(instance==null){
                instance=new DataBaseConnectionManager();
            }
        }
        return instance;
    }
    public void connectDB(){
        System.out.println("Connecting to DataBase");
    }

    public void disconnectDB(){
        System.out.println("Disconnecting to DataBase");
    }
}
