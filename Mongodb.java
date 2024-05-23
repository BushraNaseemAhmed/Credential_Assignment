package crud_operation;

import com.mongodb.MongoClient;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Mongodb 
{
		public static void main(String[] args) 
		{
		        // Connect to MongoDB server running on localhost
		        MongoClient mongoClient = new MongoClient("localhost", 27017);
		        
		        // Accessing the database
		        MongoDatabase database = mongoClient.getDatabase("booksDB");
		        
		        // Creating a collection
		        MongoCollection<Document> collection = database.getCollection("books");
		        
		        // Inserting documents
		        Document book1 = new Document("name", "Harry Potter and the Order of the Phoenix")
		                            .append("img", "https://bit.ly/2IcnSwz")
		                            .append("summary", "Harry Potter and Dumbledore's warning about the return of Lord Voldemort is not heeded by the wizard authorities who, in turn, look to undermine Dumbledore's authority at Hogwarts and discredit Harry.");
		        
		        Document book2 = new Document("name", "The Lord of the Rings: The Fellowship of the Ring")
		                            .append("img", "https://bit.ly/2tC1Lcg")
		                            .append("summary", "A young hobbit, Frodo, who has found the One Ring that belongs to the Dark Lord Sauron, begins his journey with eight companions to Mount Doom, the only place where it can be destroyed.");
		        
		        Document book3 = new Document("name", "Avengers: Endgame")
		                            .append("img", "https://bit.ly/2Pzczlb")
		                            .append("summary", "Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America, and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with Thanos -- the evil demigod who decimated the planet and the universe");
		        
		        collection.insertOne(book1);
		        collection.insertOne(book2);
		        collection.insertOne(book3);
		        
		        System.out.println("Documents inserted successfully.");
		        
		        // Closing the connection
		        mongoClient.close();
		    }
}
