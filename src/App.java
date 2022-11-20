import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class App{

    public static void main(String[] args) throws NumberFormatException, IOException
    {
        System.out.println("Songlist is Here");

        Songs a1 = new Songs ("The_Last_Ride" ,  "Sidhu_Mose_Wala",  58879374);
        a1.print();
        Songs b2 = new Songs ( "Umbrella" ,  "Rihanna",  985676239);
        b2.print();
        Songs c3 = new Songs ( "Without You" , "The Kid Laroi", 768602433);
        c3.print();
        Songs d4 = new Songs ( "Impress" , "Ranjit Bawa",  7166884);
        d4.print();
        Songs e5 = new Songs ( "Game_Over" ,  "Karan_Aujla",  11035382);
        e5.print();
        Songs f6 = new Songs ( "under_The_Influence" , "Chris_Brown", 412288623);
        f6.print();
        Songs g7 = new Songs ( "Start_Over" , "Imagine_Dragons", 78148369);
        g7.print();
        Songs h8 = new Songs ( "Excuses" , "AP_Dhillon",219379636);
        h8.print();
        Songs i9 = new Songs ( "Trust" , "justin_Beiber", 68989464);
        i9.print();
        Songs j10 = new Songs ( "July" , "Noah_Cyrus", 642969965);
        j10.print();
        Songs k11 = new Songs ( "Falling" , "Harry_Styles", 858162822);
        k11.print();
    

        ArrayList<Songs> music = new ArrayList<Songs>(16);
        
        music.add(a1);
        music.add(b2);
        music.add(c3);
        music.add(d4);
        music.add(e5);
        music.add(f6);
        music.add(g7);
        music.add(h8);
        music.add(i9);
        music.add(j10);
        music.add(k11);

        music.remove(h8);
        System.out.println("The elimination of one Song is done");

        
        for( Songs Song: music)
        {
            Song.print();
        }
        
        BufferedReader count = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Put the value of playcount of the song to print the list of songs have veiwcount over this ");
        int plays= Integer.parseInt(count.readLine());
        System.out.println("The list of Songs over the given playcount is stored");
        
        for( Songs song: music)
        {if (plays < song.getPlays()) 
           {
            song.print();
           } 


    }
}}

