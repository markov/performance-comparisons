package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_125 {
    private val production = Production47_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
