package org.apache.cassandra.stress;

import com.datastax.driver.core.Cluster;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").withPort(15250).build();
		System.out.println("Test");
	}

}
