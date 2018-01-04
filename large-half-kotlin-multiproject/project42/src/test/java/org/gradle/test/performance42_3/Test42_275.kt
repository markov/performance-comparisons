package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_275 {
    private val production = Production42_275("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
