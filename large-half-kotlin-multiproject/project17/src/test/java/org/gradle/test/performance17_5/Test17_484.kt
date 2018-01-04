package org.gradle.test.performance17_5

import org.junit.Assert.*

class Test17_484 {
    private val production = Production17_484("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}