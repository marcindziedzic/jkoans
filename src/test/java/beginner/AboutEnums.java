package beginner;

import static constant.Constants.__;
import static org.junit.Assert.*;
import org.junit.Test;

public class AboutEnums {


	enum Colors {
		Red, Blue, Green, Yellow // what happens if you add a ; here?
		// What happens if you type Red() instead?
	}
	
	@Test
	public void basicEnums() {
		Colors blue = Colors.Blue;
		assertEquals(blue == Colors.Blue, __);
		assertEquals(blue == Colors.Red, __);
		assertEquals(blue instanceof Colors, __);
	}
	
	@Test
	public void basicEnumsAccess() {
		Colors[] colorArray = Colors.values();
		assertEquals(colorArray[2], __);
	}
	
	enum SkatSuits {
		Clubs(12), Spades(11), Hearts(10), Diamonds(9);
		SkatSuits(int v) { value = v; }
		private int value;
	}
	
	@Test
	public void enumsWithAttributes() {
		// value is private but we still can access it. Why?
		// Try moving the enum outside the AboutEnum class... What do you expect?
		// What happens?
		assertEquals(SkatSuits.Clubs.value > SkatSuits.Spades.value, __);
	}
	
	enum OpticalMedia {
		CD(650), DVD(4300), BluRay(50000);
		OpticalMedia(int c) {
			capacityInMegaBytes = c;
		}
		int capacityInMegaBytes;
		int getCoolnessFactor() {
			return (capacityInMegaBytes - 1000) * 10;
		}
	}
	
	@Test
	public void enumsWithMethods() {
		assertEquals(OpticalMedia.CD.getCoolnessFactor(), __);
		assertEquals(OpticalMedia.BluRay.getCoolnessFactor(), __);
	}
}
