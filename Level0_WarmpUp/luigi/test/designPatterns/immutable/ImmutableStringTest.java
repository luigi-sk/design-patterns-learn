package designPatterns.immutable;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImmutableStringTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHashCode() {
		String firstName = "Lukas";
		String lastName = "Votypka";
		String otherFirstName = "Stefan";
		String otherLastName = "Luptak";
		
		ImmutableString immutable = new ImmutableString(firstName, lastName);
		ImmutableString sameImmutable = new ImmutableString(firstName, lastName);
		ImmutableString otherImmutable = new ImmutableString(firstName, otherLastName);
		
		assertEquals(immutable.hashCode(), sameImmutable.hashCode());
		assertEquals(immutable.hashCode(), sameImmutable.hashCode());
	}

	@Test
	public void testEqualsObject() {
		String firstName = "Lukas";
		String lastName = "Votypka";
		String otherFirstName = "Stefan";
		String otherLastName = "Luptak";
		
		ImmutableString immutable = new ImmutableString(firstName, lastName);
		ImmutableString sameImmutable = new ImmutableString(firstName, lastName);
		ImmutableString otherImmutable = new ImmutableString(firstName, otherLastName);
		assertEquals(immutable, sameImmutable);
		assertTrue(immutable.equals(sameImmutable));
		assertTrue(sameImmutable.equals(immutable));
		assertFalse(immutable.equals(otherImmutable));
		assertFalse(otherImmutable.equals(immutable));
	}

	@Test
	public void testReverse() {
		String firstName = "Lukas";
		String lastName = "Votypka";
		
		ImmutableString imm = new ImmutableString(firstName, lastName);
		assertEquals("sakuL akpytoV", imm.reverse().toString());
		
		firstName = "Stefan";
		assertEquals("sakuL akpytoV", imm.reverse().toString());
	}

}
