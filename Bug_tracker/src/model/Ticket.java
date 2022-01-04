package model;
/**
 * @author mahia
 *
 */
public class Ticket {
	/**
	 * @param: summary, location and level
	 * Creates a ticket and has get and change methods
	 */
String summary;
String location;
String level;
public Ticket(String bug_summary, String bug_location, String bug_level) {
	summary = bug_summary;
	location = bug_location;
	level = bug_level;
}
public String getSummary() {
	return summary;
}
public void changeSummary(String new_summary) {
	summary = new_summary;
}
public String getLocation() {
	return location;
}
public void changeLocation(String new_location) {
	location = new_location;
}
public String getLevel() {
	return level;
}
public void changeLevel(String new_level) {
	level = new_level;
}
}
