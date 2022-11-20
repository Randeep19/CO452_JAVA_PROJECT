public class Songs{
   
    private String Song_Title;
    private String Artist_Name;
    private int Plays;

    public Songs (String Song_Title, String Artist_Name, int Plays)
    {
        this.Song_Title =Song_Title;
        this.Artist_Name = Artist_Name;
        this.Plays = Plays;
    }

    public void print()
    {
        System.out.print("Song: " + this.Song_Title + "\t");
        System.out.print("Artist: " + this.Artist_Name  +"\t");
        System.out.println("Plays: " + this.Plays);
    }

    public String getName()
        {
            return this.Song_Title;
        
        }
        public int getPlays()
        {
            return this.Plays;
        }
    
}