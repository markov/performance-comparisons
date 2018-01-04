package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_208 {
    private val production = Production42_208("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
