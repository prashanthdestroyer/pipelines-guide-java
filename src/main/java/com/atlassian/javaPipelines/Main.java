package com.atlassian.javaPipelines;
import com.mongodb.*;
import java.util.*;
/**
 * Hello world!
 *
 */
public class Main{


	public int add(int arg1, int arg2){
		return arg1+arg2;
	}

	public int subtract(int arg1, int arg2){
		return arg1-arg2;
	}

	public int multiply(int arg1, int arg2){
		return arg1*arg2;
	}

	public int divide(int arg1, int arg2){
		return (arg2 == 0) ? 0 : arg1/arg2;
	}

    public void createDB(){
       try {

             List<ServerAddress> lstServer = new ArrayList<ServerAddress>();
             lstServer.add(new ServerAddress("127.0.0.1", 27000));
             MongoClient  mongoClient = new MongoClient(lstServer);

            // Now connect to your database
            DB db = mongoClient.getDB("test");

            DBCollection coll = db.createCollection("Test", null);

            DBCollection colReceived= db.getCollection("Test");


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

    }
}