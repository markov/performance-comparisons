package org.gradle.test.performance42_4

import org.junit.Assert.*

class Test42_338 {
    private val production = Production42_338("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
