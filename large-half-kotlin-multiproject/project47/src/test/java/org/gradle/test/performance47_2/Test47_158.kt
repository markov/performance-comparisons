package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_158 {
    private val production = Production47_158("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
