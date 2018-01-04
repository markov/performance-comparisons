package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_235 {
    private val production = Production42_235("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
