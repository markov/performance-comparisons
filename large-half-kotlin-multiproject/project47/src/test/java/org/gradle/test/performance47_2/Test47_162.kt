package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_162 {
    private val production = Production47_162("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
