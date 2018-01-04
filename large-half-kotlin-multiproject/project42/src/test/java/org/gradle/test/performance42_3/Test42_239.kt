package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_239 {
    private val production = Production42_239("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
