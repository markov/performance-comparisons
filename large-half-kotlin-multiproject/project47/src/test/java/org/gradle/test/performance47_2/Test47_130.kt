package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_130 {
    private val production = Production47_130("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
