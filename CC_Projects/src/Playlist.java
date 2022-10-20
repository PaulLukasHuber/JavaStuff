/*
 * MIT License
 *
 * Copyright (c) 2022 Paul-Lukas Huber
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

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