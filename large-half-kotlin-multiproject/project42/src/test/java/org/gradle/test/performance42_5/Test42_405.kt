package org.gradle.test.performance42_5

import org.junit.Assert.*

class Test42_405 {
    private val production = Production42_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
