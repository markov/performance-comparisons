package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_11 {
    private val production = Production47_11("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
