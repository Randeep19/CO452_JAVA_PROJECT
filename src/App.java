import java.util.ArrayList;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class App{
    public static void main(String[] args)
    {
        System.out.println("Songlist is Here");

        Songs 1 = new Songs(Song_Title- "The Last Ride",  Artist_Name- "Sidhu Mose Wala", Play_Count- 58,879,374);
        Songs 2 = new Songs(Song_Title- "Umbrella",  Artist_Name- "Rihanna", Play_Count- 985,676,239);
        Songs 3 = new Songs(Song_Title- "Without You",  Artist_Name- "The Kid Laroi", Play_Count- 768,602,433);
        Songs 4 = new Songs(Song_Title- "Impress",  Artist_Name- "Ranjit Bawa", Play_Count- 7,166,884);
        Songs 5 = new Songs(Song_Title- "Game Over",  Artist_Name- "Karan Aujla", Play_Count- 11,035,382);
        Songs 6 = new Songs(Song_Title- "under The Influence",  Artist_Name- "Chris Brown", Play_Count- 412,288,623);
        Songs 7 = new Songs(Song_Title- "Start Over",  Artist_Name- "Imagine Dragons", Play_Count- 78,148,369);
        Songs 8 = new Songs(Song_Title- "Excuses",  Artist_Name- "AP Dhillon", Play_Count- 219,379,636);
        Songs 9 = new Songs(Song_Title- "Trust",  Artist_Name- "justin Beiber", Play_Count- 68,989,464);
        Songs 10 = new Songs(Song_Title- "July",  Artist_Name- "Noah Cyrus", Play_Count- 642,969,965);
        Songs 11 = new Songs(Song_Title- "Falling",  Artist_Name- "Harry Styles", Play_Count- 858,162,822);

        ArrayList<Songs> Song = new ArrayList<Songs>(16);
        
        Song.add(1);
        Song.add(2);
        Song.add(3);
        Song.add(4);
        Song.add(5);
        Song.add(6);
        Song.add(7);
        Song.add(8);
        Song.add(9);
        Song.add(10);
        Song.add(11);

        System.out.println(Song.get(8));
        Song.remove(8);
        System.out.println("The elimination of Song is done");

        for(Songs song : Song)
        {
            Song.print();
        }



       

}