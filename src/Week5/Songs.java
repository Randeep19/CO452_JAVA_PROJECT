public class Songs{
   
    private String Song_Title;
    private String Artist_Name;
    private int Play_Count;
     
    public Songs(String Song_Title, String Artist_Name, int Play_Count)
    {
        this.Song_Title =Song_Title;
        this.Artist_Name = Artist_Name;
        this.Play_Count = Play_Count;
    }

    public void print()
    {
        System.out.println("Song:" + this.Song_Title + "\t");
        System.out.println("Artist:" + this.Artist_Name  +"\t");
        System.out.println("Play Count" + this.Play_Count);
    }

    public String getName()
        {
            return this.Song_Title;
        
        }
        public String getArtist()
        {
            return this.Artist_Name;
        }
        public int getPlaycounts()
        {
            return this.Play_Count;
        }
}