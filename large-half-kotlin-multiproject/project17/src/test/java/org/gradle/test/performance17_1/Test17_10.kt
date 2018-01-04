package org.gradle.test.performance17_1

import org.junit.Assert.*

class Test17_10 {
    private val production = Production17_10("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}