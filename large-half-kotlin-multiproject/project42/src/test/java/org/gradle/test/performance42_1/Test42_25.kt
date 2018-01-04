package org.gradle.test.performance42_1

import org.junit.Assert.*

class Test42_25 {
    private val production = Production42_25("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
