package s054;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SimpleTest {
	private Simple simple;
	
	@BeforeEach
	public void init() {
		Simple simple=new Simple();
	}
	@Test
	public void negatePositive() {
		Simple simple = new Simple();
		int value = 42;

		int result = simple.negate(value);

		assertThat(result, equalTo(-42));
	}

	@Test
	public void negateMaxInt() {
		int value = Integer.MAX_VALUE;

		int result = simple.negate(value);

		assertThat(result, equalTo(-42));
	}

@Test
    public void negateMINInt() {
        int value = Integer.MIN_VALUE;

        int result = simple.negate(value);

        assertThat(result, equalTo(Integer.MIN_VALUE));
}
}
