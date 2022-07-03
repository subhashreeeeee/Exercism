class TwelveDays {
    String verse(int verseNumber) {
        String[] day = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        
        String[] word = {"a Partridge in a Pear Tree","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
        

        String ith_day = day[verseNumber-1];
        String postfix = "";
        if (verseNumber>1){
            for(int j=verseNumber-1;j>=0;)
            {   if (j!=0)
                {postfix+=word[j]; postfix+=", ";}
                else
                {postfix = postfix+"and "+word[0];}
                j--;
            }}
        else{
            postfix = word[0];
        }
        String s = "On the "+ith_day+" day of Christmas my true love gave to me: "+postfix+".\n";
        return s;
        }
        
        
    String verses(int startVerse, int endVerse) 
    {   String res="";
        while (startVerse<=endVerse){
            res=res+verse(startVerse);
            startVerse++;
        }
        return res;
    }

    
    String sing() 
    {
        return verses(1,12);
    }
}
