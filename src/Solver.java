import java.util.*;

/**
 * A class to house the main method of the system,
 * handles the skeletal structure of the program
 * explaining the ideas behind the decryption
 */
public class Solver {
    public static void main(String[] args) {
        String cipherText =
                "Turning once again, and this time more generally, to the question of invasion, I would observe that" +
                        " there has never been a period in all these long centuries of which we boast when an absolute " +
                        "guarantee against invasion, still less against serious raids, could have been given to our people." +
                        " In the days of Napoleon, of which I was speaking just now, the same wind which would have carried" +
                        " his transports across the Channel might have driven away the blockading fleet. There was always" +
                        " the chance, and it is that chance which has excited and befooled the imaginations of many " +
                        "Continental tyrants. Many are the tales that are told. We are assured that novel methods will be" +
                        " adopted, and when we see the originality of malice, the ingenuity of aggression, which our enemy" +
                        " displays, we may certainly prepare ourselves for every kind of novel stratagem and every kind" +
                        " of brutal and treacherous manœuvre. I think that no idea is so outlandish that it should not be" +
                        " considered and viewed with a searching, but at the same time, I hope, with a steady eye. We must" +
                        " never forget the solid assurances of sea power and those which belong to air power if it can be" +
                        " locally exercised." +
                        "Sir, I have, myself, full confidence that if all do their duty, if nothing is neglected, and if" +
                        " the best arrangements are made, as they are being made, we shall prove ourselves once more able" +
                        " to defend our island home, to ride out the storm of war, and to outlive the menace of tyranny," +
                        " if necessary for years, if necessary alone. At any rate, that is what we are going to try to " +
                        "do. That is the resolve of His Majesty's Government – every man of them. That is the will of " +
                        "Parliament and the nation. The British Empire and the French Republic, linked together in their" +
                        " cause and in their need, will defend to the death their native soil, aiding each other like " +
                        "good comrades to the utmost of their strength." +
                        "Even though large tracts of Europe and many old and famous States have fallen or may fall into " +
                        "the grip of the Gestapo and all the odious apparatus of Nazi rule, we shall not flag or fail. " +
                        "We shall go on to the end. We shall fight in France, we shall fight on the seas and oceans, we " +
                        "shall fight with growing confidence and growing strength in the air, we shall defend our island," +
                        " whatever the cost may be. We shall fight on the beaches, we shall fight on the landing grounds," +
                        " we shall fight in the fields and in the streets, we shall fight in the hills; we shall never " +
                        "surrender, and if, which I do not for a moment believe, this island or a large part of it were " +
                        "subjugated and starving, then our Empire beyond the seas, armed and guarded by the British Fleet," +
                        " would carry on the struggle, until, in God's good time, the New World, with all its power and " +
                        "might, steps forth to the rescue and the liberation of the old.";
        CipherMap currentDecrypted = new CipherMap(); //use this map to keep track of our decoding
        WordTypeFilter filter = new WordTypeFilter(cipherText.toUpperCase()); //use this to return selections of words
        LetterFrequencyCounter letterFrequency = new LetterFrequencyCounter();
        letterFrequency.counter(cipherText.strip().toUpperCase()); // tally the letters in cipherText

        Character mostCommon = (Character) letterFrequency.mostFrequent();
        System.out.println(mostCommon);
        currentDecrypted.addPair('E', mostCommon);//our most common letter is probably an E if the text is long

        String[] threeLetterWords = filter.returnXLetterWords(3);
        filter.setWords(threeLetterWords);
        String[] xxe = filter.returnEndsWithX(currentDecrypted.cipherMap.get('E')); //three letter words ending with e
        WordFrequencyCounter mostCommonWord = new WordFrequencyCounter();
        mostCommonWord.counter(xxe); //the most common word that is XXE is almost definitely "THE"
        String the = (String) mostCommonWord.mostFrequent();
        System.out.println(the);
    }
}
