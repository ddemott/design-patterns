
package com.demott.patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Aggregate
class Playlist implements Iterable<String> {
    private String[] songs;
    private int size;

    public Playlist(int capacity) {
        songs = new String[capacity];
        size = 0;
    }

    public void addSong(String song) {
        if (size < songs.length) {
            songs[size++] = song;
        }
    }

    @Override
    public Iterator<String> iterator() {
        return new PlaylistIterator();
    }

    // Concrete Iterator
    private class PlaylistIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return songs[index++];
        }
    }
}

public class IteratorDemo {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(5);
        playlist.addSong("Bohemian Rhapsody");
        playlist.addSong("Imagine");
        playlist.addSong("Hotel California");
        playlist.addSong("Hey Jude");

        System.out.println("Playlist:");
        for (String song : playlist) {
            System.out.println("- " + song);
        }
    }
}
