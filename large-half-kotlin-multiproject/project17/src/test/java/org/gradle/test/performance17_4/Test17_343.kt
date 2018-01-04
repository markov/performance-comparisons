package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_343 {
    private val production = Production17_343("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}