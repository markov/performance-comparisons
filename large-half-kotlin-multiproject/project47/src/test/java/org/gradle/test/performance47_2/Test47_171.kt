package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_171 {
    private val production = Production47_171("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
