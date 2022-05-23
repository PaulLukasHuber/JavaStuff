/*
Another imples CC project. In this one the handling of ArrayLists should be taught by creating a small playlist.
 */


import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        desertIslandPlaylist.add("Späti - Gzuz");
        desertIslandPlaylist.add("N95 - Kendrick Lamar");
        desertIslandPlaylist.add("Der letzte Song - KUMMER");
        desertIslandPlaylist.add("Tage wie diese - Die Toten Hosen");
        desertIslandPlaylist.add("Trip to Valhalla - Dr.Peacock");
        desertIslandPlaylist.add("Legend - Tevvez");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(2);

        //Swap
        String temp = desertIslandPlaylist.get(desertIslandPlaylist.indexOf("N95 - Kendrick Lamar"));
        desertIslandPlaylist.set(1, desertIslandPlaylist.get(desertIslandPlaylist.indexOf("Trip to Valhalla - Dr.Peacock")));
        desertIslandPlaylist.set(3, temp);

        System.out.println(desertIslandPlaylist);


    }

}