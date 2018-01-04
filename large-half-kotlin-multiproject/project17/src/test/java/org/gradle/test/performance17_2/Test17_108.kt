package org.gradle.test.performance17_2

import org.junit.Assert.*

class Test17_108 {
    private val production = Production17_108("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}