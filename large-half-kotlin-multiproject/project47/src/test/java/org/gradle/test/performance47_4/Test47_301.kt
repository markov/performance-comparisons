package org.gradle.test.performance47_4

import org.junit.Assert.*

class Test47_301 {
    private val production = Production47_301("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
