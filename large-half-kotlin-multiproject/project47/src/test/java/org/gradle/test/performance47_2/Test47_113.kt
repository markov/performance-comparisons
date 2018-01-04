package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_113 {
    private val production = Production47_113("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
