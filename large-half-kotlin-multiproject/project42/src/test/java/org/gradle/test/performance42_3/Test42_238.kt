package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_238 {
    private val production = Production42_238("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
