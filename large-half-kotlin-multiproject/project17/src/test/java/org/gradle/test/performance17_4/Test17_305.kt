package org.gradle.test.performance17_4

import org.junit.Assert.*

class Test17_305 {
    private val production = Production17_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}