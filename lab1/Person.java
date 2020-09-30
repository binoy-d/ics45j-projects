package labs.lab1;


/** Represents a person and their list of friends
 */
public class Person {
    
    /** Add instance variables for the class here. */
    private String name;
    private String friends;
    private int numFriends;
    /** Creates a person with a given name and no friends in their list.
     * @param name the first name of the person of interest
     */
    public Person(String name)
    {
        /** Implement this constructor appropriately. */
    	this.name = name;
    	this.friends = "";
    	this.numFriends = 0;
    }
    
    /** Retrieves the names of all of a person's friends.
     * @return a string containing all of the names of a person's friends
     */
    public String getFriendNames()
    {
        return friends;
        /** Modify this method appropriately to return the friend list. */
    }
    
    /** Adds a person to the list of friends of this person.
     * @param p the person whose name is to be added to the friend list
     */
    public void befriend(Person p)
    {
        /** Implement this method appropriately. */
    	//if this is first friend
    	numFriends++;
    	if(friends.length() == 0) {
    		friends+=p.getName();
    	}else {
    		friends+=" "+p.getName();
    	}
    }
    
    /** Removes a person from the list of friends of this person.
     * @param p the person whose name is to be removed from the friend list
     */
    public void unfriend(Person p)
    {
        /** Implement this method appropriately. */
    	numFriends--;
    	// if first friend
    	if(friends.indexOf(p.getName()) == 0) {
    		friends = friends.substring(p.getName().length()+1);
    	}else {
    		friends = friends.replace(p.getName(), "");
        	friends = friends.replace("  ", " "); //fixes double space
    	}
    	
    	
    }
    
    /** Retrieves the number of friends a person has.
     * @return an integer representing the number of friends the person has
     */
    public int getFriendCount()
    {
        return numFriends;
        /** Modify this method appropriately to return the number of friends. */
    }
    
    
    public String getName() {
    	return this.name;
    }
    
    public static void main(String[] args) {
    	Person individual = new Person("Robert");
    	individual.befriend(new Person("Fido"));
    	individual.befriend(new Person("Spot"));
    	individual.befriend(new Person("Fluffy"));
    	System.out.println("Friend List: " + individual.getFriendNames()); // Should print "Fido Spot Fluffy"
    	System.out.println("Num friends: " + individual.getFriendCount()); // Should print 3
    	individual.befriend(new Person("Sunny"));
    	individual.befriend(new Person("Max"));
    	individual.unfriend(new Person("Spot"));
    	System.out.println("Friend List: " + individual.getFriendNames()); // Should print "Fido Fluffy Sunny Max"
    	System.out.println("Num friends: " + individual.getFriendCount()); // Should print 4
    }
}
