package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_190 {
    private val production = Production47_190("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
