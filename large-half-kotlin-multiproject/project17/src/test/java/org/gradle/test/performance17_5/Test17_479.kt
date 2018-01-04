package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_479 {
    private val production = Production17_479("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}