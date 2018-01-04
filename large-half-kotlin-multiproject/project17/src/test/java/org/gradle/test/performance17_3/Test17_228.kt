package org.gradle.test.performance17_3

import org.junit.Assert.*

class Test17_228 {
    private val production = Production17_228("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}