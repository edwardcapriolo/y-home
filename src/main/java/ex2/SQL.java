package ex2;

public class SQL {
/*We need to create a table and populate it with users (CookieID) 
	who is from the New York state and has been to a News Site in 
	Augst 2017 but has not visited CNN ever along with their first 
	and last visit time ever . The structure of the table is as follows :		*/
	
/*
Logs	
	LogID	INT	Auto Increment ID for every page hit	
	ViewTimeStamp	TIMESTAMP	Timestamp of the time a page view happened	
	CookieID	VARCHAR	CookieID is a unique hash for a given visitor	
	SiteID	INT	FK to Site	
	LocationID	INT	FK to Location	
	URL	VARCHAR	URL of the page visited	
	* This Table is a very large table with 100 million rows per day , partitioned and indexed on the timestamp			
				
Location	
    Location ID	INT	Auto Increment PK	
	Country	CHAR(3)	3 Letter ISO Code , eg. USA	
	State	VARCHAR(300)	Eg. New York, Texas etc.	
	City	VARCHAR(300)	Eg. New York City, Houston	
	Zip Code	VARCHAR(30)	Postal Code	
				
Site	SiteID	INT	Auto Increment PK	
	SiteName	VARCHAR(300)	Site Name such as "CNN, New York Times, Huffington Post,ESPN"	
	SiteVeritcal	VARCHAR(300)	Type of the site visited - News , Life Style, Sports etc	
*/
	
	/* 
	 * //USERS FROM NY that have been to a news site in august
	 * SELECT CookieID FROM Logs 
	 * INNER JOIN Site 
	 * ON Site.SiteVertical = Logs.SiteID
	 * INNER JOIN Location
	 * ON Location.ID = Logs.Location.ID
	 * WHERE SiteVertical = 'News' AND 
	 * (ViewTimeStamp >= '2017 09 01' AND ViewTimeStamp < '2017 10 01')
	 * AND State = 'New York'
	 * 
	 */
	
	/*
	 * //not visited CNN ever using in
	 * SELECT CookieID FROM Logs 
	 * INNER JOIN Site 
	 * ON Site.SiteVertical = Logs.SiteID
	 * INNER JOIN Location
	 * ON Location.ID = Logs.Location.ID
	 * WHERE SiteVertical = 'News' AND 
	 * (ViewTimeStamp >= '2017 09 01' AND ViewTimeStamp < '2017 10 01')
	 * AND State = 'New York'
	 * AND CookieId NOT IN ( 
	 *   SELECT CookieId FROM Logs INNER JOIN Site 
	 *   ON Site.SiteID = Logs.SiteId
	 *   WHERE SiteID == 'CNN' )
	 */
	 
	/*
	 * CREATE TABLE final_answer AS (
	 *   SELECT * FROM (SELECT distinct(CookieId) FROM ( ^code above^ ) ) A 
	 *     INNER JOIN  (SELECT min(ViewTimeStamp), max(ViewTimeStamp), CookieId) B
	 *     ON a.CookieId = b.CookieId 
	 * )
	 */
	
	/* question 2 
	 * SELECT * FROM user_address where state = 'New York' and Start_DateTime >='2017 04 01' and End_dateTime < '2017 04 01'
	 * */
	 
}
