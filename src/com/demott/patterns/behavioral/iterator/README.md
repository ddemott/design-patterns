# Iterator Pattern

**Intent:** Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Structure
- Iterator interface
- Concrete Iterator
- Aggregate

## Example Usage
```java
java.util.Iterator<String> it = names.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

## When to Use
- When you need to traverse a collection without exposing its internals

# Iterator Pattern

**Intent:** Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Structure
- Aggregate: `Playlist`
- Iterator: `PlaylistIterator` (inner class)
- Client: `IteratorDemo`

## Example Usage (from `IteratorDemo.java`)
```java
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
        // Output:
        // Playlist:
        // - Bohemian Rhapsody
        // - Imagine
        // - Hotel California
        // - Hey Jude
    }
}
```

## When to Use
- When you need to traverse a collection without exposing its internals

## Related Patterns
- Composite
