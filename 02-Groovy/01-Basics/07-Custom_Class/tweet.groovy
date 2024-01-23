@groovy.transform.ToString()
class Tweet {

    String username // @handlers
    String text
    Integer retweets
    Integer favorites
    Date  createdOn

    // Setup a constructure to define a way to create a new tweet 
    public Tweet(String user, String tweet) {
       username = user
       text = tweet
       retweets = 0
       favorites = 0
       createdOn = new Date()
    }
    
    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}