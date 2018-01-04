package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_154 {
    private val production = Production47_154("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
