package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_309 {
    private val production = Production17_309("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}