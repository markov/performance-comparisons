package org.gradle.test.performance42_4

import org.junit.Assert.*

class Test42_348 {
    private val production = Production42_348("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
