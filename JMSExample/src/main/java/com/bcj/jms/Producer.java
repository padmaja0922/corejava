/**
 * 
 */
package com.bcj.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Producer {
	
	
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	
	private static String subject = "Test Message";
	
	public static void main(String[] args) throws JMSException {
		
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();
		
		Session session = connection.createSession(false,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createQueue(subject);
		
		MessageProducer producer = session.createProducer(destination);
		
		TextMessage message = session.createTextMessage("Hello welcome come to vallysoft ActiveMQ!");
		
		producer.send(message);
		System.out.println("Sentage '" + message.getText() + "'");

		connection.close();
		
	}
	
	
	

}
