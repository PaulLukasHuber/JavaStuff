public class MadLibs {
    /*
  Another CC project where it is about rebuilding a MadLibs word game, again completely hardcoded without external input.
  */
    public static void main(String[] args) {

        String name1, name2, adjective1, adjective2, adjective3, verb1, noun1, noun2, noun3, noun4, noun5, noun6, place1;
        int number;

        name1 = "Peter";
        name2 = "Tom";

        adjective1 = "relaxed";
        adjective2 = "productive";
        adjective3 = "furious";

        noun1 = "workers";
        noun2 = "Bananas";
        noun3 = "Sirens";
        noun4 = "Mothers";
        noun5 = "Chicken Wings";
        noun6 = "Snail";

        verb1 = "shout";

        place1 = "Madeira";

        number = 2175;

        //The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a " + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2 + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the " + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1 + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1 + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}
