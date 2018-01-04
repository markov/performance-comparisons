package org.gradle.test.performance47_1

import org.junit.Assert.*

class Test47_83 {
    private val production = Production47_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
