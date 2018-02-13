package tech.anima.archon

import kotlin.test.assertEquals
import org.junit.Test
import tech.anima.archon.language.Archon

public class TryTest {

	@Test fun pass() {
		assertEquals("cid", Archon.Factory().make("correlate cid").emit())
	}

}