package org.gradle.test.performance42_5

import org.junit.Assert.*

class Test42_422 {
    private val production = Production42_422("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
