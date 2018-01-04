package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_271 {
    private val production = Production42_271("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
