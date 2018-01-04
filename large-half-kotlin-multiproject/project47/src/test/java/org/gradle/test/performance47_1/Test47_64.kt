package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_64 {
    private val production = Production47_64("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
