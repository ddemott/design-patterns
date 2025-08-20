# Adapter Pattern

**Intent:** Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

## Structure
- Target interface: `MediaPlayer`
- Adapter: `MediaAdapter`
- Adaptee: `AdvancedMediaPlayer`
- Client: `AdapterDemo`

## Example Usage (from `AdapterDemo.java`)
```java
public class AdapterDemo {
	public static void main(String[] args) {
		MediaPlayer player = new MediaAdapter();
		player.play("mp4", "movie.mp4");      // Output: Playing mp4 file: movie.mp4
		player.play("vlc", "song.vlc");      // Output: Playing vlc file: song.vlc
		player.play("avi", "clip.avi");      // Output: Invalid media. avi format not supported
	}
}
```

## When to Use
- When you want to use an existing class, but its interface does not match your needs

## Related Patterns
- Bridge, Decorator, Proxy
