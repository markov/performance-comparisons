package org.gradle.test.performance42_3

import org.junit.Assert.*

class Test42_220 {
    private val production = Production42_220("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
