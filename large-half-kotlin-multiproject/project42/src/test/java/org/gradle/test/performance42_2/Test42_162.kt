package org.gradle.test.performance42_2

import org.junit.Assert.*

class Test42_162 {
    private val production = Production42_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
