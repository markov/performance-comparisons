package org.gradle.test.performance42_4

import org.junit.Assert.*

class Test42_315 {
    private val production = Production42_315("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.getProperty(), "value")
    }
}
